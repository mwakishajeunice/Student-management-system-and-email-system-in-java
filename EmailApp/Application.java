/*A program for creating a new email accounts for new Hires
 * and generating a random password for their emails of the company*/

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Login log1 = new Login("Jeunice","Mwakisha");
		
		//log1.setAlternateEmail("jeunice@gmail.com");
		//System.out.println(log1.getAlternateEmail());
		
		System.out.println(log1.showInfo());
	}
}
