package week2;
import java.util.*;
import java.util.Scanner;

class Circle
{
	double r;
	Circle(double r)
	{	
		this.r = r;
	}
	double area() 
	{
		return 3.14 * r * r;
	}
	double arc(double a) 
	{
		return 3.14 *(a/360)*(r*2);
	}
	double pie(double a)
	{
		return area()* (a/360);
	}
	
	public static class week2_3
	{
		public static void main(String[] args)
		{
			Circle result[]=new Circle[5];
			Scanner opt = new Scanner(System.in);
			
			for(int i=0;i<5;i++)
			{
				System.out.println("輸入第"+(1+i)+"個半徑:");
				double b=opt.nextDouble();
				result[i]=new Circle(b);
			}
			while(true)
			{
				System.out.println("輸入圓形編號 (-1結束)");
				int option=opt.nextInt();
				if(option != -1)
				{
					System.out.println("輸入角度");
					double angle=opt.nextDouble();
					System.out.println("弧長:"+result[option-1].arc(angle));
					System.out.println("面積:"+result[option-1].pie(angle));
				}
				else
					break;
			}
		}

	}
}