package LeetCode.ToOffer;
/*
面试题10- I. 斐波那契数列
写一个函数，输入 n ，求斐波那契（Fibonacci）数列的第 n 项。斐波那契数列的定义如下：

F(0) = 0,   F(1) = 1
F(N) = F(N - 1) + F(N - 2), 其中 N > 1.
斐波那契数列由 0 和 1 开始，之后的斐波那契数就是由之前的两数相加而得出。

答案需要取模 1e9+7（1000000007），如计算初始结果为：1000000008，请返回 1。



示例 1：

输入：n = 2
输出：1
示例 2：

输入：n = 5
输出：5


提示：

0 <= n <= 100
注意：本题与主站 509 题相同：https://leetcode-cn.com/problems/fibonacci-number/

通过次数4,864提交次数14,556
 */

import java.util.Scanner;

public class fib {
    static class Solution {
        public int fib(int n) {
            int[] dp = new int[101];
            dp[0] = 0;
            dp[1] = 1;
            if (n == 0 || n == 1) return dp[n];
            for (int i = 2; i <= n; i++) {
                dp[i] = dp[i - 1] + dp[i - 2];
                if (dp[i] >= 1000000007) {
                    dp[i] -= 1000000007;
                }
            }
            return dp[n];
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(new Solution().fib(scanner.nextInt()));
    }
}
