package heroRepository;

public class Item {
    private int strength;
    private int agility;
    private int intelligence;

    public Item(int strength, int agility, int intelligence) {
        this.strength = strength;
        this.agility = agility;
        this.intelligence = intelligence;
    }


    public int getStrength() {
        return strength;
    }

    public int getAgility() {
        return agility;
    }

    public int getIntelligence() {
        return intelligence;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Item:" + System.lineSeparator());
        stringBuilder.append(String.format("  *  Strength: %d%n", this.getStrength()));
        stringBuilder.append(String.format("  *  Agility: %d%n", this.getAgility()));
        stringBuilder.append(String.format("  *  Intelligence: %d", this.getIntelligence()));

        return stringBuilder.toString().trim();

 }
}
