package logicalProgrammes;

public class amstrongNo {

	public static void main(String[] args) {
		
		int myno=153;
		int addition=0;
		
		for(int i=myno;i>0;i=i/10)
		{
			int rem = i%10;
			addition= addition+(rem*rem*rem);
			
		}
		
		if(myno==addition)
		{
			System.out.println("it is amstrong no");
		}
		else
		{
			System.out.println("it is not amstrong no");
		}

	}

}
