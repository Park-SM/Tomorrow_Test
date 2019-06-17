package model;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import javafx.beans.property.SimpleStringProperty;

public class MemberFileReader {
	Scanner sc = null;
	
	public MemberFileReader(File f) throws FileNotFoundException {
		sc = new Scanner(f);
	}
	public ArrayList<Member> readMember() {
		ArrayList<Member> retObj = new ArrayList<Member>();
		while(sc.hasNext()) {
			Member m = new Member();
			String strArr[] = sc.nextLine().split("\t");
			m.setUemail(strArr[0]);
			m.setUpw(strArr[1]);
			m.setUname(strArr[2]);
			m.setUbirth(strArr[3]);
			m.setUage(strArr[4]);
			m.setUaddress(strArr[5]);
			m.setUcontact(strArr[6]);
			m.setUsex(strArr[7]);
			retObj.add(m);	//retObj.remove(index i);
		}
		return retObj;
	}
}