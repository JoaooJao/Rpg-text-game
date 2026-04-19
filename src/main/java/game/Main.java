package game;


public class Main {
    public static void main(String[] args) {
            Mage mage = new Mage("Gandalf");
            Enemy goblin = new Enemy("Goblin");
            Warrior warrior = new Warrior("Baldin");
            while(warrior.isAlive() && goblin.isAlive()){
                goblin.attack(warrior);
                System.out.println("Warrior Life: " + warrior.getCharLife());
                warrior.attack((goblin));
                System.out.println("Goblin Life: " + goblin.getCharLife());
                if(warrior.getCharLife() >= 1 && !goblin.isAlive()){
                    System.out.println("Warriors win");
                }
                else{
                    System.out.println("Goblin Wins");
                }
            }

    }
}
