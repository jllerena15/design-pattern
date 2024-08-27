package com.jllerena.design_pattern;

import com.jllerena.design_pattern.creational.abstract_factory.example.AbstractFactory;
import com.jllerena.design_pattern.creational.abstract_factory.example.card.Card;
import com.jllerena.design_pattern.creational.abstract_factory.example.FactoryProvider;
import com.jllerena.design_pattern.creational.abstract_factory.example.payment_method.PaymentMethod;
import com.jllerena.design_pattern.creational.factory_method.example.Payment;
import com.jllerena.design_pattern.creational.factory_method.example.PaymentFactory;
import com.jllerena.design_pattern.creational.factory_method.example.TypePayment;
import com.jllerena.design_pattern.creational.prototype.example.PrototypeCard;
import com.jllerena.design_pattern.creational.prototype.example.PrototypeFactory;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import static com.jllerena.design_pattern.creational.prototype.example.PrototypeFactory.CartType.MASTERCARD;
import static com.jllerena.design_pattern.creational.prototype.example.PrototypeFactory.CartType.VISA;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
//		SpringApplication.run(Application.class, args);
//		testFactoryMethod();
//		testAbstractFactory();
//		testBuilder();
//		testPrototype();
		testSingleton();
	}

	private static void testFactoryMethod() {
		Payment payment = PaymentFactory.buildPayment(TypePayment.CARD);
		payment.doPayment();
	}

	private static void testAbstractFactory() {
		AbstractFactory abstractFactory = FactoryProvider.getFactory("card");
		Card card = (Card)abstractFactory.create("visa");

		AbstractFactory abstractFactory1 = FactoryProvider.getFactory("payment_method");
		PaymentMethod paymentMethod = (PaymentMethod)abstractFactory1.create("credit");

		System.out.println("Tarjeta de tipo " + card.getCardType() + " con el metodo de pago " + paymentMethod.doPayment());
	}

	private static void testBuilder() {
		com.jllerena.design_pattern.creational.builder.example.Card card = new com.jllerena.design_pattern.creational.builder.example.Card
				.CardBuilder("VISA", "0000 0000 0000 1234")
				.name("BBVA BFREE")
				.expires(5)
				.credit(true)
				.build();
		System.out.println(card.toString());
	}

	private static void testPrototype() {
		PrototypeFactory.loadCard();
		try {
			PrototypeCard visa = PrototypeFactory.getInstance(VISA);
			visa.getCard();

			PrototypeCard mastercard = PrototypeFactory.getInstance(MASTERCARD);
			mastercard.getCard();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}

	private static void testSingleton() {
		com.jllerena.design_pattern.creational.singleton.example.Card.getInstance().setCardNumber("1234-1234-1234-1234");
		System.out.println(com.jllerena.design_pattern.creational.singleton.example.Card.getInstance().getCardNumber());
	}
}
