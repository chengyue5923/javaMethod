package Memento;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//����ԭʼ��
		Original origi=new Original("original");
		
		//��������¼
		
		Storage storage=new Storage(origi.createMemento());
		
		//�޸�ԭʼ���״̬
		
		System.out.println("ԭʼ���״̬��"+origi.getValue());
		origi.setValue("new");
		System.out.println("�µ�״̬��"+origi.getValue());
		
		//�ظ�ԭʼ״̬
		
		origi.restoreMemento(storage.getMemento());
		System.out.println("�ظ�ԭʼ״̬״̬��"+origi.getValue());
	}

}
