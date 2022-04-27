package com.lec.sts_mybatis.board.command;

import java.util.ArrayList;

import org.springframework.ui.Model;

import com.lec.sts_mybatis.board.C;
import com.lec.sts_mybatis.board.beans.BWriteDTO;
import com.lec.sts_mybatis.board.beans.IWriteDAO;

public class BListCommand implements BCommand{
	
	@Override
	public void execute(Model model) {
		
		// mybatis 사용
		IWriteDAO dao = C.sqlSession.getMapper(IWriteDAO.class);
		model.addAttribute("list", dao.select());
		
	}

}
