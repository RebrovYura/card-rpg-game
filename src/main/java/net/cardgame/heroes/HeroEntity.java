package net.cardgame.heroes;

public class HeroEntity {
    public String name;
    public HeroType heroType;
    /*
        Hero stats in order (index - value):
        0 - level
        1 - health
     */
    public int[] stats;

    public HeroEntity(String name, HeroType heroType, int[] stats) {
        this.name = name;
        this.heroType = heroType;
        this.stats = stats;
    }

}
