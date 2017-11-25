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
public class VendedorTeste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Vendedor v = new Vendedor();
        
        v.setNome(JOptionPane.showInputDialog(null,"digite seu nome"));
        v.setIdate(Integer.parseInt(JOptionPane.showInputDialog(null,"digite dua idade")));
        v.setSalario(Double.parseDouble(JOptionPane.showInputDialog(null,"digite seu salario")));
        v.setValorVendas(Double.parseDouble(JOptionPane.showInputDialog(null,"digite o valor das vendas")));
        v.setPorcentagem(Integer.parseInt(JOptionPane.showInputDialog(null,"digite a porcentagem da comissão")));
        v.setSexo(JOptionPane.showInputDialog(null,"digite seu sexo"));
        v.setAltura(Double.parseDouble(JOptionPane.showInputDialog(null,"digite sua altura")));
        
        
        JOptionPane.showMessageDialog(null,"DADOS DO EMPREGADO"+"\n"+"Nome: "+v.getNome()+"\n"+"Idade: "+v.getIdate()+"\n"+"Sexo: "+v.getSexo()+"\n"+"Altura: "+v.getAltura());
        v.obterLucros();
    }
    
}
