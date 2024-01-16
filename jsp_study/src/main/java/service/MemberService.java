package service;

import java.util.List;

import domain.MemberVO;

public interface MemberService {

	int register(MemberVO mvo);

	MemberVO login(MemberVO mvo);

	int lastlogin(String id);

	List<MemberVO> getList();

	int detail(String id);

}
