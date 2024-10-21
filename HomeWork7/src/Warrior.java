public class Warrior extends Hero{

    public Warrior(int health, int damage, String typeOfCriticalDamage) {
        super(health, damage, typeOfCriticalDamage);
    }

    @Override
    public void applySuperAbility() {
        System.out.println("Warrior применил свою суперспособность: " + typeOfCriticalDamage);
    }
}
