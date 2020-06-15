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

public class Main {
    public static void main(String[] args) {
        //Fast shipping
        System.out.println("Offline Payment");
        PaymentAbstractFactory factoryOffline = PaymentFactory.getFactory(PaymentType.OFFLINE);
        Cash cashPayment = factoryOffline.cashPaying();
        cashPayment.pay();
        //Normal shipping
        System.out.println("Online Payment");
        PaymentAbstractFactory factoryOnline = PaymentFactory.getFactory(PaymentType.ONLINE);
        MOMO MOMOPayment = factoryOnline.MOMOPaying();
        MOMOPayment.pay();
        BankCard bankCardPayment = factoryOnline.bankCardPaying();
        bankCardPayment.pay();
    }
}
