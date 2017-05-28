package aspect;

import org.aspectj.lang.ProceedingJoinPoint;

public class LogAspect {
	public void log(Object rvt) {
		System.out.println("returned value of the object:" + rvt);
	}

	public void release() {
		System.out.println("模拟方法结束后的释放资源...");
	}

	public void doRecoveryActions(Throwable ex) {
		System.out.println("目标方法中抛出异常：" + ex);
	}

	public Object processTx(ProceedingJoinPoint jp) throws java.lang.Throwable {
		System.out.println("执行目标方法之前，模拟开始事务...");
		// 获取目标方法原始的调用参数
		Object[] args = jp.getArgs();
		if (args != null && args.length > 1) {
			// 修改目标方法的第一个参数
			args[0] = "【增加的前缀】" + args[0];
		}
		// 以改变后的参数去执行目标方法，并保存目标方法执行后的返回值
		Object rvt = jp.proceed(args);
		System.out.println("执行目标方法之后，模拟结束事务...");
		// 如果rvt的类型是Integer，将rvt改为它的平方
		if (rvt != null && rvt instanceof Integer)
			rvt = (Integer) rvt * (Integer) rvt;
		return rvt;
	}
}
