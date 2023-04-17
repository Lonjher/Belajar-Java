import java.util.*;
public class OTP {
	static char[] create(int len){
		System.out.println("Generating Random OTP");
		System.out.print("Your OTP is: ");
		String number = "0123456789";
		Random rndm_method = new Random();
		char[]otp = new char[len];
		for (int i = 0; i < len; i++){
			otp[i] = number.charAt(rndm_method.nextInt(number.length()));
		}
		return otp;
	}
	
	public static void main(String[] args) {
		int length = 6;
		System.out.println(create(length));
	}
}