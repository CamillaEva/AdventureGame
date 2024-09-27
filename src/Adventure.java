//class for managing the adventure.
public class Adventure {

    private Map map; // creates the map.
    private Alice alice; //creates player.


    public Adventure() {
        this.map = new Map();
        this.alice = new Alice(map.getTheFirstRoom());
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

    public Alice getAlice() {
        return alice;
    }

}
