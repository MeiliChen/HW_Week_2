package two;
import java.util.Scanner;
public class two {

    public static void main(String[] args) {
    	
    	while(true)
    	{
    	int OP;
    	@SuppressWarnings("resource")
		Scanner IN = new Scanner(System.in);
    	System.out.print("�D��: 1)1 2)2 3)3 4)4 -1)����:");
		OP = IN.nextInt();
		if(OP == -1)
			break;
		else if(OP == 1)
		{
		//2_1
		String name;
		int birth,year,month,day;
		System.out.print("�п�J�m�W�G");
		@SuppressWarnings("resource")
		Scanner	n	=	new Scanner(System.in);
		name	=	n.nextLine();
		System.out.print("�п�J�X�ͦ~���(ex:19950328)�G");
		@SuppressWarnings("resource")
		Scanner	Bir	=	new Scanner(System.in);
		birth	=	Bir.nextInt();
		year	=	(birth/10000)-1911;
		month	=	(birth/100)%100;
		day		=	birth%100;
		System.out.println("�m�W�G"+name);
		System.out.println("����"+year+"�~"+month+"��"+day+"��");
		}
		else if(OP == 2)
		{
		double num1,num2,ans=0;
		int opt=0;
		System.out.println("�п�J��ӯB�I�ơG");
		System.out.println("Number1:");
		@SuppressWarnings("resource")
		Scanner A = new Scanner(System.in);
		num1 = A.nextDouble();
		System.out.println("Number2:");
		@SuppressWarnings("resource")
		Scanner B = new Scanner(System.in);
		num2 = B.nextDouble();
		System.out.println("�B��l�G1)+ 2)- 3)* 4)/ �G");
		@SuppressWarnings("resource")
		Scanner cal	=	new Scanner(System.in);
		opt	=	cal.nextInt();
		switch(opt)
		{
			case 1:
				ans = num1+num2;
				System.out.println("Ans: "+ans);
				break;
			case 2:
				ans = num1-num2;
				System.out.println("Ans: "+ans);
				break;
			case 3:
				ans = num1*num2;
				System.out.println("Ans: "+ans);
				break;
			case 4:
				if(num2 == 0)
					System.out.println("�������i���s!");
				else
				{
					ans = num1/num2;
					System.out.println("Ans: "+ans);
					break;
				}
			default:
				break;
		}
		}
		else if(OP == 3)
		{
		//2_3
		int Year,i,count=0;
		System.out.println("�п�J�褸�G");
		@SuppressWarnings("resource")
		Scanner yy	=	new Scanner(System.in);
		Year		=	yy.nextInt();
		System.out.println("�褸"+Year+"�~�H�e���|�~:");
		for(i=Year;i>0;i--)
		{
			if(i%400 == 0)
			{
				System.out.print(i+" | ");
				count++;
				if(count%4 == 0)
					System.out.println("\n");
			}
			else if(i%4 == 0 && i%100 != 0)
			{
				System.out.print(i+" | ");
				count++;
				if(count%4 == 0)
					System.out.println("\n");
			}
		}
		}
		else if(OP == 4)
		{
		//2_4
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		String N[] = new String[100];
		int G[] = new int[100];
		int opt1,opt2,counter,id;
		counter = 1;
		while(true)
		{
			System.out.println("1)��J�ǥ͸�� 2)�j�M�ǥͽs�� -1)����:");
			opt1 = input.nextInt();
			if(opt1 == -1)
				break;
			else if(opt1 == 1)
			{
				while(true)
				{
					System.out.println("1)��J�ǥͦ��Z  -1)����:");
					opt2 = input.nextInt();
					if(opt2 == -1)
						break;
					else if(opt2 == 1)
					{
						try
						{
							System.out.println("��"+counter+"�ǥ�:");
							System.out.println("�m�W:");
							  N[counter] = input.next();
							  System.out.printf("���Z:");
							  G[counter] = input.nextInt();
							  counter++;
						}
						catch(Exception wrong)
						{
							System.out.println("Error:NumberFormatException");
							input.next();
							if(counter-1 >= 0)
								counter--;
						}
					}
					else	
						System.out.println("Error!�Э��s��J");
				}
			}
			else if(opt1 == 2)
			{
				System.out.println("��J�ǥͽs��:");
				id = input.nextInt();
				if(id >= 1 && id < counter)
				{
					System.out.println("��" + id + "��ǥͩm�W:"+N[id]);
					System.out.println("���Z:" + G[id]);
				}
				else
					System.out.println("�s�����~!");
			}
			else
				System.out.println("Error!�Э��s��J");	
		}		
		}
		else
			System.out.println("Error!�Э��s��J");
    	}
    }
}