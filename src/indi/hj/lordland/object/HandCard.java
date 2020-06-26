package indi.hj.lordland.object;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author Joe
 *
 */
public class HandCard implements Comparator<Card>{
    List<Card> cards =new ArrayList<>();

    public void addCard(Card card){
        cards.add(card);
    }

    public void addCards(List<Card> cardList){
        cards.addAll(cardList);
        this.sortCards();
    }

    public void removeCards(List<Card> cardList){
        for(Card card:cardList){
            cards.remove(card);
        }
    }

    public void sortCards(){
        cards.sort(this::compare);
    }

    public List<Card> getCards() {
        return cards;
    }

    @Override
    public int compare(Card o1, Card o2) {
        if(o1.getCode()>o2.getCode()){
            return -1;
        }else {
            return 1;
        }
    }

    @Override
    public String toString() {
        List<Integer> list=new ArrayList<>();
        for(Card card:cards){
            list.add(card.getCode());
        }
        return "Cards{" +
                "handCards=" + list +
                '}';
    }
}
