public abstract class Hero implements HavingSuperAbility {

    protected int health;
    protected int damage;
    protected String typeOfCriticalDamage;

    public Hero(int health, int damage, String typeOfCriticalDamage) {
        this.health = health;
        this.damage = damage;
        this.typeOfCriticalDamage = typeOfCriticalDamage;
    }

    @Override
    public abstract void applySuperAbility();
}
