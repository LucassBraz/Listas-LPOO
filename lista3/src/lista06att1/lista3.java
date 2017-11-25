/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista06att1;


import javax.swing.JOptionPane;


public class lista3 {

    public static void main(String[] args) {
        CartaoWeb [] cartoes = new CartaoWeb[3];
        cartoes[0] = new DiaDosNamorados();
        cartoes[1] = new Natal();
        cartoes[2] = new Aniversario();
        
        
        CartaoWeb cartaoescolhido;
        
        for(int i = 0; i<3; i++){
            
            cartaoescolhido = cartoes[i];
            cartaoescolhido.retornarMensagem(JOptionPane.showInputDialog("Remetente: "), JOptionPane.showInputDialog("Destinatario: "));
        }
    }
    
}
