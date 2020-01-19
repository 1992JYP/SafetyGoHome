package pr.Oracle.sgh.service;

import pr.Oracle.sgh.model.MemberDTO;

public class MainFunction {

	private I_Function _func;
	private MemberDTO _dto;
	
	public MainFunction(I_Function func, MemberDTO dto) {
		_func=func;
		_dto=dto;
	}
	
//	public I_Function getFunc() {
//		return _func;
//	}
	
	public int changeType(int type) {
		if(_dto.isLogined()) {	//검사 해야하는가 의문은 있음
			_dto.setType(type);
		}
		return _dto.getType();
	}
	public int getType() {
		return _dto.getType();
	}
	
	
	public String getId() {
		return _dto.getId();
	}

	public String getName() {
		return _dto.getName();
	}

	public String start() {
		return _func.getStart();
	}

	public String end() {
		return _func.getEnd();
	}

	public String startChat() {
		return _func.startChat();
	}

	public String endChat() {
		return _func.endChat();
	}

	public Object emerge() {
		return _func.emerge();
	}

	public Object getNick() {
		return _func.getNick();
	}


	
	
}
