/**
 * Created by liza on 21.06.16.
 */
public class RtriangleImpl implements Rtriangle {

    private int x1, x2, x3, y1, y2, y3;

    public RtriangleImpl(int x1, int y1, int x2, int y2, int x3,  int y3){
        this.x1 = x1;
        this.x2 = x2;
        this.x3 = x3;
        this.y1 = y1;
        this.y2 = y2;
        this.y3 = y3;
    }

    public int getApexX1() {
        return x1;
    }

    public int getApexY1() {
        return y1;
    }

    public int getApexX2() {
        return x2;
    }

    public int getApexY2() {
        return y2;
    }

    public int getApexX3() {
        return x3;
    }

    public int getApexY3() {
        return y3;
    }
}
