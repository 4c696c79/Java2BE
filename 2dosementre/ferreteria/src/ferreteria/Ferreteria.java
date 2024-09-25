package ferreteria;

import java.util.*;

public class Ferreteria {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<mercaderia> fer = new ArrayList();
        int confirmacion = 0, precionuevo;
        //\n para el salto de linea :D
        for (int i = 0; i < 1; i++) {
            mercaderia mer = new mercaderia();
            System.out.println("Ingrese el coódigo ");
            mer.setCo(in.nextInt());

            System.out.println("Ingrese precio");
            mer.setP(in.nextInt());
            System.out.println("Ingrese Descripción");
            mer.setDes(in.next());
            fer.add(mer);

            System.out.println("¿Quieres sumarle el precio al producto? (1 para si y otro numero para no)");
            confirmacion = in.nextInt();
            if (confirmacion == 1) {
                System.out.println("Ingrese cantidad de dinero para subir el precio");
                precionuevo = in.nextInt();
                mer.su(precionuevo);
            }
            System.out.println("");
        }
        for (int i = 0; i < fer.size(); i++) {

            System.out.println("el código es: " + fer.get(i).getCo());
            System.out.println("el precio es: " + fer.get(i).getP());
            System.out.println("la descripcion es:" + fer.get(i).getDes());

        }

    }

}
