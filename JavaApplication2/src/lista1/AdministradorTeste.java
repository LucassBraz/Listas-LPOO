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
public class AdministradorTeste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Administrador a = new Administrador();
        a.setNome(JOptionPane.showInputDialog(null,"digite seu nome"));
        a.setIdate(Integer.parseInt(JOptionPane.showInputDialog(null,"digite dua idade")));
        a.setSalario(Double.parseDouble(JOptionPane.showInputDialog(null,"digite seu salario")));
        a.setAjudasDeCusto(Double.parseDouble(JOptionPane.showInputDialog(null,"digite o valor da ajuda de custo")));
        a.setSexo(JOptionPane.showInputDialog(null,"digite seu sexo"));
        a.setAltura(Double.parseDouble(JOptionPane.showInputDialog(null,"digite sua altura")));
        
        
        JOptionPane.showMessageDialog(null,"DADOS DO EMPREGADO"+"\n"+"Nome: "+a.getNome()+"\n"+"Idade: "+a.getIdate()+"\n"+"Sexo: "+a.getSexo()+"\n"+"Altura: "+a.getAltura());
        a.obterLucros();
    }
    
}
