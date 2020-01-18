package pr.Oracle.sgh.model;

import java.sql.SQLException;

public class jihyun extends BaseDAO{ //DAO

	public int join(String MEMBER_ID, String MEMBER_PW, String TYPE, String NAME, String REGISTER_NUM, String PHONE_NUM) {
		getConnect();
		
		String sql = "INSERT INTO MEMBER VALUES (?, ?, ?, ?, ?, ?)";
		int cnt =0;
		try {
			ps = conn.prepareStatement(sql);
			
			ps.setString(1, MEMBER_ID);
			ps.setString(2, MEMBER_PW);
			ps.setString(3, TYPE);
			ps.setString(4, NAME);
			ps.setString(5, REGISTER_NUM);
			ps.setString(6, PHONE_NUM);
			
			
			cnt = ps.executeUpdate();
			
			
		
		} catch (SQLException e) {
			 System.out.println("오타 .. 잘못쓴거 아닌가요?");
		} finally {
			disConnect();
		}
		
		return cnt;
		
		
	}
	
	
	public void withdraw(String del_id) { // 정말 탈퇴하도록 확인받고 버튼,,,
	
		getConnect();
		int cnt =0;
		String sql = "delete MEMBER WHERE MEMBER_ID = ? ";
			try {
				ps = conn.prepareStatement(sql);
				
				ps.setString(1, del_id); //id를 받고
				
				cnt = ps.executeUpdate();
				if (cnt > 0) { 
					System.out.println("탈퇴 완료되었습니다!");
				}
			} catch (SQLException e) {
				System.out.println("오타오류..!");
				e.printStackTrace();
			} finally {
				disConnect();
			}
		
	}
	
}
