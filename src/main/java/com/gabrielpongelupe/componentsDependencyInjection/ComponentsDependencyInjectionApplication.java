package com.gabrielpongelupe.componentsDependencyInjection;

import com.gabrielpongelupe.componentsDependencyInjection.entities.Order;
import com.gabrielpongelupe.componentsDependencyInjection.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class ComponentsDependencyInjectionApplication implements CommandLineRunner {

	@Autowired
	private OrderService orderService;

	public static void main(String[] args) {
		SpringApplication.run(ComponentsDependencyInjectionApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Scanner scanner = new Scanner(System.in);

		int code = scanner.nextInt();
		double basic = scanner.nextDouble();
		double discount = scanner.nextDouble();

		Order order = new Order(code, basic, discount);

		System.out.println("Pedido código: " + order.getCode());
		System.out.println("Valor total: R$ " + orderService.total(order));


	}
}
