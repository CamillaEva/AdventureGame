// class representing a room in the game, with information about adjacent rooms and description
public class Room {

    // room attributes for name, description, and adjacent rooms.
    private String roomName;
    private String roomDescription;
    private Room northAdjacentRoom;
    private Room southAdjacentRoom;
    private Room eastAdjacentRoom;
    private Room westAdjacentRoom;

    //Contructor to initialize room with its name and description
    public Room(String roomName, String roomDescription) {
        this.roomName = roomName;
        this.roomDescription = roomDescription;
    }


    //getters and setters for adjacent rooms.
    public Room getNorthAdjacentRoom() {
        return northAdjacentRoom;
    }

    public void setNorthAdjacentRoom(Room northAdjacentRoom) {
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

    // getter for room name.
    public String getRoomName() {
        return roomName;
    }

    //getter for room description
    public String getRoomDescription() {
        return roomDescription;
    }


}
