package q02_advanced.question03;

import java.util.List;

public class MemberManager {
	private MemberManager() {

	}

	public static void showAllMembers(List<Member> members) {

		for (Member member : members) {
			member.showMember();
		}
	}

	public static void updatePassword(List<Member> members, int targetId, String newPassword) {
		boolean Flag = false;

		for (Member member : members) {
			if (member.getId() == targetId) {
				member.setPassword(newPassword);
				Flag = true;
				break;
			}
		}

		if (!Flag) {
			System.out.println("該当者はいませんでした。");
		}
	}
}
