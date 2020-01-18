/**Program to print the table of Squares*/
class SquareTable{
	int n,i=1;//number of elements
	public SquareTable(int n)//Parameterized Constructor
	{
		this.n=n;
	}
	public void printTable()//Method to actually print the table
	{
		while(i<=n)
		{
			System.out.println(i+"*"+i+"="+i*i);
			i++;
		}
	}
	public static void main(String args[])
	{
		SquareTable obj = new SquareTable(5);
		obj.printTable();
	}
}
