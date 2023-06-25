import java.util.*;
public class MyClass {
    public static void main(String args[]) {
       Scanner sc=new Scanner(System.in);
       String str=sc.next();
       char ch[]=str.toCharArray();
       for(int i=0;i<ch.length;i++)
       {
           for(int j=i+1;j<ch.length;j++)
           {
               if(ch[i]==ch[j])
               {
                   ch[j]=' ';
                   break;
               }
               
           }
       }
       for(int i=0;i<ch.length;i++)
       {
           if(ch[i]!=' ')
           {
               System.out.print(ch[i]);
           }
       }
    }
}
