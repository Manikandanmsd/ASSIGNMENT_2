import java.util.Scanner;

public class array_ass {

	public static void main(String[] args) {
		int dar [] = new int[5];
        Scanner sdr = new Scanner(System.in);
        for ( int i =0;i<dar.length;i++)
        {
            dar[i] = sdr.nextInt();
        }
        for (int k=0;k<dar.length;k++){
        	
        	for (int j=k+1; j<dar.length;j++){
        					if(dar[k]==dar[j])
            {
                System.out.println("Duplicate elements are :"+dar[j]);
            }
        }

	}
	}
}