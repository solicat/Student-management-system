package pd.management;

import java.io.Serializable;

public class Account implements Serializable{
	private String ID;
	private String PW;
	private User user ;
		
	public Account(String iD, String pW, User user) {
		super();
		ID = iD;
		PW = pW;
		this.user = user;
	}
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getPW() {
		return PW;
	}
	public void setPW(String pW) {
		PW = pW;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}	
}
