package oppg1;

	import java.util.Arrays;
	import java.util.Collections;
	import java.util.List;

	public class Oppg1a {

		public static void main(String[] args) {

			
			List<String> listen = Arrays.asList("10", "1", "20", "110", "21", "12");
			
			//Lambda utrykk som sorterer listen ved bruk av en comparator
			Collections.sort(listen, (s1, s2) -> {
				
				int int1 = Integer.parseInt(s1);
				int int2 = Integer.parseInt(s2);
				return Integer.compare(int1, int2);
			});
			
			//Går gjennom den nye sortere listen, og printer ut tallene i stigende rekkefølge.
			for (String s : listen) {
				System.out.print(s + " ");
			}
		}

	}

