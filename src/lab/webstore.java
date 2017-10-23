package lab;

import java.util.HashMap;
import java.util.Map;

public class webstore implements list{
	 public String cart[] = {"A","A" , "B" ,"C" , "D"};	 int totle=0;
	 public webstore(){
		 HashMap<String, Integer> itm = new HashMap<String, Integer>();
			itm.put("A",3);
			itm.put("B",1);
			itm.put("C",1);  System.out.println("Item weight: " +itm.get("B"));
	 }
	 
	 @Override
	   public Iterator getcost() {
	      return new shipmentcost();
	   }

	   private class shipmentcost implements Iterator {

		      int index;

		      @Override
		      public boolean hasNext() {		      
		         if(index < cart.length){
		            return true;
		         }
		         return false;
		      }

		      @Override
		      public Object next() {
		         if(this.hasNext()){
		        	 totle++;
		   
		            return cart[index++];
		         }
		         return null;
		      }		
	   }
}