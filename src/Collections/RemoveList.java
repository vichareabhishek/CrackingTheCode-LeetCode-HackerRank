package Collections;

import java.util.ArrayList;
import java.util.List;

public class RemoveList {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(245);
		list.add(388);
		list.add(423);
		list.add(545);
		list.add(688);
		list.add(7);
		list.add(845);
		list.add(988);
		list.add(1023);
		list.add(115);
		list.add(128);
//		for(int i=1; i<list.size(); i++){
//			if(i%2==0)
//				list.remove(i);
//		}
		for(int i=1; i<list.size(); i++){
			if(list.get(i)%4==0){
				list.remove(i);
			}
		}
		System.out.println(list);
	}

}
