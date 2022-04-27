package com.lec.sts_mybatis.board.command;

import java.util.Map;

import org.springframework.ui.Model;

import com.lec.sts_mybatis.board.C;
import com.lec.sts_mybatis.board.beans.BWriteDTO;
import com.lec.sts_mybatis.board.beans.IWriteDAO;

public class BWriteCommand implements BCommand{
	
	@Override
	public void execute(Model model) {
		Map<String, Object> map = model.asMap();
		BWriteDTO dto = (BWriteDTO)map.get("dto");
		
		// mybatis
		IWriteDAO dao = C.sqlSession.getMapper(IWriteDAO.class);
//		model.addAttribute("result", dao.insert(dto));
		// type 2
		model.addAttribute("result", 
				dao.insert(dto.getSubject(), dto.getContent(), dto.getName()));
	}

}
