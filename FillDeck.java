/* If you randomly found a playing card on the floor every day, how many days
 * to fill a full deck? Based on this reddit question:
 * https://www.reddit.com/r/askscience/comments/6y93j8/if_you_were_to_randomly_find_a_playing_card_on/
 */

import java.util.HashSet;
import java.lang.Math;

public class FillDeck {
   
   public static void main(String[] args) {
      
      int trials = 1000;
      HashSet<Integer> deck = new HashSet<Integer>();
      int totaldays = 0;
      
      for(int i = 0; i < trials; i++) {
         int days = 0;
         while (deck.size() != 52) {
            int card = (int)(Math.random() * 52);
            deck.add(card);
            days++;            
         }
         System.out.println(days + " days to fill deck.");
         deck.clear();
         totaldays += days;
      }
      System.out.println("Average days to fill deck: " + (double) (totaldays) / (trials));
      
   }
}
