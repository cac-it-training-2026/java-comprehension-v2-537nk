package q02_advanced.question02;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SystemMain02 {

	public static void main(String[] args) {

		//TODO ここから実装する
		ConsoleReader cr = new ConsoleReader();

		Member member1 = Member.getInstance(1, "Passw0rd", "Miura Manabu", 28, 2);
		Member member2 = Member.getInstance(2, "aaaAAA", "Sato Kensuke", 43, 1);

		System.out.println("＝＝＝会員情報を表示します＝＝＝");
		List<Member> members = new ArrayList<Member>();
		members.add(member1);
		members.add(member2);
		MemberManager.showAllMembers(members);

		System.out.println("===パスワードを変更します===");

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
		String newPassword = null;
		try {
			newPassword = cr.inputString();
		} catch (IOException e) {
			e.printStackTrace();
		}

		MemberManager.updatePassword(members, inputId, newPassword);

		System.out.println("---SHOW DATA---");
		MemberManager.showAllMembers(members);
	}

}
