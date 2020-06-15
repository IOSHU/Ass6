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
public class PaymentFactory{
    public static PaymentAbstractFactory getFactory(PaymentType paymentType){
        switch (paymentType){
            case ONLINE:
                return new OnlinePaymentFactory();
            case OFFLINE:
                return new OfflinePaymentFactory();
            default:
                throw new UnsupportedOperationException("Unsupported");
        }
    }
}