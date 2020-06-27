package indi.hj.lordland.ui;

import indi.hj.lordland.object.Card;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Joe
 * @date 2020/6/26 16:48
 */
public class DrawFarme extends JPanel {
    private List<List<Card>> cards=new ArrayList<>();
    private List<Integer> x=new ArrayList<>();
    private List<Integer> y=new ArrayList<>();

    public DrawFarme(List<Card> player1, int x1, int y1,List<Card> player2, int x2, int y2,List<Card> player3, int x3, int y3,List<Card> playerhand, int x4, int y4) {
        cards.add(player1);
        cards.add(player2);
        cards.add(player3);
        cards.add(playerhand);
        x.add(x1);
        x.add(x2);
        x.add(x3);
        x.add(x4);
        y.add(y1);
        y.add(y2);
        y.add(y3);
        y.add(y4);
    }

    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D)g;
        for(int i=0;i<x.size();i++){
            List<Card> cardList=cards.get(i);
            int xs=x.get(i);
            int ys=y.get(i);
            for(Card card:cardList){
                g2.drawImage(card.getDraw(),xs,ys,null);
                xs+=20;
            }
        }
        g2.drawString("玩家1",30,30);
        g2.drawString("玩家2",30,190);
        g2.drawString("玩家3",30,380);
        g2.drawString("底牌",30,540);
    }
}
