import java.util.ArrayList;

public class Alice {
    private Room theRoomShesin; //the room she's currently in.
    private ArrayList<Item> aliceItems = new ArrayList<>();
    private int aliceHealthPoints;
    private Weapon currentWeapon;


    //moving methods for player
    public Alice(Room firstRoom) {
        theRoomShesin = firstRoom;
        aliceHealthPoints = 100;
        currentWeapon = null;
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


    //health
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

    //items
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


    //item & inventory
    public String findItem() {
        int counter = 1;
        String empty = "";
        for (Item currentItem : aliceItems) {
            empty += "\n" + counter++ + ". " + currentItem.getItem() + currentItem.getItemDescription();
        }
        return empty;
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


    public isIt aliceEats(String eating) {
        Item itemToEat = findItemInInventory(eating);

        if (itemToEat == null) {
            itemToEat = theRoomShesin.findItemInRoom(eating);
        }
        if (itemToEat == null) {
            return isIt.NOTHING_FOUND;
        } else if (itemToEat instanceof Food) {
            aliceHealthPoints = aliceHealthPoints + ((Food) itemToEat).getHealthPoints();
            if (aliceItems.contains(itemToEat)) {
                removeFromInventory(itemToEat);
            } else {
                theRoomShesin.removeItemFromList(itemToEat);
            }
            return isIt.IT_IS;
        } else {
            return isIt.ITS_NOT;
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

    //weaponry:


    public String equipWeapon(String weapon) {
        Item itemToEquip = findItemInInventory(weapon);
        if (itemToEquip == null) {
            return weapon + " is not in inventory";
        } else if (itemToEquip instanceof Weapon) {
            currentWeapon = ((Weapon)itemToEquip);
            aliceItems.remove(itemToEquip);
            return "you equip yourself with " + weapon;
        } else {
            return "that's not a weapon";
        }
    }

    public String attack(){
        Item itemToAttackWith = currentWeapon;
        if (itemToAttackWith == null){
            return "you are not equipped with a weapon";
        }else if(itemToAttackWith instanceof RangedWeapon){
            currentWeapon.remainingUses();
            return "you attack with your " + currentWeapon.getItem() +  ", you used one of your ammos in this weapon.";
        } else {
            return "you attack the enemy with your " + currentWeapon.getItem();
        }
    }

    public boolean useWeapon(){
        return useWeapon();
    }

    public Weapon getCurrentWeapon() {
        return currentWeapon;
    }


    public boolean dropWeapon(String itemToDrop) {
        // checks if the current weapon has the same name as the item we want to drop.
        if (currentWeapon == null || !currentWeapon.getItem().equalsIgnoreCase(itemToDrop)) {
            return false;  // if Alice doesn't have a weapon, or if the weapon don't match, return false.
        }
        // adds the weapon to the room she's in and take it away form alice.
        theRoomShesin.addItem(currentWeapon);
        currentWeapon = null;
        return true;
    }


    public String changeWeapon(String newWeaponName) {
        if (currentWeapon != null) {
            aliceItems.add(currentWeapon);
            System.out.println(currentWeapon.getItem() + " was added to your inventory.");
        }else {
            return "you're not equipped with a weapon";
        }return " ";
    }


}



