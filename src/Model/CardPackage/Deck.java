package Model.CardPackage;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.stream.Stream;

/**********************************************************************************
 * This class represents a deck
 *
 * @author Santiago Quirgoa
 * @version 2/18/2018
 *********************************************************************************/
public class Deck {

  /**
   * A list with all the cards
   */
  private ArrayList<Card> deck;

  /**********************************************************************************
   *  This constructor reads a text file and populates the deck with the specific set
   *  of cards.
   *
   * @param fileName
   * @param cardType True for Chance, False for Community Chest
   *********************************************************************************/
  public Deck(String fileName, boolean cardType) {
    //intializes the deck
    deck = new ArrayList<>();

    try (Stream<String> text = Files.lines(Paths.get(fileName))) {

      //Iterates thought every line in the stream
      text.forEach(line -> {
        //Defines and instantiates a Scanner to read through the each line
        Scanner scanner = new Scanner(line).useDelimiter("[,\r\n]+");

        deck.add(new Card(scanner.next(), cardType, new int[]{scanner.nextInt(), scanner.nextInt(),
            scanner.nextInt(), scanner.nextInt(), scanner.nextInt(),
            scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt()}));
      });
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  /**********************************************************************************
   * Returns the card on top of the deck
   *
   * @return
   **********************************************************************************/
  public Card drawCard() {
    return deck.remove(0);
  }

  /**********************************************************************************
   *  Adds the given card to back to the deck
   *
   * @param card
   * @return
   *********************************************************************************/
  public boolean returnCard(Card card) {
    return deck.add(card);
  }

  /**********************************************************************************
   * Shuffles the ArrayList to a speudorandom state.
   *********************************************************************************/
  public void shufleDeck() {
    Collections.shuffle(deck);
  }

  /**
   *
   * @return
   */
  public ArrayList<Card> getDeck() {
    return deck;
  }

  /**
   *
   * @param deck
   */
  public void setDeck(ArrayList<Card> deck) {
    this.deck = deck;
  }
}
