
public class Person {
	
	int id;
	int phoneNumber;
	Address adress;
	public String name;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public Address getAdress() {
		return adress;
	}
	public void setAdress(Address adress) {
		this.adress = adress;
	}
@Override
public String toString() {
	// TODO Auto-generated method stub
	String output =this.name+ " " + this.phoneNumber;
	return output;
}
//
@Override
public boolean equals(Object obj) {
	// TODO Auto-generated method stub
	if(!(obj instanceof Person)) {
		return false;
	}else {
		Person p = (Person) obj;
		if(p.getName().equals(this.name)) {
			return true;
		}
	}
	return false;
}
	

}
