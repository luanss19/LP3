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
public class Onibus extends Automovel implements Tipo{
    private int numPassageiros;
    private int codOnibus;
    
    public Onibus(){
        this.numPassageiros=0;
        this.codOnibus=0;
    }
    
    public Onibus(String placa, String modelo, String cor,int codOnibus,int numPassageiros,int numCavalos, int numPneus){
        super(cor,modelo,placa);
        this.numPassageiros=numPassageiros;
        this.codOnibus=codOnibus;
        this.NumCavalos(numCavalos);
        this.NumPneus(numPneus);
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

    @Override
    public void NumPneus(int numPneus) {
        System.out.println("Número de Pneus : "+numPneus);
    }

    @Override
    public void NumCavalos(int numCavalos) {
        System.out.println("Número de Cavalos : "+numCavalos);
    }

}
