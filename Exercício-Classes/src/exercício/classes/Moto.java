/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercício.classes;

/**
 *
 * @author Luan
 */
public class Moto extends Automovel implements Tipo{
    private int numCilindradas;
    
    public Moto(){
        this.numCilindradas=0;
    }
    
    public Moto(String placa, String modelo, String cor,int numCilindradas, int numPneus){
        super(cor,modelo,placa);
        this.numCilindradas=numCilindradas;
        this.modelo=modelo;
        this.NumPneus(numPneus);
}
    @Override
    public void imprimir(){
        super.imprimir();
        System.out.println("Numero de Cilindradas: " + this.numCilindradas);
}
     
    public void setCilindradas(int numCilindradas){
        this.numCilindradas=numCilindradas;
    }
    
    public int getCilindradas(){
        return this.numCilindradas;
    }
    
    @Override
    public void NumPneus(int numPneus) {
        System.out.println("Número de Pneus : "+numPneus);
    }

    @Override
    public void NumCavalos(int numCavalos) {
        System.out.println("Insira a potência da moto em Cilindradas");
    }
}
