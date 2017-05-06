package Singleton;

public class Singleton {

	/**
	 * ˽�еĹ��췽������ֹ��ʵ����
	 */
	private Singleton(){
		
	}
	/**
	 * �˴�ʹ��һ���ڲ�����ά������
	 */
	private static class SingletonFactory{
		private static Singleton instance =new Singleton();
	}
	/**
	 * ��ȡʵ��
	 */
	
	public static Singleton getInstance(){
		
		return SingletonFactory.instance;
		
	}
	/**
	 * �����ʵ���������л������Ա�֤�����л�ǰ��һ��
	 */
	public Object readResolve(){
		return getInstance();
	}
	
	
}
