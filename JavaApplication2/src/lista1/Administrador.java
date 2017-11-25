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
public class Administrador extends Empregado {
    
    private double ajudasDeCusto;

    public Administrador() {
    }

    public Administrador(double ajudasDeCusto, double salario, String nome, int idate, double altura, String sexo) {
        super(salario, nome, idate, altura, sexo);
        this.ajudasDeCusto = ajudasDeCusto;
    }

    public double getAjudasDeCusto() {
        return ajudasDeCusto;
    }

    public void setAjudasDeCusto(double ajudasDeCusto) {
        this.ajudasDeCusto = ajudasDeCusto;
    }

    @Override
    public void obterLucros() {
        setSalario(getSalario()+getAjudasDeCusto());
        JOptionPane.showMessageDialog(null,"Lucros do Administrador: "+getSalario());
    }
    
    
    
    
    
            
    
}
