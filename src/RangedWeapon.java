public class RangedWeapon extends Weapon {

    private int damagePoints;
    private int remainingUses;


    public RangedWeapon(String weaponName, String weaponDescription, int damagePoints, int maxUses) {
        super(weaponName, weaponDescription);
        this.damagePoints = damagePoints;
        this.remainingUses =maxUses;
    }



    public int getDamagePoints() {
        return damagePoints;
    }



    @Override
    Item weapon(String weaponName, String weaponDescription, int damagePoints) {
        return null;
    }

}
