import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import static java.lang.System.*;
public class Stream1 {
	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(7);
		al.add(16);
		al.add(9);
		al.add(10);
		al.add(39);
		al.add(71);
		al.add(84);
		al.add(12);
		
		int res=al.stream().filter(i->i%2!=0).reduce(0,(i,j)->i+j);
		System.out.println(res);
}
}
