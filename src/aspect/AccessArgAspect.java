package aspect;


/**
 * Description:
 * <br/>��վ: <a href="http://www.crazyit.org">���Java����</a>
 * <br/>Copyright (C), 2001-2016, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author  Yeeku.H.Lee kongyeeku@163.com
 * @version  1.0
 */
public class AccessArgAspect
{
	// �����args(arg0,arg1)������Ŀ�귽��������2���β�
	// �˴�ָ��arg0��arg1ΪString����
	// ��args(arg0,arg1)��Ҫ��Ŀ�귽���������βζ���String����
	public void access(Object rvt, String arg0 , String arg1)
	{
		System.out.println("����Ŀ�귽����1������Ϊ:" + arg0);
		System.out.println("����Ŀ�귽����2������Ϊ:" + arg1);
		System.out.println("��ȡĿ�귽������ֵ:" + rvt);
		System.out.println("ģ���¼��־����...");
	}
}
