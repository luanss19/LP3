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
public class Endereco {
    public String logradouro;
    public String cidade;
    public String estado;

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    public Endereco(){
        this.cidade="";
        this.estado="";
        this.logradouro="";
    }
    
    public Endereco(String cidade, String logradouro, String estado){
        this.cidade=cidade;
        this.estado=estado;
        this.logradouro=logradouro;
    }

  
    
}
