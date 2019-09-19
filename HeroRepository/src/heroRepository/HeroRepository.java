package heroRepository;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class HeroRepository {
    private List<Hero> data;

    public HeroRepository() {
        this.data = new ArrayList<>();
    }

    public void add(Hero entity) {
        this.data.add(entity);
    }

    public void remove(String name) {
       Hero currentHero = null;

        for (int i = 0; i < this.data.size(); i++) {
            currentHero = this.data.get(i);
            if (currentHero.getName().equals(name)) {
                this.data.remove(i);
                break;
            }
        }
    }

    public int getCount() {
        return this.data.size();
    }

    @Override
    public String toString() {
        StringBuilder toPrint = new StringBuilder();
        for (Hero hero : this.data) {
            toPrint.append(hero + System.lineSeparator());
        }

        return toPrint.toString().trim();
    }

    public Hero getHeroWithHighestStrength() {
        List<Hero> heroes = this.data;

        Hero heroToPrint = null;
        int bestStrenght = 0;

        for (Hero hero : heroes) {
            if (hero.getItem().getStrength() > bestStrenght) {
                heroToPrint = hero;
                bestStrenght = hero.getItem().getStrength();
            }
        }
        return heroToPrint;
    }

    public Hero getHeroWithHighestAgility() {
        List<Hero> heroes = this.data;

        Hero heroToPrint = null;
        int bestAgility = 0;

        for (Hero hero : heroes) {
            if (hero.getItem().getAgility() > bestAgility) {
                heroToPrint = hero;
                bestAgility = hero.getItem().getAgility();
            }
        }
        return heroToPrint;
    }

    public Hero getHeroWithHighestIntelligence() {
        List<Hero> heroes = this.data;

        Hero heroToPrint = null;
        int bestIntelligence = 0;

        for (Hero hero : heroes) {
            if (hero.getItem().getIntelligence() > bestIntelligence) {
                heroToPrint = hero;
                bestIntelligence = hero.getItem().getIntelligence();
            }
        }
        return heroToPrint;
    }
}
