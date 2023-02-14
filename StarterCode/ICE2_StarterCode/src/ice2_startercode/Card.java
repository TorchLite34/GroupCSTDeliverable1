/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ice2_startercode;

/** enum - loose coupling
 * enum - value and type safety
 * enum - predefined constants
 * enum is a special class, is an user defined data type
 * Modeled the card class - raw data 
 * * @author kumar
 */
public class Card  //model class
{
    public enum Suit {HEARTS,DIAMONDS,SPADES,CLUBS};
    public enum Value {ACE,TWO,THREE,FOUR,FIVE,SIX,SEVEN,EIGHT,NINE,TEN,JACK,QUEEN,KING,JOKER};
    private Suit s; // enum user defined datatype 
    private Value v;
    public Card(Suit s,Value v)
    {
        this.s=s;
        this.v=v;
    }
    /**
     * @return the s
     */
    public Suit getS() {
        return s;
    }

    /**
     * @param s the s to set
     */
    public void setS(Suit s) {
        this.s = s;
    }

    /**
     * @return the v
     */
    public Value getV() {
        return v;
    }

    /**
     * @param v the v to set
     */
    public void setV(Value v) {
        this.v = v;
    }
}
