
public class one {
	public static void main(String[] args) {
		//practice_1
        int h1=4,m1=23,s1=45;
        int h2=13,m2=54,s2=23;
        int t1=0,t2=0;
        System.out.println(h1+"�I"+m1+"��"+s1+"���");
        System.out.println(+h2+"�I"+m2+"��"+s2+"��");
        m1=(h1*60)+m1;
        t1=(m1*60)+s1;
        m2=(h2*60)+m2;
        t2=(m2*60)+s2;
        t2-=t1;
        System.out.println("�`��ơG"+t2);
        System.out.println("======================");
        //practice_2
        int num[]={3,5,11,13,15};
        float total=0,average=0,sum=0;
        System.out.println("�Ʀr�}�C�G");
        for(int x:num)
        {
            System.out.print(x+" ");
            total+=x;
            sum++;
        }
        average = (total/sum);
        System.out.println("�`�M�G"+(int )total);
        System.out.println(" �����G"+average);
    }
    

}
