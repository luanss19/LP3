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
public class Instrutor extends Pessoa {

    private int codInstrutor;
    private int horasSemanais;
    protected Automovel automovel;

    public Instrutor() {
        this.codInstrutor = 0;
        this.horasSemanais = 0;

    }

    public Instrutor(String nome, String telefone, int codInstrutor, int horasSemanais) {
        super(nome, telefone);
        this.codInstrutor = codInstrutor;
        this.horasSemanais = horasSemanais;
    }

    public Instrutor(String nome, String telefone, Endereco endereco, int codInstrutor, int horasSemanais) {
        super(nome, telefone);
        this.endereco = new Endereco();
        this.codInstrutor = codInstrutor;
        this.horasSemanais = horasSemanais;
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Código do Instrutor: " + this.codInstrutor);
        System.out.println("Horas de Serviço por semana : " + this.horasSemanais);
    }

    public Automovel getAutomovel() {
        return automovel;
    }

    public void setAutomovel(Automovel automovel) {
        this.automovel = automovel;
    }

    public void setCodInstrutor(int codInstrutor) {
        this.codInstrutor = codInstrutor;
    }

    public int getCodInstrutor() {
        return this.codInstrutor;
    }

    public void setHorasSemanais(int horasSemanais) {
        this.horasSemanais = horasSemanais;
    }

    public int getHorasSemanais() {
        return this.horasSemanais;
    }
}
