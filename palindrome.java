class palindrome{
	public static void main(String[] args){
		//int num = 100;
		System.out.println("palindrome numbers between 1 - 100 is :");
		for(int i = 1; i <= 100; i++){
			if (i < 10 && i / 1 == i){
				System.out.print(i+" ");
				
			}
			else if (i >= 10 && i <= 100){
				int lastDigit = i % 10;
				int firstDigit = i / 10;
				
				if (lastDigit == firstDigit){
					System.out.print(i+" ");
				}
			}
		}
	}
}