package pr.Oracle.sgh.test;

import static org.junit.Assert.*;

import org.junit.Test;

import pr.Oracle.sgh.model.MemberDTO;
import pr.Oracle.sgh.service.MainFunction;
import pr.Oracle.sgh.service.UserFunction;


public class FunctionTest {

	
//	�Ҽ��� ���ô�
//	1. �α����� �Ѵ�.
//	2. �α��� ������ Ȯ���Ѵ�(id, T/F, ����Ÿ��)
	
	@Test
	public void test() {
		MemberDTO user = new MemberDTO("test", true, "user");
		MainFunction function = new MainFunction(new UserFunction(), user);
		assertEquals("user", function.getType());
		assertEquals("test",function.getId());
		assertEquals("viewer", function.changeType("viewer"));
		assertEquals("�����̸�",function.getName())	;
		assertEquals("start", function.start());
		assertEquals("���̾� chat start",function.startChat());
		assertEquals("���̾�",function.getNick());
		assertEquals("���", function.emerge());
		assertEquals("���̾� chat end", function.endChat());
		assertEquals("end",function.end());
	}

}
