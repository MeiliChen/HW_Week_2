
public class one {
	public static void main(String[] args) {
		//practice_1
        int h1=4,m1=23,s1=45;
        int h2=13,m2=54,s2=23;
        int t1=0,t2=0;
        System.out.println(h1+"點"+m1+"分"+s1+"秒到");
        System.out.println(+h2+"點"+m2+"分"+s2+"秒");
        m1=(h1*60)+m1;
        t1=(m1*60)+s1;
        m2=(h2*60)+m2;
        t2=(m2*60)+s2;
        t2-=t1;
        System.out.println("總秒數："+t2);
        System.out.println("======================");
        //practice_2
        int num[]={3,5,11,13,15};
        float total=0,average=0,sum=0;
        System.out.println("數字陣列：");
        for(int x:num)
        {
            System.out.print(x+" ");
            total+=x;
            sum++;
        }
        average = (total/sum);
        System.out.println("總和："+(int )total);
        System.out.println(" 平均："+average);
    }
    

}
