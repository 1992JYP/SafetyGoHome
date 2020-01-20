package pr.Oracle.sgh.service;
import java.util.Random;

import pr.Oracle.sgh.model.BaseDAO;
import pr.Oracle.sgh.model.MemberDAO;
import pr.Oracle.sgh.model.MemberDTO;

public class ScoutFunction implements I_Function {

	public MemberDTO scout;
	public BaseDAO dao;
	public MemberDAO mdao;

	public String[] ScoutInfo = { "�����̸�", "������й�ȣ" };
	public String[] chatNickList = { "���̾�", "���ε�", "����ġ", "������" };
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
		System.out.println("�����ڿ��� ����� �����ϴ�.");
		return "���";
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
		System.out.println("����ڿ��� ���� ��û�� �Խ��ϴ�.");
		return "��û";
	}

	public String notifyUserSafety() {
		System.out.println("����ڰ� �������� ������ �����߽��ϴ�.");
		return "����� ����";

	}

	public String notifyScoutSafety() {
		System.out.println("��ī��Ʈ�� �������� ������ �����߽��ϴ�.");
		return "��ī��Ʈ ����";

	}

	public String notifyDanger() {
		System.out.println("������ �����Ǿ����ϴ�.");
		return "����";
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
