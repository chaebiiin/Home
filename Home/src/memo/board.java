package memo;

import java.util.*;


public class board {
	public static void main(String[] args) {
		note memo = new note();
				
		note[] noteArray = new note[3];
		noteArray[0] = memo;		
		noteArray[1] = memo;
		noteArray[2] = memo;
		
		noteArray[1].getSubject();
	
		List<note> list = new ArrayList(); {
	
		list.add(memo);
		memo= new note("두번째");
		list.add(memo);
		memo= new note("세번째");
		list.add(memo);
		
		System.out.println(list.get(0).getSubject());
		System.out.println(list.get(1).getSubject());
		System.out.println(list.get(2).getSubject());

		
		}
		
	}
}

