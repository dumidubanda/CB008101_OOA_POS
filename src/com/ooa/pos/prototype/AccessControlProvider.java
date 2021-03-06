package com.ooa.pos.prototype;

import java.util.HashMap;
import java.util.Map;

public class AccessControlProvider {

	private static Map<String, AccessControl>map = new HashMap<String, AccessControl>();
	
	static{
		
		System.out.println("Fetching data from external resources and creating access control objects...");
		map.put("CASHIER", new AccessControl("USER","SALES"));
		map.put("ADMIN", new AccessControl("ADMIN","ADD/REMOVE USERS, GENERATE/READ REPORTS"));
		
	}
	
	public static AccessControl getAccessControlObject(String controlLevel){
		AccessControl ac = null;
		ac = map.get(controlLevel);
		if(ac!=null){
			return ac.clone();
		}
		return null;
	}
}
