import java.util.ArrayList;

//class for managing the adventure.
public class Adventure {

    private Map map; // creates the map.
    private Alice alice; //creates player.
    //items:


    //Map & Rooms
    public Adventure() {
        map = new Map();
        alice = new Alice(map.getTheFirstRoom());
    }

    public String getCurrentRoomName() {
        return alice.getCurrentRoomName();
    }

    public String getCurrentRoomDescription() {
        return alice.getCurrentRoomDescription();
    }

    public boolean canAliceMove(String direction) {
        return alice.canMove(direction);
    }

    public void moveAliceToRoom(String direction) {
        alice.moveToRoom(direction);
    }

    public Map getMap() {
        return map;
    }

    public String getCurrentRoomDetails() {
        return alice.getCurrentRoom().toString();
    }


    //Alice and Items

    public Alice getAlice() {
        return alice;
    }


    public isIt canAliceEat(String food) {
        return alice.aliceEats(food);
    }

    public String aliceHealth() {
        return alice.aliceHealth();
    }

    public boolean dropItem(String itemToDrop) {
        return alice.dropItem(itemToDrop);
    }

    //try to take item, return true if successfull, otherwise return false.
    public Boolean takeItem(String itemToTake) {
        return alice.takeItem(itemToTake);
    }


    //inventory
    public String findItem() {
        return alice.findItem();
    }

    //enemies and weaponry

    public boolean useWeapon(){
        return alice.useWeapon();
    }


    public Weapon getCurrentWeapon() {
        return alice.getCurrentWeapon();
    }

    public String equipWeapon(String weapon){
        return alice.equipWeapon(weapon);
    }

    public String attack(){
        return alice.attack();
    }


    public boolean dropWeapon(String itemToDrop) {
        return alice.dropWeapon(itemToDrop);
    }


    public String changeWeapon(String weaponName){
        return alice.changeWeapon(weaponName);
    }

//    public Enemy currrentEnemy(){
//        return alice.currentEnemy;
//    }
//
//    public void damageEnemy(){
//        return enemy.enemyHealth;
//    }
}

