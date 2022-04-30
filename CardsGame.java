import java.util.*;

class Cards {
    private int value;
    private String suit;

    public void setCards(String suit, int r) {
        this.value = r;
        this.suit = suit;
    }

    //Write your code here.
    public String getSuit(){
        return this.suit;
    }
    
    public int getValue(){
        return this.value;
    }

    public int getSuitPriority(String suitString) {

        //Write your code here.
        // Spades > Diamond > Hearts > Clubs 
        String receivedSuit = suitString;
        // System.out.println("Received Suit:" + receivedSuit);
        int incPoints;
        if(receivedSuit.equals("spades")){
            incPoints = 4;
        }else if(receivedSuit.equals("diamonds")){
            incPoints = 3;
        }else if(receivedSuit.equals("hearts")){
            incPoints = 2;
        }else if(receivedSuit.equals("clubs")){
            incPoints = 1;
        }else{
            incPoints = 0;
        }
        return incPoints;
    }
}

class ClassicGame {
    int points1 = 0;
    int points2 = 0;

    public void game(Cards c1, Cards c2) {

        //Write your code here.
        points1 = c1.getValue();
        points2 = c2.getValue();
        
        if(points1 == points2){
            String compSuit1 = c1.getSuit();
            String compSuit2 = c2.getSuit();

            points1 = c1.getSuitPriority(compSuit1);
            points2 = c2.getSuitPriority(compSuit2);
        }
        if(points1 > points2){
            points1 = 1;
            points2 = 0;
        }else if(points2 > points1){
            points1 = 0;
            points2 = 1;
        }else{
            points1 = 0;
            points2 = 0;
        }

        System.out.println("points of player 1 :" + " " + points1);
        System.out.println("points of player 2 :" + " " + points2);
    }

}

public class CardsGame {

    public static void main(String[] args) {
        //Two objects (cards) of class Cards
        Cards c1 = new Cards();
        Cards c2 = new Cards();
        Scanner in = new Scanner(System.in);
        //Enter the suit of card 1
        String s1 = in.nextLine();
        c1.setCards(s1, in.nextInt());
        in.nextLine();
        //Enter the suit of card 2
        String s2 = in.nextLine();
        c2.setCards(s2, in.nextInt());
        ClassicGame c = new ClassicGame();

        c.game(c1, c2);
    }
}
