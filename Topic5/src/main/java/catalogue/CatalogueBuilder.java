package catalogue;

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

}
