package Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Java8ExColl {
	
	public static void main(String[] args) {
		
		Consumer<Integer> c;
		Function<Integer, Integer> fun;
		Predicate<Integer> p;
																																																																																																
		List<Integer> list = new ArrayList<Integer>();
		list.add(20);
		list.add(50);
		list.add(4555);
		list.add(245);
		list.add(5);
		
		//list.stream().forEach(new Consumer<Integer>()){
			
		//}
		
		//list.stream().forEach( System.out::println);
		System.out.println(
		list.stream()
		.map((t) -> t+10)
//		.filter(new Predicate<Integer>(){
//
//			@Override
//			public boolean test(Integer t) {
//				// TODO Auto-generated method stub
//				return t%2==0;
//			}
//			
//		})
		.filter((t)-> t%2==0)
		.reduce((t,u)->t+u).get()
		);
		
	}

}
