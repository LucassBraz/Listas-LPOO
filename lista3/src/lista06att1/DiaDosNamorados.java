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
public class DiaDosNamorados extends CartaoWeb {

    
    
    public void DiaDosNamorados(String destinatario){
        
    }

    @Override
    public void retornarMensagem(String remetente, String destinatario) {
        String mensagem = String.format("Querida %s ,\n Feliz dia dos namorados! \n Espero que esse"
                + "tenha sido o único cartão do dia dos namorados que tenha ganhado nessa data! De coração, \n %s", destinatario, remetente);
        JOptionPane.showMessageDialog(null, mensagem);
    }
    
}
