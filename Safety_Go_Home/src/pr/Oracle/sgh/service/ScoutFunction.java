package pr.Oracle.sgh.service;
import java.util.Random;

import pr.Oracle.sgh.model.BaseDAO;
import pr.Oracle.sgh.model.MemberDAO;
import pr.Oracle.sgh.model.MemberDTO;

public class ScoutFunction implements I_Function {

	public MemberDTO scout;
	public BaseDAO dao;
	public MemberDAO mdao;

	public String[] ScoutInfo = { "유저이름", "유저비밀번호" };
	public String[] chatNickList = { "라이언", "프로드", "어피치", "제이지" };
	public String Nick;

	public boolean isLogined() {
		return scout.isLogined();
	}

	public int getType(String id, String pw) {

		scout = mdao.Login(id, pw);
		return scout.getType();
	}

	public String getName(String id, String pw) {

		scout = mdao.Login(id, pw);
		return scout.getName();

	}

	@Override
	public String startChat() {
		setNick();
		return getNick() + "chat start";
	}

	@Override
	public String endChat() {
		return getNick() + "chat+end";
	}

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

	public String receiveRequest() {
		System.out.println("사용자에게 서비스 요청이 왔습니다.");
		return "요청";
	}

	public String notifyUserSafety() {
		System.out.println("사용자가 목적지에 무사히 도착했습니다.");
		return "사용자 안전";

	}

	public String notifyScoutSafety() {
		System.out.println("스카우트가 목적지에 무사히 도착했습니다.");
		return "스카우트 안전";

	}

	public String notifyDanger() {
		System.out.println("위험이 감지되었습니다.");
		return "위험";
	}

	@Override
	public void updateInfo(String id, String pw) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getType() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getInfo(String id, String pw) {
		// TODO Auto-generated method stub
		return null;
	}

}
