
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		String login = null, password = null;
		
		try {
			String fileName = "Enter.txt";
		    Path path = Paths.get(fileName);
		    Scanner scanner = new Scanner(path);
		    login = scanner.nextLine();
		    password = scanner.nextLine();
		    scanner.close();

			String uLogin = null, uPas = null; 
			int count = 3;
			for (int i = 0; i < count; ++i) {
				System.out.println("Enter login: ");
				uLogin = in.nextLine();
				System.out.println("Enter password: ");
				uPas = in.nextLine();
				testes(uLogin, login, uPas, password);
			}
			
			System.out.println("\n\nCount correct testes: " + countCorrect);
			System.out.println("Count uncorrect testes: " + (count - countCorrect));
		} catch (Exception ex) {
			System.out.println("\n\n" + ex.getMessage());
		} finally {
			in.close();
		}
	}
	
	private static int countCorrect = 0;
	private static void testes(String uLogin, String login, String uPas, String password) {
		if (isCorrectLogin(uLogin, login) && isCorrectPassword(uPas, password)) {
			System.out.println("\n\nHello " + login);
			++countCorrect;
		} else {
			System.out.println("\n\nWrong data!!!");
		}
		
	}

	private static boolean isCorrectPassword(String uPas, String password) {
		return uPas.equals(password);
	}

	private static boolean isCorrectLogin(String uLogin, String login) {
		return uLogin.equals(login);
	}

}
	