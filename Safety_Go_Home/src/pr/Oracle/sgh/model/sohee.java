package pr.Oracle.sgh.model;

import java.sql.SQLException;

public class sohee extends BaseDAO {

	public MemberDTO Login(String id, String pw) {
		MemberDTO result = null;
		getConnect();
		String sql = "update member set isLogin = '1' where member_id =? AND member_pw=?";
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, id);
			ps.setString(2, pw);
			int cnt = ps.executeUpdate();
			if(cnt > 0) {
				rs = conn.createStatement().executeQuery(String.format("select member_id, islogin, type, name from member where member_id = '%s'", id));
				while(rs.next()) {
					String rmember_id = rs.getString(1);
					boolean rislogined = rs.getBoolean(2);
					int rtype = rs.getInt(3);
					String rname = rs.getString(4);
					result = new MemberDTO(rmember_id, rislogined, rtype, rname);
				}
			}			
		} catch (SQLException e) {
			System.err.println("sql문 확인1!");
			e.printStackTrace();
		}finally {
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
			System.err.println("sql문 확인2!!");;
		}finally {
			disConnect();
		}
		
	}

}
