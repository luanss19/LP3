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
public abstract class Automovel implements Tipo {
    
    protected String placa;
    protected String cor;
    protected String modelo;
    protected Instrutor instrutor;
    protected int cavalos;
    protected int pneus;

    public Automovel(){
        this.placa= "";
        this.cor= "";
        this.modelo= "";
        this.cavalos=0;
        this.pneus=0;

    }
    
    public Automovel(String placa, String modelo, String cor, int numCavalos, int numPneus){
        this.placa= placa;
        this.cor= cor;
        this.modelo= modelo;
        this.cavalos=numCavalos;
        this.pneus=numPneus;
    }
    
    public void imprimir(){
        System.out.println("Modelo: "+ this.modelo);
        System.out.println("Placa: "+ this.placa);
        System.out.println("Cor: "+ this.cor);
        NumCavalos(this.cavalos);
        NumPneus(this.pneus);

    }

    public Instrutor getInstrutor() {
        return instrutor;
    }

    public void setInstrutor(Instrutor instrutor) {
        this.instrutor = instrutor;
    }
    
    
    public String getPlaca(){
        return this.placa;
    }
    
    public void setPlaca(String placa){
        this.placa=placa;
    }
    
    public String getCor(){
        return this.cor;
    }
    
    public void setCor(String cor){
        this.cor=cor;
    }
    
    public String getModelo(){
        return this.modelo;
    }
    
    public void setModelo(String modelo){
        this.modelo=modelo;
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