package pr.Oracle.sgh.model;

import java.sql.ResultSet;
import java.sql.SQLException;

public class MemberDAO extends BaseDAO {

	public int safetyStart(int type, String id) {

		String sql = "INSERT INTO LOG (SERVICE_NUM, USER_ID) VALUES (LOG_SEQ.NEXTVAL , ?)";

		if (type == 2) {
			sql = "update LOG set watcher_id = ? where service_num=";
		}
		if (type == 3) {
			sql = "update log set scout1_id = ?";
		}

		int cnt = 0;
		getConnect();
		try {

			ps = conn.prepareStatement(sql); // sql���� ���� ������ �� ���� �����ϱ� try,catch������ ������

			cnt = ps.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return cnt;
	}

	private int getType(String id) {
		int rtype = 0;
		getConnect();
		String sql = "select type from member where member_id = ? and islogined=1";
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, id);

			rs = ps.executeQuery();
			while (rs.next()) {
				rtype = rs.getInt(1);
			}

		} catch (SQLException e) {

		} finally {
			disConnect();
		}
		return rtype;

	}

	private boolean getID() {
		// TODO Auto-generated method stub
		return false;
	}

	public int join(String id, String pw, String name, String registerNum, String gender, String phoneNum, int type) {

		String id_check = checkId(id);
		if (id.equals(id_check)) {
			return -1;
		}
		String registerNum_check = checkregisterNum(registerNum);
		if (registerNum.equals(registerNum_check)) {
			return -2;
		}

		String phoneNum_check = checkPhoneNum(phoneNum);
		if (phoneNum.equals(phoneNum_check)) {
			return -3;
		}

		getConnect();
		int cnt = 0; // �� �ȿ��� �����ϸ� �ű⼭ �ۿ� ��� �� ��
		try {
			String sql = "INSERT INTO MEMBER(MEMBER_ID, MEMBER_PW, NAME, REGISTER_NUM, GENDER, PHONE_NUM, TYPE) VALUES (?, ?, ?, ?, ?, ?, ?)";

			ps = conn.prepareStatement(sql); // sql���� ���� ������ �� ���� �����ϱ� try,catch������ ������

			ps.setString(1, id);
			ps.setString(2, pw);
			ps.setString(3, name);
			ps.setString(4, registerNum);
			ps.setString(5, gender);
			ps.setString(6, phoneNum);
			ps.setInt(7, type);

			cnt = ps.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		disConnect();
		return cnt; // ���ܰ� �߻��ϵ� ���ϵ� ����� �� > ���� �۵� �ߴٸ� cnt�� 0 �̻��̹Ƿ� main���� ���, ���� �߻� �ߴٸ� ���x

	}

	public String checkPhoneNum(String phoneNum) {
		getConnect();
		String phoneNum_check = "";
		String sql = "SELECT PHONE_NUM FROM MEMBER WHERE PHONE_NUM = ?";
		try {
			ps = conn.prepareStatement(sql); // �̰� ���� �ڵ����� try, catch�� ������ ��
			ps.setString(1, phoneNum);

			ResultSet rs = ps.executeQuery();
			while (rs.next()) { // �̰� �ؾ� ������� ���� �� () �ȿ� false�� ���� while���� ������ �ȵ�

				phoneNum_check = rs.getString(1);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			disConnect();
		}

		return phoneNum_check;

	}

	public String checkregisterNum(String registerNum) {

		getConnect();
		String registerNum_check = "";
		String sql = "SELECT REGISTER_NUM FROM MEMBER WHERE REGISTER_NUM = ?";
		try {
			ps = conn.prepareStatement(sql); // �̰� ���� �ڵ����� try, catch�� ������ ��
			ps.setString(1, registerNum);

			ResultSet rs = ps.executeQuery();
			while (rs.next()) {

				registerNum_check = rs.getString(1);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			disConnect();
		}

		return registerNum_check;

	}

	public String checkId(String id) {

		getConnect();
		String id_check = "";
		String sql = "SELECT MEMBER_ID FROM MEMBER WHERE MEMBER_ID = ?";
		try {
			ps = conn.prepareStatement(sql); // �̰� ���� �ڵ����� try, catch�� ������ ��
			ps.setString(1, id);

			ResultSet rs = ps.executeQuery();
			while (rs.next()) {

				id_check = rs.getString(1);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			disConnect();
		}

		return id_check;

	}

	public int pwUpdate(String id, String pw) {

		getConnect();

		int cnt = 0;

		String sql = "update member set member_pw =? where member_id =?";

		try {
			ps = conn.prepareStatement(sql);

			ps.setString(1, pw);

			ps.setString(2, id);
			cnt = ps.executeUpdate();

		} catch (SQLException e) {
			System.out.println("sql!");
		} finally {
			disConnect();
		}
		return cnt;
	}

	public int nameUpdate(String id, String name) {

		getConnect();
		int cnt = 0;

		String sql = "update member set name=? where member_id=?";

		try {

			ps = conn.prepareStatement(sql);
			ps.setString(1, name);
			ps.setString(2, id);
			cnt = ps.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();

		} finally {
			disConnect();
		}

		return cnt;
	}

	public int TypeUpdate(String id, int type) {

		getConnect();
		int cnt = 0;

		String sql = "update member set type=? where member_id=?";

		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1, type);
			ps.setString(2, id);
			cnt = ps.executeUpdate();

		} catch (SQLException e) {
			if (1 <= type && type <= 4) {
				return 0;
			}
//			e.printStackTrace();

		} finally {
			disConnect();
		}
		return cnt;
	}

	public void withDraw(String del_id) { // ���� Ż���ϵ��� Ȯ�ιް� ��ư,,,

		getConnect();
		int cnt = 0;
		String sql = "delete MEMBER WHERE MEMBER_ID = ? ";
		try {
			ps = conn.prepareStatement(sql);

			ps.setString(1, del_id); // id�� �ް�

			cnt = ps.executeUpdate();
			if (cnt > 0) {
				System.out.println("Ż�� �Ϸ�Ǿ����ϴ�!");
			}
		} catch (SQLException e) {
			System.out.println("��Ÿ����..!");
			e.printStackTrace();
		} finally {
			disConnect();
		}

	}

	public MemberDTO Login(String id, String pw) {
		MemberDTO result = null;
		getConnect();
		String sql = "update member set isLogined = '1' where member_id =? AND member_pw=?";
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, id);
			ps.setString(2, pw);
			int cnt = ps.executeUpdate();
			if (cnt > 0) {
				rs = conn.createStatement().executeQuery(String
						.format("select member_id, islogined, type, name from member where member_id = '%s'", id));
				while (rs.next()) {
					String rmember_id = rs.getString(1);
					boolean rislogined = rs.getBoolean(2);
					int rtype = rs.getInt(3);
					String rname = rs.getString(4);
					result = new MemberDTO(rmember_id, rislogined, rtype, rname);
				}
			}
		} catch (SQLException e) {

		} finally {
			disConnect();
		}
		return result;

	}

	public void logout(String id) {
		getConnect();
		String sql = "update member set islogin = '0' where member_id=?";
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, id);

		} catch (SQLException e) {
			System.err.println("sql�� Ȯ��2!!");
			;
		} finally {
			disConnect();
		}
		System.out.println("�α׾ƿ� �Ϸ�");
	}

	public int phoneNumUpdate(String phoneNum, String pw) {

		getConnect();
		int cnt = 0;

		String sql = "update member set phone_num =? where member_pw=?";

		try {

			ps = conn.prepareStatement(sql);
			ps.setString(1, phoneNum);
			ps.setString(2, pw);
			cnt = ps.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();

		} finally {
			disConnect();
		}

		return cnt;

	}

//	public String getPhoneNum()

}
