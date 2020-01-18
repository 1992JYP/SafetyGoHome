package pr.Oracle.sgh.test;

import static org.junit.Assert.*;

import org.junit.Test;

import pr.Oracle.sgh.model.MemberDAO;
import pr.Oracle.sgh.model.MemberDTO;

public class DAOTest {

	@Test
	public void test() {
		MemberDAO dao = new MemberDAO();
		dao.getConnect();
		dao.disConnect();
//		assertEquals(1, dao.join("jyp", "jyp", "π⁄¡÷¿±", "920108-1558811", "M", "010-6449-6746", 2));
//		dao.withDraw("jyp1");
		assertEquals(-1, dao.join("jyp", "jyp", "π⁄¡÷¿±", "920108-1558811", "M", "010-6449-6746", 2));
		assertEquals(-2, dao.join("jyp1", "jyp", "π⁄¡÷¿±", "920108-1558811", "M", "010-6449-6746", 2));
		assertEquals(-3, dao.join("jyp1", "jyp", "π⁄¡÷¿±", "920108-1558813", "M", "010-6449-6746", 2));
		assertEquals(1, dao.pwUpdate("jyp", "jyp1"));
		assertEquals(1, dao.pwUpdate("jyp", "jyp"));
		assertEquals(0, dao.pwUpdate("jyp1", "jyp"));
		assertEquals(1, dao.nameUpdate("jyp", "π⁄¡÷¿±1"));
		assertEquals(1, dao.nameUpdate("jyp", "π⁄¡÷¿±"));
		assertEquals(0, dao.nameUpdate("jyp1", "π⁄¡÷¿±1"));
		assertEquals(1, dao.TypeUpdate("jyp", 1));
		assertEquals(1, dao.TypeUpdate("jyp", 2));
		assertEquals(0, dao.TypeUpdate("jyp", 25));
		MemberDTO user = dao.Login("jyp", "jyp");
		assertTrue(user.isLogined());
		dao.logout("jyp");
		dao.disConnect();
	}
}
