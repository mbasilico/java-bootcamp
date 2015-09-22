package exercises.one.catalogue;

import exercises.one.catalogue.Catalogue;
import exercises.one.catalogue.CatalogueBuilder;

public class CatalogueDirector {
	
	private CatalogueBuilder catalogueBuilder;

	public void setCatalogueBuilder(CatalogueBuilder cb) {
		catalogueBuilder = cb;
	}

	public Catalogue getCatalogue() {
		return catalogueBuilder.getCatalogueBuilder();
	}

	public void constructCatalogue() {
		catalogueBuilder.createNewCatalogue();
		catalogueBuilder.buildCatalogue();
		catalogueBuilder.buildCatalogueType();
	}

}
