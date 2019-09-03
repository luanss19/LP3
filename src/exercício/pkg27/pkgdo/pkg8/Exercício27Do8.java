/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercício.pkg27.pkgdo.pkg8;

/**
 *
 * @author Luan
 */
import java.util.Random;
import java.util.Scanner;

public class Exercício27Do8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        Random random = new Random();
        int op=0;
        do {
            System.out.println("");
            System.out.println("Selecione uma opção:");
            System.out.println("1-Jogar adivinhe o número");
            System.out.println("2-Imprimir de 0 a 100, só os ímpares");
            System.out.println("3-Imprimir de 0 a 100, só os pares");
            System.out.println("4-Sair");
            System.out.println("");
             op = tec.nextInt();

            switch (op) {
                case 1:
                    int numero = random.nextInt(10);
                    System.out.println("Digite um número entre 0 e 10 ");
                    int num = tec.nextInt();
                    if (num == numero) {
                        System.out.println("Parabéns, você acertou!");
                    } else {
                        System.out.println("Você errou, o número certo desta vez era : " + numero);
                    }

                    break;
                case 2:
                    System.out.println("Números ímpares de 0 a 100 : ");
                    for (int i = 0; i < 100; i++) {
                        if (i % 2 == 0) {
                            continue;
                        }
                        System.out.println(i);
                    }
                    break;
                case 3:
                    System.out.println("Números pares de 0 a 100 : ");
                    for (int i = 0; i < 100; i++) {
                        if (i % 2 != 0) {
                            continue;
                        }
                        System.out.println(i);
                    }
                    break;
                
            }
        } while (op != 4);
    }
}
