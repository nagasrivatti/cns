import java.math.BigInteger;
import java.util.Scanner;
public class RSAExample{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter prime number p: ");
		BigInteger p=sc.nextBigInteger();
		System.out.print("Enter a prime number q: ");
		BigInteger q=sc.nextBigInteger();
		BigInteger n=p.multiply(q);
		BigInteger phi=(p.subtract(BigInteger.ONE)).multiply(q.subtract(BigInteger.ONE));
		System.out.print("Enter public key e: ");
		BigInteger e=sc.nextBigInteger();
		BigInteger d=e.modInverse(phi);
		System.out.println("\nPubic key(e,n):(" +e+ "," +n+ ")");
		System.out.println("Private key(d,n):(" +d+ "," +n+ ")");
		System.out.print("\nEnter message(number): ");
		BigInteger message=sc.nextBigInteger();
		BigInteger cipher=message.modPow(e,n);
		System.out.println("\nEncrypted message: "+cipher);
		BigInteger decrypted=cipher.modPow(d,n);
		System.out.println("Decrypted message: "+decrypted);
		sc.close();
	}
}
o/p:
Enter prime number p: 23
Enter a prime number q: 5
Enter public key e: 7

Pubic key(e,n):(7,115)
Private key(d,n):(63,115)

Enter message(number): 97

Encrypted message: 63
Decrypted message: 97
