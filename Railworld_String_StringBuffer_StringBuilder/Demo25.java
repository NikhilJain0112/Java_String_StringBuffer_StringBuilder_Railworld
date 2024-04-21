class Demo25
{
 int rollno;  
 String name;  
 String city;  
  
 Demo25(int rollno, String name, String city){  
 this.rollno=rollno;  
 this.name=name;  
 this.city=city;  
 }  
   
 public String toString(){//overriding the toString() method  
  return rollno+" "+name+" "+city;  
 }  
 public static void main(String args[]){  
   Demo25 s1=new Demo25(101,"Sajal","Indore");  
   Demo25 s2=new Demo25(102,"Jainam","Bakal");  
     
   System.out.println(s1);//compiler writes here s1.toString()  
   System.out.println(s2);//compiler writes here s2.toString()  
 }  
} 
