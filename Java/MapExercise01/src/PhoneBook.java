import java.util.HashMap;
import java.util.TreeMap;
import java.util.Map;

public class PhoneBook {

		Map<String, String> map = new HashMap<>();

		public void addEntry(String name, String phoneNumber) {
			map.put(name, phoneNumber);
	    }
	    
	    public String findEntry(String name) {
	    	return map.get(name);
	    }
	    
	    public boolean existsEntry(String name) {
	    	return map.containsKey(name);
	    }
	    
	    public boolean checkNumberExists(String phoneNumber) {
	    	return map.containsValue(phoneNumber);
	    
	    }
	    
	     public String getOwnerForNumber(String phoneNumber) {
	    	 for(String name : map.keySet())
	    	 {
	    		 if(map.get(name).equals(phoneNumber))
	    		 {
	    			 return name;
	    		 }
	    	 }
	    	 return null;
	     }
	

}
