// Write a program to find x to the power n (i.e. x^n).
// Take x and n from the user. You need to return the answer.

public class Q1CalculatePower {
    
    public static int calculatePower(int num, int power) {
        if(power==0) {
            return 1;
        }
        return num * calculatePower(num, power-1);
    }
    public static void main(String[] args) {
        System.out.println(calculatePower(2,3));
    }
}