/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula02prgiii.entidades;
import javax.swing.JOptionPane;

/**
 *
 * @author Márcio
 */
public class Pessoa {
    private Long id;
    private String nome;
    private String telefone;
    private String endereco;
    private int anoNascimento;
    
    public void cadastrarUsuario(){
        this.nome = JOptionPane.showInputDialog(null, "Digite o Nome da pessoa");
        this.telefone = JOptionPane.showInputDialog(null, "Digite o Telefon da pessoa");
        this.endereco = JOptionPane.showInputDialog(null, "Digite o Endereço da pessoa");
        this.anoNascimento = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o Ano de Nascimeto da pessoa"));
    }
    
    
    /* Decomente para sair o nome digitado em this.nome
    @Override
    public String toString(){
        return this.nome;
    }
    */
    
     public String mostrarDadosPessoa(){
         String msg = "Detalhes da Pessoa\n";
         msg = msg + "Nome: " + this.nome + "\n";
         msg = msg + "Telefone: " + this.telefone + "\n";
         msg = msg + "Endereço: " + this.endereco + "\n";
              return msg;
     }


}
     
      

}
