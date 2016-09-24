package homework2.poligon;

/**
 * Created by Ciprian on 9/24/2016.
 */
public class Punct {
    private float x;
    private float y;

    public Punct(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public void changeCoords(float schimbX, float schimbY){
        this.x = schimbX;
        this.y = schimbY;
    }

    public void afisarePunct(){
        System.out.println("(" + this.x + "," + this.y + ")");

    }
}
