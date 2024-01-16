package service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import domain.MemberVO;
import repository.MemberDAO;
import repository.MemberDAOImpl;

public class MemberServiceImpl implements MemberService {

	private MemberDAO mdao;
	
	private static final Logger log = LoggerFactory.getLogger(MemberServiceImpl.class);
	
	public MemberServiceImpl() {
		mdao = new MemberDAOImpl();
	}
	@Override
	public int register(MemberVO mvo) {
		// TODO Auto-generated method stub
		log.info("join check 1");
		return mdao.register(mvo);
	}
	@Override
	public MemberVO login(MemberVO mvo) {
		// TODO Auto-generated method stub
		log.info("login check 1");
		return mdao.login(mvo);
	}
	@Override
	public int lastlogin(String id) {
		// TODO Auto-generated method stub
		log.info("logout check 1");
		return mdao.lastlogin(id);
	}
	@Override
	public List<MemberVO> getList() {
		// TODO Auto-generated method stub
		log.info("list check 1");
		return mdao.getList();
	}
	@Override
	public int detail(String id) {
		// TODO Auto-generated method stub
		log.info("detail check 1");
		return mdao.detail(id);
	}

}
