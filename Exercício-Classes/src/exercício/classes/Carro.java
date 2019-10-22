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
public class Carro extends Automovel implements Tipo{
    
    private int numPortas;
    
    public Carro(){
        this.numPortas=0;
    }
    
    public Carro(String placa, String modelo, String cor,int numPortas, int numCavalos, int numPneus){
        super(cor,modelo,placa);
        this.numPortas=numPortas;
        this.modelo=modelo;
        this.NumCavalos(numCavalos);
        this.NumPneus(numPneus);
}
    @Override
    public void imprimir(){
        super.imprimir();
        System.out.println("Numero de Portas: " + this.numPortas);
}
     
    public void setNumPortas(int numPortas){
        this.numPortas=numPortas;
    }
    
    public int getNumPortas(){
        return this.numPortas;
    }
    
    @Override
    public void NumPneus(int numPneus) {
        System.out.println("Número de Pneus : "+numPneus);
    }

    @Override
    public void NumCavalos(int numCavalos) {
        System.out.println("Número de Cavalos : "+numCavalos);
    }
}
