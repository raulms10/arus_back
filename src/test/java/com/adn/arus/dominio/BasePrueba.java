package com.adn.arus.dominio;

import static org.junit.Assert.fail;

import java.util.function.Supplier;

import org.junit.Assert;

/**
 * @author raul.martinez
 *
 */
public class BasePrueba {

	private static final String PERO_FUE_LANZADA = " pero fue lanzada ";
	private static final String SE_ESPERABA_LA_EXCEPCION = "Se esperaba la excepci<93>n ";
	
	public static <T> void assertThrows(Supplier<T> supplier, Class<? extends Exception> exception, String message) {
		try {
			supplier.get();
			fail();
		} catch (Exception e) {
			Assert.assertTrue(SE_ESPERABA_LA_EXCEPCION + exception.getCanonicalName() 
				+ PERO_FUE_LANZADA + e.getClass().getCanonicalName(), exception.isInstance(e));
			Assert.assertTrue(e.getMessage().contains(message));
		}
	}

	public static void assertThrows(Thunk thunk, Class<? extends Exception> exception, String message) {
		try {
			thunk.execute();
			fail();
		} catch (Exception e) {
			Assert.assertTrue(SE_ESPERABA_LA_EXCEPCION + exception.getCanonicalName() 
				+ PERO_FUE_LANZADA + e.getClass().getCanonicalName(), exception.isInstance(e));
			Assert.assertTrue(e.getMessage().contains(message));
		}
	}

	@FunctionalInterface
	public interface Thunk {
		void execute();
	}
}
