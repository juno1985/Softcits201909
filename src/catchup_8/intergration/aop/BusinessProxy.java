package catchup_8.intergration.aop;

import java.lang.reflect.Proxy;

public class BusinessProxy {

	// 为传入的target对象生成动态代理对象
	public static Object getProxy(Object target) {
		// 创建一个InvocationHandler对象
		BusinessInvocationHandler bih = new BusinessInvocationHandler();

		// 传入被代理对象
		bih.setTarget(target);

		// 创建并返回一个动态代理
		return Proxy.newProxyInstance(target.getClass().getClassLoader(),
				target.getClass().getInterfaces(), bih);
	}

}
