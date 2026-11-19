package Module1;

public class Palindrome {

	public static void main(String[] args) 
	{
		String a = "madam";
		String b = "";
		for(int i=a.length()-1;i>=0;i--)
		{
			char c1= a.charAt(i);
			b=b+c1;
		}
System.out.println("Input"+a);
System.out.println("Input"+b);
if(a.equals(b))
{
	System.out.println("String is palindrome");
}
else
{
	System.out.println("String is not palindrome");
}
	}

}
