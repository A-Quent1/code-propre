package ex4;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {
	
	/*	Date au format par défaut */
	public static String DEFAULT_FORMAT = "dd/MM/yyyy HH:mm:ss";
	
	/* Formatage de la date en String avec un format choisi
	 * @param date de type Date qui va être formaté
	 * @param format de type pattern 
	 * @return String
	 */
	public static String formatChoisiDate(Date date, String format) {
		
		SimpleDateFormat formateur = new SimpleDateFormat(format);
		return formateur.format(date);
	}
	
	/* Formatage de la date en String avec un format par défaut
	 * @param date de type Date qui va être formaté
	 * @return String
	 */
	public static String formatDefaultDate(Date date) {
		
		return formatChoisiDate(date, DEFAULT_FORMAT);
	}
	
	
	
}
