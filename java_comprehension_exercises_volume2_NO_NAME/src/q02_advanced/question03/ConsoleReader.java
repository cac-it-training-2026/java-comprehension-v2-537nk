package q02_advanced.question03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleReader {
	public String inputString() throws IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		try {
			String str = reader.readLine();
			return str;

		} catch (IOException e) {
			e.printStackTrace();

		}

		return "";
	}

	public int inputNumber() throws IOException, NumberFormatException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		try {
			int i = Integer.parseInt(reader.readLine());
			return i;

		} catch (IOException e) {
			e.printStackTrace();

		} catch (NumberFormatException e) {
			e.printStackTrace();

		}

		return 0;

	}
}
