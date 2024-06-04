package src;

public class Character {
    private String characterClass;
    private int health;
    private int strength;
    private int dexterity;
    private String weapon;

    public Character(String characterClass, int health, int strength, int dexterity, String weapon) {
        this.characterClass = characterClass;
        this.health = health;
        this.strength = strength;
        this.dexterity = dexterity;
        this.weapon = weapon;
    }

    // Getters e setters
    public String getCharacterClass() {
        return characterClass;
    }

    public int getHealth() {
        return health;
    }

    public int getStrength() {
        return strength;
    }

    public int getDexterity() {
        return dexterity;
    }

    public String getWeapon() {
        return weapon;
    }
}

