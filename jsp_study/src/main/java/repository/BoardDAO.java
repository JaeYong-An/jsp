package repository;

import java.util.List;

import domain.BoardVO;

public interface BoardDAO {

	int insert(BoardVO bvo);

	List<BoardVO> getlist();

	BoardVO getDetail(int bno);

	int modify(BoardVO bvo);

	int delete(int bno);

}
