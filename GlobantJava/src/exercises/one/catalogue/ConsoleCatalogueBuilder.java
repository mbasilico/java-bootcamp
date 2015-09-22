package exercises.one.catalogue;

import java.util.Scanner;

import exercises.one.product.ConsoleProductBuilder;
import exercises.one.product.Product;
import exercises.one.product.ProductDirector;

public class ConsoleCatalogueBuilder extends CatalogueBuilder {

	Scanner input = new Scanner(System.in);

	@Override
	public void buildCatalogue() {
		catalogueBuilder.setCatalogue(catalogue);
	}

	@Override
	public void buildCatalogueType() {
		System.out.println("Enter type of catalogue (suggested normal or offers)");
		catalogueBuilder.setType(input.nextLine());

	}

	@Override
	public void addProductToCatalogue(Catalogue catalogue) {
		new ProductDirector().setProductBuilder(new ConsoleProductBuilder());
		new ProductDirector().constructProduct();
		catalogue.catalogue.add(new ProductDirector().getProduct());
	}

	@Override
	public void deleteProductFromCatalogue(Catalogue catalogue, Product product) {		
		catalogue.catalogue.remove(catalogue.catalogue.indexOf(product));
	}

}
