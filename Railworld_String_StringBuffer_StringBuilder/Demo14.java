class Demo14
{
public static void main(String as[])
{
StringBuffer sb=new StringBuffer();  
System.out.println(sb.capacity());//default 16  
sb.append("Sajal");  
System.out.println(sb.capacity());  
sb.append("java is my favourite language");  
System.out.println(sb.capacity());
}
}