package indi.hj.lordland.object;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * @author Joe
 *
 */
public class Card {
    private int decor;
    private int number;
    private int code;
    private BufferedImage draw;



    public Card(int decor, int number) {
        this.decor = decor;
        this.number = number;
        this.code = decor+number*10;
        {
            try {
                draw = ImageIO.read(new File(System.getProperty("user.dir")+"/image/"+code +".jpg"));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public int getDecor() {
        return decor;
    }


    public int getNumber() {
        return number;
    }


    public int getCode() {
        return code;
    }

    public BufferedImage getDraw() {
        return draw;
    }

    @Override
    public String toString() {
        return "Card{" +
                "code=" + code +
                '}';
    }
}
