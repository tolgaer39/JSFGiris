package helloCdiBean;

// Burda dikkat edilmesi gereken @Named kullandigimda session scope icin enterprise.context.SessionScoped kullanilmalidir.  
import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@Named(value="personBeanCDI")
// eger name attribute kullanmazsak isim --> personBean olur.

@SessionScoped    // Session scope ise serializable olmalidir.
public class PersonBean implements Serializable{

	private String name;
	private String password;	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
