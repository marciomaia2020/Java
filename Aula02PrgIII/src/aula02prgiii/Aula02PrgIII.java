/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula02prgiii;
import aula02prgiii.entidades.Pessoa;
import javax.swing.JOptionPane;


public class Aula02PrgIII {

    public static void main(String[] args) {
       Pessoa p = new Pessoa();
       p.cadastrarUsuario();
       /* System.out.println(p);
       Decomente para sair o nome digitado em this.nome*/
       JOptionPane.showMessageDialog(null,p.mostrarDadosPessoa());
    }
    
   
    
}
