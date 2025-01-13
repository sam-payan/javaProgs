public class biggestFromThree{
	public static void main(String[] args){
		int a = 10, b = 20, c = 30;
		if (a > b && a > c){
			System.out.println("A is Biggest among three");
		}
		if (b > a && b > c){
			System.out.println("B is Biggest among three");
		}
		if (c > b && c > a){
			System.out.println("C is Biggest among three");
		}
	}
}