package logica;

public abstract class Vehiculo {
	private String tipo_Vehiculo;
	private String placa;
	private String marca;
	private String referencia;
	private String model;
	private int numero_Ruedas;
	private double precio;
	private boolean disponible;
	
	public Vehiculo() {}
	
	
	public Vehiculo(String tipo_Vehiculo, String placa, String marca, String referencia, String model, int numero_Ruedas, double precio, boolean disponible) {
		super();
		this.tipo_Vehiculo = tipo_Vehiculo;
		this.placa = placa;
		this.marca = marca;
		this.referencia = referencia;
		this.model = model;
		this.numero_Ruedas = numero_Ruedas;
		this.precio = precio;
		this.disponible = disponible;

	}

	public String getTipo_Vehiculo() {
		return tipo_Vehiculo;
	}

	public void setTipo_Vehiculo(String tipo_Vehiculo) {
		this.tipo_Vehiculo = tipo_Vehiculo;
	}

	public String getPlaca() {
		return placa;
	}


	public void setPlaca(String placa) {
		this.placa = this.placa;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public String getReferencia() {
		return referencia;
	}


	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}


	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}


	public int getNumero_Ruedas() {
		return numero_Ruedas;
	}


	public void setNumero_Ruedas(int numero_Ruedas) {
		this.numero_Ruedas = numero_Ruedas;
	}
	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public boolean isDisponible() {
		return disponible;
	}

	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}

	public abstract void queSoy();
}
