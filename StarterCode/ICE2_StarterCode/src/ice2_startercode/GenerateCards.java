/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ice2_startercode;

/** high cohesion
 * generate cards - seperation of concern - Delegation 
 * controller class --main logic - MVC design pattern 
 * deck - generate cards - 4*13 = 52 cards
 * @author kumar
 */
public class GenerateCards 
{
    private int size =56;
    Card[] deck = new Card[size]; //Array of objects
    public void generateHand()
    {
        int c=0;
        for( Card.Suit s :Card.Suit.values() ) //suits -hearts , CLUBS 
        {
            for(Card.Value v : Card.Value.values()) //values  1
            {
                deck[c] = new Card(s,v); //hearts,1,deck [1]=hearts,2
                //Card c1 = new Card();
                c++;
            }
        }
    }
}
