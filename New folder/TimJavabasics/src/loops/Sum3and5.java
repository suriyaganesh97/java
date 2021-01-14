package loops;

public class Sum3and5 {

	public static void main(String[] args) {
		int sum=0,flag=0;
		for(int i=1;i<=1000;i++)
		{
			if(i%3==0 && i%5==0)
			{
				sum+=i;
				System.out.println("found a number matching the condition "+i);
				flag++;
				if(flag==5)
				{
					break;
				}
			}
		}
		System.out.println("som of the numbers are "+sum);

	}

}
