Luke Skywalker gave Chewbacca an integer number x. Chewbacca isn't good at numbers but he loves inverting digits in them. Inverting digit t means replacing it with digit 9 - t.
Help Chewbacca to transform the initial number x to the minimum possible positive number by inverting some (possibly, zero) digits. The decimal representation of the final number shouldn't start with a zero.

Input
The first line contains a single integer x (1 ≤ x ≤ 1018) — the number that Luke Skywalker gave to Chewbacca.

Output
Print the minimum possible positive number that Chewbacca can obtain after inverting some digits. The number shouldn't contain leading zeroes.

Examples
inputCopy
27
outputCopy
22

inputCopy
4545
outputCopy
4444

  


import java.util.*;

public class FiveOneFourA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        String num = Long.toString(n);
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < num.length(); i++) {
            char digit = num.charAt(i);
            int inverted = '9' - digit + '0';

            if (digit == '9' && i == 0) {
                result.append(digit);
                continue;
            }

            if (digit > (char) inverted) {
                result.append((char) inverted);
            } else {
                result.append(digit);
            }
        }

        System.out.println(Long.parseLong(result.toString()));
    }
}
