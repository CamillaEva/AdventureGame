import java.util.ArrayList;

public class Alice {
    private Room theRoomShesin; //the room she's currently in.
    private ArrayList<Item> aliceItems = new ArrayList<>();
    private int aliceHealthPoints;


    public Alice(Room firstRoom) {
        theRoomShesin = firstRoom;
        aliceHealthPoints = 100;
    }

    public int getAliceHealthPoints() {
        return aliceHealthPoints;
    }

    public void setAliceHealthPoints(int aliceHealthPoints) {
        this.aliceHealthPoints = aliceHealthPoints;
        if (aliceHealthPoints > 100) {
            this.aliceHealthPoints = 100;
        }
    }

    public String aliceHealth() {
        if (this.aliceHealthPoints < 50 && this.aliceHealthPoints > 0) {
            return this.aliceHealthPoints + ", you are low on health";
        } else if (this.aliceHealthPoints > 50 && this.aliceHealthPoints <= 100) {
            return this.aliceHealthPoints + ", you have a lot of health";
        } else if (this.aliceHealthPoints == 50) {
            return this.aliceHealthPoints + ", you are good girl";
        } else if (this.aliceHealthPoints <= 0) {
            return "game over!";
        } else {
            return "limit health is 100";
        }
    }

    public Item findItemInInventory(String eatItem) {
        for (Item item : aliceItems) {
            if (item.getItem().equalsIgnoreCase(eatItem)) {
                return item;
            }
        }
        return null;
    }


    public void removeFromInventory(Item itemToEat) {
        aliceItems.remove(itemToEat);
    }

    public isItFood aliceEats(String eating) {
        Item itemToEat = findItemInInventory(eating);

        if (itemToEat == null) {
            itemToEat = theRoomShesin.findItemInRoom(eating);
        }
        if (itemToEat == null) {
            return isItFood.NO_FOOD_FOUND;
        } else if (itemToEat instanceof Food) {
            aliceHealthPoints = aliceHealthPoints + ((Food) itemToEat).getHealthPoints();
            if (aliceItems.contains(itemToEat)) {
                removeFromInventory(itemToEat);
            } else {
                theRoomShesin.removeItemFromList(itemToEat);
            }
            return isItFood.IT_IS_FOOD;
        } else {
            return isItFood.NOT_FOOD;
        }
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


    public Item findItem(String findItem) {
        for (Item item : aliceItems) {
            if (item.getItem().equalsIgnoreCase(findItem)) {
                return item;
            }
        }
        return null;
    }


    public boolean dropItem(String itemToDrop) {
        Item variable = findItem(itemToDrop);
        if (variable == null) {
            return false;
        }
        aliceItems.remove(variable);
        theRoomShesin.addItem(variable);
        return true;
    }

    public boolean takeItem(String itemToTake) {
        Item variableitem = theRoomShesin.findItemInRoom(itemToTake);
        if (variableitem == null) {
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

    public Room getCurrentRoom() {
        return theRoomShesin;
    }


}

