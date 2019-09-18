package arena;

import java.util.ArrayList;
import java.util.List;

public class FightingArena {
    private List<Gladiator> gladiators;
    private String name;

    public FightingArena(String name) {
        this.gladiators = new ArrayList<>();
        this.name = name;
    }

    public void add(Gladiator entity) {
        this.gladiators.add(entity);
    }

    public void remove(String name) {
        for (Gladiator gladiator : this.gladiators) {
            if (gladiator.getName().equals(name)) {
                this.gladiators.remove(gladiator);
                return;
            }
        }
    }

    public Gladiator getGladiatorWithHighestStatPower(){
        Gladiator gladiator = null;
        int highestStat = 0;

        for (Gladiator gladiator1 : this.gladiators) {
            if (gladiator1.getStatPower() > highestStat) {
                highestStat = gladiator1.getStatPower();
                gladiator = gladiator1;
            }
        }
        return gladiator;
    }


    public Gladiator getGladiatorWithHighestWeaponPower(){
        Gladiator gladiator = null;
        int highestStat = 0;

        for (Gladiator gladiator1 : this.gladiators) {
            if (gladiator1.getWeaponPower() > highestStat) {
                highestStat = gladiator1.getWeaponPower();
                gladiator = gladiator1;
            }
        }
        return gladiator;
    }


    public Gladiator getGladiatorWithHighestTotalPower(){
        Gladiator gladiator = null;
        int highestStat = 0;

        for (Gladiator gladiator1 : this.gladiators) {
            if (gladiator1.getTotalPower() > highestStat) {
                highestStat = gladiator1.getTotalPower();
                gladiator = gladiator1;
            }
        }
        return gladiator;
    }

    public int getCount(){
        return this.gladiators.size();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append(String.format("%s - %d gladiators are participating", this.name, getCount()));

        return sb.toString();
    }
}
