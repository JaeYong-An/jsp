package repository;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import domain.BoardVO;
import orm.DatabaseBuilder;


public class BoardDAOImpl implements BoardDAO {

	private static final Logger log = LoggerFactory.getLogger(BoardDAOImpl.class);
	
	private SqlSession sql;
	
	public BoardDAOImpl() {
		new DatabaseBuilder();
		sql = DatabaseBuilder.getFactory().openSession();
	}
	
	public int insert(BoardVO bvo) {
		// TODO Auto-generated method stub
		log.info("insert check 2");
		int isOK = sql.insert("BoardMapper.ins", bvo);
		if(isOK > 0) {
			sql.commit();
		}
		return isOK;
	}

	@Override
	public List<BoardVO> getlist() {
		// TODO Auto-generated method stub
		log.info("list check 2");
		return sql.selectList("BoardMapper.list");
	}

	@Override
	public BoardVO getDetail(int bno) {
		// TODO Auto-generated method stub
		log.info("detail check 2");
		int isOK = sql.update("BoardMapper.upCnt", bno);
		if(isOK > 0) {
			sql.commit();
		}
		return sql.selectOne("BoardMapper.detail", bno);
	}

	@Override
	public int modify(BoardVO bvo) {
		// TODO Auto-generated method stub
		log.info("mod check 2");
		int isOK = sql.update("BoardMapper.update",bvo);
		if(isOK>0) {
			sql.commit();
		}
		return isOK;
	}

	@Override
	public int delete(int bno) {
		// TODO Auto-generated method stub
		log.info("remove check 2");
		int isOK = sql.delete("BoardMapper.del", bno);
		if(isOK>0) {
			sql.commit();
		}
		return isOK;
	}

}
