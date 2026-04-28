package q01_basic.question05;

public class SystemMain05 {

	public static void main(String[] args) {

		AbstMember[] members = new AbstMember[2];
		//TODO ここから実装する
		NonMember nonMember = new NonMember("Sato Kensuke");
		Member member = new Member(1, "Passw0rd", "Miura Manabu", 28, 2);

		members[0] = nonMember;
		members[1] = member;

		MemberManager.showAllMembers(members);

		System.out.println("---BUY ITEM---");
		nonMember.buyItem();
		member.buyItem();
	}

}
