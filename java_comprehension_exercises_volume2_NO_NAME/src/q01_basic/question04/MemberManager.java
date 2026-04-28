package q01_basic.question04;

class MemberManager {

	/**
	 * インスタンス化の禁止
	 */
	private MemberManager() {
	}

	public static void showAllMembers(Member[] members) {
		System.out.println("---SHOW ALL MEMBERS---");
		for (Member member : members) {
			member.showMember();
		}
	}

	//TODO showAllMembersメソッドを実装する

}
