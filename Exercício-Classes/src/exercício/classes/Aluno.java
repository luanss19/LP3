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
public class Aluno extends Pessoa{
    
    private int matricula;
    
    public Aluno(){
        this.matricula= 0;
    }
    
    public Aluno( String nome,String telefone,int matricula){
        super(nome, telefone);
        this.matricula= matricula;
        this.endereco=new Endereco();
    }
    
    public Aluno( String nome, Endereco endereco,String telefone,int matricula){
        super(nome, telefone);
        this.endereco=new Endereco();
        this.matricula= matricula;
    }
    
    @Override
    public void imprimir(){
        super.imprimir();
        System.out.println("Matrícula: " + this.matricula);
        
}
    public void setMatricula(int mat){
        this.matricula=mat;
    }
    
    public int getMatricula(){
        return this.matricula;
    }
}
