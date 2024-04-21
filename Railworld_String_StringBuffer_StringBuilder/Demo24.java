class Demo24
{
  int rollno;  
 String name;  
 String city;  
  
 Demo24(int rollno, String name, String city)
 {  
 this.rollno=rollno;  
 this.name=name;  
 this.city=city;  
 }  
  
 public static void main(String args[]){  
   Demo24 s1=new Demo24(101,"Nikhil","Indore");  
   Demo24 s2=new Demo24(102,"Sajal","Bakal");  
     
   System.out.println(s1);//compiler writes here s1.toString()  
   System.out.println(s2);//compiler writes here s2.toString()  
 }
}