/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Payment;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */
public class PaymentDAOImpl implements IPaymentDAO{

    @Override
    public List<Payment> getListPayment() {
        return new ArrayList<Payment>();
    }

    @Override
    public Payment getPaymentByID() {
        return new Payment();
     }

    @Override
    public int InsertUpdatePayment() {
        return 1;
    }
    
}
