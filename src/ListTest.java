import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

/**
 *  Ecrire une classe Java avec 3 méthodes statiques pour manipuler
 *  une collection de chaîne.
 *   Une méthode pour transformer une liste de String
 *   en une seule String, chaque élément étant séparé par une virgule.
 *   Une deuxième méthode pour afficher en ordre inverse le contenu
 *   de ma liste de chaine.
 *   Enfin une troisième méthode pour mettre en majuscule
 *   chacune des Strings de ma liste.
 */
public class ListTest {
    public static List<String> aTestList;

    /**
     *  Main
     */
    public static void main(String[] args) {

        setUp();
        aTestList.forEach((temp)-> {System.out.println(temp);} );
        printList(aTestList);

        System.out.println("Normal " + aTestList);

        // first function
        List<String> cList = concatenate(aTestList);
        System.out.println("Concatenate " + cList);

        // second function
        List<String> rList = reverseList(aTestList);
        System.out.println("Reversed " + rList);

        // third function
        List<String> uList = toUppercase(aTestList);
        System.out.println("UpperCased " + uList);

    }

    /**
     * to fill the Test list
     */
    public static void setUp() {
        aTestList = new ArrayList<String>();
        aTestList.add("one");
        aTestList.add("two");
        aTestList.add("three");
    }

    /**
     * Une méthode qui itère dans les élèments d'une liste
     * pour les afficher.
     *
     */
    public static void printList(List<String> list){
        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext())
        {
            System.out.print(iterator.next()+ " ");
        }
        System.out.print('\n');
    }


    /**
     * Une méthode pour transformer une liste de String
     * en une seule String, chaque élément étant séparé par une virgule.
     *
     */
    public static List<String> concatenate(List<String> list){
        String t = new String();
        List<String> cList = new ArrayList<String>();

        for(String i:list)
        {
            t = t + i;
        }

        cList.add(t);

        return cList;
    }


    /**
     * Une deuxième méthode pour afficher en ordre inverse le contenu
     *   de ma liste de chaine.
     */
    public static List<String> reverseList(List<String> list){
        List<String> rList = new ArrayList<String>();

        for (int i = list.size() - 1; i >= 0; i--)
        {
            rList.add(list.get(i));
        }

        return rList;
    }


    /**
     * Enfin une troisième méthode pour mettre en majuscule
     *   chacune des Strings de ma liste.
     */
    public static List<String> toUppercase(List<String> list){
        List<String> uList = new ArrayList<String>();
        for(String i:list)
        {
            uList.add(i.toUpperCase());
        }

        return uList;
    }

}

