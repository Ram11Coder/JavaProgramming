package com.task1;

import java.util.Scanner;
 
public class Palindrome {

 void accept(String S){
     int i=0,j=S.length()-1;
     boolean flag=true;
     while(i<j){
         
     if(check(S.charAt(i),S.charAt(j))!=true){
 
         flag=false;
         
         break;
     }
     i++;
     j--;
     }
     if(flag==true){
         System.out.println("String is palindrome");
     }else{
         System.out.println("String is not palindrome");  
     }
     

 }
 
 boolean check(char a,char b){
   
     if(a==b)
     return true;
    return false;
     
 }
 
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String S=s.next();
        
        Palindrome p=new Palindrome();
        p.accept(S);
       

    }

}
