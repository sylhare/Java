import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Scanner;
import java.io.*;

/**
 * Editor creates a small text editor in Java where you can open, edit and save text documents
 */
public class Editor extends JFrame implements ActionListener {
    // Menu
    private MenuBar menuBar = new MenuBar();
    private Menu file = new Menu();
    private MenuItem open = new MenuItem();
    private MenuItem save = new MenuItem();
    private MenuItem close = new MenuItem();
    // Text Area
    private TextArea textArea = new TextArea("", 0, 0, TextArea.SCROLLBARS_VERTICAL_ONLY);

    /**
     * Creates the Text Editor
     */
    public Editor() {
        this.setSize(500, 300);
        this.setTitle("Text Editor");
        setDefaultCloseOperation(EXIT_ON_CLOSE); // Exit on the cross [x]

        this.textArea.setFont(new Font("Sanserif", Font.PLAIN, 12));
        this.getContentPane().setLayout(new BorderLayout()); // the BorderLayout bit makes it fill it automatically
        this.getContentPane().add(textArea);

        this.setMenuBar(this.menuBar);
        this.menuBar.add(this.file);
        this.file.setLabel("File");
        setMenuItem(this.open, "Open", KeyEvent.VK_O);
        setMenuItem(this.save, "Save", KeyEvent.VK_S);
        setMenuItem(this.close, "Close", KeyEvent.VK_F4);
    }

    /**
     * Add and configure the menu item to the editor menu bar
     *
     * @param item     the menu item to add
     * @param name     the name to give to the menu item in the drop down
     * @param shortcut the associated shortcut of the menu item (VK_S is for ctrl + S)
     */
    private void setMenuItem(MenuItem item, String name, int shortcut) {
        item.setLabel(name);
        item.setShortcut(new MenuShortcut(shortcut, false));
        item.addActionListener(this);
        this.file.add(item);
    }

    /**
     * Will trigger some action depending on the event.
     * Menu item actions
     * @param e
     */
    public void actionPerformed(ActionEvent e) {

        switch (e.getActionCommand()) {
            case "Open":
                this.open();
                break;
            case "Save":
                this.save();
                break;
            case "Close":
                this.dispose();
                break;
            default:
                System.out.println("Unmapped Action");
                break;
        }

    }

    /**
     * When the open menu item event is triggered, a file chooser pane will pop prompting to select a file to open
     * If you click on "OK" it will be displayed in the text area of the text editor
     */
    private void open() {
        JFileChooser chooser = new JFileChooser();

        //If the user click on "OK" after selecting a file
        if (chooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            this.textArea.setText("");
            try {
                Scanner scan = new Scanner(new FileReader(chooser.getSelectedFile().getPath()));
                while (scan.hasNext())
                    this.textArea.append(scan.nextLine() + "\n");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

    }

    /**
     * When the save menu item event is triggered, a file chooser pane will pop prompting to select a path and
     * a name to save the file.
     * If you click on "SAVE" the text area of the text editor will be saved in that file.
     */
    private void save() {
        JFileChooser chooser = new JFileChooser();

        //If the user click on "SAVE" after naming the file
        if (chooser.showSaveDialog(this) == JFileChooser.APPROVE_OPTION) {
            try {
                BufferedWriter out = new BufferedWriter(new FileWriter(chooser.getSelectedFile().getPath()));
                out.write(this.textArea.getText());
                out.close();
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
}

