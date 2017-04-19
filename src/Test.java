import java.util.ArrayList;

/**
 *
 * Class to try some stuff and do some tests
 *
 */
public class Test {

    /**
     * Main function for the program
     * @param args
     */
    public static void main (String[] args){
        String[] ls = new String[2]; //Inside is the length
        ArrayList<String> als = new ArrayList<>(5);
        Living living = new Human();
        Human human = new Human();
        SuperHero superHero = new SuperHero("Wolverine", "Logan");
        Food Burger = new Food(70, 30, "diabetes");

        //Some debug tests
        int[] tab = {1, 2, 3, 4};
        System.out.println("\ntab : " + tab[0]);
        tab = new int[]{4, 3, 2, 1};
        System.out.println("tab : " + tab[0]);

        //SuperHero
        superHero.revealPower("Claw", tab);
        System.out.println(superHero.toString());
        System.out.println(superHero.getpowers());

        //Human and Human implementation
        System.out.println("\nabstract \n" + living.toString());
        System.out.println("-------------- \nclass \n" + human.toString());

        //Food

        //Array list and lists
        for(int i = 0; i < ls.length; i++){
            ls[i] = "String list - ";
            als.add(" - String ArrayList ");
            System.out.println(ls[i] + i + als.get(i));
        }

        //Settings Enum
        System.out.println(Settings.BONUS.getValue()); // give you the value
        for(Settings e :Settings.values()){ //values return an array of enum values
            System.out.println(e);
        }
    }

}
