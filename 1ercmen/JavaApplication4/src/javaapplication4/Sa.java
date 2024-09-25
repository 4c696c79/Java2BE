package javaapplication4;
/*2)EXISTE UNA CLASE CUENTA QUE TIENE UN SALDO INCICIAL Y TIENE
           TRES METODOS QUE UNO ES:PARA DEPOSITAR OTRO PARA RETIRAR Y OTRO PARA 
        OBTENER EL SALDO.
    
        EXITE CLIENTES QUE VAN A TENER COMO DATO UN NOMBRE UNA CEDULA Y UNA 
    CUENTA ASOCIADA, SE PIDE REPRESENTAR LA ACCION QUE UN OBJETO CLIENTE 
    PUEDA DEPOSITAR, RETIRAR Y MOSTRAR EL SALDO DE SU CUENTA*/


//clase saldo

public class Sa {
    int saldo=0;
    

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
    //////////////////////////////////////
                  public void dpo(int nu){
        saldo+=nu;
    }
    public void rti(int xd){
      
            
        if (xd<saldo) {
          saldo-=xd;  
          
        }else{
            System.out.println("Saldo insuficiente :(");
        
        
        }
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
