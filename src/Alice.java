public class Alice {
    private Room theRoomShesin; //the room she's currently in.


    public Alice(Room firstRoom) {
        this.theRoomShesin = firstRoom;
    }

    public boolean canMove(String direction) {
        switch (direction) {
            case "go north":
                return theRoomShesin.getNorthAdjacentRoom() != null;
            case "go south":
                return theRoomShesin.getSouthAdjacentRoom() != null;
            case "go east":
                return theRoomShesin.getEastAdjacentRoom() != null;
            case "go west":
                return theRoomShesin.getWestAdjacentRoom() != null;
            default:
                return false;
        }
    }

    public void moveToRoom(String direction) {
        if (direction.equalsIgnoreCase("go north")) {
            theRoomShesin = theRoomShesin.getNorthAdjacentRoom();
        } else if (direction.equalsIgnoreCase("go south")) {
            theRoomShesin = theRoomShesin.getSouthAdjacentRoom();
        } else if (direction.equalsIgnoreCase("go east")) {
            theRoomShesin = theRoomShesin.getEastAdjacentRoom();
        } else if (direction.equalsIgnoreCase("go west")) {
            theRoomShesin = theRoomShesin.getWestAdjacentRoom();
        }
    }

    public void goToNorthRoom() {
        theRoomShesin = theRoomShesin.getNorthAdjacentRoom();
    }

    public void goToSouthRoom() {
        theRoomShesin = theRoomShesin.getSouthAdjacentRoom();
    }

    public void goToEastRoom() {
        theRoomShesin = theRoomShesin.getEastAdjacentRoom();
    }

    public void goToWestRoom() {
        theRoomShesin = theRoomShesin.getWestAdjacentRoom();
    }

    public String whereRU() {
        return theRoomShesin.getRoomName();
    }

    public String getCurrentRoomName() {
        return theRoomShesin.getRoomName();
    }

    public String getCurrentRoomDescription() {
        return theRoomShesin.getRoomDescription();
    }

}

