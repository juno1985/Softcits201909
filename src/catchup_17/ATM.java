package catchup_17;

//为程序导入依赖
import java.util.Scanner;
import java.util.regex.Pattern;
/**
* 模拟 ATM 取款前输入密码 密码必须为六位数字 为了演示输入的密码，未采用*遮盖
* 
* @author wangzhen85@dingtalk.com
*
*/
public class ATM {
//声明类变量，用于扫描用户输入
private static Scanner scPwdEnter = null;
//声明整型变量，用于累计用户输入次数，如果累计 3 次账号会被锁定
private static int attemptCounter = 0;
//声明字符串变量，用于存储用户输入的密码
private static String strPwdEnter = null;
/**
* 创建方法，判断输入是否全为数字
* 
* @param 输入的密码
* @return
*/
private static boolean isInteger(String password) {
//具体判断每位是否为 0-9 数字
Pattern pattern = Pattern.compile("[0-9]*");
return pattern.matcher(password).matches();
}
/**
* 创建方法，判断输入是否为六位字符
* 
* @param 输入的密码
* @return
*/
private static boolean isSixDigit(String password) {
if (password.length() == 6)
return true;
else
return false;
}
/**
* 创建方法，判断输入是否为正确密码 123456
* 
* @param 输入的密码
* @return
*/
private static boolean isRightPwd(String password) {
return "123456".equals(password);
}
//主方法，程序入口
public static void main(String args[]) {
//键盘扫描初始化
scPwdEnter = new Scanner(System.in);
//进入循环，用户可尝试输入 3 次
while (attemptCounter < 3) {
System.out.println("请输入取款密码:");
//读取用户输入
strPwdEnter = scPwdEnter.nextLine();
//进入具体判断
if (!isSixDigit(strPwdEnter)) {
System.out.println("密码应为六位数字!");
}
else if (!isInteger(strPwdEnter)) {
System.out.println("密码含非数字字符!");
}
else if (!isRightPwd(strPwdEnter)) {
System.out.println("密码错误!");
} else {
System.out.println("密码输入正确"); // 实际上需要去数据库或者加密文件中读取密码并进行验证，此处省略，只是为了给大家呈现大致处理
break;
}
attemptCounter++;
}
if (attemptCounter == 3)
System.out.println("密码错误累计三次!账户已被锁定，请联系客服.");
} }