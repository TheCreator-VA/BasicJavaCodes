/**Fibonacci series upto the values less than 100*/
class Fibonacci{
	int max;//max possible value in fibonacci series
	public Fibonacci(int a)//Parameterized Constructor
	{
		max=a;	
	}
	public void printSeries()//Method to print the actual series 
	{
		int hi=1;
		int lo=0;
		System.out.println(lo);
		while(hi<max)
		{
			System.out.println(hi);
			hi=hi+lo;
			lo=hi-lo;
		}
	}
	public static void main(String args[])
	{
		Fibonacci obj = new Fibonacci(20);
		obj.printSeries();
	}
}
