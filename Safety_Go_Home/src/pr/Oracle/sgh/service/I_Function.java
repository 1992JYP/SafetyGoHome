package pr.Oracle.sgh.service;

public interface I_Function {
	
//	프로그램 실행시 I_Function를 기반으로 생성한
//	종속 클래스를 사용할 예정
	
	public String getStart(); 
	
	public boolean isLogined();
//	실제 프로그램에서 쓸지는 모르겠지만
//	메인 테스트에서 while문을 쓸 예정이라
//	로그인 되어있는지 계속 확인할거임
	
	public String getType();	
//	접속자 타입 표시용
	
	public String getName();	
//	~~~님 환영합니다
	
	public void updateInfo(String id, String pw);
//	접속자 정보 수정
	
	public String getInfo(String id, String pw);
//	자신 정보 확인
//	나중엔 DB에서 자기정보만 뽑겠지만
//	지금은 문자열로 확인만
	
	public String startChat();
	public String endChat();
//	대화방 기능

	public String getEnd();

	public Object emerge();

	public void setNick();

	public Object getNick();
	
//	실질적인 안내 프로그램은 상속받은 클래스에서 작성
}
