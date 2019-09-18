package arena;

public class Gladiator {

    private String name;
    private Stat stat;
    private Weapon weapon;

    public Gladiator(String name, Stat stat, Weapon weapon) {
        this.name = name;
        this.stat = stat;
        this.weapon = weapon;
    }

    public String getName() {
        return name;
    }

    public int getStatPower() {
        return stat.getStrength() + stat.getAgility() + stat.getFlexibility() + stat.getIntelligence() + stat.getSkills();
    }

    public int getWeaponPower() {
        return weapon.getSharpness() + weapon.getSize() + weapon.getSolidity();
    }

    public int getTotalPower() {
        return getWeaponPower() + getStatPower();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append(String.format("%s - %d", this.name, getTotalPower())).append(System.lineSeparator());
        sb.append(String.format("  Weapon power: %d", getWeaponPower())).append(System.lineSeparator());
        sb.append(String.format("  Stat power: %d", getStatPower())).append(System.lineSeparator());


        return sb.toString().trim();
    }
}

