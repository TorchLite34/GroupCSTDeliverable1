/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package ice2_startercode;

/**
 *
 * @author Sivagama
 */
public class ICE2_StarterCode {

    /** responsibility is user interaction - view class 
     * @param args the command line arguments - 52 crds 
     */
    public static void main(String[] args) 
    {
       // delegation 
        GenerateCards ch = new GenerateCards();
        ch.generateHand(); //cards are generated now 
        for( Card c : ch.deck)
        {
            System.out.println(c.getS() + " "+c.getV());
        }
    }

}
