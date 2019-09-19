package heroRepository;

public class Hero {
    private String name;
    private int level;
    private Item item;

    public Hero(String name, int level, Item item) {
        this.name = name;
        this.level = level;
        this.item = item;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public Item getItem() {
        return item;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append(String.format("Hero: %s - %d%n", this.getName(), this.getLevel()));

        sb.append(String.format("  *  Strength: %d%n", this.getItem().getStrength()))
                .append(String.format("  *  Agility: %d%n", this.getItem().getAgility()))
                .append(String.format("  *  Intelligence: %d", this.getItem().getIntelligence()));

        return sb.toString().trim();

        //return String.format("Hero: %s – %d%n  *  Agility: %d%n  *  Intelligence: %d%n", this.getName(), this.getLevel(), this.getItem().getStrength(), this.getItem().getAgility(), this.getItem().getIntelligence());
    }
}
