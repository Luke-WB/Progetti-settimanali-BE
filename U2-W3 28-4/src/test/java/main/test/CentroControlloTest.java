package main.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.design_pattern.controllo_gestione_incendi.gestione_sonda.ControlloSonda;
import com.design_pattern.controllo_gestione_incendi.gestione_sonda.Subject;
import com.design_pattern.controllo_gestione_incendi.main.CentroControllo;
import com.design_pattern.controllo_gestione_incendi.model.CentroControlloProxy;
import com.design_pattern.controllo_gestione_incendi.model.Sonda;

class CentroControlloTest {

	@Test
	public void testConstructorCentroControllo() {
		CentroControllo CentroControllo = new CentroControllo();
	    assertNotNull(CentroControllo);
	}
	
	@Test
	public void testConstructorSonda() {
		Sonda Sonda = new Sonda(1, 44.4056, 8.9463);
	    assertNotNull(Sonda);
	}

	@Test
	public void testConstructorCentroControlloProxy() {
		CentroControlloProxy CentroControlloProxy = new CentroControlloProxy();
	    assertNotNull(CentroControlloProxy);
	}
	
	@Test
	public void testAggiorna() {
	    Sonda sondaGenova = new Sonda(1, 44.4056, 8.9463);
	    sondaGenova.setLivelloFumo(sondaGenova.VALORE_CRITICO + 1);
	    
	    Sonda sondaRoma = new Sonda(5, 41.9027835, 12.4963655);	    
	    sondaRoma.setLivelloFumo(sondaRoma.VALORE_CRITICO + 1);
	    
	    assertEquals(sondaGenova.getLivelloFumo(), sondaRoma.getLivelloFumo());
	}
}
