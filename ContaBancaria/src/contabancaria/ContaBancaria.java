/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package contabancaria;
import package contabancaria.entidades.Conta;
/**
 *
 * @author Márcio
 */
public class ContaBancaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Conta cc = new Conta();
       cc.saldo = 450;
       Sytem.out.println ("Saldo da conta: R$" + cc.saldo);
    }
    
}
