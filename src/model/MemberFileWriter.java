package model;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class MemberFileWriter {
	BufferedWriter bw = null;
	FileWriter fw = null;
	public MemberFileWriter(File f) throws IOException {
		fw = new FileWriter(f);
	}
	public void saveMember(ArrayList<Member> memberList) {
		SimpleDateFormat dFormat = new SimpleDateFormat("yyyy");
		for(Member m : memberList) {
			try {
				fw.write(m.getUemail() + "\t");
				fw.write(m.getUpw() + "\t");
				fw.write(m.getUname() + "\t");
				fw.write(m.getUbirth() + "\t");
				fw.write(String.valueOf(Integer.parseInt(dFormat.format(System.currentTimeMillis()))
						- Integer.parseInt(m.getUbirth().substring(0,  4)) + 1) + "\t");
				fw.write(m.getUaddress() + "\t");
				fw.write(m.getUcontact() + "\t");
				fw.write(m.getUsex() + "\n");
				fw.flush();
			} catch (IOException e) {
			}			
		}
	}
}
