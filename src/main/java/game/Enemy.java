package game;

public class Enemy extends Character implements Actions {
    public Enemy(String name){
        super(name,CharacterClass.ENEMY);
        setCharLife(35);
        setCharArmor(10);
        setCharAttackPower(2);
        setLevel(1);
        setExperience(15);
    }

    @Override
    public void attack(Character target) {
        int roll = Dice.rollD20();
        Dice.rollInfo(roll);

        if(roll > target.getCharArmor()){
            int damageRoll = Dice.rollD6() + getCharAttackPower();
            target.setCharLife(target.getCharLife() - damageRoll);
            damageInfo(target,damageRoll);
        }
        else{
            System.out.println("Miss");
        }
    }

    @Override
    public void defend() {

    }

    @Override
    public void run() {
    }

    @Override
    public void skipTurn() {

    }

    @Override
    public void dodge() {

    }

    @Override
    public void rest() {
    }
}
