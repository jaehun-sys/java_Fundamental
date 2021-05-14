package java_20210514;

import java.util.ArrayList;

public class MemberManager {
	private ArrayList list;
	public MemberManager() {
		list = new ArrayList();
	}
	public void insert(String id, String name, int age) {
		list.add(new Member(id,name,age));
	}
	public void update(String id, String name, int age) {
		for(int i=0; i<list.size(); i++) {
			Member m = (Member)list.get(i);
			if(id.equals(m.getId())) {
				list.set(i, new Member(id,name,age));
			}
		}
	}
	public void delete(String id) {
		for(int i=0; i<list.size(); i++) {
			Member m = (Member)list.get(i);
			if(id.equals(m.getId())) {
				list.remove(i);
				break;
			}
		}
	}
	public ArrayList select() {
		return list;
	}
	public void select(String id) {
		for(int i=0; i<list.size(); i++) {
			Member m = (Member)list.get(i);
			if(id.equals(m.getId())) {
				System.out.printf("%s, %s, %d, \n", m.getId(), m.getName(), m.getAge());
			}
		}
	}
	public void show() {
		for(int i=0; i<list.size(); i++) {
			Member m = (Member)list.get(i);
			System.out.printf("%s, %s, %d, \n", m.getId(), m.getName(), m.getAge());
		}
		System.out.println("=========================");
	}
}
