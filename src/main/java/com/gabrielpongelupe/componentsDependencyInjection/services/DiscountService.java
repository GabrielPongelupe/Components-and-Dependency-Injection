package com.gabrielpongelupe.componentsDependencyInjection.services;

import com.gabrielpongelupe.componentsDependencyInjection.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class DiscountService {

    public double discount(Order order) {
        return order.getDiscount() * order.getBasic() / 100;
    }
}
