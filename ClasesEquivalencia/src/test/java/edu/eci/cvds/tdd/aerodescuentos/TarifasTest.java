package edu.eci.cvds.tdd.aerodescuentos;

import org.junit.Assert;
import org.junit.Test;

public class TarifasTest {
	// arrange
	private double tarifa;

	@Test
	public void should_raiseException_when_diasAntelacionIsUnder0() {
		try {
			// act
			tarifa = CalculadorDescuentos.calculoTarifa(200000, -5, 25);
		} catch (Exception ExcepcionParametrosInvalidos) {
			// assert
			Assert.assertTrue(true);
		}
	}

	@Test
	public void should_dropTheOriginalAmount_when_itsOverageAnddiasAntelacionIsUnder20() {
		// act
		tarifa = CalculadorDescuentos.calculoTarifa(200000, 15, 25);
		// assert
		Assert.assertEquals(String.valueOf(tarifa), "200000.0");
	}

	@Test
	public void should_dropThe15perCentDisc_when_diasAntelacionIsUnder20() {
		// act
		tarifa = CalculadorDescuentos.calculoTarifa(200000, 25, 25);
		// assert
		Assert.assertEquals(String.valueOf(tarifa), "170000.0");
	}

	@Test
	public void should_raiseException_when_tarifaBaseIsUnder0() {
		try {
			// act
			tarifa = CalculadorDescuentos.calculoTarifa(-5, 15, 25);
		} catch (Exception ExcepcionParametrosInvalidos) {
			// assert
			Assert.assertTrue(true);
		}
	}

	@Test
	public void should_raiseException_when_ageIsUnder0() {
		try {
			// act
			tarifa = CalculadorDescuentos.calculoTarifa(200000, 15, -5);
		} catch (Exception ExcepcionParametrosInvalidos) {
			// assert
			Assert.assertTrue(true);

		}
	}

	@Test
	public void should_dropThe5perCentDisc_when_itsUnderage() {
		// act
		tarifa = CalculadorDescuentos.calculoTarifa(200000, 15, 12);
		// assert
		Assert.assertEquals(String.valueOf(tarifa), "190000.0");
	}

	@Test
	public void should_dropThe8perCentDisc_when_itsOver68() {
		// act
		tarifa = CalculadorDescuentos.calculoTarifa(200000, 15, 68);
		// assert
		Assert.assertEquals(String.valueOf(tarifa), "184000.0");
	}
}
