package javaapplication4;

import java.util.Scanner;

public class JavaApplication4 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        /*2)EXISTE UNA CLASE CUENTA QUE TIENE UN SALDO INCICIAL Y TIENE
           TRES METODOS QUE UNO ES:PARA DEPOSITAR OTRO PARA RETIRAR Y OTRO PARA 
        OBTENER EL SALDO.
    
        EXITE CLIENTES QUE VAN A TENER COMO DATO UN NOMBRE UNA CEDULA Y UNA 
    CUENTA ASOCIADA, SE PIDE REPRESENTAR LA ACCION QUE UN OBJETO CLIENTE 
    PUEDA DEPOSITAR, RETIRAR Y MOSTRAR EL SALDO DE SU CUENTA*/

        
        //clase main 
        
        Sa o = new Sa();
        chiken cli = new chiken();
        System.out.println("su nombre");
        cli.setN(in.next());
        
         System.out.println("cedula");
        cli.setCell(in.nextInt());
        
        System.out.println("cuenta");
        cli.setCell(in.nextInt());

        System.out.println("saldo que tiene:");
        o.setSaldo(in.nextInt());

        System.out.println("Hola " + cli.getN() + " cuanto es el monto que va a depostar?");
        o.dpo(in.nextInt());
        
        System.out.println("Cuanto va a retirar?");
        o.rti(in.nextInt());
        
        
        System.out.println(cli.getN() + ", el saldo que tiene en su cuenta ahora es de: " + o.getSaldo());
    }

}
