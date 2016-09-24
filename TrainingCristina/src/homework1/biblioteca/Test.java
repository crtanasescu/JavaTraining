package homework1.biblioteca;



import java.util.ArrayList;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        ArrayList<Carte> carti = new ArrayList<>();

        Scanner s = new Scanner(System.in);
        System.out.println("Intruduceti numarul de carti pentru care veti indtroduce date:");
        int i = Integer.parseInt(s.nextLine());
        for (int j=1; j<=i; j++) {
            Carte carte = new Carte();
            System.out.println("Titlul cartii este:");
            carte.setTitlu(s.nextLine());
            System.out.println("Autorul cartii este:");
            carte.setAutor(s.nextLine());
            System.out.println("Editura cartii este:");
            carte.setEditura(s.nextLine());
            System.out.println("Numarul de pagini al cartii este:");
            int nrPagini = Integer.parseInt(s.nextLine());
            while(nrPagini<=0){
                System.out.println("Numarul de pagini trebuie sa fie >0. Reintroduceti:");
                nrPagini = Integer.parseInt(s.nextLine());
            }
            carte.setNrPagini(nrPagini);

            carti.add(carte);
        }

        System.out.println(carti);





    }

}
