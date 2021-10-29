package com.xworkz.mobile;

import com.xworkz.mobile.dao.MobileDAO;
import com.xworkz.mobile.dao.MobileDAOImpl;
import com.xworkz.mobile.entity.MobileEntity;

public class MobileTester {

	public static void main(String[] args) {
		MobileEntity mobileEntityf = new MobileEntity(1, "VivoV9", 35000.00, "16GB", "Blue", 10, false, "Android");
//		MobileEntity mobileEntity1 = new MobileEntity(2, "VivoV9", 35000.00, "16GB", "Blue", 10, false, "Android");
//		MobileEntity mobileEntity2 = new MobileEntity(3, "VivoV9pro", 35000.00, "16GB", "Blue", 10, false, "Android");
//		MobileEntity mobileEntity3 = new MobileEntity(4, "apple", 35000.00, "16GB", "Blue", 10, false, "Android");
//		MobileEntity mobileEntity4 = new MobileEntity(5, "oneplus", 35000.00, "16GB", "Blue", 10, false, "Android");
//		MobileEntity mobileEntity5 = new MobileEntity(6, "real me", 35000.00, "16GB", "Blue", 10, false, "Android");
		MobileDAO mobileDAOImpl = new MobileDAOImpl();
		mobileDAOImpl.saveMobileEntity(mobileEntityf);
//		mobileDAOImpl.saveMobileEntity(mobileEntity1);
//		mobileDAOImpl.saveMobileEntity(mobileEntity2);
//		mobileDAOImpl.saveMobileEntity(mobileEntity3);
//		mobileDAOImpl.saveMobileEntity(mobileEntity4);
//		mobileDAOImpl.saveMobileEntity(mobileEntity5);
//		
		

		 //mobileDAOImpl.saveMobileEntity();
//		 mobileDAOImpl.getMobileEntity();
//         mobileDAOImpl.updateMobileEntity();
//		 mobileDAOImpl.deleteMobileEntity();
		
	}

}
