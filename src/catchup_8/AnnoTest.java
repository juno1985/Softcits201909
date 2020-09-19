package catchup_8;

import java.lang.annotation.Annotation;

public class AnnoTest {

	@MyTag(age=60)
	public void info(){
	}
	
	public static void main(String[] args) throws NoSuchMethodException, SecurityException, ClassNotFoundException {
		Annotation[] aArray = AnnoTest.class.getMethod("info").getAnnotations();
		for(Annotation an : aArray){
			System.out.println(an);
			System.out.println(((MyTag)an).name());
			System.out.println(((MyTag)an).age());
		}
		
		Annotation[] ano = AnnoTest.class.getMethod("transfer").getAnnotations();
		
		for(Annotation as : ano) {
			//如果方法上使用了@MyAtomicTransaction
			if(as instanceof MyAtomicTransaction) {
				//生成被修饰方法的代理类
				
				
			}
		}
	}
	// to be continued ....
	@MyAtomicTransaction
	public void transfer() {
		// card -> zhifubao
		// zhifubao withdraw cash
		// add to yuebao
	}
}
