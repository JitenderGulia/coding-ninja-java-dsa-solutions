// Given the number 'n', 
// write a code to print numbers from 1 to n in increasing order recursively.

public class Q2PrintNumbers {
    public static void printNumbers(int num) {
        if(num==1) {
            System.out.println(num + " ");
            return;
        }
        printNumbers(num-1);
        System.out.println(num + " ");
    }
    public static void main(String[] args) {
        printNumbers(8);
    }
}
