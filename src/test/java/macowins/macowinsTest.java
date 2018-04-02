package macowins;
import org.junit.*;

public class macowinsTest {
	
	Prenda jean = new Prenda(37);
	
	@Test
	public void probandoTest() {
		Assert.assertTrue(jean.getPrecioBase() == 37);
	}

}
