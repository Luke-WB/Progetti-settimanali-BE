package main.test;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({ AggiornaSondaTest.class, CentroControlloFactoryTest.class, CentroControlloHttptTest.class,
	CentroControlloProxySondaTest.class, CentroControlloTest.class, ComunicazioneHttpTest.class,
	ControlloSondaTest.class, SondaTest.class })
public class AllTests {

}
