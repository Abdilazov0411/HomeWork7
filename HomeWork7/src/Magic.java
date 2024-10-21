public class Magic extends Hero{

    public Magic(int health, int damage, String typeOfCriticalDamage) {
        super(health, damage, typeOfCriticalDamage);
    }

    @Override
    public void applySuperAbility() {
        System.out.println("Magic прменил свою суперспособность: " + typeOfCriticalDamage);
    }
}
