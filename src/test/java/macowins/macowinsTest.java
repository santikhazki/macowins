package macowins;
import org.junit.*;

public class macowinsTest {
	
	
	Nueva nueva = new Nueva();
	Prenda jean = new Prenda(37.0,nueva,"jean");
	
	@Test
	public void probandoTest() {
		Assert.assertTrue(jean.getPrecioBase() == 37);
	}
	

}
