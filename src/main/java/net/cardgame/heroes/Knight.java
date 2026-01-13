package net.cardgame.heroes;

import java.util.HashMap;

public class Knight {
    public String name;
    HashMap<String, Integer> stats = new HashMap<>();
    private String abilityName = "Increase physical dmg";
    private double damage;

    public Knight(String name) {
        this.name = name;
        stats.put("LVL", 1);
        stats.put("HP", 5);
        this.damage = 3;
    }

    public String getStats() {
        return stats.toString();
    }

    public String getAbilityName() {
        return abilityName;
    }

    public void getHurt(int dmg) {
        int knight_hp = stats.get("HP");
        if (knight_hp > 0) {
            knight_hp -= dmg;
            stats.replace("HP", knight_hp);
            System.out.print("Knight take damage. HP now is: ");
            System.out.println(stats.get("HP"));
        } else {
            System.out.println("Knight is dead");
        }
    }

    @Override
    public String toString() {
        return "Knight stats: \n" +
                "Level: " +
                stats.get("LVL") +
                "\nHealth: " +
                stats.get("HP");
    }
}
