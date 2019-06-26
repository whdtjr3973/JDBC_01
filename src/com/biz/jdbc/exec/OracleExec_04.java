package com.biz.jdbc.exec;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.biz.jdbc.medel.ScoreVO;
import com.biz.jdbc.medel.StudentVO;

public class OracleExec_04 {


	public static void main(String[] args) {
		
		List<ScoreVO> scList = new ArrayList<ScoreVO>();
		
		String jdbcDriver ="oracle.jdbc.driver.OracleDriver";
		
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String userName = "user4";
		String password = "1234";

		try {
			Class.forName(jdbcDriver);
			Connection con = DriverManager.getConnection(url, userName, password);
			System.out.println("오라클 연결 성공!");
			
			PreparedStatement pStr = null;
			
			String sql = "SELECT * FROM tbl_student";
			pStr = con.prepareStatement(sql);
			ResultSet rs = pStr.executeQuery();
			
			while(rs.next()) {
				ScoreVO vo = new ScoreVO();
				
			vo.setSc_seq(rs.getLong(1));
			vo.setSc_date(rs.getString(2));
			vo.setSc_st_no(rs.getString(3));
			vo.setSc_score(rs.getInt(4));
			vo.setSc_sb_no(rs.getString(5));
			
			scList.add(vo);
			
			
			
			}
			for(ScoreVO vo : scList) {
				System.out.println(vo);
			}
			
		} catch (ClassNotFoundException e) {
			System.out.println("JDBC Driver 실행 오류");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("오라클에 연결할수 없음");
			e.printStackTrace();
		}
		
	}

}
