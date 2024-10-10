public abstract class Weapon extends Item {

    private int damagePoints;
    private int uses;
    private int remainingUses;


    abstract Item weapon(String weaponName, String weaponDescription, int damagePoints);


    public Weapon(String weaponName, String weaponDescription) {
        super(weaponName, weaponDescription);
        this.damagePoints = damagePoints;
    }

    public int getDamagePoints(){
        return damagePoints;
    }



    public int remainingUses(){
        remainingUses =  uses - 1;
        return remainingUses;
    }

}
