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
			 System.out.println("��Ÿ .. �߸����� �ƴѰ���?");
		} finally {
			disConnect();
		}
		
		return cnt;
		
		
	}
	
	
	public void withdraw(String del_id) { // ���� Ż���ϵ��� Ȯ�ιް� ��ư,,,
	
		getConnect();
		int cnt =0;
		String sql = "delete MEMBER WHERE MEMBER_ID = ? ";
			try {
				ps = conn.prepareStatement(sql);
				
				ps.setString(1, del_id); //id�� �ް�
				
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
	
}
