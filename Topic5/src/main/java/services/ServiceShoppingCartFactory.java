package services;

public class ServiceShoppingCartFactory {
	
	private ServiceShoppingCartFactory(){
		
	}
	
	public static ServiceShoppingCart getLocalService(){  
        return new ServiceShoppingCartImp();  
    } 
	
	/*
    public static ServiceShoppingCart getRemoteServiceUsingWebService(){  
        return new ServiceShoppingCartProxy(imp) (new ServiceShoppingCartWebServiceClient());  
    }  
   */
}
