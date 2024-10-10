public class Enemy {


    private String enemyName;
    private String enemyDescription;
    private int enemyHealthPoints;
    private int damageAlice;
    private Weapon enemyWeapon;


    public Enemy(String enemyName, String enemyDescription, int enemyHealthPoints, int damageAlice, Weapon enemyWeapon) {
        this.enemyHealthPoints = enemyHealthPoints;
        this.enemyName = enemyName;
        this.enemyDescription = enemyDescription;
        this.damageAlice = damageAlice;
        this.enemyWeapon = enemyWeapon;
    }

    public Weapon getEnemyWeapon(){
        return enemyWeapon;
    }


    public String getEnemyName() {
        return enemyName;
    }

    public String getEnemyDescription() {
        return enemyDescription;
    }

    public int getEnemyHealthPoints() {
        return enemyHealthPoints;
    }


    public void takeDamage(int damage) {
        enemyHealthPoints -= damage;
        if (enemyHealthPoints < 0) {
            enemyHealthPoints = 0;
        }
    }




}
