package co.com.adn.infraestructura.compartido;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class FormateadorFecha {
	
	public static Date getDate(String fechaString) throws ParseException {
		SimpleDateFormat simpleDateFormat = getDateFormat();
		return simpleDateFormat.parse(fechaString); 
	}
	
	public static SimpleDateFormat getDateFormat() {
		return new SimpleDateFormat("yyyy-MM-dd", new Locale("es", "ES"));
	}
	
	public static String getDate(Date fecha) throws ParseException {
		SimpleDateFormat simpleDateFormat = getDateFormat();
		return simpleDateFormat.format(fecha);
	}
}
