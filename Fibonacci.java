/*Lint Code
 *Find the Nth number in Fibonacci sequence.
 *A Fibonacci sequence is defined as follow:
 *The first two numbers are 0 and 1.
 *The i th number is the sum of i-1 th number and i-2 th number.
 *The first ten numbers in Fibonacci sequence is:
 *0, 1, 1, 2, 3, 5, 8, 13, 21, 34 ...
 */

public int fibonacci(int n){
        if (n == 1)
            return 0;
        if (n == 2)
            return 1;
        int[] ans = new int[n + 1];
        ans[1] = 0;
        ans[2] = 1;
        for (int i = 3; i <= n; i++)
        ans[i] = ans[i - 1] + ans[i - 2];
        int temp = ans[n];
        return temp;
}