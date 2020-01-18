package pr.Oracle.sgh.model;

public class MemberDTO {
	private String _id;
	private boolean _isLogined = false;
	private int _type=0;
	private String _name = null;
	
	public MemberDTO(String _id, boolean _isLogined, int _type, String _name) {
		this._id = _id;
		this._isLogined = _isLogined;
		this._type = _type;
		this._name = _name;
	}

	public String getId() {
		return _id;
	}

	public boolean isLogined() {
		return _isLogined;
	}

	public int getType() {
		return _type;
	}
	
	public void setType(int type) {
		_type=type;
	}
	
	public String getName() {
		return _name;
	}

	
}
