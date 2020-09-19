package catchup_8.intergration.aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

import catchup_8.proxy.TableAction;

public class BusinessInvocationHandler implements InvocationHandler {
	
	//需要被代理的对象
		private Object target;

		//执行动态代理对象的所有方法时，都会被替代执行如下的invoke方法
		//各参数含义
		//proxy - 代表动态代理对象
		//method - 代表正在执行的方法
		//args - 代表调用目标方法时传入的实参
		@Override
		public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
			
			Object result = null;
			//business中被代理的trade方法，调用执行
			try {
				result = method.invoke(target, args);
			}catch(Exception ex) {
				System.out.println("因为系统错误，交易中断，金额原数返回到支付宝");
			}
			
			return result;
		}

		public Object getTarget() {
			return target;
		}

		public void setTarget(Object target) {
			this.target = target;
		}

}
