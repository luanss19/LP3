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
        
      
     
     Moto Moto1 = new Moto();
     Onibus Onibus1 = new Onibus();
     
     Vector carros = new Vector();
     carros.add(new Carro("III9966","Brasilia","Azul",4,4,100));
     carros.add(new Carro("I123SD6","Chevete","Verde",100,5,4));
     for(int i=0; i<carros.size(); i++){
     Carro c = (Carro) carros.get(i);
     c.imprimir();
     System.out.println("");
     }
     
     System.out.println("");
     Vector alunos = new Vector();
     alunos.add(new Aluno("Joao","999223312",4));
    // alunos.add(new Aluno("I123SD6","Chevete","Verde",100,5,4));
     for(int i=0; i<alunos.size(); i++){
     Aluno c = (Aluno) alunos.get(i);
     c.imprimir();
     System.out.println("");
     }
//     
//     Moto1.setCor("Azul");
//     Moto1.setModelo("CB-300");
//     Moto1.setPlaca("ADX-143");
//     Moto1.setCilindradas(300);
//     Moto1.NumPneus(2);
//     Moto1.imprimir();
//     
//     System.out.println("");
//     
//     Onibus1.setCor("Amarelo");
//     Onibus1.setModelo("Mercedes");
//     Onibus1.setPlaca("DWC-739");
//     Onibus1.setNumPassageiros(45);
//     Onibus1.setCodOnibus(35);
//     Onibus1.NumPneus(6);
//     Onibus1.NumCavalos(150);
//     Onibus1.imprimir(); 
    }
}