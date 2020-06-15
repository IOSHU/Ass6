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
public class OnlinePaymentFactory extends PaymentAbstractFactory{
    MOMO MOMOPaying() {
        return new OnlinePaymentMOMO();
    }

    BankCard bankCardPaying() {
        return new OnlinePaymentBankCard();
    }

    @Override
    Cash cashPaying() {
        System.out.println("unsupported");
        return null;
    }

  
}

