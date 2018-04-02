package macowins;

public class Prenda {
	public Float precioBase;
	public Estado estado;
	public String tipo;
	
	public Prenda(Float precioBase, Estado estado, String tipo) { /*CONSTRUCTOR*/
		this.precioBase = precioBase;
		this.estado = estado;
		this.tipo = tipo;
	}
	
	public Float getPrecioBase() {
		return precioBase;
	}
	
	public Float precioFinal() {
		return estado.precioDeEstado(this.precioBase);
	}
}
