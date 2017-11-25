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
public class FornecedorTeste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Fornecedor f = new Fornecedor();
        
        f.setNome(JOptionPane.showInputDialog(null,"digite o nome da pessoa"));
        f.setCreditoMaximo(Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o crédito maximo para a pessoa")));
        f.setValorEmDivida(Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o valor da divida dessa pessoa")));
        f.setIdate(Integer.parseInt(JOptionPane.showInputDialog(null,"digite a idade da pessoa")));
        f.setSexo(JOptionPane.showInputDialog(null,"digite o sexo"));
        f.setAltura(Double.parseDouble(JOptionPane.showInputDialog(null,"digite a altura da pessoa")));
        
        JOptionPane.showMessageDialog(null,"DADOS DA PESSOA CADASTRADOS NO FORNECEDOR"+"\n"+"Nome: "+f.getNome()+
        "\n"+"Credito dessa pessoa: "+f.getCreditoMaximo()+"\n"+"Divida da pessoa: "+f.getValorEmDivida()+
        "\n"+"Idade: "+f.getIdate()+"\n"+"Sexo: "+f.getSexo()+"\n"+"Altura: "+f.getAltura());
        
        f.obterSaldo();
        
        
        
    }
    
}
