
public class Test {
	//static Person p = new Person();
	public static void main(String[] args) {
	/*	Person p = new Person();
		p.setName("ata");
		p.setPhoneNumber(876);
		
		Person p2 = new Person();
		p2.setName("weam");
		p2.setPhoneNumber(876);
		
		if(p.equals(p2)) {
			System.out.println("OK");
		}else {
			System.out.println("Not Ok");
		}
		System.out.println(p);*/
//		City city=new City();
//		city.setName("amman");
//	//	System.out.println(city);
//		City city2=new City();
//		city2.setName("amman");
//		//System.out.println(city);
//		if(city.equals(city2)) {
//			System.out.println("ok");
//		}else {
//			System.out.println("not ok");
//		}
		
		Sender sender=new Sender();
		sender.setName("ata");
		sender.setId(123456);
		sender.setPhoneNumber(88);
		Currency currency =new Currency();
		currency.setName("$");
		Reciver reciver=new Reciver();
		reciver.setName("fares");
		reciver.setPhoneNumber(666);
		Address address=new Address();
		City city=new City();
		Country country1=new Country();
		country1.setName("Oman");
		city.setName("Masqat");
	    city.setCountry(country1);
		address.setCity(city);
		reciver.setAdress(address);
		Bank bank=new Bank();
		bank.setName(".....");
		bank.setBankCode("...");
		bank.setBankAccount("....");
		reciver.setBank(bank);
	WireTransfere w=new WireTransfere();
	w.setAmount(6000);
	
		currency.setName("$");
		w.setSander(sender);
		w.setReciver(reciver);
		w.setCurrency(currency);
		System.out.println("Sender");
		System.out.println("name "+w.getSander().getName());
		System.out.println("Id  "+w.getSander().getId());
		System.out.println("phoneNumber "+w.getSander().getPhoneNumber());
		System.out.println("amount  "+w.getAmount());
		System.out.println("a currcny  "+w.getCurrency().getName());
		System.out.println("Reciver");
		System.out.println("name "+w.getReciver().name);
		System.out.println("phone "+w.getSander().getPhoneNumber());
		System.out.println("county "+w.getReciver().getAdress().getCity().getCountry().getName());
		System.out.println("city "+w.getReciver().getAdress().getCity().getName());
		System.out.println("bankAccount "+w.getReciver().getBank().getBankAccount());
		System.out.println("bank name "+w.getReciver().getBank().getName());
		System.out.println("bank code "+w.getReciver().getBank().getBankCode());

	}
	
	

}
