package view;
import controller.Threads;
public class Principal {

	public static void main(String[] args) {
		for(int i=0; i<5; i++) {
			Thread inicializar= new Threads(i);
			inicializar.start();
		}
		

	}

}
