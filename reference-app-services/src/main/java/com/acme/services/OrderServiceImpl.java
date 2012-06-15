package com.acme.services;

import com.acme.model.Order;

import javax.jws.WebService;
import java.util.List;

@WebService(endpointInterface = "com.acme.services.OrderService",
        name = "OrderService",
        serviceName = "OrderService",
        portName = "OrderPortType",
        targetNamespace = "http://acme.com/services",
        wsdlLocation = "xml/orderservice.wsdl")
public class OrderServiceImpl implements OrderService {
    @Override
    public Order submitOrder(Order order, String accoutId) {
        return null;
    }

    @Override
    public List<Order> retrieveOrdersforAccount(String accountId) {
        return null;
    }

    @Override
    public String getOrderStatus(String orderId) {
        return null;
    }

    @Override
    public Order modifyOrder(Order order) {
        return null;
    }

    @Override
    public String cancelOrder(Order order) {
        return null;
    }
}
