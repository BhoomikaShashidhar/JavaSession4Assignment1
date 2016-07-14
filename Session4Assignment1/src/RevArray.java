
public class RevArray {
	public static void main(String args[])
	{
		int series[] =new int[10];
		System.out.println("The array values are");
		
		for(int i=0;i<series.length;i++)
		{
			series[i]=i*5;
			System.out.println(series[i]);
		}
		System.out.println();
		System.out.println("The array in the reverse order");
		
		for(int i=series.length-1;i>=0;i--)
		{
			System.out.println(series[i]);
		}
	}

}
