package aspect;


public class RepairAspect {
	public void doRecoveryActions(Throwable ex) {
		System.out.println("目标方法中抛出异常：" + ex);
	}

}
