import java.util.Scanner;

public class Game {
    Scanner myScanner = new Scanner(System.in);
    Scanner enterScanner = new Scanner(System.in);
    int playerHp;
    String playerName;
    String playerWeapon;
    int choice;
    int weaponPick;


    public static void main(String[] args){
    Game game;
    game=new Game();
    game.playerSetup();
    game.forrest();
    game.crossRoad();
    game.town();

    }


    public void playerSetup(){
        playerHp=15;

        System.out.println("Please enter your name : ");
        playerName = myScanner.nextLine();
        System.out.println("Hello " + playerName + ", let's start your adventure! ");
        System.out.println("------------------------------------------------------");
        System.out.println("Your HP: " + playerHp);
    }
    public void forrest(){

        System.out.println("");
        System.out.println("");
        System.out.println("------------------------------------------------------/n");
        System.out.println("You are walking in the forrest ");
        System.out.println("You are now in the middle of a glade an you have two options");
        System.out.println("");
        System.out.println("1: Go East");
        System.out.println("2: Go West");
        System.out.println("------------------------------------------------------/n");

       choice = myScanner.nextInt();

       if (choice==1){
           System.out.println("Oops... You made a circle!This forrest is like a maze ");
           enterScanner.nextLine();
           forrest();
       }
        if (choice==2){
            crossRoad();
        }
        else{
            System.out.println("Invalid option");
            enterScanner.nextLine();
            forrest();
        }
    }
    public void crossRoad(){
        System.out.println("------------------------------------------------------\n");
        System.out.println("You are at a crossroad");
        System.out.println("------------------------------------------------------\n");
        System.out.println("Something is shining. What is it? \n\n Oh it is a sword!" +
                "What are you gonna do? ");
        System.out.println("1: Pick it ");
        System.out.println("2: Move on ");
        System.out.println("------------------------------------------------------\n");

        playerWeapon= "Sword";
        weaponPick = myScanner.nextInt();

        if (weaponPick==1){
            System.out.println("You picked the sword up! Your weapon now is: "+playerWeapon +" and you are" +
                    " moving to the town");
            enterScanner.nextLine();
            town();
        }
        if (weaponPick==2){
            System.out.println("You are moving to the town!");
            enterScanner.nextLine();
            town();
        }
        else {
            System.out.println("Invalid option");
            enterScanner.nextLine();
            crossRoad();
        }


    }
    public void town() {
        System.out.println("Welcome to town!");
    }

}
