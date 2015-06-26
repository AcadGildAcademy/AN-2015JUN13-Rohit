

public class CozaLozaWoza {
	
	int i=1;
	int Max=110;
	int count;
	
	void printNumbers()
	{
		for(int j=i;j<=Max;j++)
		{
			if(j%3==0 && j%5==0){
				System.out.print("CozaLoza");
			}
			
			else if(j%3==0)
			{
				System.out.print("Coza");
			}
			else if(j%5==0)
			{
				System.out.print("Loza");
				
			}
			else if (j%7==0)
			{
				System.out.print("Woza");
			}
			else
			{
			System.out.print(j);
			}
			count++;
			if(count==11)
			{
				System.out.println();
				count=0;
			}
           

	}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		CozaLozaWoza clw=new CozaLozaWoza();
		clw.printNumbers();
	}

}
