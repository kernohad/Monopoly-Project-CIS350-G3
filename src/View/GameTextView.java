package View;

import java.util.Scanner;

/**********************************************************************
 * The text based view for monopoly
 *
 * @author Dylan Kernohan
 * @version 3/12/2018
 *********************************************************************/
public class GameTextView {

  Scanner scanner = new Scanner(System.in);

  /**********************************************************************
   * This method prompts the user for a command used to play the game.
   *
   * @return The command entered by the user.
   *********************************************************************/
  public String getCommand() {
    // Prompt user for command
    System.out.print(">> ");
    String command = scanner.nextLine();

    return command;
  }

  /**********************************************************************
   * This method prompts the user for the number of players playing the game
   *
   * @return The number of players entered
   *********************************************************************/
  public int getNumPlayers() {
    //TODO: Add validation to prevent characters entered. Only ints.

    System.out.print("How many players want to play?\n>> ");
    int num = scanner.nextInt();
    scanner.nextLine();

    return num;
  }

  /**********************************************************************
   * This method prompts for a single players name
   *
   * @param num The player number whos name is wanted
   * @return The player name entered.
   *********************************************************************/
  public String getPlayerName(int num) {
    //TODO: Add validation to prevent anything other than desired characters entered.
    System.out.println("------------------------------------------------------");
    System.out.printf("What is Player %d's name?\n>>", num);
    String playerName = scanner.nextLine();

    return playerName;
  }

  /**********************************************************************
   * This method prompts for a single players token
   *
   * @param num The player number whos token is wanted
   * @return The player token entered.
   *********************************************************************/
  public String getPlayerToken(int num) {
    //TODO: Add validation to prevent anything other than desired characters entered.

    System.out.printf("What is Player %d's token?\n>>", num);
    String playerToken = scanner.nextLine();

    return playerToken;
  }

  /**********************************************************************
   * This method prints the players location
   *
   * @param num The dice value the player rolled
   * @param name The location's name.
   * @param owner The name of the owner of that location.
   *********************************************************************/
  public void printLocation(int num, String name, String owner) {
    System.out.println("------------------------------------------------------");
    System.out
        .printf("You rolled: %d\nYou are at location: %s\nOwner of this location: %s\n", num, name,
            owner);

  }

  /**********************************************************************
   * This method prints the current players name
   *
   * @param name The current players name
   *********************************************************************/
  public void printCurrentPlayer(String name) {
    System.out.println("------------------------------------------------------");
    System.out.printf("%s's turn.\n", name);
  }

  /**********************************************************************
   * This method prints action not allowed error
   *********************************************************************/
  public void printActionError() {
    System.out.println("------------------------------------------------------");
    System.out.printf("You cannot perform that action right now.\n");
  }

  /**********************************************************************
   * This method prints square bought successful
   *
   * @param name The name of the square that was bought
   *********************************************************************/
  public void printBuySuccessful(String name) {
    System.out.println("------------------------------------------------------");
    System.out.printf("You bought %s.\n", name);
  }

  /**********************************************************************
   * This method prints square could not be bought
   *********************************************************************/
  public void printBuyFail() {
    System.out.println("------------------------------------------------------");
    System.out.printf("You do not have enough money to buy this property\n");
  }

  /**********************************************************************
   * This method prints all the properties the player owns
   *
   * @param name The name of the property to print
   *********************************************************************/
  public void printOwnedSquares(String name, int counter) {
    if (counter < 1) {
      System.out.printf("Properties owned:\n\t%s\n", name);
    } else {
      System.out.printf("\t%s\n", name);
    }
  }

  /*********************************************************************
   * This method prints the current value of booth dies.
   * @param dieOne
   * @param dieTwo
   ********************************************************************/
  public void printDies(int dieOne, int dieTwo) {
    System.out.printf("die 1: %d die 2: %d\n", dieOne, dieTwo);
  }

  /**
   * this method reports when a property cannot be bought
   */
  public void printCannotBuy() {
    System.out.println("This property cannot be bought at the moment.");
  }

  public void notAValidCommand() {
    System.out.println("You enter an unknown command");
  }

<<<<<<< HEAD
  public void printTaxCollected(int tax) {
    System.out.println("You paid "+  tax + " in fees/rent");
=======
  public void printPlayerWallet(int amount){
    System.out.println("------------------------------------------------------");
    System.out.printf("Wallet: $%d\n\n", amount);
  }

  public void printPossibleActions(String action, int counter){
    if (counter < 1) {
      System.out.println("------------------------------------------------------");
      System.out.printf("You can use these actions:\n\t%s\n", action);
    } else {
      System.out.printf("\t%s\n", action);
    }

>>>>>>> master
  }
}
