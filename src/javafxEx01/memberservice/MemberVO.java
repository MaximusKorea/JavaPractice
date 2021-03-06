package javafxEx01.memberservice;

public class MemberVO {
	
	private String memberName;
	private String memberId;
	private String memberPw;
	private String memberInterest;
	private String memberGender;
	
	public MemberVO() {}
	
	public MemberVO(String memberName, String memberId, String memberPw, String memberInterest, String memberGender) {
		super();
		this.memberName = memberName;
		this.memberId = memberId;
		this.memberPw = memberPw;
		this.memberInterest = memberInterest;
		this.memberGender = memberGender;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getMemberPw() {
		return memberPw;
	}

	public void setMemberPw(String memberPw) {
		this.memberPw = memberPw;
	}

	public String getMemberInterest() {
		return memberInterest;
	}

	public void setMemberInterest(String memberInterest) {
		this.memberInterest = memberInterest;
	}

	public String getMemberGender() {
		return memberGender;
	}

	public void setMemberGender(String memberGender) {
		this.memberGender = memberGender;
	}
	
	
	
	
	
	
	
}
