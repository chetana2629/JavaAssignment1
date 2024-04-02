package assignmetOne;

public class PatternG {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			//	int row=5;
				int px=5;
				int py=5;
			
			//outer for loop
				
				for(int i=1;i<=5;i++)
				{
					for(int c=1;c<=9;c++)
					{
						if(i==5 || c==px || c==py)
						{
							System.out.print("*");	 
					}
						else
							{
							System.out.print(" ");
							}		
				}
					px--;
					py++;
					System.out.println();
			}
				
				
			}
		}

	