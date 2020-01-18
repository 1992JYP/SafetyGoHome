package pr.Oracle.sgh.model;

import java.sql.SQLException;

public class eunju extends BaseDAO {

   // 회원정보 업그레이드
   // 비밀번호 수정, 이름변경, 타입 변경 등.

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
         e.printStackTrace();

      } finally {
         disConnect();
      }
      return cnt;
   }
}
