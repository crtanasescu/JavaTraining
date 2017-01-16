package homeworkSah;

/**
 * Created by crtanasescu on 1/8/2017.
 */
public class LocatiePeTabla {
    protected int x;
    protected int y;

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
}
