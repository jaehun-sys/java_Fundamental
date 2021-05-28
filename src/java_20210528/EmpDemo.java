package java_20210528;

import java.util.ArrayList;

public class EmpDemo {
	public static void main(String[] args) {
		
		EmpDao dao = EmpDao.getInstance();
		/*
		EmpDto dto = new EmpDto(9003, "KIM", "MANAGER", 7839, null, 40000.0, 30000.0, 30);
		boolean success = dao.insert(dto);
		if(success) {
			System.out.println("insert 성공");
		}else {
			System.out.println("insert 실패");
		}
		*/
		ArrayList<EmpDto> list = dao.select(0,5);
		for(EmpDto dto : list) {
			System.out.printf("%d%10s%10s%10d%15s%10.1f%10.1f%10d\n",
					dto.getNo(), dto.getName(),dto.getJob(),
					dto.getMgr(),dto.getHiredate(),dto.getSal(),
					dto.getComm(), dto.getDeptNo());
		}
	}
}
