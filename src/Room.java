import java.util.ArrayList;

// class representing a room in the game, with information about adjacent rooms and description
public class Room {

    // room attributes for name, description, and adjacent rooms.
    private String roomName;
    private String roomDescription;
    private Room northAdjacentRoom;
    private Room southAdjacentRoom;
    private Room eastAdjacentRoom;
    private Room westAdjacentRoom;
    //Arraylist til items:
    private ArrayList<Item> itemList = new ArrayList<>();

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



    //Item methods:
    public ArrayList<Item> getItemList(){
        return itemList;
    }


    //adds to arraylist.
    public void addItem(String item, String itemDescription) {
        itemList.add(new Item(item, itemDescription));
    }

    public void addItem(Item item){
        itemList.add(item);
    }

    public void addFood(String food, String foodDescription, int healthPoints){
        itemList.add(new Food(food,foodDescription,healthPoints));
    }

    public void addMeleeWeapon(String weaponName, String weaponDescription, int healthPoints){
        itemList.add(new MeleeWeapon(weaponName,weaponDescription,healthPoints));
    }

    public void addRangedWeapon(String weaponName, String weaponDescription, int healthPoints, int uses){
        itemList.add(new RangedWeapon(weaponName,weaponDescription,healthPoints,uses));
    }


    public Item findItemInRoom(String takeItem){
        for(Item item:itemList) {
            if (item.getItem().equalsIgnoreCase(takeItem)) {
                return item;
            }
        }
        return null;
    }


    public void removeItemFromList(Item item){
        itemList.remove(item);
    }


    @Override
    public String toString() {
        String variabel;
        int counter = 1;
        variabel = getRoomName() + ", " + getRoomDescription();
        if (!itemList.isEmpty()) {
            variabel += "\nthe items in the room are ";
            for (Item currentItem : itemList) {
                variabel += "\n" + counter++ + ". " + currentItem.getItem() + currentItem.getItemDescription();
            }
        }
        return variabel;
    }
}

