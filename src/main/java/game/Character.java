package game;

public abstract class Character {
    private String charName;
    private int charLife;
    private int charArmor;
    private int charAttackPower;
    private int level;
    private int experience;
    private CharacterClass characterClass;

    public enum CharacterClass{
        MAGE,
        WARRIOR,
        PALADIN,
        ARCHER,
        ENEMY
    }
    public Character(String charName, CharacterClass characterClass){
        this.charName = charName;
        this.characterClass = characterClass;
        this.level = 1;
        this.experience = 0;

    }

    public String getCharName(){
        return charName;
    }
    public void setCharName(String charName){
        this.charName = charName;
    }

    public int getCharLife(){
        return charLife;
    }
    public void setCharLife(int charLife){
        this.charLife = charLife;
    }

    public int getCharArmor(){
        return charArmor;
    }
    public void setCharArmor(int charArmor){
        this.charArmor= charArmor;
    }

    public int getCharAttackPower(){
        return charAttackPower;
    }
    public void setCharAttackPower(int charAttackPower){
        this.charAttackPower = charAttackPower;
    }
    public boolean isAlive(){
        return charLife > 0;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public CharacterClass getCharacterClass() {
        return characterClass;
    }

    public void setCharacterClass(CharacterClass characterClass) {
        this.characterClass = characterClass;
    }

    protected void damageInfo(Character target, int damageRoll){
        System.out.println(getCharName() + " Attacked " + target.getCharName());
        System.out.println("Damage: " + damageRoll);
    }
}

