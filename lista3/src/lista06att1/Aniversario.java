/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista06att1;

import javax.swing.JOptionPane;

/**
 *
 * @author paulo.gustavo
 */
public class Aniversario extends CartaoWeb {

    public void Aniversario(String destinatario){
        
    }
    
    @Override
    public void retornarMensagem(String remetente, String destinatario) {
        String mensagem = String.format("Querida %s ,\n Feliz Aniversário! \n Te desejo"
                + "muita luz, paz, saúde, prosperidade etc \n Atenciosamente %s", destinatario, remetente);
        JOptionPane.showMessageDialog(null, mensagem);
    }
    
}
