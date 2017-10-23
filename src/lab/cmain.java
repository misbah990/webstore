package lab;

public class cmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		webstore namesRepository = new webstore();
		
	      for(Iterator iter = namesRepository.getcost(); iter.hasNext();){
	         String name = (String)iter.next();
	         System.out.println("item : " + name);
	      } 
	      System.out.println("Total items : " +namesRepository.totle);
	    
	}

}
