package aspect;

import org.aspectj.lang.ProceedingJoinPoint;

public class LogAspect {
	public void log(Object rvt) {
		System.out.println("returned value of the object:" + rvt);
	}

	public void release() {
		System.out.println("ģ�ⷽ����������ͷ���Դ...");
	}

	public void doRecoveryActions(Throwable ex) {
		System.out.println("Ŀ�귽�����׳��쳣��" + ex);
	}

	public Object processTx(ProceedingJoinPoint jp) throws java.lang.Throwable {
		System.out.println("ִ��Ŀ�귽��֮ǰ��ģ�⿪ʼ����...");
		// ��ȡĿ�귽��ԭʼ�ĵ��ò���
		Object[] args = jp.getArgs();
		if (args != null && args.length > 1) {
			// �޸�Ŀ�귽���ĵ�һ������
			args[0] = "�����ӵ�ǰ׺��" + args[0];
		}
		// �Ըı��Ĳ���ȥִ��Ŀ�귽����������Ŀ�귽��ִ�к�ķ���ֵ
		Object rvt = jp.proceed(args);
		System.out.println("ִ��Ŀ�귽��֮��ģ���������...");
		// ���rvt��������Integer����rvt��Ϊ����ƽ��
		if (rvt != null && rvt instanceof Integer)
			rvt = (Integer) rvt * (Integer) rvt;
		return rvt;
	}
}
