package in.internationalization;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatDemo {

	public static void main(String[] args) {

		double number = 1234567.893;

		Locale locale = new Locale("en", "IN");

		String format = NumberFormat.getCurrencyInstance(locale).format(number);

		System.out.println("India Formatted Currency: " + format);

		String format1 = NumberFormat.getCurrencyInstance(Locale.US).format(number);

		System.out.println("US Formatted Currency: " + format1);

		String format2 = NumberFormat.getCurrencyInstance(Locale.UK).format(number);

		System.out.println("UK Formatted Currency: " + format2);

		NumberFormat numberFormat = NumberFormat.getInstance();
		
		NumberFormat numberFormat1 = NumberFormat.getInstance();
		
		NumberFormat numberFormat2 = NumberFormat.getInstance();

		numberFormat.setMaximumFractionDigits(2);

		System.out.println(numberFormat.format(123.4567));
		
		System.out.println(numberFormat.format(1234567.4));

		numberFormat1.setMinimumFractionDigits(2);

		System.out.println(numberFormat1.format(234.4567));
		
		System.out.println(numberFormat1.format(234.4));

		numberFormat.setMaximumIntegerDigits(5);

		System.out.println(numberFormat.format(1234567.4567));

		numberFormat2.setMinimumIntegerDigits(3);

		System.out.println(numberFormat2.format(10.4567));

	}
}
