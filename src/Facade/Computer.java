package Facade;

public class Computer {

	private CPU cpu;
	private Memory memoty;
	private Disk disk;
	
	
	public Computer() {
		super();
		this.cpu =new  CPU();
		this.memoty = new Memory();
		this.disk = new Disk();
	}

	public Computer(CPU cpu, Memory memoty, Disk disk) {
		super();
		this.cpu = cpu;
		this.memoty = memoty;
		this.disk = disk;
	}
	
	public void startUp(){
		System.out.println("begin to startup computer");
		cpu.startup();
		memoty.startup();
		disk.startup();
		System.out.println("end to startup computer");
	}
	public void shotdown(){
		System.out.println("begin to shutdown computer");
		cpu.shotdown();
		memoty.shutdown();
		disk.shotdown();
		System.out.println("end to shutdown computer");
	}
	
	
}
