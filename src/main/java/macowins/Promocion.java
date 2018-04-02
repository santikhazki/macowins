package macowins;

public class Promocion implements Estado {
	public Float valorDeUsuario;
	
	public Promocion(Float valorDeUsuario) {
		this.valorDeUsuario = valorDeUsuario; 
	}
	
	public Float precioDeEstado(Float precioBase) {
		return precioBase - this.valorDeUsuario;
		
	}

}
