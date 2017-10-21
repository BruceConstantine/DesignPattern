package brand;

public interface Brand {
	String getBreandName();
}

class Lenovo implements Brand {
	
	private String brandName;
	
	public Lenovo() {
		this.brandName = "Lenovo";
	}
	
	public String getBrandName() {
		return this.brandName;
	}
	
}


class Dell implements Brand {
	
	private String brandName;
	
	public Lenovo() {
		this.brandName = "Dell";
	}
	
	public String getBrandName() {
		return this.brandName;
	}
	
}
