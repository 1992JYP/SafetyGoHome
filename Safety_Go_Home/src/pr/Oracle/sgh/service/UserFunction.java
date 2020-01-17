package pr.Oracle.sgh.service;

import java.util.Random;

import pr.Oracle.sgh.model.MemberDTO;

public class UserFunction implements I_Function {

	public MemberDTO user;

//	DTO에 있다 치고

	public String[] userInfo = { "유저이름", "유저비밀번호" };
//	어떻게든 받았다 치고
	public String[] chatNickList = { "라이언" /*,"프로드","어피치","제이지"*/};
	public String Nick;
	
	@Override
	public boolean isLogined() {
		return user.isLogined();
	}

	@Override
	public String getType() {
		return user.getType();
	}

	@Override
	public String getName() {
		return userInfo[0];
	}

	@Override
	public void updateInfo(String id, String pw) {
		System.out.println("유저 정보를 변경합니다.");
	}

	@Override
	public String getInfo(String id, String pw) {
		return userInfo[0] + userInfo[1];
	}

	@Override
	public String startChat() {
		setNick();
		return getNick()+" chat start";
	}

	@Override
	public String endChat() {
		return getNick()+ " chat end";
	}

	@Override
	public String getStart() {
		return "start";
	}

	@Override
	public String getEnd() {
		return "end";
	}

	@Override
	public Object emerge() {
		System.out.println("관리자에게 긴급을 보냅니다.");
		return "긴급";
	}

	@Override
	public void setNick() {
		Nick = chatNickList[new Random().nextInt(chatNickList.length)];
	}

	@Override
	public Object getNick() {
		return Nick;
	}

}
