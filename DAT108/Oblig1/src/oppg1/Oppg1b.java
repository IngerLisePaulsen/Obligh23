package oppg1;

	import java.util.Arrays;
	import java.util.Collections;
	import java.util.List;
	import java.util.function.BiFunction;

	
	public class Oppg1b {
	public static int beregn(int a, int b, BiFunction<Integer, Integer, Integer> funksjon) {
			
			return funksjon.apply(a, b);
			
		} 
		
		public static void main(String[] args) {
			
			BiFunction<Integer, Integer, Integer> sumFunksjon = (a, b) -> a + b;
			BiFunction<Integer, Integer, Integer> maxFunksjon = (a, b) -> Math.max(a, b);
			BiFunction<Integer, Integer, Integer> absFunksjon = (a, b) -> Math.abs(a - b);
			
			int sum = beregn(12, 13, sumFunksjon);
			int max = beregn(-5, 3, maxFunksjon);
			int abs = beregn(54, 45, absFunksjon);
			
			System.out.println("Summen av 12 + 13 = " + sum);
			System.out.println("Høyeste verdi mellom -5 og 3 = " + max);
			System.out.println("Avstanden mellom 54 og 45 = " + abs);
		}

	}


