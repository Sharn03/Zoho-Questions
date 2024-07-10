package zohoProblems;

import java.util.ArrayList;
import java.util.Optional;

public class streamsDemo {
public static void main(String[] args) {
	ArrayList<Integer>list = new ArrayList<>();
	list.add(1);
	list.add(2);
	list.add(3);
	list.add(4);
	list.add(5);
	
   Optional<Integer> ans = Optional.ofNullable(list.stream().reduce(1,(c,e) -> c+e));
   System.out.println(ans.get());
}
}
