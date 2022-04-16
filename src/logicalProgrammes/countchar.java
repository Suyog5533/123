package logicalProgrammes;

import java.util.ArrayList;

public class countchar {

	public static void main(String[] args) {
		
		
		String s1= "wagaskar";
		ArrayList<Character> a1 = new ArrayList<Character>();
		int count = 1;
		for( int i=0;i<=s1.length()-1;i++)
		{
			char c = s1.charAt(i);
			if(a1.contains(c)){
				count++;
				System.out.println("char "+c+" repeated  "+count);
			}else {
			a1.add(c);
			
			}
		}
	}

}
