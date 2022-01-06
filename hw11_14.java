package JAVA11;
//hw11_14a,
interface iVolume
{
public void showData();    // ��ܲy�骺���
public double vol();       // �p��y��n
}
abstract class CSphere implements iVolume
{
final double PI=3.14;
protected int x;
protected int y;
}
class CCircle extends CSphere
{
protected int radius;

public CCircle(int a,int b,int r)
{
   x=a;
   y=b;
   radius=r;
}
public void showData()
{
   System.out.println("�y��:("+x+","+y+")");
   System.out.println("�b�|:"+radius);
   System.out.println("�y��n:"+vol());
}
public double vol()
{
   return ((4.0/3)*PI*radius*radius*radius);
}
}

public class hw11_14
{
public static void main(String args[])
{
   CCircle cir=new CCircle(8,6,2);
   cir.showData();
}
}

/* output------------------
�y��:(8,6)
�b�|:2
�y��n:33.49333333333333
-------------------------*/