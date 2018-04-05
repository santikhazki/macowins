package macowins;

public class Prenda {
	public Double precioBase;
	public Estado estado;
	public String tipo;
	
	public Prenda(Double precioBase, Estado estado, String tipo) { /*CONSTRUCTOR*/
		this.precioBase = precioBase;
		this.estado = estado;
		this.tipo = tipo;
	}
	
	public Double getPrecioBase() {
		return precioBase;
	}
	
	public Double precioFinal() {
		return estado.precioDeEstado(this.precioBase);
	}
	
	public Estado getEstado() {
		return this.estado;
	}
}
