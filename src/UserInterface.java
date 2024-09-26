import java.util.Scanner;

public class UserInterface {

    Controller controller;

    public UserInterface(Controller controller){
        this.controller=controller;
    }

    public void displayMenu() {


        Scanner input = new Scanner(System.in);

        String userinput = "";

        Adventure myAdventure = new Adventure();
        myAdventure.buildAdventure(); //we start in room1 here(aka currentRoom).

        System.out.println("welcome to the game" +
                "\nif you want instructions or an overview of the commandos write 'help'" +
                "\nif you want to have the description of the room you're in one more time, write 'look'" +
                "\nwhen you're in a room you have some options:" +
                "\nto move to another room you can write \n'go north', \n'go south', \n'go east', \n'go west' \nto move in whatever direction you want." +
                "\nif you want to exit the game write 'exit'" +
                "\nwrite 'start' to begin the game");


        userinput = "";
        //while loopet runs until userinput is exit.
        while (!userinput.equalsIgnoreCase("exit")) {
            userinput = input.nextLine();
            switch (userinput) {
                //start of game
                case "start":
                    System.out.println(myAdventure.getCurrentRoomNumber() + ", " + myAdventure.getCurrentRoomDescription());
                    break;
                //look, is for when you want the room number and description refreshed.
                case "look":
                    System.out.println("room: " + myAdventure.getCurrentRoomNumber() +
                            "\nbeskrivelse: " + myAdventure.getCurrentRoomDescription());
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
                // for going in any direction.
                case "go north":
                case "go south":
                case "go east":
                case "go west":
                    if (myAdventure.canMove(userinput)) {
                        myAdventure.moveToRoom(userinput);
                        System.out.println("you " + userinput);
                    } else {
                        System.out.println("you can't " + userinput + " from here");
                    }
                    System.out.println("to " + myAdventure.getCurrentRoomNumber() + ", " + myAdventure.getCurrentRoomDescription());
                    break;

                default:

            }
        }
    }
}
