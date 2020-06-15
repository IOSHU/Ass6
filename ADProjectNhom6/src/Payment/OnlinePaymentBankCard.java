/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Payment;

/**
 *
 * @author User
 */
public class OnlinePaymentBankCard implements BankCard {
    public void pay() {
        System.out.println("BankCard - Online Payment");
    }
}

