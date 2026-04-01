import java.util.*;
class SubstituteCipher
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String text, ctext = "", dtext = "";
		
		String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String key = "QWERTYUIOPASDFGHJKLZXCVBNM";
		
		System.out.println("Text: ");
		text = sc.nextLine().toUpperCase();
		
		for(int i = 0; i<text.length(); i++)
		{
			char ch;
			ch = text.charAt(i);
			for(int j=0; j<26; j++)
			{
				if(ch==alphabet.charAt(j))
				{
					ctext = ctext + key.charAt(j);
					break;
				}
			}
			if(ch==' ')
				ctext=ctext+" ";
		}
		System.out.println("Cipher text: "+ctext);
		
		for(int i = 0; i<ctext.length(); i++)
		{
			char ch;
			ch = ctext.charAt(i);
			for(int j=0; j<26; j++)
			{
				if(ch==key.charAt(j))
				{
					dtext = dtext + alphabet.charAt(j);
					break;
				}
			}
			if(ch==' ')
				dtext=dtext+" ";
		}
		System.out.println("Decrypted text: "+dtext);
	}
}
o/p:
Text: 
hello
Cipher text: ITSSG
Decrypted text: HELLO
