

import java.util.*;
import java.util.Map.*;
class Main
{
    public static void aaa(int a[])
    {
        int sum=0,count=0;
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<a.length;i++)
        {
            hm.put(a[i],hm.getOrDefault(a[i],0)+1);
        }
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==(int)hm.get(a[i]))
            {
               System.out.print(a[i]+" ");
               hm.put(a[i],0);
               count++;
            }
        }
        if(count==0)
         System.out.println(-1);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,x[];
        n=sc.nextInt();
        x=new int[n];
        for(int i=0;i<n;i++)
          x[i]=sc.nextInt();
       aaa(x);
    }
}