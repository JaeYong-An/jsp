package service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import domain.BoardVO;
import repository.BoardDAO;
import repository.BoardDAOImpl;

public class BoardServiceImpl implements BoardService {

	private static final Logger log = LoggerFactory.getLogger(BoardServiceImpl.class);
	private BoardDAO bdao;
	
	public BoardServiceImpl() {
		bdao = new BoardDAOImpl();
	}
	
	@Override
	public int insert(BoardVO bvo) {
		// TODO Auto-generated method stub
		log.info("insert check 1");
		return bdao.insert(bvo);
	}

	@Override
	public List<BoardVO> getList() {
		// TODO Auto-generated method stub
		log.info("list check 1");
		return bdao.getlist();
	}

	@Override
	public BoardVO detail(int bno) {
		// TODO Auto-generated method stub
		log.info("detail check 1");
		return bdao.getDetail(bno);
	}

	@Override
	public int modify(BoardVO bvo) {
		// TODO Auto-generated method stub
		log.info("mod check 1");
		return bdao.modify(bvo);
	}

	@Override
	public int remove(int bno) {
		// TODO Auto-generated method stub
		log.info("remove check 1");
		return bdao.delete(bno);
	}

}
