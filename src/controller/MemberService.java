package controller;

import java.util.ArrayList;
import model.Member;

public interface MemberService {	
	int create(Member member);
	Member read(Member member);
	ArrayList<Member> readList();
	int update(Member member);
	int delete(Member member);	
	int findByUid(Member member);
	int findByUname(Member member);
	
	ArrayList<Member> SearchAddress(String address);
	ArrayList<Member> SearchName(String name);
}
