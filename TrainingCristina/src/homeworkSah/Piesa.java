package homeworkSah;

/**
 * Created by crtanasescu on 1/8/2017.
 */
public abstract class Piesa {
    LocatiePeTabla locatiePeTabla;
   //daca nu facem niciodata new Piesa() de ce avem constructor? --- ca sa il apelam cu super din clasele derivate
    public Piesa(LocatiePeTabla locatiePeTabla) {
        this.locatiePeTabla = locatiePeTabla;
    }

    public abstract boolean valid(LocatiePeTabla locatiePeTabla, Tabla tabla);
    public abstract void muta(LocatiePeTabla locatiePeTabla);

    @Override
    public String toString() {
        return "Piesa{" +
                "locatiePeTabla=" + locatiePeTabla.x + ", " + locatiePeTabla.y +
                '}';
    }
}
