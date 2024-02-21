package sample1;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name = "name", eager = true)
@RequestScoped
public class Name {
	private String familyName;
	private String firstName;

	   public Name() {
		      System.out.println("Name started!");
		   }
			
    public String getFamilyName() {
		return familyName;
	}

	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String next() {
        return "output.xhtml";
    }

}
