
public class City {
	String name ;
	
	Country country ;
	public City(Country country) {
		this.country=country;
	}
	public City() {
		// TODO Auto-generated constructor stub
	
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Country getCountry() {
		return country;
	}
	public void setCountry(Country country) {
		this.country = country;
	}
	@Override
	public String toString() {
		String output=this.name;
		return output;
	}
	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof City)) {
			return false;
		}
		else {
			City c=(City)obj;
			if(c.name.equals(this.name)) {
				return true;
			}
			
		}
		return false;
	}

}
