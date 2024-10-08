public class MeleeWeapon extends Weapon {


    private int damagePoints;


    public MeleeWeapon(String weaponName, String weaponDescription, int damagePoints) {
        super(weaponName, weaponDescription);
        this.damagePoints = damagePoints;
    }



    public int getDamagePoints() {
        return damagePoints;
    }


    @Override
    Item weapon(String weaponName, String weaponDescription, int damagePoints) {
        return null;
    }
}
