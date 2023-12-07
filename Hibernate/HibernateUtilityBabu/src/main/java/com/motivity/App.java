package com.motivity;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.motivity.Model.Customer;
import com.motivity.Model.Merchant;
import com.motivity.Model.Order;
import com.motivity.service.MerchantTest;
import com.motivity.utility.HibernateUtils;

public class App 
{
    public static void main( String[] args )
    {
       MerchantTest test = new MerchantTest();
       test.updateMerchant();
       
       
       
       
//       Customer customer = new Customer();
//       customer.setcId(1);
//       customer.setcEmail("Abhilash@gmail.com");
//       customer.setcName("Abhilash");
//       customer.setcPhone("54545454");
//       
//       
//       Order order1 = new Order();
//       order1.setOrderId(1);
//       order1.setOrderAmount(1000);
//       order1.setOrderTrackingId(101);
//       order1.setCustomer(customer);
//       
//       Order order2 = new Order();
//       order2.setOrderId(2);
//       order2.setOrderAmount(2000);
//       order2.setOrderTrackingId(102);
//       order2.setCustomer(customer);
//       
//       List<Order> orders = new ArrayList<Order>();
//       orders.add(order1);
//       orders.add(order2);
//       
//       customer.setOrders(orders);
//       
//       Transaction transaction = session.beginTransaction();
//       session.save(order1);
//       session.save(order2);
//       session.save(customer);
//       transaction.commit();
    
       
 
    }
}
