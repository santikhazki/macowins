package macowins;

public class Promocion implements Estado {
	public Double valorDeUsuario;
	
	public Promocion(Double valorDeUsuario) {
		this.valorDeUsuario = valorDeUsuario; 
	}
	
	public Double precioDeEstado(Double precioBase) {
		return precioBase - this.valorDeUsuario;
		
	}

}
