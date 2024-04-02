package assignmetOne;

public class Program5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[] = {1,1, 2,2,2,1,5,5,3,3};
		
		for (int i = 0; i < a.length; i++) 
		{    int count=0;
			for (int j = 0; j < a.length; j++) 
			{
				if(a[i]==a[j])
					count++;
			}
			System.out.println("number of = " +a[i]+ "  occurrence  " +count+ "   in array");
		}
	}

}
