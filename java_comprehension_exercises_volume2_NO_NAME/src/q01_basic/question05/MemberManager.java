package q01_basic.question05;

public class MemberManager {

	private MemberManager() {
	}

	public static void showAllMembers(AbstMember[] members) {
		System.out.println("---SHOW ALL MEMBERS---");
		for (AbstMember member : members) {
			member.showMember();
		}
	}
}
