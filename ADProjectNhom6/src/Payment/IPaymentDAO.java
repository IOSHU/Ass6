/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Payment;

import java.util.List;

/**
 *
 * @author User
 */
public interface IPaymentDAO {
    public List<Payment> getListPayment();
     public Payment getPaymentByID();
     public int InsertUpdatePayment();
}
