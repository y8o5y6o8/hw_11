package JAVA11;
//hw11_2,��H���O���d��
abstract class Math
{
protected int ans;
public void show()
{
   System.out.println("ans="+ans);
}
public abstract void add(int a,int b);  // �p��a+b
public abstract void sub(int a,int b);  // �p��a-b
public abstract void mul(int a,int b);  // �p��a*b
public abstract void div(int a,int b);  // �p��a/b
}
class Compute extends Math
{
public void add(int a,int b)
{
   ans=a+b;
}
public void sub(int a,int b)
{
   ans=a-b;
}
public void mul(int a,int b)
{
   ans=a*b;
}
public void div(int a,int b)
{
   ans=a/b;
}
}
public class hw11_2
{
public static void main(String args[])
{
   Compute cmp=new Compute();
   cmp.mul(3,5);  // �p��3*5
   cmp.show();    // ����|�^��"ans=15"�r��
}
}

/* output----
ans=15
-----------*/