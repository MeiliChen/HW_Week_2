package week2_4;
import java.io.*;
import java.util.*;

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
}
class Oval extends Circle
{
	
	double shortEdge;
    public Oval(double longEdge,double shortEdge) 
	{
        super(longEdge);
        this.shortEdge = shortEdge;
    }
    double area() 
	{
		return 3.14*r*shortEdge;
    }
    double length()
    {
    	if(r > shortEdge)
    		return 4*(r - shortEdge)+3.14*2*shortEdge ;
    	else if(shortEdge > r)
    		return 4*(shortEdge - r)+3.14*2*shortEdge;    
    	else
    		return 2*3.14*r;
    }
}
public class Oval_2 
{
	public static void main(String[] args)
	{
		Scanner op = new Scanner(System.in);
		Oval oval[] = new Oval[5];
        double longEdge,shortEdge;
        int num;
		
		for(int i=0;i<5;i++)
		{
			System.out.println("橢圓"+(i+1)+":");
			System.out.printf("長軸:");
			longEdge= op.nextDouble();
			System.out.printf("短軸:");
			shortEdge = op.nextDouble();
			if(longEdge<= 0 || shortEdge <= 0)
				System.out.println("Error!");
			else
				oval[i] = new Oval(longEdge,shortEdge);
		}
		while(true)
		{
			System.out.printf("編號:(-1結束)");
			num = op.nextInt();
			if(num > 5 || num < -1 || num==0 )
				System.out.println("Error!");
			else if(num!=-1)
			{
				System.out.println("橢圓"+(num)+":");
				System.out.println("面積:" + oval[num - 1].area());
				System.out.println("邊長:" + oval[num - 1].length());
			}	
			else
				break;
		}

	}

}
