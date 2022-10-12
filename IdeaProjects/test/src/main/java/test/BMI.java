package test;

import java.util.Scanner;

public class BMI {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in); // 创建Scanner对象
    System.out.print("Input height: "); // 打印提示
    double height = scanner.nextDouble(); // 读取一行输入并获取字符串
    System.out.print("Input weight: "); // 打印提示
    double weight = scanner.nextDouble(); // 读取一行输入并获取整数
    double BMI = weight / (Math.pow(height, 2));
    System.out.println(BMI);
    if (BMI < 18.5) {
      System.out.println("过轻");
    } else if (BMI >= 18.5 && BMI < 25) {
      System.out.println("正常");
    } else if (BMI >= 25 && BMI < 28) {
      System.out.println("过重");
    } else if (BMI >= 28 && BMI < 32) {
      System.out.println("肥胖");
    } else {
      System.out.println("非常肥胖");
    }
  }
}
