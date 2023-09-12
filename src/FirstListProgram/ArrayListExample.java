package FirstListProgram;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListExample {
	public static void main(String [] args)
	{
		List<Integer> lstOfInteger=new ArrayList<Integer>();
		lstOfInteger.add(1);
		lstOfInteger.add(2);
		lstOfInteger.add(3);
		lstOfInteger.add(4);
		
		Iterator itr=lstOfInteger.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	}

}
