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
public class Moto extends Automovel {

    private int numCilindradas;

    public Moto() {
        this.numCilindradas = 0;
    }

    public Moto(String placa, String modelo, String cor, int numCilindradas, int numPneus, int numCavalos) {
        super(cor, modelo, placa, numPneus, numCavalos);
        this.numCilindradas = numCilindradas;
        this.modelo = modelo;
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Numero de Cilindradas: " + this.numCilindradas);
    }

    public void setCilindradas(int numCilindradas) {
        this.numCilindradas = numCilindradas;
    }

    public int getCilindradas() {
        return this.numCilindradas;
    }

    @Override
    public void inserirDados() {
        super.inserirDados();
        Scanner read = new Scanner(System.in);
        System.out.println("Numero de Cilindradas : ");
        this.numCilindradas = (read.nextInt());
    }
}
