/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista1;

/**
 *
 * @author adilson
 */
public class Pessoa {
    
    private String nome;
    private int idate;
    private double altura;
    private String sexo;

    public Pessoa() {
    }

    public Pessoa(String nome, int idate, double altura, String sexo) {
        this.nome = nome;
        this.idate = idate;
        this.altura = altura;
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdate() {
        return idate;
    }

    public void setIdate(int idate) {
        this.idate = idate;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    
    
}
