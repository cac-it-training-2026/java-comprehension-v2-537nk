package q01_basic.question07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleReader {
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
