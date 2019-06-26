package com.biz.jdbc.exec;

import java.util.Scanner;

import com.biz.jdbc.medel.StudentVO;
import com.biz.jdbc.service.StdService;

public class OracleExec_08 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		StdService ss = new StdService();
		
		while(true) {
			System.out.println("조회할 학생의 학번을 입력하세요(종료:--END)");
			String strNum = scan.nextLine();
			
			if(strNum.contentEquals("--END")) {
				
				System.out.println("Good Bye!");
				break;
			}
			StudentVO vo = ss.findByNum(strNum);
			if(vo == null) System.out.println("찾는 학생이 없음");
			else System.out.println(vo);
		}
		
	}

}
