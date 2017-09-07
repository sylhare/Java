package javahero.behaviour;

/**
 */
public class FirstAid implements Heal{

    @Override
    public Integer heal(){
        System.out.println("Applying First Aid");
        return 10;
    };
}

