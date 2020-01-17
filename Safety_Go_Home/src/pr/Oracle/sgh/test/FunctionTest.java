package pr.Oracle.sgh.test;

import static org.junit.Assert.*;

import org.junit.Test;

import pr.Oracle.sgh.model.MemberDTO;
import pr.Oracle.sgh.service.MainFunction;
import pr.Oracle.sgh.service.UserFunction;


public class FunctionTest {

	
//	소설을 씁시다
//	1. 로그인을 한다.
//	2. 로그인 계정을 확인한다(id, T/F, 계정타입)
	
	@Test
	public void test() {
		MemberDTO user = new MemberDTO("test", true, "user");
		MainFunction function = new MainFunction(new UserFunction(), user);
		assertEquals("user", function.getType());
		assertEquals("test",function.getId());
		assertEquals("viewer", function.changeType("viewer"));
		assertEquals("유저이름",function.getName())	;
		assertEquals("start", function.start());
		assertEquals("라이언 chat start",function.startChat());
		assertEquals("라이언",function.getNick());
		assertEquals("긴급", function.emerge());
		assertEquals("라이언 chat end", function.endChat());
		assertEquals("end",function.end());
	}

}
