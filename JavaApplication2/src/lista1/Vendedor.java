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
public class Vendedor extends Empregado {
    
    private double valorVendas;
    private int porcentagem;
    private double comissao;

    public Vendedor() {
    }

    public Vendedor(double valorVendas, int porcentagem, double salario, String nome, int idate, double altura, String sexo) {
        super(salario, nome, idate, altura, sexo);
        this.valorVendas = valorVendas;
        this.porcentagem = porcentagem;
    }

    

    public double getValorVendas() {
        return valorVendas;
    }

    public void setValorVendas(double valorVendas) {
        this.valorVendas = valorVendas;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    public int getPorcentagem() {
        return porcentagem;
    }

    public void setPorcentagem(int porcentagem) {
        this.porcentagem = porcentagem;
    }
    
    @Override
    public void obterLucros() {
        setComissao(((getValorVendas()*getPorcentagem())/100)+getSalario()); 
        JOptionPane.showMessageDialog(null,"Lucros do Vendedor: "+getComissao());
    }
    
}
