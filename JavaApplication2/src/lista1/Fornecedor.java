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
public class Fornecedor extends Pessoa {
    
    private double creditoMaximo;
    private double valorEmDivida;
    private double diferenca;
    public Fornecedor() {
    }

    public Fornecedor(double creditoMaximo, double valorEmDivida, String nome, int idate, double altura, String sexo) {
        super(nome, idate, altura, sexo);
        this.creditoMaximo = creditoMaximo;
        this.valorEmDivida = valorEmDivida;
    }

    public double getCreditoMaximo() {
        return creditoMaximo;
    }

    public void setCreditoMaximo(double creditoMaximo) {
        this.creditoMaximo = creditoMaximo;
    }

    public double getValorEmDivida() {
        return valorEmDivida;
    }

    public void setValorEmDivida(double valorEmDivida) {
        this.valorEmDivida = valorEmDivida;
    }

    public double getDiferenca() {
        return diferenca;
    }

    public void setDiferenca(double diferenca) {
        this.diferenca = diferenca;
    }
    
    
    public void obterSaldo(){
       setDiferenca(getCreditoMaximo() - getValorEmDivida());
       
       JOptionPane.showMessageDialog(null,"Saldo disponível: "+getDiferenca());
    }
    
}
