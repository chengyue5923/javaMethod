package Adapter;

public class AdapterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/**
		 * ���������ģʽ
		 */
		Adapter ap=new Adapter();
		ap.method1();
		ap.method2();
		ap.method1();
		
		/**
		 * �����������ģʽ
		 */
		Source source=new Source();
		
		Wrapper war=new Wrapper(source);
		war.method1();
		war.method2();
		
		/**
		 * �ӿڵ�������ģʽ
		 */
		
		Sourceable source1=new SourceSub1();
		Sourceable source2=new SourceSub2();
		source1.method1();
		source1.method2();
		source2.method1();
		source2.method2();
		
		
	}

}
