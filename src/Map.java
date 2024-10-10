import java.util.List;
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
        //room objects with description and name
        Room room1 = new Room("The Enchanted Woods:", "\nAs you wander into the Enchanted Wood, a kaleidoscope of colours surround you, each leaf dancing on top of the trees. " +
                "\nWhispers of laughter and chatter flies through the air, tickling your ears, yet the speakers remain hidden among the towering trees.");
        Room room2 = new Room("Mr. Rabbit's Cozy house:", "\nYou find yourself within a delightful little house, where everything exudes charm and warmth." +
                "The air is sweet with the smell of freshly baked cookies, creating an idyllic scene that feels like a dream.");
        Room room3 = new Room("The Walrus' dinner table:", "\nhere you are, seated at the dinner table of the Walrus, surrounded by small, innocent oyster babies, " +
                "eargerly anticipating the feast that awaits. little do they know, their fate hangs in a thin thread, for the Walrus has a rather big appetite!");
        Room room4 = new Room("The March Hare's Tea Party", "\nyou now stand in a whimsical room where a March Hare and a peculiar fellow with a very VERY big and wierd hat sits, " +
                "\nteacups of every shape and size and colour are everywhere, alongside towering cakes that seem to defy gravity. they sing an utterly nonsensical birthday tune.");
        Room room5 = new Room("the Teeny tiny room:", "\n welcome to a pint-sized chamber, it's walls closing in around you. there's but one door. a sturdy pillar with a jar of cookies on top," +
                "and a curious potion that has a little sign, that reads: drink me!");
        Room room6 = new Room("the Caterpillar's fungal realm:", "\nnow you find yourself amidst the grandest fungi you've ever seen, towering high like a skyskraper. " +
                "perched atop one is a caterpillar, even larger than you. lazily puffing on a hookah while singing a curious melody and blowing smoke letters into the air.");
        Room room7 = new Room("the Dark Forest:", "\nin an instant you are surrounded by darkness, you are standing in a forest.\n" +
                "it feels like there's eyes watching you from everywhere, and you can hear a mischievous laugh, from the top of the tree in front of you, who might that be?");
        Room room8 = new Room("the Singing Flowers:", "\nwow, what's going on?\nyou're standing in the middle of a flower bed with a choir of flowers singing in perfect harmony,\n" +
                "you try to join their melody, but the choir leader seems rather insistent you stay silent!");
        Room room9 = new Room("The Card Castle:", "Wait a moment! That’s not merely a house; it’s a castle made entirely of cards!" +
                "You ponder who might reside in such an extraordinary place, where whimsy reigns supreme.");


        theFirstRoom = room1;

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


        //Items
        room1.addItem("watch", "  it's the white rabbits pocket watch! we will have to find him and give it back.");
        room5.addItem("potion", " it's filled with a purple liquid and theres a little note tied to it, that says, drink me.");
        room4.addItem("teacup", " it's a teacup from the wierd teaparty, wonder what flavour it is?.");
        room9.addItem("paintbrush", " and it's lying next to a bucket filled with red paint.");


        //Food:
        room5.addFood("cookie", " it's a freshlybaked vanilla cookie, with frosting that says eat me!", -50);
        room2.addFood("muffin", " it's a yellow muffin with blue buttercream and a little sign on top that says 'take a bite!'", +20);
        room4.addFood("cake", " mmm the cake smells lovely, should you have some? it says so on the top!'", +20);
        room6.addFood("fungi", " the caterpillar tells you to eat the fungi, but should you do it? ", +10);


        //Weapons:
        room2.addMeleeWeapon("sword", " it's the queen of hearts sword, it is used only to cap of heads of those who does not do as the queen commands.", 100);
        room4.addRangedWeapon("bow", " it's a bow, with it is 5 arrows", 30, 5);
        room1.addMeleeWeapon("morningstar", " this weapon is made for destroying you enemies.", 40);


        //enemyWeapons:
        Weapon cards = new RangedWeapon("cards", "the queen of hearts has a blood-red sword, with the longest and sharpest blade", 40, 52);
        Weapon teacup = new RangedWeapon("brokenTeaCup "," the madhatter has a broken teacup, that he uses as a grenade", 10, 1);
        Weapon teeth = new MeleeWeapon("teeth", "the cheshirecats teeth are sharp an venomous!", 30);


        //Enemies:
        room9.addEnemy("queen", " the queen of hearts is the most viscious of all, we have to kill her to save all of Wonderland.", 100, 20, cards);
        room4.addEnemy("madhatter", " the madhatter is as his name says, mad, he will haunt you and taunt you, what are you gonna do about it?", 100, 5, teacup);
        room7.addEnemy("cheshirecat", " the cheshirecat uses his venomous bite, to attack people, so you better run, or start fighting?", 100, 30, teeth);

    }

    // getter for the first room.
    public Room getTheFirstRoom() {
        return this.theFirstRoom;
    }




}

