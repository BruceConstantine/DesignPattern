package computer;

import brand.*; 

public interface Computer {
	String getDescribe();
}

class Desktop implements Computer{
	
	Brand brand;
	
	public Desktop( Brand brand) {
		this.brand = brand;
	}
	
	public String getDescribe(){
		return "This is a Desktop from the brand: " + brand.getBrandName() ;
	}
}

class Laptop implements Computer{
	
	Brand brand;
	
	public Laptop( Brand brand) {
		this.brand = brand;
	}
	
	public String getDescribe(){
		return "This is a Laptop from the brand: " + brand.getBrandName() ;
	}
}
