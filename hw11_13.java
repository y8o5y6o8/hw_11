package JAVA11;
//hw11_13,����������
interface Show_ans
{
public void show();
}
interface Math extends Show_ans
{
public void add(int a,int b);  // �p��a+b
public void sub(int a,int b);  // �p��a-b
public void mul(int a,int b);  // �p��a*b
public void div(int a,int b);  // �p��a/b
}

class Compute implements Math
{
public int ans;
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
public void show()
{
   System.out.println("ans="+ans);
}
}
public class hw11_13
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
