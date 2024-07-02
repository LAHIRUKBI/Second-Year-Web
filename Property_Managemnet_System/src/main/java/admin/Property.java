package admin;

public class Property {

  // Properties (encapsulated with getters and setters)
  public int pid;
  public String title;
  public String type;
  public String location;
  public String description;
  public String name;
  public String phone;
  public String email;
  public  double price;
  public double totalcost;
  public double discount;
  public String states;
  
 

  // Constructor (assumes all properties are required)
  public Property(int pid, String title, String type, String location, String description,String name, String phone,  double price,double totalcost,String states,Double discount) {
    this.pid = pid;
    this.title = title;
    this.type = type;
    this.location = location;
    this.description = description;
    this.name = name;
    this.phone = phone;
   
    this.price = price;
    this.totalcost = totalcost;
    this.discount = discount;
    this.states = states;
  }

  // Getters (provide access to properties)
  public int getPid() {
    return pid;
  }

  public String getTitle() {
    return title;
  }

  public String getType() {
    return type;
  }

  public String getLocation() {
    return location;
  }

  public String getDescription() {
    return description;
  }

  public String getOwnerName() {
    return name;
  }

  public String getOwnerPhone() {
    return phone;
  }

  public String getEmail() {
    return email;
  }

  public  double getPrice() {
    return price;
  }
  
  public  double getDiscount() {
	    return discount;
 }
  public  double getTotalcost() {
	    return totalcost;
 }
  
  public  String getStates() {
	    return states;
	  }

  // (Optional) Setters (allow modifications if needed)
  // ... (implement setter methods if necessary for your project)
}