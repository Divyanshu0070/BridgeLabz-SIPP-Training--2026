package MethodPractice.Level3;

import java.util.Arrays;

public class Generate6dgigitsOTP {

    public static int generateOTP() {
        return (int) (Math.random() * 900000) + 100000;
    }

    public static boolean checkUnique(int[] otpNumbers) {

        for (int i = 0; i < otpNumbers.length; i++) {
            for (int j = i + 1; j < otpNumbers.length; j++) {
                if (otpNumbers[i] == otpNumbers[j]) {
                    return false;
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {

        int[] otpNumbers = new int[10];

        for (int i = 0; i < otpNumbers.length; i++) {
            otpNumbers[i] = generateOTP();
        }

        System.out.println("Generated OTPs: " + Arrays.toString(otpNumbers));

        if (checkUnique(otpNumbers)) {
            System.out.println("All OTP numbers are unique");
        } else {
            System.out.println("OTP numbers are not unique");
        }
    }
}