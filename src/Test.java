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
        Food burger = new Food("burger", 70, 30, "diabetes");
        Food rubbish;

        /*       ------   Some tests   ------         */
        // Simple int array
        int[] tab = {1, 2, 3, 4};
        System.out.println("\ntab : " + tab[0]);
        tab = new int[]{4, 3, 2, 1};
        System.out.println("tab : " + tab[0]);

        //Array list and lists
        for(int i = 0; i < ls.length; i++){
            ls[i] = "String list - ";
            als.add(" - String ArrayList ");
            System.out.println(ls[i] + i + als.get(i));
        }

        // Casting
        Object o = "12345";
        System.out.println(Integer.parseInt((String) o)); //"Object" casted into "String" parsed into "int"

        //living and Human
        System.out.println("\nabstract \n" + living.toString());
        System.out.println("-------------- \nclass \n" + human.toString());

        //SuperHero
        superHero.revealPower("Claw", tab);
        System.out.println(superHero.toString());
        System.out.println(superHero.getPowers());
        superHero.talk("Hi! How are you?");

        //Food Test
        System.out.println(burger.toString());
        // Creating an anonymous class when calling the the Food class to override a method
        rubbish = new Food("rubbish"){
            @Override
            public void yummy(){
                System.out.println("Eww !");
            }
        };
        human.eat(rubbish);
        System.out.println("-------------- \nAfter eating Rubbish \n" + human.toString());

        //Settings Enum
        System.out.println(Settings.BONUS.getValue()); // give you the value
        for(Settings e :Settings.values()){ //values return an array of enum values
            System.out.println(e);
        }
    }

}
