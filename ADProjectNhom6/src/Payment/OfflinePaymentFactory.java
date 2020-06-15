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
public class OfflinePaymentFactory extends PaymentAbstractFactory {
    Cash cashPaying() {
        return new OfflinePaymentCash();
    }

    @Override
    BankCard bankCardPaying()  {
        System.out.println("unsupported");
        return null;
    }
        

    @Override
    MOMO MOMOPaying() {

        System.out.println("unsupported");
        return null;
    }


}
