import java.util.ArrayList;

//class for managing the adventure.
public class Adventure {

    private Map map; // creates the map.
    private Alice alice; //creates player.
    //items:


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

    public isItFood canAliceEat(String food) {
        return alice.aliceEats(food);
    }

    public String aliceHealth(){
        return alice.aliceHealth();
    }

    public Map getMap() {
        return map;
    }

    public Alice getAlice() {
        return alice;
    }

    public String getCurrentRoomDetails() {
        return alice.getCurrentRoom().toString();
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


}
