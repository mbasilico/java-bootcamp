package exercises.one.catalogue;

import exercises.one.product.Product;

public abstract class CatalogueBuilder extends Catalogue{

	protected Catalogue catalogueBuilder;

	public void createNewCatalogue() {
		catalogueBuilder = new Catalogue();
	}

	public Catalogue getCatalogueBuilder() {
		return catalogueBuilder;
	}

	public abstract void buildCatalogue();

	public abstract void buildCatalogueType();
	
	public abstract void addProductToCatalogue (Catalogue catalogue);
	
	public abstract void deleteProductFromCatalogue(Catalogue catalogue, Product product);

}
