package pr.Oracle.sgh.service;

public interface I_Function {
	
//	���α׷� ����� I_Function�� ������� ������
//	���� Ŭ������ ����� ����
	
	public String getStart(); 
	
	public boolean isLogined();
//	���� ���α׷����� ������ �𸣰�����
//	���� �׽�Ʈ���� while���� �� �����̶�
//	�α��� �Ǿ��ִ��� ��� Ȯ���Ұ���
	
	public String getType();	
//	������ Ÿ�� ǥ�ÿ�
	
	public String getName();	
//	~~~�� ȯ���մϴ�
	
	public void updateInfo(String id, String pw);
//	������ ���� ����
	
	public String getInfo(String id, String pw);
//	�ڽ� ���� Ȯ��
//	���߿� DB���� �ڱ������� �̰�����
//	������ ���ڿ��� Ȯ�θ�
	
	public String startChat();
	public String endChat();
//	��ȭ�� ���

	public String getEnd();

	public Object emerge();

	public void setNick();

	public Object getNick();
	
//	�������� �ȳ� ���α׷��� ��ӹ��� Ŭ�������� �ۼ�
}
