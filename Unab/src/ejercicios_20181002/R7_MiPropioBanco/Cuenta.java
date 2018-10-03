package ejercicios_20181002.R7_MiPropioBanco;

public class Cuenta {
	private Cliente cliente;
	private long numcuenta;
	private long saldo;
	
	public Cuenta() {
		this.cliente = new Cliente();
		this.numcuenta = -1;
		this.saldo= 0;
	}
	
	public Cuenta(Cliente cliente, long numcuenta, long saldo) {
		this.cliente = cliente;
		this.numcuenta = numcuenta;
		this.saldo = saldo;
	}

	public Cuenta(String nombre, long saldo, long numcuenta) {
		this.cliente = new Cliente(nombre);
		this.numcuenta = numcuenta;
		this.saldo = saldo;
	}

	public Cliente getCliente() {
		return cliente;
	}
	public long getNumcuenta() {
		return numcuenta;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public void setNumcuenta(long numcuenta) {
		this.numcuenta = numcuenta;
	}

	public long getSaldo() {
		return saldo;
	}

	public void setSaldo(long saldo) {
		this.saldo = saldo;
	}
	
	

}
