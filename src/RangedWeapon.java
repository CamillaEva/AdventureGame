public class RangedWeapon extends Weapon {
    private int damagePoints;
    private int uses;


    public RangedWeapon(String weaponName, String weaponDescription, int damagePoints, int uses) {
        super(weaponName, weaponDescription);
        this.damagePoints = damagePoints;
        this.uses = uses;
    }

    public int getDamagePoints() {
        return damagePoints;
    }

    public int getUses() {
        return uses;
    }

    public boolean useWeapon() {
        if (uses > 0) {
            uses--;
            System.out.println(getItem() + "used! remaining uses: " + uses);
            return true;
        } else {
            System.out.println(getItem() + " is out of ammo");
            return false;
        }
    }


    @Override
    Item weapon(String weaponName, String weaponDescription, int damagePoints) {
        return null;
    }


}
