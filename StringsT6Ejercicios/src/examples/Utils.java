package examples;

public class Utils {

	public static void clearConsole(String line) {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		for(int i=1; i<=line.length(); i++) {
			System.out.print("\b\b  \b");
		}
	}
	
	public static void clearConsole2()	{
		for(int i=0; i<50; i++) {
			System.out.println();
		}
	}
}
