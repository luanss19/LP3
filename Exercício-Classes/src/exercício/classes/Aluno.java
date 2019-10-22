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
public class Aluno {
    String nome;
    String cpf;
    int matricula;
    
    
    public Aluno(){
        this.nome= "";
        this.cpf= "00.000.000-00";
        this.matricula= 0;
       
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public void setNome(String nome){
        this.nome=nome;
    }
    
    public String getCPF(){
        return this.cpf;
    }
    
    public void setCPF(String cpf){
        this.cpf=cpf;
    }

    public void setMatricula(int mat){
        this.matricula=mat;
    }
    
    public int getMatricula(){
        return this.matricula;
    }
}
