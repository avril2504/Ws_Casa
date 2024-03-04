package casa;

public class Jardin {
	private double metroCuadrado;
	private int numeroPlantas;
	public Jardin(double metroCuadrado, int numeroPlantas) {
		super();
		this.metroCuadrado = metroCuadrado;
		this.numeroPlantas = numeroPlantas;
	}
	public Jardin() {
		super();
	}
	@Override
	public String toString() {
		return "Jardin [metroCuadrado=" + metroCuadrado + ", numeroPlantas=" + numeroPlantas + "]";
	}
	public double getMetroCuadrado() {
		return metroCuadrado;
	}
	public void setMetroCuadrado(double metroCuadrado) {
		this.metroCuadrado = metroCuadrado;
	}
	public int getNumeroPlantas() {
		return numeroPlantas;
	}
	public void setNumeroPlantas(int numeroPlantas) {
		this.numeroPlantas = numeroPlantas;
	}
	
}
