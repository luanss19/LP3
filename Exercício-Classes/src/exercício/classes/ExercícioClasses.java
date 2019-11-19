package exercício.classes;

import java.util.Vector;
import java.util.Scanner;

/**
 *
 * @author Luan
 */
public class ExercícioClasses {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        int op = 0;

        Vector<Automovel> carrosVector = new Vector();
        Vector<Automovel> motosVector = new Vector();
        Vector<Automovel> onibusVector = new Vector();

        Vector<Pessoa> instrutoresVector = new Vector();
        instrutoresVector.add(new Instrutor("Marcela", "999784512", 50, 20));
        instrutoresVector.lastElement().endereco.setEndereco("Camaqua", "Rua Brasil", "RS");

        Vector<Pessoa> atendentesVector = new Vector();
        atendentesVector.add(new Atendente("Mario", "981743312", 4, "R$ 1.000,00"));
        atendentesVector.lastElement().endereco.setEndereco("Camaqua", "Rua Ana Gonçalves", "RS");

        Vector<Pessoa> alunosVector = new Vector();
        alunosVector.add(new Aluno("Joao", "999223312", 4));
        alunosVector.lastElement().endereco.setEndereco("Camaqua", "Rua Osorio", "RS");

        do {
            System.out.println("");
            System.out.println("Selecione uma opção:");
            System.out.println("1- Cadastrar Alunos");
            System.out.println("2- Cadastrar Automóveis");
            System.out.println("3- Listar Pessoas");
            System.out.println("4- Listar Autmóveis");
            System.out.println("Digite qualquer outro numero para sair");
            System.out.println("");

            op = read.nextInt();
            switch (op) {
                case 1:
                    Aluno aluno = new Aluno();
                    aluno.inserirDados();
                    aluno.endereco.inserirEndereco();
                    alunosVector.add(aluno);
                    break;
                case 2:
                    int j = 0;
                    System.out.println("1- Cadastrar Carro ");
                    System.out.println("2- Cadastrar Moto ");
                    System.out.println("3- Cadastrar Ônibus ");
                    j = read.nextInt();
                    switch (j) {
                        case 1:
                            Carro carro = new Carro();
                            carro.inserirDados();
                            carrosVector.add(carro);
                            break;
                        case 2:
                            Moto moto = new Moto();
                            moto.inserirDados();
                            motosVector.add(moto);
                            break;
                        case 3:
                            Onibus onibus = new Onibus();
                            onibus.inserirDados();
                            onibusVector.add(onibus);
                            break;
                    }
                    break;
                case 3:
                    int k = 0;
                    System.out.println("1- Listar Alunos cadastrados ");
                    System.out.println("2- Listar Instrutores ");
                    System.out.println("3- Listar Atendentes");
                    k = read.nextInt();
                    switch (k) {
                        case 1:
                            for (int i = 0; i < alunosVector.size(); i++) {
                                Aluno c = (Aluno) alunosVector.get(i);
                                c.imprimir();
                                System.out.println("");
                            }
                            break;
                        case 2:
                            for (int i = 0; i < instrutoresVector.size(); i++) {
                                Instrutor c = (Instrutor) instrutoresVector.get(i);
                                c.imprimir();
                                System.out.println("");
                            }
                            break;
                        case 3:
                            for (int i = 0; i < atendentesVector.size(); i++) {
                                Atendente c = (Atendente) atendentesVector.get(i);
                                c.imprimir();
                                System.out.println("");
                            }
                            break;
                    }
                    break;
                case 4:
                    int x = 0;
                    System.out.println("1- Listar Carros ");
                    System.out.println("2- Listar Motos ");
                    System.out.println("3- Listar Onibus");
                    x = read.nextInt();
                    switch (x) {
                        case 1:
                            for (int i = 0; i < carrosVector.size(); i++) {
                                Carro c = (Carro) carrosVector.get(i);
                                c.imprimir();
                                System.out.println("");
                            }
                            break;
                        case 2:
                            for (int i = 0; i < motosVector.size(); i++) {
                                Moto c = (Moto) motosVector.get(i);
                                c.imprimir();
                                System.out.println("");
                            }
                            break;
                        case 3:
                            for (int i = 0; i < onibusVector.size(); i++) {
                                Onibus c = (Onibus) onibusVector.get(i);
                                c.imprimir();
                                System.out.println("");
                            }
                            break;
                    }

            }
        } while (op > 0 && op < 5);
    }
}
