// User interface class to interact with the player via command-line input.

import java.util.NoSuchElementException;
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
        System.out.println("welcome to " +
                "\n" +
                "░█████╗░██╗░░░░░██╗░█████╗░███████╗░██████╗\n" +
                "██╔══██╗██║░░░░░██║██╔══██╗██╔════╝██╔════╝\n" +
                "███████║██║░░░░░██║██║░░╚═╝█████╗░░╚█████╗░\n" +
                "██╔══██║██║░░░░░██║██║░░██╗██╔══╝░░░╚═══██╗\n" +
                "██║░░██║███████╗██║╚█████╔╝███████╗██████╔╝\n" +
                "╚═╝░░╚═╝╚══════╝╚═╝░╚════╝░╚══════╝╚═════╝░\n" +
                "\n" +
                "░█████╗░██████╗░██╗░░░██╗███████╗███╗░░██╗████████╗██╗░░░██╗██████╗░███████╗░██████╗░░█████╗░███╗░░░███╗███████╗\n" +
                "██╔══██╗██╔══██╗██║░░░██║██╔════╝████╗░██║╚══██╔══╝██║░░░██║██╔══██╗██╔════╝██╔════╝░██╔══██╗████╗░████║██╔════╝\n" +
                "███████║██║░░██║╚██╗░██╔╝█████╗░░██╔██╗██║░░░██║░░░██║░░░██║██████╔╝█████╗░░██║░░██╗░███████║██╔████╔██║█████╗░░\n" +
                "██╔══██║██║░░██║░╚████╔╝░██╔══╝░░██║╚████║░░░██║░░░██║░░░██║██╔══██╗██╔══╝░░██║░░╚██╗██╔══██║██║╚██╔╝██║██╔══╝░░\n" +
                "██║░░██║██████╔╝░░╚██╔╝░░███████╗██║░╚███║░░░██║░░░╚██████╔╝██║░░██║███████╗╚██████╔╝██║░░██║██║░╚═╝░██║███████╗\n" +
                "╚═╝░░╚═╝╚═════╝░░░░╚═╝░░░╚══════╝╚═╝░░╚══╝░░░╚═╝░░░░╚═════╝░╚═╝░░╚═╝╚══════╝░╚═════╝░╚═╝░░╚═╝╚═╝░░░░░╚═╝╚══════╝\n" +
                "\n" +
                "██╗███╗░░██╗  ░██╗░░░░░░░██╗░█████╗░███╗░░██╗██████╗░███████╗██████╗░██╗░░░░░░█████╗░███╗░░██╗██████╗░\n" +
                "██║████╗░██║  ░██║░░██╗░░██║██╔══██╗████╗░██║██╔══██╗██╔════╝██╔══██╗██║░░░░░██╔══██╗████╗░██║██╔══██╗\n" +
                "██║██╔██╗██║  ░╚██╗████╗██╔╝██║░░██║██╔██╗██║██║░░██║█████╗░░██████╔╝██║░░░░░███████║██╔██╗██║██║░░██║\n" +
                "██║██║╚████║  ░░████╔═████║░██║░░██║██║╚████║██║░░██║██╔══╝░░██╔══██╗██║░░░░░██╔══██║██║╚████║██║░░██║\n" +
                "██║██║░╚███║  ░░╚██╔╝░╚██╔╝░╚█████╔╝██║░╚███║██████╔╝███████╗██║░░██║███████╗██║░░██║██║░╚███║██████╔╝\n" +
                "╚═╝╚═╝░░╚══╝  ░░░╚═╝░░░╚═╝░░░╚════╝░╚═╝░░╚══╝╚═════╝░╚══════╝╚═╝░░╚═╝╚══════╝╚═╝░░╚═╝╚═╝░░╚══╝╚═════╝░" +
                "  " +
                "  " +
                " "  +
                "\nHere's the game menu:" +
                "\n---------------------------------" +
                "\n* help *_____________ Get instructions or an overview of the commands" +
                "\n* look *_____________ Get a description of the room you're in" +
                "\n* go north *" +
                "\n* go south *" +
                "\n* go east *" +
                "\n* go west *__________ Move in a direction" +
                "\n* exit *_____________ Exit the game" +
                "\n* take + itemName *__ Grab an item" +
                "\n* drop + itemName *__ Drop an item" +
                "\n* inventory *________ View the list of items you're carrying" +
                "\n* health *___________ Check your health in the game" +
                "\n* equip *____________ Equip a weapon from your inventory" +
                "\n* change + weapon *__ Put current weapon back in your inventory" +
                "\n* attack + enemy*____ Attack an enemy" +
                "\n---------------------------------" +
                "\nType 'start' to begin the game");



        userinput = "";
        //the while loop runs until userinput is exit.
        while (!userinput.equalsIgnoreCase("exit")&& adventure.getAlice().getAliceHealthPoints() > 0) {
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
                    isIt isItFood = adventure.canAliceEat(commandoUserinput[1]);
                    switch (isItFood) {
                        case IT_IS:
                            System.out.println("yes! you eat the " + commandoUserinput[1]);
                            break;
                        case NOTHING_FOUND:
                            System.out.println("there's no food in your inventory nor in the room");
                            break;
                        case ITS_NOT:
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
                //equip + the weapon of your choice
                case "equip":
                    System.out.println(adventure.equipWeapon(commandoUserinput[1]));
                    break;
                //attack to attack the enemies you come across.
                case "attack":
                    System.out.println(adventure.attack(commandoUserinput[1]));
                    break;
                case "change":
                    System.out.println(adventure.changeWeapon(commandoUserinput[1]));
                    break;
                //drop + what you want to drop, you leave it in the room.
                case "drop":
                    if (adventure.dropItem(commandoUserinput[1])) {
                        System.out.println("You drop the " + commandoUserinput[1] + " in " + adventure.getCurrentRoomName());
                    }
                    else if (adventure.dropWeapon(commandoUserinput[1])) {
                        System.out.println("You drop the " + commandoUserinput[1] + " in " + adventure.getCurrentRoomName());
                    }
                    else {
                        System.out.println("You don't have a " + commandoUserinput[1] + " in your inventory or equipped.");
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