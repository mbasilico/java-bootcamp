package catalogue;

import java.util.Scanner;

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
}
