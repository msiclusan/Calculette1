package calculette;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestCalculette 
{
	private Calculette calculette;
	
	@Before	
	public void initialize()
	{
		this.calculette = new Calculette();
	}
	
	@Test
	public void testAucunCharacterePasse() {
		
		assertEquals(0, this.calculette.click('=').resultat());
	}
	
	@Test
	public void testRetourneCaracterePasse() 
	{
		assertEquals(1, this.calculette.click(1).click('=').resultat());
	}
	
	@Test
	public void testUnPlusUn()
	{
		assertEquals(2, this.calculette.click(1).click('+').click(1).click('=').resultat());
	}
	
	@Test
	public void testDeuxMoinsUn()
	{
		assertEquals(1, this.calculette.click(2).click('-').click(1).click('=').resultat());
	}
	
	@Test
	public void testUnDeuxPlusTroisQuatre()				//12+34
	{
				
		assertEquals(46, this.calculette.click(1).click(2).click('+').click(3).click(4).click('=').resultat());
	}
	
	@Test
	public void testDeuxFoisTrois()		//1+2+3
	{
		assertEquals(6, this.calculette.click(2).click('*').click(3).click('=').resultat());
	}
	
	@Test
	public void testSixDiviseParTrois()		//1+2+3
	{
		assertEquals(2, this.calculette.click(6).click('/').click(3).click('=').resultat());
	}
	
	@Test
	public void testUnPlusDeuxPlusTrois()		//1+2+3
	{
		assertEquals(6,this.calculette.click(1).click('+').click(2).click('+').click(3).click('=').resultat());
	}
}
