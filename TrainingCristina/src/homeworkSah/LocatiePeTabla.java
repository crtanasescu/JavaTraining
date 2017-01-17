package homeworkSah;

/**
 * Created by crtanasescu on 1/8/2017.
 */
public class LocatiePeTabla {
    private int x;
    private int y;

    public LocatiePeTabla(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "LocatiePeTabla{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
