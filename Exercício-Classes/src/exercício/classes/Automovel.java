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
public class Automovel  {
    
    protected String placa;
    protected String cor;
    protected String modelo;
    protected Instrutor instrutor;

    public Automovel(){
        this.placa= "";
        this.cor= "";
        this.modelo= "";
    }
    
    public Automovel(String placa, String modelo, String cor){
        this.placa= placa;
        this.cor= cor;
        this.modelo= modelo;
    }
    
    public void imprimir(){
        System.out.println("Placa: "+ this.placa);
        System.out.println("Cor: "+ this.cor);
        System.out.println("Modelo: "+ this.modelo);
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
    
 }