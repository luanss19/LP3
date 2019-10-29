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
public class Onibus extends Automovel {
    private int numPassageiros;
    private int codOnibus;
    
    public Onibus(){
        this.numPassageiros=0;
        this.codOnibus=0;
    }
    
    public Onibus(String placa, String modelo, String cor,int codOnibus,int numPassageiros,int numCavalos, int numPneus){
        super(cor,modelo,placa,numPneus,numCavalos);
        this.numPassageiros=numPassageiros;
        this.codOnibus=codOnibus;
}
    @Override
    public void imprimir(){
        super.imprimir();
        System.out.println("Numero de Passageiros: " + this.numPassageiros);
        System.out.println("Código do Ônibus: " + this.codOnibus);
}
     
    public void setNumPassageiros(int numPassageiros){
        this.numPassageiros=numPassageiros;
    }
    
    public int getNumPassageiros(){
        return this.numPassageiros;
    }
    
    public void setCodOnibus(int codOnibus){
        this.codOnibus=codOnibus;
    }
    
    public int getCodOnibus(){
        return this.codOnibus;
    }

    

}
