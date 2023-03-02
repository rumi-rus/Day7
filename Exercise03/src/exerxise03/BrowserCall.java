package exerxise03;

public class BrowserCall {

	public static void main(String[] args) {
		Browser google=new Browser();
		Integer i= google.numberOfTabs;
		System.out.println("The number of tabs(object) are "+i);
		int in=google.noOfTabs;
		System.out.println("The number of tabs(primitive) are "+in);
		// TODO Auto-generated method stub

	}

}
