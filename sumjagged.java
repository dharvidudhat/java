//sum of all element in jagged array
class sumjagged
{
	static int sum(int[][] arr,int na,int nb)
	{
		int a=0;
		for(int i=0;i<na;i++)
		{
			for(int j=0;j<nb;j++)
			{
				a+=arr[i][j];
			}
		}
		return a;
	}
	public static void main(String[] args)
	{
		int[][] arr=new int[2][2];
		arr[0][0]=10;
		arr[0][1]=20;
		arr[1][0]=30;
		arr[1][1]=40;
		System.out.println("value of array:");
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.println(arr[i][j]);
			}
		}
		int s=sum(arr,2,2);
		System.out.println("sum of jagged array : "+s);
	}
}