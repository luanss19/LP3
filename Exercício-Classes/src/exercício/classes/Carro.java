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
public class Carro extends Automovel{
    
    private int numPortas;
    
    public Carro(){
        this.numPortas=0;
    }
    
    public Carro(String placa, String modelo, String cor,int numPortas, int numCavalos, int numPneus){
        super(placa,modelo,cor,numPneus,numCavalos);
        this.numPortas=numPortas;
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
    
}
