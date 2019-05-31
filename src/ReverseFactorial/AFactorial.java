package ReverseFactorial;

public class AFactorial extends ReverseFactorial implements ReverseCalculating{
	
public AFactorial(int num) {
	this.num = num;
	
}

@Override
public void reverseCal(int input) {
	for(int i = input - 1; i >0; i--){
		if(input % i == 0){
			if(input %(i-1) == 0) {
		//reverseCal(i);
	System.out.println( input);
			}
			else {
				System.out.println("None");
			}
}
}
}
}

