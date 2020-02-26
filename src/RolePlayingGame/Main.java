package RolePlayingGame;
import java.util.Scanner;
import java.util.Random;
import RolePlayingGame.Locations.*;
import RolePlayingGame.Monsters.*;

public class Main {
    public static void main(String[] args) {
        //Game initialization
        Scanner scan = new Scanner(System.in);
        WorldMap worldMap = new WorldMap();
        System.out.println("Hello! Welcome to this wonderful world!\n");
        System.out.println("In this world, you battle monsters.\n");
        System.out.println("You can also capture them, and battle with them.\n");
        System.out.println("In order to capture them, you need to weaken them, then you need to use a capture disk.\n You have been given 10 to start.");
        System.out.println("***");
        System.out.println("What is your name?");
        String name = scan.nextLine();
        Player player = new Player(name);

        //Main game loop
        boolean gameEnd = false;
        while (!gameEnd) {
            System.out.println("What will you do?");
            System.out.println("you may move, search, view party, view map, or end");
            String action = scan.nextLine().toLowerCase();
            switch(action) {
                case "move":
                    System.out.println("Which direction?");
                    System.out.println("North, South, East, West");
                    char dir = scan.nextLine().toLowerCase().charAt(0);
                    switch(dir) {
                        case 'n':
                            player.setLoc_y(player.getLoc_y() + 1);
                            break;
                        case 'e':
                            player.setLoc_x(player.getLoc_x() + 1);
                            break;
                        case 's':
                            player.setLoc_y(player.getLoc_y() - 1);
                            break;
                        case 'w':
                            player.setLoc_x(player.getLoc_x() - 1);
                            break;
                    }//end nested switch
                    break;


                //TODO add search functionality
                case "search":
                    String playerLocation = worldMap.getMap()[player.getLoc_y()][player.getLoc_x()];
                    System.out.println(playerLocation);
                    Random random = new Random();
                    switch(playerLocation) {

                        case "Forest":
                            Forest forest = new Forest();
                            String opponent = null;
                            opponent = forest.getMonRoster()[random.nextInt(forest.getMonRoster().length)];
                            System.out.println("You found a wild " + opponent);
                            System.out.println("Fight it? yes/no");
                            char battle = scan.next().toLowerCase().charAt(0);
                            switch(battle){
                                case 'y':
                                    combat(opponent, player);
                                    break;
                                default:
                                    break;
                            }
                    }
                    break;


                case "view party":
                    if (player.getTeam().length != 0){
                        for(int i = 0; i <= player.getTeam().length ; i ++) {

                            System.out.println(player.getTeam()[i].getName());
                        }
                    }
                    else {
                        System.out.println("No monsters in party.");
                    }
                    break;


                case "map":
                    for (int i = 0; i < worldMap.getMap().length; i ++) {
                        for (int j = 0; j < worldMap.getMap()[i].length; j ++) {
                            System.out.print(worldMap.getMap()[i][j] + " ");
                        }
                        System.out.print("\n");

                    }
                    break;
                case "end":
                    gameEnd = true;
                    break;
                default:
                    break;
            }//end action switch
        }//End game loop

        scan.close();
    }//End main
    public static void combat(String encounter, Player player) {
        Monster opponent = null;
        Character combatant = null;
        switch(encounter) {
            case "forret":
                Forret forret = new Forret();
                opponent = forret;
                break;
        }//end opponent switch

        try {
            combatant = player.getTeam()[0];
        }
        catch(ArrayIndexOutOfBoundsException ex) {
            combatant = player;
        }//end try-catch

        System.out.println("Opponent: " + opponent.getName());
        System.out.println("Combatant: " + combatant.getName());
        boolean combat = true;
        while(combat) {
            if (combatant.getSpeed() <= opponent.getSpeed()) {
                //OpTurn();
                PTurn(combatant, opponent);
                break;
            }
        }
    }//end combat
    public static void PTurn(Character combatant, Character opponent) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Player turn");
        System.out.println("You can:\nAttack\nBag\nSwitch\nRun");
        char action = scan.nextLine().toLowerCase().charAt(0);
       /* switch(action) {
            case 'a':

                combatant.getMoves();

        }*/
    }
}//End