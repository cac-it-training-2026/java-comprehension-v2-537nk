package q02_advanced.question03;

import java.io.IOException;

public class SystemMain03 {

	public static void main(String[] args) {

		LoginService loginService = new LoginService(new MemberStorage());
		System.out.println("ログイン情報を入力してください");
		boolean isLogin = false;
		//TODO ここから実装する

		ConsoleReader cr = new ConsoleReader();

		Member loginUser = null;

		while (isLogin == false) {

			System.out.print("input target Id>>");
			int inputId = 0;
			try {
				inputId = cr.inputNumber();

			} catch (IOException e) {
				e.printStackTrace();

			} catch (NumberFormatException e) {
				System.out.println("error");
				e.printStackTrace();
			}

			System.out.print("input new Password>>");
			String inputPassword = null;
			try {
				inputPassword = cr.inputString();

			} catch (IOException e) {
				e.printStackTrace();
			}

			loginUser = loginService.doLogin(inputId, inputPassword);
			if (loginUser == null) {
				System.out.println("IDまたはパスワードが違っています。再度入力してください。");
				continue;
			} else {
				System.out.println("ログインに成功しました");
				isLogin = true;
				break;
			}
		}

		System.out.println("ログインユーザ情報を表示します。");
		System.out.println(loginUser);

	}

}
