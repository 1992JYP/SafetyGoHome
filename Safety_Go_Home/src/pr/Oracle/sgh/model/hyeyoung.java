package pr.Oracle.sgh.model;


import java.sql.ResultSet;
import java.sql.SQLException;

public class hyeyoung extends BaseDAO{

   
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
      int cnt = 0; // ���� �ȿ��� �����ϸ� �ű⼭ �ۿ� ��� �� ��
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

   private String checkPhoneNum(String phoneNum) {
      getConnect();
      String phoneNum_check = "";
      String sql = "SELECT PHONE_NUM FROM MEMBER WHERE PHONE_NUM = ?";
      try {
         ps = conn.prepareStatement(sql); // �̰� ���� �ڵ����� try, catch�� ������ ��
         ps.setString(1, phoneNum);

         ResultSet rs = ps.executeQuery();
         while (rs.next()) {  // �̰� �ؾ� ������� ���� ��  () �ȿ� false�� ���� while���� ������ �ȵ�

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

   private String checkregisterNum(String registerNum) {

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

   private String checkId(String id) {

      getConnect();
      String id_check = "";
      String sql = "SELECT MEMBER_ID FROM MEMBER WHERE MEMBER_ID = ?";
      try {
         System.out.println("*");
         ps = conn.prepareStatement(sql); // �̰� ���� �ڵ����� try, catch�� ������ ��
         System.out.println("*");
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

}