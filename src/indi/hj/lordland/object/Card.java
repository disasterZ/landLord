package indi.hj.lordland.object;

/**
 * @author Joe
 *
 */
public class Card {
    private int decor;
    private int number;
    private int code;

    public Card(int decor, int number) {
        this.decor = decor;
        this.number = number;
        this.code = decor+number*10;
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

    @Override
    public String toString() {
        return "Card{" +
                "code=" + code +
                '}';
    }
}
