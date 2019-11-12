/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercício.classes;

import java.util.Scanner;

/**
 *
 * @author Luan
 */
public class Endereco {
    public String logradouro;
    public String cidade;
    public String estado;

       
    public Endereco(){
        this.cidade="";
        this.estado="";
        this.logradouro="";
    }
    
    public Endereco(String cidade, String logradouro, String estado){
        this.cidade=cidade;
        this.estado=estado;
        this.logradouro=logradouro;
    }
    
    @Override
    public String toString(){
        return "Cidade : "+this.cidade+"\nEstado : "+this.estado+"\nLogradouro : "+this.logradouro;
    }
    
    public void setEndereco(String cidade, String logradouro, String estado){
        this.cidade=cidade;
        this.estado=estado;
        this.logradouro=logradouro;
    }
    
    public void inserirEndereco(){
        Scanner read = new Scanner(System.in);
        System.out.println("Cidade : ");
        this.cidade=read.next();
        System.out.println("Estado : ");
        this.estado=read.next();
        System.out.println("Logradouro : ");
        this.logradouro=read.next();
        
    }    
}