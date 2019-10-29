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
public abstract class Pessoa {
    
    protected String nome;
    protected String cpf;


    public Pessoa(){
        this.nome= "";
        this.cpf= "00.000.000-00";
    }
    
    public Pessoa(String nome, String cpf){
        this.nome= nome;
        this.cpf= cpf;
    }
    
    public void imprimir(){
        System.out.println("Nome : "+this.nome);
        System.out.println("Cpf : "+this.cpf);
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public void setNome(String nome){
        this.nome=nome;
    }
    
    public String getCpf(){
        return this.cpf;
    }
    
    public void setCpf(String cpf){
        this.cpf=cpf;
    }
}
