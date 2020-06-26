package indi.hj.lordland.test;

import indi.hj.lordland.object.Card;
import indi.hj.lordland.object.HandCard;
import indi.hj.lordland.object.Player;
import indi.hj.lordland.object.Pokes;

/**
 * @author Joe
 *
 */
public class Test {
    public static void main(String[] args) {
        Pokes pokes=Pokes.getInstance();
        pokes.fullCard();
        pokes.shuffle();
        Player one=new Player("one");
        Player two=new Player("two");
        Player three=new Player("three");
        HandCard hand=new HandCard();
        for(int i=0;i<pokes.getPokes().size();i++){
            Card card=pokes.getPokes().get(i);
            if(i>=51){
                hand.addCard(card);
            }else {
                if(i%3==0){
                    one.addCard(card);
                }else if(i%3==1){
                    two.addCard(card);
                }else {
                    three.addCard(card);
                }
            }
        }
        one.sortCards();
        two.sortCards();
        three.sortCards();
        System.out.println(hand.toString());
        three.setStatus(1);
        if(three.getStatus()==1){
            three.addCards(hand.getCards());
        }
        System.out.println(three.toString());
        three.removeCards(hand.getCards());
        System.out.println(three.toString());
    }

}
