package indi.hj.lordland.object;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Joe
 *
 */
public class Pokes {

    /*
    * holder模式
    * */
    private static class PokesHolder{
        private static Pokes instance=new Pokes();
    }
    private Pokes(){

    }
    public static Pokes getInstance(){
        return PokesHolder.instance;
    }

    private List<Card> pokes=new ArrayList<>();

    public void fullCard(){
        for(int i=1;i<14;i++){
            for(int k=1;k<5;k++){
                Card card=new Card(k,i);
                pokes.add(card);
            }
        }
        Card joker=new Card(1,14);
        Card theJoker=new Card(2,14);
        pokes.add(joker);
        pokes.add(theJoker);
    }

    public void shuffle(){
        Collections.shuffle(pokes);
    }

    public List<Card> getPokes() {
        return pokes;
    }

}
