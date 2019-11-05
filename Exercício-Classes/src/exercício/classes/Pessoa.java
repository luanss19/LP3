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
    protected Endereco endereco;
    protected String telefone;



    public Pessoa(){
        this.nome= "";
        this.endereco= new Endereco();
        this.telefone = "";
    }
    
    public Pessoa(String nome,String telefone){
        this.nome= nome;
        this.endereco = new Endereco();
        this.telefone = telefone;
    }
    
    public Pessoa(String nome,String telefone , Endereco endereco ){
        this.nome= nome;
        this.endereco= new Endereco();
        this.telefone =telefone;
    }
    
    public void imprimir(){
        System.out.println("Nome : "+this.nome);
        System.out.println("Endereco : "+this.endereco);
        System.out.println("Telefone :"+this.telefone);
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public void setNome(String nome){
        this.nome=nome;
    }
    
    public Endereco getEndereco(){
        return this.endereco;
    }
    
    public void setEndereco(Endereco endereco){
        this.endereco=endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
