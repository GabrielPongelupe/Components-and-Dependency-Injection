package com.gabrielpongelupe.componentsDependencyInjection.services;

import com.gabrielpongelupe.componentsDependencyInjection.entities.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private DiscountService discountService;

    @Autowired
    private ShippingService shippingService;

    public double total(Order order){
        double difValue = shippingService.shipment(order) - discountService.discount(order);

        return order.getBasic() + difValue;
    }
}
