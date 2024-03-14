package com.tnsif.mainmethod;

import com.tnsif.application.GSNormal;
import com.tnsif.application.GSPrime;
import com.tnsif.application.GSShopFactory;

public class Client {

	public static void main(String[] args) {
		GSShopFactory obj=new GSShopFactory();
		
		// prime account creation
		
		GSPrime ga=(GSPrime)obj.getNewPrimeAccount(12, "suma", 500.6f, true);
		ga.bookproduct(ga.getCharges());
		
		//normal account creation
		
		GSNormal ge=(GSNormal)obj.getNewNormalAccount(13, "raju", 500.6f, 65.4f);
		ge.bookproduct(ge.getCharges());
	}
}