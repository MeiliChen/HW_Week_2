package week2;
import java.util.*;

class checkAll
{
	public static void monthain(String[] args) 
	{
		Scanner input=new Scanner(System.in);
		try{
			int year,month,date;
			System.out.print("西元年:");
			year=input.nextInt(); 
			System.out.print("月:");
			month=input.nextInt();
			System.out.print("日:");
			date=input.nextInt();
			date D=new date(year,month,date);
			if(D.Check()==true){
				System.out.println(year+","+month+","+date+"Correct!");
			}
			else{
				System.out.println(year+","+month+","+date+"Error!");
			}
		}catch(Exception e){
			System.out.println("Error!");
		}
		
	}
}
class date{
	int year,month,date;
	public date(int year, int month, int date)
	{
		this.year=year;
		this.month=month;
		this.date=date;
	}
	public boolean Check()
	{
		if(year<=0){
			return false;
		}
		if((month==1||month==3||month==5||month==7||month==8||month==10||month==12)&&(date>0&&date<32))
			return true;
		else if((month==4||month==6||month==9||month==11)&&(date>0&&date<31))
			return true;
		else if(month==2&&date>0)
		{
			if(((year%400==0) || (year%4==0&&year%100!=0)) && date<=29)
				return true;
			else if(date<=28)
				return true;
		}
		return false;
	}
}
