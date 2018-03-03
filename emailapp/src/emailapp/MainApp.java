package emailapp;

public class MainApp {

	public static void main(String[] args) {
		EmailApplication em1 = new EmailApplication("vivek", "Shrestha");
		
		
		em1.setMailCapacity(10);
		em1.setAltEmail("vs@gmail.com");
		em1.setNewPassword("shreekit");
		System.out.println( em1.showInfo());
		
	}

}
