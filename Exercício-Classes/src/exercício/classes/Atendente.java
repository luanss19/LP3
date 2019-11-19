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
public class Atendente extends Pessoa {

    private int codAtendente;
    private String salario;

    public Atendente() {
        this.codAtendente = 0;
        this.salario = "";

    }

    public Atendente(String nome, String telefone, int codAtendente, String salario) {
        super(nome, telefone);
        this.codAtendente = codAtendente;
        this.salario = salario;
    }

    public Atendente(String nome, String telefone, Endereco endereco, int codAtendente, String salario) {
        super(nome, telefone);
        this.endereco = new Endereco();
        this.codAtendente = codAtendente;
        this.salario = salario;
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Código do Atendente: " + this.codAtendente);
        System.out.println("Salário do Atendente : " + this.salario);
    }

    public void setcodAtendente(int codAtendente) {
        this.codAtendente = codAtendente;
    }

    public int getcodAtendente() {
        return this.codAtendente;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }

    public String getSalario() {
        return this.salario;
    }
}
