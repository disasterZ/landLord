package indi.hj.lordland.object;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Joe
 *
 *
 */
public class Player extends HandCard {
    private String userName;
    private int status=0;
    private int sorce=0;

    public Player(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getSorce() {
        return sorce;
    }

    public void setSorce(int sorce) {
        this.sorce = sorce;
    }

    @Override
    public String toString() {
        List<Integer> list=new ArrayList<>();
        for(Card card:cards){
            list.add(card.getCode());
        }
        return "Player{" +"Player="+userName+
                "/handCards=" + list +
                '}';
    }
}
