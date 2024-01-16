package repository;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import domain.MemberVO;
import orm.DatabaseBuilder;

public class MemberDAOImpl implements MemberDAO {

	private static final Logger log = LoggerFactory.getLogger(MemberDAOImpl.class);
	
	private SqlSession sql;
	
	public MemberDAOImpl() {
		new DatabaseBuilder();
		sql = DatabaseBuilder.getFactory().openSession();
	}
	
	@Override
	public int register(MemberVO mvo) {
		// TODO Auto-generated method stub
		log.info("join check 2");
		int isOK = sql.insert("MemberMapper.ins", mvo);
		if(isOK>0) sql.commit();
		return isOK;
	}

	@Override
	public MemberVO login(MemberVO mvo) {
		// TODO Auto-generated method stub
		log.info("login check 2");
		return sql.selectOne("MemberMapper.login", mvo);
	}

	@Override
	public int lastlogin(String id) {
		// TODO Auto-generated method stub
		log.info("logout check 2");
		int isOK = sql.update("MemberMapper.lastlogin", id);
		if(isOK>0) sql.commit();
		return isOK;
	}

	@Override
	public List<MemberVO> getList() {
		// TODO Auto-generated method stub
		log.info("list check 2");
		return sql.selectList("MemberMapper.list");
	}

	@Override
	public int detail(String id) {
		// TODO Auto-generated method stub
		log.info("detail check 2");
		return sql.selectOne("MemberMapper.detail", id);
	}

}
