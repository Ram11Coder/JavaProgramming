package com.task1;

import java.util.Random;

public class EliminateDup {

 int temp,i,j,max,max1;
 boolean flag=false;
    void SortDup(String str){
  
  for(int i=0;i<str.length();i++){
      flag=false;
     max=str.charAt(i);
     for(j=i+1;j<str.length();j++){
      if(max<str.charAt(j)){
          max1=str.charAt(j);
       flag=true;   
      }
     System.out.println(max1);
     if(flag==true){
         temp=str.charAt(i);
         max1=max;
         max=temp;
         
     }

  }
  }
    }
    
    public static void main(String[] args) {
        
       Random R=new Random();
       Integer R1=R.nextInt(10000);
       
       System.out.println(R1);
       
       
       String s=R1.toString();
       EliminateDup e=new EliminateDup(); 
       e.SortDup(s);
       

    }

}
