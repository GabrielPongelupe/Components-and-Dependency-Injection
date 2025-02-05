package com.gabrielpongelupe.componentsDependencyInjection.services;

import com.gabrielpongelupe.componentsDependencyInjection.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {

    public double shipment(Order order) {
        double basicPrice = order.getBasic();

        if(basicPrice < 100) {
            return 20.0;
        }else if(basicPrice < 200) {
            return 12.0;
        }else {
            return 0.0;
        }
    }
}
