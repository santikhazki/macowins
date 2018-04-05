package macowins;

public class Efectivo implements ModalidadDePago {
	
	public Double recargo(Venta unaVenta) {
		return unaVenta.precioTotalDePrendas();
	}

}
