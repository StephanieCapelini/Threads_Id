package controller;

public class Threads extends Thread {
	private int i;
	public Threads(int i) {
		this.i= i;
	}
	@Override
	public void run() {
		mostrar();
	}
	private void mostrar() {
		try {
			sleep(i*100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Thread "+ getId());
	}
}
