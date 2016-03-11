package week2_4;
import java.io.*;
import java.util.*;

abstract class S
{
	  abstract double area();
}
class Circle extends S
{
	double r;
	public Circle(double r) 
	{
		this.r = r;
	}
	public double area() 
	{
		return 3.14 * r * r;
	}
}
class Oval extends S
{
	double longEdge,shortEdge;
	public Oval(double longEdge, double shortEdge) 
	{
		this.longEdge = longEdge;
		this.shortEdge = shortEdge;
	}
	public double area() 
	{
		return 3.14 * 2 * shortEdge + 4 * (longEdge - shortEdge);
	}
}
class Rect extends S
{
	double longEdge,shortEdge;
	public Rect(double longEdge, double shortEdge) 
	{
		this.longEdge = longEdge;
		this.shortEdge = shortEdge;
	}
	public double area() 
	{
		return longEdge * shortEdge;
	}
}
class Tri extends S
{
	double longEdge,shortEdge;
	public Tri(double longEdge, double shortEdge) 
	{
		this.longEdge = longEdge;
		this.shortEdge = shortEdge;
	}
	public double area() 
	{
		return (longEdge * shortEdge) / 2;
	}
}

public class shape
{
	public static void main(String[] args)
	{
		int result[] = new int[10];
		Circle c[] = new Circle[10];
		Oval o[] = new Oval[10];
		Rect r[] = new Rect[10];
		Tri t[] = new Tri[10];
		
        Scanner enter = new Scanner(System.in);
        double num1= 0,num2 = 0;
		double area = 0;
        int c1= 0,c2=0,c3=0,c4=0,count = 0,opt;
		while(true)
		{
			System.out.printf("1)�� 2)��� 3)�x��  4)�T�� 5)�Ϊ��P���n-1)���� :");
			opt = enter.nextInt();
			result[count] = opt;
			count++;
			if(opt == -1)
				break;
			else if(opt == 1)
			{
				System.out.printf("�b�|:");
				num1 = enter.nextInt();
				c[c1] = new Circle(num1);
				c1++;
			}
			else if(opt == 2)
			{
				System.out.printf("���b:");
				num1 = enter.nextDouble();
				System.out.printf("�u�b:");
				num2 = enter.nextDouble();
				o[c2] = new Oval(num1,num2);
				c2++;
			}
			else if(opt == 3)
			{
				System.out.printf("��:");
				num1 = enter.nextDouble();
				System.out.printf("�e:");
				num2 = enter.nextDouble();
				r[c3] = new Rect(num1,num2);
				c3++;
			}
			else if(opt == 4)
			{
				System.out.printf("��:");
				num1 = enter.nextDouble();
				System.out.printf("��:");
				num2 = enter.nextDouble();
				t[c4] = new Tri(num1,num2);
				c4++;
			}
			else if(opt == 5)
			{
				c1= 0;c2=0;c3=0;c4=0;
				for(int i=0;i<count;i++)
				{
					if( result[i]==1)
					{
						System.out.println((i+1)+"��έ��n:"+c[c1].area());
						c1++;
					}
					else if( result[i]==2)
					{
						System.out.println((i+1)+"��ꭱ�n��:"+o[c2].area());
						c2++;
					}
					else if( result[i]==3)
					{
						System.out.println((i+1)+"�x�έ��n��:"+r[c3].area());
						c3++;
					}
					else if( result[i]==4)
					{
						System.out.println((i+1)+"�T���έ��n��:"+t[c4].area());
						c4++;
					}
				}
			}
			else
				System.out.println("Error!");	
		}	      
	}

}
