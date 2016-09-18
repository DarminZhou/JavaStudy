package demo;

import java.util.ArrayList;

public class Datebase {
	private ArrayList<CD> listCD = new ArrayList<CD>();
	
	public void add(CD cd){
		listCD.add(cd);
	}
	
	public void list(){
		for(CD cd:listCD){
			cd.print();
		}
	}
	public static void main(String[] args) {
		Datebase db=new Datebase();
		db.add(new CD("abc","abc",4, 60,"...")	);
		db.add(new CD("fgfh","dgd",4, 60,"...")	);
		db.list();
	}

}
