package com.biz.jdbc.exec;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.biz.jdbc.medel.iolistVO;

public class OracleExec_05 {

	public static void main(String[] args) {

		/*
		 * user4 schema에 있는 tbl_iolist 테이블을 읽어서
		 * 리스트를 console에 보이시오
		 */
		List<iolistVO> ioList = new ArrayList<iolistVO>();
		
		String jdbcDriver = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String userName = "user4";
		String password = "1234";
		
		
		try {
			Class.forName(jdbcDriver);
			
			Connection con = DriverManager.getConnection(url, userName, password);
			
			System.out.println("오라클 연결 성공!");
			
			PreparedStatement pStr = null;
			
			String sql = "SELECT * FROM tbl_iolist";
			
			pStr = con.prepareStatement(sql);
			ResultSet rs = pStr.executeQuery();
			
			while(rs.next()) {
				iolistVO vo = new iolistVO();
				
				vo.setIO_SEQ(rs.getLong(1));
				vo.setIO_DATE(rs.getString(2));
				vo.setIO_INOUT(rs.getString(3));
				vo.setIO_AMT(rs.getInt(4));
				vo.setIO_PRICE(rs.getInt(5));
				vo.setIO_TOTAL(rs.getInt(6));
				vo.setIO_PCODE(rs.getString(7));
				vo.setIO_CCODE(rs.getString(8));
				
				ioList.add(vo);
				
			}
			for(iolistVO vo : ioList) {
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
