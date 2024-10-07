// User interface class to interact with the player via command-line input.

import java.util.Scanner;

public class UserInterface {

    Adventure adventure; //instance of adventure class to manage the game

    public UserInterface() {
        adventure = new Adventure();
    }

    //method to display the game and handle user input.
    public void StartGame() {


        Scanner input = new Scanner(System.in);

        String userinput = "";

        //instructions for the game.
        System.out.println("welcome to the game" +
                "\n*help* - if you want instructions or an overview of the commandos" +
                "\n*look* - if you want to have the description of the room you're in one more time, write 'look'" +
                "\n*go north*\n*go south*\n*go east*\n*go west* - to move in whatever direction you want." +
                "\n*exit* - if you want to exit the game write 'exit'" +
                "\n*take + itemname* - to grab an item" +
                "\n*drop + itemname* - to drop an item" +
                "\n*inventory* - to get a list of items you carry" +
                "\n*health* - to see your health in the game." +
                "\nwrite 'start' to begin the game");


        userinput = "";
        //the while loop runs until userinput is exit.
        while (!userinput.equalsIgnoreCase("exit")) {
            userinput = input.nextLine();
            String[] commandoUserinput = userinput.split(" ");
            switch (commandoUserinput[0]) {
                //start of game
                case "start":
                    System.out.println(adventure.getCurrentRoomDetails());
                    break;
                //look, is for when you want the room number and description refreshed.
                case "look":
                    System.out.println(adventure.getCurrentRoomDetails());
                    break;
                //help is for orientation menu.
                case "help":
                    System.out.println("HELP MENU: \n" +
                            "'go north' - to go north.\n" +
                            "'go south' - to go south.\n" +
                            "'go east' - to go east.\n" +
                            "'go west' - to go west.\n" +
                            "'exit' - to end game.\n" +
                            "'look' - to get room number and description again.");
                    break;
                    //for eating food and getting health.
                case "eat":
                    isItFood isItFood = adventure.canAliceEat(commandoUserinput[1]);
                    switch(isItFood){
                        case IT_IS_FOOD:
                            System.out.println("yes! you eat the" + commandoUserinput[1]);
                            break;
                        case NO_FOOD_FOUND:
                            System.out.println("there's no food in your inventory nor in the room");
                            break;
                        case NOT_FOOD:
                            System.out.println("That's not food, you can't eat that!");
                        default:
                    }
                    break;
//                Health for at se health
                case "health":
                    System.out.println(adventure.aliceHealth());
                    break;
                //take + item to pick up the item in the room
                case "take":
                    if (adventure.takeItem(commandoUserinput[1]) == true) {
                        System.out.println("you take the " + commandoUserinput[1] + " from the room");
                    } else {
                        System.out.println("theres no " + commandoUserinput[1] + " in the room");
                    }
                    break;
                //drop + the item you want to drop in the current room
                case "drop":
                    if (adventure.dropItem(commandoUserinput[1]) == true) {
                        System.out.println("you drop the " + commandoUserinput[1] + " in " + adventure.getCurrentRoomName());
                    } else {
                        System.out.println("you don't have a " + commandoUserinput[1] + " in your inventory");
                    }
                    break;
                //inventory to check what items you are carrying
                case "inventory":
                    System.out.println(adventure.findItem());
                    break;
                // go + whatever direction you want to go.
                case "go":
                    if (adventure.canAliceMove(commandoUserinput[1])) {
                        adventure.moveAliceToRoom(commandoUserinput[1]);
                        System.out.println("you go " + commandoUserinput[1]);
                    } else {
                        System.out.println("you can't go " + commandoUserinput[1] + " from here");
                    }
                    System.out.println(adventure.getCurrentRoomDetails());
                    break;
                //press exit to exit game
                case "exit":
                    break;

                default:
                    //handle unrecognized commands.
                    System.out.println("unknown command. Type 'help' for assistance.");

            }
        }
    }
}
