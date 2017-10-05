package lession.excamples;

/**
 * Created by Markus on 10/5/17.
 */
public class Operations {
    public Operations() {

    }

    public int computeGgt(int a, int b) {
        if (a == 0) {
            return b;
        }

        while (b != 0) {
            if (a > b) {
                a -= b;
            } else {
                b = b - a;
            }
        }

        return a;
    }
}
