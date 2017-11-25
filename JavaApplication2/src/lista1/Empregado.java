/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista1;

import javax.swing.JOptionPane;

/**
 *
 * @author adilson
 */
public class Empregado extends Pessoa {
    
    private double salario;
    

    public Empregado() {
    }

    public Empregado(double salario, String nome, int idate,double altura, String sexo) {
        super(nome, idate, altura, sexo);
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public void obterLucros(){
      
        JOptionPane.showMessageDialog(null,"Lucros do Empregado: "+getSalario());
        
    }

    
}
