/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercício.classes;

import java.util.Vector;

/**
 *
 * @author Luan
 */
public class ExercícioClasses {

    public static void main(String[] args) {
        
     Aluno Aluno1 = new Aluno();
     Instrutor Instrutor1 = new Instrutor();
     Atendente Atendente1 = new Atendente();
     
     
     Moto Moto1 = new Moto();
     Onibus Onibus1 = new Onibus();
     
     Vector carros = new Vector();
     carros.add(new Carro("III9966","Brasilia","Azul",4,4,100));
     carros.add(new Carro("Verde","Chevete","I123SD6",100,5,4));
     for(int i=0; i<carros.size(); i++){
     Carro c = (Carro) carros.get(i);
     c.imprimir();
         System.out.println("");
     }
     Aluno1.setNome("Carlos");
     Aluno1.setCpf("123.456.789-00");
     Aluno1.setMatricula(15);
     Aluno1.imprimir();
     
     System.out.println("");
     
     Instrutor1.setNome("Joao");
     Instrutor1.setCpf("555.444.779-45");
     Instrutor1.setCodInstrutor(25);
     Instrutor1.setHorasSemanais(20);
     Instrutor1.imprimir();
     
     System.out.println("");
     
     Atendente1.setNome("Joaquim");
     Atendente1.setCpf("541.426.289-50");
     Atendente1.setSalario("R$ 2.000,00");
     Atendente1.setcodAtendente(10);
     Atendente1.imprimir();
     
     System.out.println("");
     
     
     System.out.println("");
     
     Moto1.setCor("Azul");
     Moto1.setModelo("CB-300");
     Moto1.setPlaca("ADX-143");
     Moto1.setCilindradas(300);
     Moto1.NumPneus(2);
     Moto1.imprimir();
     
     System.out.println("");
     
     Onibus1.setCor("Amarelo");
     Onibus1.setModelo("Mercedes");
     Onibus1.setPlaca("DWC-739");
     Onibus1.setNumPassageiros(45);
     Onibus1.setCodOnibus(35);
     Onibus1.NumPneus(6);
     Onibus1.NumCavalos(150);
     Onibus1.imprimir(); 
    }
}