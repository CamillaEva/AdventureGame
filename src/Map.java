import java.util.Random;

//class that handles the game map, managing rooms and movement logic.
public class Map {
    private Room theFirstRoom;


    //constructor for map, which automatically builds the map when created.
    public Map() {
        buildMap();
    }


    //method to build the map, setting up room connections.
    public void buildMap() {


        //room objects 1 through 9
        Room room1 = new Room("1", "description of room 1");
        Room room2 = new Room("2", "description of room 2");
        Room room3 = new Room("3", "description of room 3");
        Room room4 = new Room("4", "description of room 4");
        Room room5 = new Room("5", "description of room 5");
        Room room6 = new Room("6", "description of room 6");
        Room room7 = new Room("7", "description of room 7");
        Room room8 = new Room("8", "description of room 8");
        Room room9 = new Room("9", "description of room 9");


        theFirstRoom = room1;

//        //room objects with description and name, to use when personify game.
//        currentRoom = new Room("The Magic Forest:", "\nyou find yourself in the magic forest, its bright green and very vibrant\n" +
//                "you can hear some people talk, somewhere nearby, but you can't see anybody.");
//        Room room2 = new Room("Mr. Rabbits house:", "\nyou stand in a pretty little house where everything is cute and cozy. \n" +
//                "it smells like freshbaked cookies, everything is so idyllic");
//        Room room3 = new Room("The Walrus' dinner table:", "\nyou find yourself sitting at the dinner table of the Walrus, \n" +
//                "all around it are small oyster babies ready to get some promised delicious food, but what they don't know i that the walrus is about to eat them all.");
//        Room room4 = new Room("The March Hare's Tea Party", "\nyou now stand in a room where a March Hare and a man with a very big and wierd hat sits, \nsurrounded" +
//                "by thousands of teacups and big cakes. \nthey are singing some kind of wierd birthday song but like a non-birthday song.");
//        Room room5 = new Room("the Room:", "\nyou are now in a teeny tiny itty bitty room, with only one door, a pillar with a jar of cookies and some kind of potion.");
//        Room room6 = new Room("the Catarpillars':", "\nnow you are standing between the biggest funghis you ever saw in your entire life, on top of one of them \n" +
//                "is a catarpiller even bigger than you. it's smoking a hookah and singing a curious song.");
//        Room room7 = new Room("the Dark Forest:", "\nsuddenly everything is all dark, and creepy, you are standing in a forest.\n" +
//                "it feels like there's eyes watching you from everywhere, and you can hear a mischievous laugh, from the top of the tree in front of you");
//        Room room8 = new Room("the Singing Flowers:", "\nwow, what's going on?\nyou're standing in the middle of a flower bed with a choir of flowers singing in perfect harmony,\n" +
//                "you try to sing along but the choir leader is not having any of it.");
//        Room room9 = new Room("the Cardhouse:", "\nno wait, it's not a house, that's a castle. made of cards?" +
//                "you wonder who lives such a place...");


        //setting adjacent rooms for each room

        //room1 adjacent rooms
        room1.setNorthAdjacentRoom(null);
        room1.setSouthAdjacentRoom(room4);
        room1.setEastAdjacentRoom(room2);
        room1.setWestAdjacentRoom(null);

        //room2 adjacent rooms
        room2.setNorthAdjacentRoom(null);
        room2.setSouthAdjacentRoom(null);
        room2.setEastAdjacentRoom(room3);
        room2.setWestAdjacentRoom(room1);

        //room3 adjacent rooms
        room3.setNorthAdjacentRoom(null);
        room3.setSouthAdjacentRoom(room6);
        room3.setEastAdjacentRoom(null);
        room3.setWestAdjacentRoom(room2);

        //room4 adjacent rooms
        room4.setNorthAdjacentRoom(room1);
        room4.setSouthAdjacentRoom(room7);
        room4.setEastAdjacentRoom(null);
        room4.setWestAdjacentRoom(null);

        //room5 adjacent rooms
        room5.setNorthAdjacentRoom(null);
        room5.setSouthAdjacentRoom(room8);
        room5.setEastAdjacentRoom(null);
        room5.setWestAdjacentRoom(null);

        //room6 adjacent rooms
        room6.setNorthAdjacentRoom(room3);
        room6.setSouthAdjacentRoom(room9);
        room6.setEastAdjacentRoom(null);
        room6.setWestAdjacentRoom(null);

        //room7 adjacent rooms
        room7.setNorthAdjacentRoom(room4);
        room7.setSouthAdjacentRoom(null);
        room7.setEastAdjacentRoom(room8);
        room7.setWestAdjacentRoom(null);

        //room8 adjacent rooms
        room8.setNorthAdjacentRoom(room5);
        room8.setSouthAdjacentRoom(null);
        room8.setEastAdjacentRoom(room9);
        room8.setWestAdjacentRoom(room7);

        //room9 adjacent rooms
        room9.setNorthAdjacentRoom(room6);
        room9.setSouthAdjacentRoom(null);
        room9.setEastAdjacentRoom(null);
        room9.setWestAdjacentRoom(room8);


        //Items test:

        room1.addItem("watch", "  it's the white rabbits pocket watch! we will have to find him and give it back.");
        room5.addItem("bottle", " it's filled with a purple liquid and theres a little note tied to it, that says, drink me.");
        room4.addItem("teacup", " it's a teacup from the wierd teaparty, wonder what flavour it is?.");
        room9.addItem("paintbrush", " and it's lying next to a bucket filled with red paint.");
        room1.addFood("cookie", " it's a freshlybaked vanilla cookie, with frosting that says eat me!", 20);
        room4.addFood("muffin", " it's a yellow muffin with blue buttercream and a little sign on top that says 'take a bite!'", -20);


    }

    // getter for the first room.
    public Room getTheFirstRoom() {
        return this.theFirstRoom;
    }


}
