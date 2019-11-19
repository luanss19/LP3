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
public abstract class Automovel implements Tipo {

    protected String placa;
    protected String cor;
    protected String modelo;
    protected Instrutor instrutor;
    protected int cavalos;
    protected int pneus;

    public Automovel() {
        this.placa = "";
        this.cor = "";
        this.modelo = "";
        this.cavalos = 0;
        this.pneus = 0;

    }

    public Automovel(String placa, String modelo, String cor, int numCavalos, int numPneus) {
        this.placa = placa;
        this.cor = cor;
        this.modelo = modelo;
        this.cavalos = numCavalos;
        this.pneus = numPneus;
    }

    public void imprimir() {
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Placa: " + this.placa);
        System.out.println("Cor: " + this.cor);
        System.out.println("Numero de Pneus: " + this.pneus);
        if (this.cavalos > 0) {
            System.out.println("Numero de Cavalos: " + this.cavalos);
        }
    }

    public void inserirDados() {
        Scanner read = new Scanner(System.in);
        System.out.println("Modelo : ");
        this.modelo = read.next();
        System.out.println("Placa : ");
        this.placa = read.next();
        System.out.println("Cor : ");
        this.cor = read.next();
        System.out.println("Num Pneus: ");
        this.NumPneus(read.nextInt());

    }

    public Instrutor getInstrutor() {
        return instrutor;
    }

    public void setInstrutor(Instrutor instrutor) {
        this.instrutor = instrutor;
    }

    public String getPlaca() {
        return this.placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCor() {
        return this.cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public void NumPneus(int numPneus) {
        this.pneus = numPneus;
    }

    @Override
    public void NumCavalos(int numCavalos) {
        this.cavalos = numCavalos;
    }

}
