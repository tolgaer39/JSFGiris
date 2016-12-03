package helloJSF;

import javax.faces.bean.ManagedBean;
// !! Dogru annotation import edilmedilir.
import javax.faces.bean.SessionScoped;

@ManagedBean()
// eger name attribute kullanmazsak isim --> personBean olur.
// beanlerin scopelari vardir ve varsayilan olarak request scope tur.
@SessionScoped
public class PersonBean {

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
