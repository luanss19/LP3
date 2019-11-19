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
public class Carro extends Automovel {

    private int numPortas;

    public Carro() {
        this.numPortas = 0;
    }

    public Carro(String placa, String modelo, String cor, int numPortas, int numCavalos, int numPneus) {
        super(placa, modelo, cor, numPneus, numCavalos);
        this.numPortas = numPortas;
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Numero de Portas: " + this.numPortas);
    }

    @Override
    public void inserirDados() {
        super.inserirDados();
        Scanner read = new Scanner(System.in);
        System.out.println("Numero de Cavalos : ");
        this.NumCavalos(read.nextInt());
        System.out.println("Numero de Portas : ");
        this.numPortas = read.nextInt();
    }

    public void setNumPortas(int numPortas) {
        this.numPortas = numPortas;
    }

    public int getNumPortas() {
        return this.numPortas;
    }

}
