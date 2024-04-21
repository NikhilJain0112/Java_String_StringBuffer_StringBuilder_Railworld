class Demo21
{
public static void main(String as[])
{
StringBuilder sb=new StringBuilder();    
System.out.println(sb.capacity());//default 16    
sb.append("Nikhil");    
System.out.println(sb.capacity());//now 16    
sb.append("Java is my favourite language");    
System.out.println(sb.capacity());  
}
}