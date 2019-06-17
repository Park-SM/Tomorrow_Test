package model;

import java.time.LocalDate;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Member { // DB의 레코드와 매핑되는 객체
	private StringProperty uEmail; // DB의 필드와 매핑
	private StringProperty uPw;
	private StringProperty uName;
	private StringProperty uBirth;
	private StringProperty uAge;
	private StringProperty uAddress;
	private StringProperty uContact;
	/*
    private final IntegerProperty zipcode;
    private ObjectProperty<LocalDate> birthday;
	*/
	public Member() {
		this(null, null, null, null, null, null, null);
	}
	
	public Member(String email, String pw, String name, String birth, String age, String address, String contact) {
		this.uEmail = new SimpleStringProperty(email);
		this.uPw = new SimpleStringProperty(pw);
		this.uName = new SimpleStringProperty(name);
		this.uBirth = new SimpleStringProperty(birth);
		this.uAge = new SimpleStringProperty(age);
		this.uAddress = new SimpleStringProperty(address);
		this.uContact = new SimpleStringProperty(contact);
	}
	
	// email
	public String getUemail() {
		return this.uEmail.get();
	}
	public void setUemail(String uemail) {
		this.uEmail.set(uemail);
	}
    public StringProperty uemailProperty() {
        return uEmail;
    }
    
    // password
    public String getUpw() {
    	return this.uPw.get();
    }
    public void setUpw(String upw) {
    	this.uPw.set(upw);
    }
    public StringProperty upwProperty() {
        return uPw;
    }
    
    // name
    public String getUname() {
    	return this.uName.get();
    }
    public void setUname(String uname) {
    	this.uName.set(uname);
    }
    public StringProperty unameProperty() {
        return uName;
    }
    
    // birth
    public String getUbirth() {
    	return this.uBirth.get();
    }
    public void setUbirth(String ubirth) {
    	this.uBirth.set(ubirth);
    }
    public StringProperty ubirthProperty() {
        return uBirth;
    }
    
    // age
    public String getUage() {
    	return this.uAge.get();
    }
    public void setUage(String uage) {
    	this.uAge.set(uage);
    }
    public StringProperty uageProperty() {
        return uAge;
    }
    
    // address
    public String getUaddress() {
    	return this.uAddress.get();
    }
    public void setUaddress(String uaddress) {
    	this.uAddress.set(uaddress);
    }
    public StringProperty uaddressProperty() {
        return uAddress;
    }
    
    // contact
	public String getContact() {
		return this.uContact.get();
	}
	public void setContact(String contact) {
		this.uContact.set(contact);
	}
	public StringProperty ucontactProperty() {
        return uContact;
    }

}
