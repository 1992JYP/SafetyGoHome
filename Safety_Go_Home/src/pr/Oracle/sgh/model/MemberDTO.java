package pr.Oracle.sgh.model;

public class MemberDTO {
	private String _id;
	private boolean _isLogined = false;
	private String _type = null;
	
	public MemberDTO(String _id, boolean _isLogined, String _type) {
		this._id = _id;
		this._isLogined = _isLogined;
		this._type = _type;
	}

	public String getId() {
		return _id;
	}

	public boolean isLogined() {
		return _isLogined;
	}

	public String getType() {
		return _type;
	}
	
	public void setType(String type) {
		_type=type;
	}

	
}
