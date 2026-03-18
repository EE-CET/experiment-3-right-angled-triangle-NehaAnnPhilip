public class Triangle {
    public static void main(String args[]){
		int i,j,k=1;
		for(i=0;i<3;i++)
		{
			for(j=0;j<k-1;j++)
				System.out.print("* ");
			System.out.println("*");
			k+=2;
		}
	}
}
