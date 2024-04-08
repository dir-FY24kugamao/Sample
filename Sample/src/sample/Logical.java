package sample;

public class Logical {

	public static void main(String[] args) {
		int score= 59; //成績
		
		//and:scoreが40以上、かつ50以下
		System.out.print("scoreが40以上、かつ50以下:");
		System.out.println(score >=40 && score <=50);
		
		//or:scoreが４０以上、または５０以下
		System.out.print("scoreが40以上、または50以下:");
		System.out.println(score >=40 || score <=50);
		
		//not:scoreが6０以上ではない
		System.out.print("scoreが６0以上ではない:");
		System.out.println(!(score >=60) );
		
		
	}

}
