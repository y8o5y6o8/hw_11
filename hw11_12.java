package JAVA11;
//hw11_12,
interface Data
{
public void best();        // �P�_���@�즨�Z����
public void failed();      // �P�_���@�즨�Z�C��60��
}
interface Test extends Data
{
public void showData();    // ��ܾǥͪ���ƤΥ������Z
public double average();      // �p��ƾǩM�^�媺�������Z
}
class CStu implements Test
{
protected String name;        // �m�W
protected int math;           // �ƾǦ��Z
protected int english;        // �^�妨�Z

public CStu(String s,int m,int eng)
{
   name=s;
   math=m;
   english=eng;
}
public void show()
{
   showData();
   best();
   failed();
}
public void showData()
{
   System.out.println("�m�W:"+name);
   System.out.println("�ƾǦ��Z:"+math);
   System.out.println("�^�妨�Z:"+english);
   System.out.println("�������Z:"+average());
}
public void best()
{
   if(math>english)
      System.out.println(name+"���ƾǤ�^��n");
   else if(math<english)
      System.out.println(name+"���^���ƾǦn");
   else
      System.out.println(name+"���ƾǩM�^��@�˦n");
}
public void failed()
{
   if(math<60)
      System.out.println(name+"���ƾǷ��F");
   if(english<60)
      System.out.println(name+"���^����F");
   if(math>=60 && english>=60)
      System.out.println(name+"���ƾǩM�^�峣�ή�");
}
public double average()
{
   return (math+english)/2.0;
}
}

public class hw11_12
{
public static void main(String args[])
{
   CStu stu=new CStu("Judy",58,91);
   stu.show();
}
}

/* output-----------
�m�W:Judy
�ƾǦ��Z:58
�^�妨�Z:91
�������Z:74.5
Judy���^���ƾǦn
Judy���ƾǷ��F
------------------*/
