package java_20210528;

import java.util.ArrayList;

public class EmpDao {
	private static EmpDao single;
	private EmpDao() {
		
	}
	public static EmpDao getInstance() {
		if(single==null) {
			single = new EmpDao();
		}
		return single;
	}
	
	public boolean insert(EmpDto dto) {
		boolean success = false;
		
		return success;
	}
	
	public boolean update(EmpDto dto) {
		boolean success = false;
		
		return success;
	}
	
	public boolean delete(int num) {
		boolean success = false;
		
		return success;
	}
	
	public ArrayList<EmpDto> select(int start, int len){
		ArrayList<EmpDto> list = new ArrayList<EmpDto>();
		
		return list;
	}
}
