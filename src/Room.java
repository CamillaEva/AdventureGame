public class Room {

    private String roomName;
    private String roomDescription;
    private Room northAdjacentRoom;
    private Room southAdjacentRoom;
    private Room eastAdjacentRoom;
    private Room westAdjacentRoom;

    public Room(String roomName, String roomDescription) {
        this.roomName = roomName;
        this.roomDescription = roomDescription;
    }

    public Room getNorthAdjacentRoom() {
        return northAdjacentRoom;
    }

    public void setNothAdjacentRoom(Room northAdjacentRoom) {
        this.northAdjacentRoom = northAdjacentRoom;
    }

    public Room getSouthAdjacentRoom() {
        return southAdjacentRoom;
    }

    public void setSouthAdjacentRoom(Room southAdjacentRoom) {
        this.southAdjacentRoom = southAdjacentRoom;
    }

    public Room getEastAdjacentRoom() {
        return eastAdjacentRoom;
    }

    public void setEastAdjacentRoom(Room eastAdjacentRoom) {
        this.eastAdjacentRoom = eastAdjacentRoom;
    }

    public Room getWestAdjacentRoom() {
        return westAdjacentRoom;
    }

    public void setWestAdjacentRoom(Room westAdjacentRoom) {
        this.westAdjacentRoom = westAdjacentRoom;
    }

    public String getRoomName() {
        return roomName;
    }

    public String getRoomDescription(){
        return roomDescription;
    }


}
