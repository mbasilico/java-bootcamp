package product;

import java.util.Scanner;

public class ConsoleProductBuilder extends ProductBuilder {

	Scanner input = new Scanner(System.in);

	@Override
	public void buildName() {
		System.out.print("Enter name of the product: ");
		product.setName(input.nextLine());
	}

	@Override
	public void buildProductID() {
		System.out.print("Enter product ID: ");
		product.setProductID(input.nextLine());
	}

	@Override
	public void buildPrice() {
		System.out.print("Enter price of the product: ");
		product.setPrice(input.nextDouble());
	}

	@Override
	public void buildStock() {
		System.out.print("Enter stock of the product: ");
		product.setStock(input.nextInt());
	}

	@Override
	public void buildDescription() {
		System.out.print("Enter description of the product: ");
		product.setDescription(input.nextLine());
	}

}
