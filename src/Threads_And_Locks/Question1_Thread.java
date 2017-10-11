package Threads_And_Locks;

public class Question1_Thread {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Sinclass sin = new Sinclass(45.0);
		Cosclass cos = new Cosclass(45.0);
		Tanclass tan = new Tanclass(45.0);

		sin.start();
		cos.start();
		tan.start();
		sin.join();
		cos.join();
		tan.join();
		double ans = sin.result + cos.result + tan.result;
		System.out.println(ans);
	}

}

class Sinclass extends Thread {
	double s, result;

	Sinclass(double s) {
		this.s = s;
	}

	public void run() {
		result = Math.sin(s);
	}

}

class Cosclass extends Thread {
	double s, result;

	Cosclass(double s) {
		this.s = s;
	}

	public void run() {
		result = Math.sin(s);
	}

}

class Tanclass extends Thread {
	double s, result;

	Tanclass(double s) {
		this.s = s;
	}

	public void run() {
		result = Math.sin(s);
	}

}