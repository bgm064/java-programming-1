package week4;

import java.util.Locale;
import java.util.Scanner;

public class MethodsSecond {

	private static void printRectangle(int h, int w)
    {
        for (int i = 0; i < h; i++)
        {
            System.out.println();
            for(i = 1; i <= h; i++)
			{
				for(int j = 1; j <= w; j++)
				{
				System.out.print("x"); 
				}
				System.out.print("\n");
			}
        }
    }
       
    public static void main(String args[])
    {  
    	
		Scanner input = new Scanner(System.in).useLocale(Locale.ROOT);
        int h;
        int w;
        
        System.out.printf("Enter width: ");
        w = input.nextInt();
        
        System.out.printf("Enter height: ");
        h = input.nextInt();
        
        printRectangle(h, w);
    }
}