package com.lec.sts_mybatis.board;

import org.apache.ibatis.session.SqlSession;
import org.springframework.jdbc.core.JdbcTemplate;

public class C {
	
	// 스프링 컨테이너에서 생성된 템플릿 받아와서
	// 언제 어디서든지 쓸 수 있도록 public static 설정
	public static SqlSession sqlSession;

	// 게시글 관련 쿼리문
	public static final String SQL_WRITE_INSERT = "INSERT INTO test_write"
			+ "(wr_subject, wr_content, wr_name) " + "VALUES"
			+ "(?, ?, ?)";

	public static final String SQL_WRITE_SELECT = 
			"SELECT wr_uid uid, wr_subject subject, "
			+ "wr_content content, wr_name name, wr_viewcnt viewCnt, "
			+ "wr_regdate regDate FROM test_write ORDER BY wr_uid DESC";
	
	public static final String SQL_WRITE_SELECT_BY_ID = 
			"SELECT wr_uid uid, wr_subject subject, "
			+ "wr_content content, wr_name name, wr_viewcnt viewcnt, "
			+ "wr_regdate regDate FROM test_write WHERE wr_uid=?";

	public static final String SQL_WRITE_INC_VIEWCNT = "UPDATE test_write SET wr_viewcnt = wr_viewcnt + 1 WHERE wr_uid = ?";

	public static final String SQL_WRITE_DELETE_BY_UID = "DELETE FROM test_write WHERE wr_uid = ?";

	public static final String SQL_WRITE_UPDATE = "UPDATE test_write SET wr_subject = ?, wr_content = ? WHERE wr_uid = ?";

}
