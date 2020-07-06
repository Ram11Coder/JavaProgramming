package com.task1;

//import java.util.Scanner;

public class Armstrong {

int r,sum=0,i=0,no,t;
Character c;
    void armNo(int n){ 
        t=n; 
        while(n>0){
            
            r=n%10;
            sum=sum+r*r*r;
            n=n/10;     
             }
             System.out.println(sum);
             if(sum == t){
                System.out.println("Armstrong no");
             }
             else {
                 System.out.println("not armstrong");
             }
        
        
    }
    
   
    public static void main(String[] args) {
//      Scanner sc=new Scanner(System.in);
//      int n=sc.nextInt();
//      
//      System.out.println("enter the no is :"+n);
//      
//      Armstrong a=new Armstrong();
//      
//      a.armNo(n);
        String s="153";
        int n=Integer.parseInt(s);
        Armstrong a=new Armstrong();
        a.armNo(n);
//sc.close();
    }

}
