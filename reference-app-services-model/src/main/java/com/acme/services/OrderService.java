package com.acme.services;

import com.acme.model.Order;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import java.util.List;

@WebService
public interface OrderService {

    @WebMethod
    @XmlElement(name = "order")
    public Order submitOrder(Order order, String accoutId);

    @WebMethod
    @XmlElementWrapper(name="orders")
    @XmlElement(name = "order")
    public List<Order> retrieveOrdersforAccount(String accountId);

    @WebMethod
    public String getOrderStatus(String orderId);

    @WebMethod
    @XmlElement(name = "order")
    public Order modifyOrder(Order order);

    @WebMethod
    public String cancelOrder(Order order);

}
