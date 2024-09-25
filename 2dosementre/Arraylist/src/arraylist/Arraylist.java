package arraylist;

import java.util.*;

public class Arraylist {

    public static void main(String[] args) {
        //Ejercicio 1
        Scanner in = new Scanner(System.in);
        /* ArrayList<Integer> enteraxd = new ArrayList();
        int unito = 0, qpro=0;
       
        for (int i = 0; i <= 4; i++) {
            System.out.println("ingrese numero");
            enteraxd.add(in.nextInt());
          //  qpro =+ enteraxd.size();
            //unito++;
        }
        for (int i = 0; i < enteraxd.size(); i++) {
            System.out.println(enteraxd.get(i));
            qpro=qpro+enteraxd.get(i);
                    
        }
 int pro=qpro/enteraxd.size();
        System.out.println("");
             System.out.println("el promedio e "+pro );*/
 /*ejercicio2
        ArrayList<String> pa = new ArrayList();
        for (int i = 0; i < 5; i++) {
            System.out.println("escriba palabras");

            pa.add(in.next());

        }
        System.out.println("");
        for (int i = 0; i < pa.size(); i++) {

            System.out.println(pa.get(i));
        }*/
 /*
        Ejercicio3
         */
        ArrayList<Character> d = new ArrayList();
        int s = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println("escriba letras");
             d.add(in.next().charAt(i));

        }
        System.out.println("");
        for (int i = 0; i < d.size(); i++) {
            if (d.size() == 97 || d.size() == 97 || d.size() == 'i' || d.size() == 'o' || d.size() == 'u') {
                s++;
            }
        }
        if (s != 0) {
            System.out.println("hay " + s + " vocales");
        } else {
            System.out.println("non hay vocales");
        }

    }

}
