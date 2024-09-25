/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parangaricumiricuaro;

public class persona {
    //aca pones los datos de la persona
   private String nome;
   private int ci;

    

    
//getter and setter como cualquiera
   //aca es como cualuier getter and setters comun
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCi() {
        return ci;
    }

    public void setCi(int ci) {
        this.ci = ci;
    }
   
   //sobrecarga del constructor 
    public persona(String nome, int ci){
        this.nome=nome;
        this.ci=ci;
    }
    
    
}
