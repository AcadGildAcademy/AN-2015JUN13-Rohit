
import java.util.*;

public class SumandAverage {
	
	int lowerLimit;
	int upperLimit;
	int i;
	double count=0;
	double n=0;
	
	public double Sum(int lower,int upper)
	{
		
		
		for (i=lower;i<=upper;i++)
		{
			n=n+i;
			count=count+1;
		}
		return n;
		
	}

	public double Average()
	{
	 double avg=n/count;
	 return avg;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SumandAverage sa=new SumandAverage();
		System.out.println("Enter the Lower limit");
		Scanner in = new Scanner(System.in);
	    sa.lowerLimit=in.nextInt();
	    System.out.println("Enter the upper limit for the sum");
	    sa.upperLimit=in.nextInt();
	    System.out.println("Sum of the number is"+ sa.Sum(sa.lowerLimit, sa.upperLimit));
	    System.out.println("Average of the number is"+ sa.Average());
	    
	    

	}

}
