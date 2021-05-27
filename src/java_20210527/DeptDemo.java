package java_20210527;

import java.util.ArrayList;

public class DeptDemo {
	public static void main(String[] args) {
		DeptDao dao = DeptDao.getInstance();
		
		/*
		boolean success = dao.insert(new DeptDto(50,"DEVELOPMENT","LA"));
		if(success) {
			System.out.println("insert 성공");
		}
		else {
			System.out.println("insert 실패");
		}
		*/
		
		/*
		boolean success = dao.update(new DeptDto(50, "DEVELOPMENT1","LA1"));
		if(success) {
			System.out.println("update 성공");
		}
		else {
			System.out.println("update 실패");
		}
		*/
		
		/*
		boolean success = dao.delete(50);
		if(success) {
			System.out.println("delete 성공");
		}
		else {
			System.out.println("delete 실패");
		} 
		*/
		
		
		ArrayList<DeptDto> list = dao.select(0,10);
		for(int i=0; i<list.size(); i++) {
			
			System.out.println(list.get(i).getNo() + "\t" + list.get(i).getName() + "\t" + list.get(i).getLoc());
		}
		
		
	}
}
