


import java.util.ArrayList;

import java.util.Scanner;


public class DA001PK {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int T1=s.nextInt();
        int T2= s.nextInt();
        int m=s.nextInt();
        if(T1<0||T2<0)
        {
            System.out.println("Invalid Input");
        }
        else{
            
        
         ArrayList<Integer> MN = new ArrayList<Integer>();
      ArrayList<Integer> JN = new ArrayList<Integer>();
     
        
        for(int i=T1;i<=T2;i++)
        {
            for(int n=1;n<i;n++)
            {
                if(i== n*((2*n)-1))
                {
                    MN.add(i);
                    
                }
                if(i== n*(n+1)/2)
                {
                    JN.add(i);
                    
                }
            }
        }

        int ind=0;
            for(int i=0; i <JN.size();i++)
            {
                if(MN.contains(JN.get(i))) 
                {
                    ind++;
                    if(ind==m)
                    {
                        System.out.println(JN.get(i));
                    }
                 
                }
            }
                if(ind<m)
                {
                    System.out.println("No number is present at this index");
                }
            
        
        
    }
    
}
}