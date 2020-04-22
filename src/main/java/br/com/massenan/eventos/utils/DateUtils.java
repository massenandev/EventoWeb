package br.com.massenan.eventos.utils;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateUtils {

	/** Padrao para data dd/MM/yyyy */
	public static final String DATE = "dd/MM/yyyy";

	public static final String DATE_TIME = "dd/MM/yyyy HH:mm:ss";

	/** Padrao para hora HH:mm:ss */
	public static final String HORA = "HH:mm:ss";

	/**
	 * @param data dd/MM/yyyy
	 * @return
	 */
	public static LocalDate parseDate(String data) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern(DATE);
		LocalDate date = LocalDate.parse(data, formatter);
		return date;
	}

	/**
	 * 
	 * @param data dd/MM/yyyy HH:mm:ss
	 * @return
	 */
	public static LocalDateTime parseDateTime(String data) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern(DATE_TIME);
		LocalDateTime dateTime = LocalDateTime.parse(data, formatter);
		return dateTime;
	}

	public static String buildDate(String data, String hora) {
		String x = data + " ";
		String y = hora;
		String z = ":00";
		String date = "";
		return date.concat(x).concat(y).concat(z);
	}
}