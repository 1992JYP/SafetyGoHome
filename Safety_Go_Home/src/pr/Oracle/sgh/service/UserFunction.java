package pr.Oracle.sgh.service;

import java.util.Random;

import pr.Oracle.sgh.model.MemberDTO;

public class UserFunction implements I_Function {

	public MemberDTO user;

//	DTO�� �ִ� ġ��

	public String[] userInfo = { "�����̸�", "������й�ȣ" };
//	��Ե� �޾Ҵ� ġ��
	public String[] chatNickList = { "���̾�" /*,"���ε�","����ġ","������"*/};
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
		System.out.println("���� ������ �����մϴ�.");
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

}
