package seller;
	    
	    public class Property_cost {
	    	
	    	
			

	  	  
    static double estimatePropertyTax( double price) {
	    	    
	    	    double taxRate = 0.01; 
	    	    return (price * taxRate) + price;
	    	  }

	    		    	  
	    	static double discount(double price) {
	    		  
	    		  
	    		 if (price >= 1000)
	    		 {
	    			 
	    			double discountt = 0.1;
	    			
	    			return discountt * price;	  
	    	  }
	    		 else {return price;}
	    		 
	    		 				
	    	 }
	    			 
	    				    		 
	    	  // Methods for other calculations

	    	   static double calculateTotalCost(String price) {
	    		   
	    			double value = Double.parseDouble(price);
	    		   
	    	   	    		  
	    		 double totalCost = 0;
	    	   
	    		 	    	  	    	     
	    		 totalCost = estimatePropertyTax(value) - discount(value)  ;
	    	   
	    	    return totalCost;
	    	     }
	    
	    
	    static double calculate_discount(String price) {
 		   
			double value = Double.parseDouble(price);
			
			return discount(value);
		   
	    }
	    }



		

		
	    	  

	    	
	    

	    

