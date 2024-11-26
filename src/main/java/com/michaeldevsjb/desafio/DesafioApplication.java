package com.michaeldevsjb.desafio;

import com.michaeldevsjb.desafio.entities.Order;
import com.michaeldevsjb.desafio.services.OrderService;
import com.michaeldevsjb.desafio.services.ShippingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DesafioApplication implements CommandLineRunner {

	@Autowired
	private OrderService orderService;

	public static void main(String[] args) {
		SpringApplication.run(DesafioApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Order order = new Order(1034, 150.0, 20.0);
//		Order order = new Order(2282, 800.0, 10.0);
//		Order order = new Order(1309, 95.90, 0.0);
		System.out.println("Pedido código "+ order.getCode());
		System.out.printf("Valor total: R$ %.2f%n",orderService.total(order));
	}
}
