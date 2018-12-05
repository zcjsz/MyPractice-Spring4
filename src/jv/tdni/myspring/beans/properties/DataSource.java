package jv.tdni.myspring.beans.properties;

public class DataSource {

	private String user;
	private String password;
	private String driver;
	private String url;
	
	public void setUser(String user) {
		this.user = user;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public void setDriver(String driver) {
		this.driver = driver;
	}
	
	public void setUrl(String url) {
		this.url = url;
	}

	public String getUser() {
		return user;
	}

	public String getPassword() {
		return password;
	}

	public String getDriver() {
		return driver;
	}

	public String getUrl() {
		return url;
	}

	@Override
	public String toString() {
		return "DataSource [user=" + user + ", password=" + password + ", driver=" + driver + ", url=" + url + "]";
	}

	
	
}
