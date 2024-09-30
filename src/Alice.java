import java.util.ArrayList;

public class Alice {
    private Room theRoomShesin; //the room she's currently in.
    private ArrayList<Item> aliceItems = new ArrayList<>();


    public Alice(Room firstRoom) {
        theRoomShesin = firstRoom;
    }


    public boolean canMove(String direction) {
        switch (direction) {
            case "north":
                return theRoomShesin.getNorthAdjacentRoom() != null;
            case "south":
                return theRoomShesin.getSouthAdjacentRoom() != null;
            case "east":
                return theRoomShesin.getEastAdjacentRoom() != null;
            case "west":
                return theRoomShesin.getWestAdjacentRoom() != null;
            default:
                return false;
        }
    }

    public void moveToRoom(String direction) {
        if (direction.equalsIgnoreCase("north")) {
            theRoomShesin = theRoomShesin.getNorthAdjacentRoom();
        } else if (direction.equalsIgnoreCase("south")) {
            theRoomShesin = theRoomShesin.getSouthAdjacentRoom();
        } else if (direction.equalsIgnoreCase("east")) {
            theRoomShesin = theRoomShesin.getEastAdjacentRoom();
        } else if (direction.equalsIgnoreCase("west")) {
            theRoomShesin = theRoomShesin.getWestAdjacentRoom();
        }
    }


    public Item findItem(String findItem){
        for(Item item:aliceItems) {
            if (item.getItem().equalsIgnoreCase(findItem)) {
                return item;
            }
        }
        return null;
    }


    public boolean dropItem(String itemToDrop){
        Item variable = findItem(itemToDrop);
        if(variable == null){
            return false;
        }
        aliceItems.remove(variable);
        theRoomShesin.addItem(variable);
        return true;
    }

    public boolean takeItem(String itemToTake){
        Item variableitem = theRoomShesin.findItemInRoom(itemToTake);
        if(variableitem == null){
            return false;
        }
        aliceItems.add(variableitem);
        theRoomShesin.removeItemFromList(variableitem);
        return true;
    }

    //inventory
    public String findItem() {
        int counter = 1;
        String empty = "";
        for (Item currentItem : aliceItems) {
            empty += "\n" + counter++ + ". " + currentItem.getItem() + currentItem.getItemDescription();
        }
        return empty;
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

    public Room getCurrentRoom(){
        return theRoomShesin;
    }



}

