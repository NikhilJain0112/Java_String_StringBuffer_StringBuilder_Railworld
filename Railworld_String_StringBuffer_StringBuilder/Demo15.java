class Demo15
{
public static void main(String as[])
{
StringBuffer sb=new StringBuffer();  
System.out.println(sb.capacity());  
sb.append("Sajal");  
System.out.println(sb.capacity());  
sb.append("java is my favourite language");  
System.out.println(sb.capacity());//now (16*2)+2=34 i.e (oldcapacity*2)+2  
sb.ensureCapacity(10);//now no change  
System.out.println(sb.capacity());//now 34  
sb.ensureCapacity(50);//now (34*2)+2  
System.out.println(sb.capacity());
}
}