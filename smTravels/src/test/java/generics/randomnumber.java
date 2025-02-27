package generics;

import java.util.Random;

public class randomnumber {
	

	private static final Random random = new Random();

	public static String generateRandomMobileNumber() {
		StringBuilder mobileNumber = new StringBuilder();

		// First digit (non-zero to ensure valid mobile number)
		mobileNumber.append(random.nextInt(9) + 1);

		// Remaining 9 digits
		for (int i = 0; i < 9; i++) {
			mobileNumber.append(random.nextInt(10));
		}

		return mobileNumber.toString();
	}
	
	public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(generateRandomMobileNumber());
        }
		
    }
	
	
}

