package game;

public class Warrior extends Character implements Actions{
    public Warrior(String name){
        super(name,CharacterClass.WARRIOR);
        setCharLife(20);
        setCharArmor(14);
        setCharAttackPower(5);
        setLevel(1);
        setExperience(0);
    }

    @Override
    public void attack(Character target) {
        int roll = Dice.rollD20();
        Dice.rollInfo(roll);
        if(roll > target.getCharArmor()){
            int damageRoll = Dice.rollD8() + getCharAttackPower();
            target.setCharLife(target.getCharLife() - damageRoll);
            damageInfo(target,damageRoll);
        }
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
