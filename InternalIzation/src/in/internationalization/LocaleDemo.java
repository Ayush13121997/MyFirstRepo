package in.internationalization;

import java.util.Arrays;
import java.util.Locale;

public class LocaleDemo {

	public static void main(String[] args) {


		Locale l = Locale.getDefault();
		
		System.out.println(l.getLanguage() + "...." + l.getCountry());
		
		System.out.println(l.getDisplayLanguage() + "...." + l.getDisplayCountry());
		
		Locale l1 = new Locale("hi", "IN");
		
		System.out.println(l1.getLanguage() + "...." + l1.getCountry());
		
		System.out.println(l1.getDisplayLanguage() + "...." + l1.getDisplayCountry());
		
		Locale.setDefault(l1);
		
		System.out.println(Locale.getDefault().getLanguage() + "...." + Locale.getDefault().getCountry());
		
		String[] isoLanguages = Locale.getISOLanguages();
		
		
		for (String isoLanguage : isoLanguages) {
			System.out.println(isoLanguage);
		}
		
		Arrays.stream(Locale.getISOCountries())
				.forEach(System.out::println);
		
		Arrays.stream(Locale.getAvailableLocales())
				.filter(locale -> locale.getCountry().equals("IN"))
				.forEach(locale -> System.out.println(locale.getDisplayLanguage() + "...." + locale.getDisplayCountry()));
		
	}

}
