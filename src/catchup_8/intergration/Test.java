package catchup_8.intergration;

import java.lang.reflect.Method;

import catchup_8.intergration.aop.BusinessProxy;
import catchup_8.intergration.aop.TradeTransaction;
import catchup_8.intergration.business.BusiessInter;
import catchup_8.intergration.business.Business;

public class Test {

	public static void main(String[] args) throws Exception{
		
		Business biz = new Business();
	// 正常情况
	//	biz.trade(false);

		//发生异常的情况
	//	biz.trade(true);
		
		
		//使用动态代理和Annotation完成声明式事务
		Class<?> clazz = biz.getClass();
		
		Method mtd = clazz.getMethod("trade", Boolean.class);
		
		TradeTransaction ann = mtd.getAnnotation(TradeTransaction.class);
		//如果目标方法标价了@TradeTransaction
		if(ann != null) {
			//生成代理类
			BusiessInter bizProxy = (BusiessInter) BusinessProxy.getProxy(biz);
			bizProxy.trade(true);
		}
	}

}
