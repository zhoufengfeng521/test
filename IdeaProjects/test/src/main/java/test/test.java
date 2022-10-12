package test;

import java.util.Scanner;

/**
 * @program: test @ClassName test
 * @description:
 * @author: zhouff
 * @create: 2022-06-02 09:20 @Version 1.0
 */
public class test {
  public static void main(String[] args) {
    int n = 1;
    int sum = 0;
    while (n < 101) {
      sum = sum + n;
      n += 1;
    }
    System.out.println(sum);
  }
}
