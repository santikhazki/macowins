package macowins;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Venta {

	public Date fecha;
	public ModalidadDePago tipoDePago;
	private List <Prenda> prendas;
	
	public Venta(Date fecha, ModalidadDePago tipoDePago){
		this.fecha = fecha;
		this.tipoDePago = tipoDePago;
		this.prendas = new ArrayList<Prenda>();
	}
	
	public Integer cantidadDePrendasVendidas() {
		return this.prendas.size();
	}
	
	public Double precioTotalDePrendas() {
		return this.prendas.stream().mapToDouble((Prenda unaPrenda) -> unaPrenda.precioFinal()).sum();
	}
	
	public Double ganancia() {
		return tipoDePago.recargo(this) + this.precioTotalDePrendas();
	}
	
	public void agregarPrenda(Prenda unaPrenda){
		this.prendas.add(unaPrenda);
	}
}
