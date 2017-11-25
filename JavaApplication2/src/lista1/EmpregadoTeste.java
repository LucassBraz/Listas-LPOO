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
public class EmpregadoTeste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 
        
        Empregado e = new Empregado();
        
        e.setNome(JOptionPane.showInputDialog(null,"digite seu nome"));
        e.setIdate(Integer.parseInt(JOptionPane.showInputDialog(null,"digite dua idade")));
        e.setSalario(Double.parseDouble(JOptionPane.showInputDialog(null,"digite seu salario")));
        e.setSexo(JOptionPane.showInputDialog(null,"digite seu sexo"));
        e.setAltura(Double.parseDouble(JOptionPane.showInputDialog(null,"digite sua altura")));
        
        
        
        JOptionPane.showMessageDialog(null,"DADOS DO EMPREGADO"+"\n"+"Nome: "+e.getNome()+"\n"+"Idade: "+e.getIdate()+"\n"+"Sexo: "+e.getSexo()+"\n"+"Altura: "+e.getAltura());
        e.obterLucros();
    }
    
}
