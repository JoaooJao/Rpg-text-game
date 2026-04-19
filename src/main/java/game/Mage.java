package game;

public class Mage extends Character implements Actions {
    public Mage(String name){
        super(name,CharacterClass.MAGE);
        setCharLife(10);
        setCharArmor(8);
        setCharAttackPower(0);
        setLevel(1);
    }




    @Override
    public void attack(Character target) {
    }

    @Override
    public void defend() {

    }

    @Override
    public void dodge() {

    }

    @Override
    public void rest() {

    }

    @Override
    public void run() {

    }

    @Override
    public void skipTurn() {

    }
}
