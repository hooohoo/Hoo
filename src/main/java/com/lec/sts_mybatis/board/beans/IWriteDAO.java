package com.lec.sts_mybatis.board.beans;

import java.util.ArrayList;

public interface IWriteDAO {
	
	public ArrayList<BWriteDTO> select();
	public int insert(final BWriteDTO dto);
	public int insert(String subject, String content, String name);
	public BWriteDTO readByUid(int uid);
//	public BWriteDTO selectByUid(int uid);
	public int update(BWriteDTO dto);
	public int deleteByUid(int uid);
	
	public int incViewCnt(int uid);


}
