package Strategy;

public abstract class AbstractCalCulator {

	
	public int[] split(String exp,String opt){
		System.out.println("----error");
		String array[]=exp.split(opt);
		int arrayInt[]=new int[2]; 
		arrayInt[0]=Integer.parseInt(array[0]);
		arrayInt[1]=Integer.parseInt(array[1]);
		return arrayInt;
	}
	
	
}
