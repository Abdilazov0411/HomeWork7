public class Main {
    public static void main(String[] args) {

        Hero[] heroes = new Hero[3];
        heroes[0] = new Magic(100,50,"Fire");
        heroes[1] = new Warrior(80,30,"Critical damage");
        heroes[2] = new Medic(50,10,"Healing");

        for (Hero hero: heroes){
            hero.applySuperAbility();

            if (hero instanceof Medic){
                Medic medic = (Medic) hero;
                medic.increaseExperience();
            }
        }
    }
}