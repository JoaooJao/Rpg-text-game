package game;
import java.util.concurrent.ThreadLocalRandom;
public class Dice {
    public static int rollD100(){
        return ThreadLocalRandom.current().nextInt(1,101);
    }
    public static int rollD20(){
        return ThreadLocalRandom.current().nextInt(1,21);
    }
    public static int rollD12(){
        return ThreadLocalRandom.current().nextInt(1,13);
    }
    public static int rollD10(){
        return ThreadLocalRandom.current().nextInt(1,11);
    }
    public static int rollD8(){
        return ThreadLocalRandom.current().nextInt(1,9);
    }
    public static int rollD6(){
        return ThreadLocalRandom.current().nextInt(1,7);
    }
    public static int rollD4(){
        return ThreadLocalRandom.current().nextInt(1,5);
    }

    protected static void rollInfo(int roll){
        System.out.println("Rolled: " + roll);
    }
}
