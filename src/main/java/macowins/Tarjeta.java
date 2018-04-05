package macowins;

public class Tarjeta implements ModalidadDePago {
	public Double cantDeCuotas;
	public Double recargoFijo;
	
	public Tarjeta(Double cantDeCuotas, Double recargoFijo) {
		this.cantDeCuotas = cantDeCuotas;
		this.recargoFijo = recargoFijo;
	}
	
	public Double recargo(Venta unaVenta) {
		return unaVenta.precioTotalDePrendas() + (this.cantDeCuotas * this.recargoFijo); /*FALTA PRECIO PORCENTUAL*/
	}
}
