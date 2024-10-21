public class Medic extends Hero{

    private int healPoints;

    public Medic(int health, int damage, String typeOfCriticalDamage) {
        super(health, damage, typeOfCriticalDamage);
        this.healPoints = healPoints;
    }

    public void increaseExperience(){
        healPoints += healPoints * 0.1;

        System.out.println("Medic увеличил опыт лечения на 10%. Новое значение " + healPoints);
    }


    @Override
    public void applySuperAbility() {
        System.out.println("Medic применил свою супер способность: " + typeOfCriticalDamage);
    }

    public int getHealPoints() {
        return healPoints;
    }
}
