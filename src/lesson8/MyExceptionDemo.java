package lesson8;

public class MyExceptionDemo {

	Integer a, b, c;

	public static void main(String[] args) {

		MyExceptionDemo myexp = new MyExceptionDemo();
		
		try {
			myexp.a = Integer.parseInt(args[0]);
			myexp.b = Integer.parseInt(args[1]);
			myexp.c = myexp.a / myexp.b;
		} catch (ArithmeticException ae) {
			// ae.printStackTrace();
			System.out.println("被除数不能为零");
		} catch (ArrayIndexOutOfBoundsException aie) {
			System.out.println("输入个数不为2个");
		} catch (NumberFormatException nfe) {
			System.out.println("输入不如数字");
		} catch(Exception ex) {
			System.out.println("未知异常");
		} finally {
			System.out.println("异常抛出后,finally一定会执行");
		}

	}

}
