package com.biz.jdbc.exec;

import java.util.List;

import com.biz.jdbc.medel.StudentVO;
import com.biz.jdbc.service.StdService;

public class OracleExec_06 {

	public static void main(String[] args) {

		StdService ss = new StdService();
		
		List<StudentVO> stdList = ss.selectAll();
		
		if(stdList != null) {
			for(StudentVO vo : stdList ) {
				System.out.println(vo);
			} 
		} else { 
			System.out.println("학생 정보를 읽는중 오류 발생");
		}
				
		
	}

}
