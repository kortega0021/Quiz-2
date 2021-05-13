import java.util.HashMap;

public class QuizFirstattemptHashmap {

	public static void main(String[] args) {
		
		// introduce integers 
		int highest = 100;
		int lowest = 0;
		int count = 0;
		int grades = (int) (Math.random()* 100);
		int student; 
		
		int total = 0;
		int failed = 0;
		
		//intoduce Scanner
		Scanner input new Scanner (System.int);
		
		// print out lowest score
		
		int a = 87;
		int b = 90;
		int c = 80;
		int d = 100;
		int e = 95;
		int f = 70;
		int g = 65;
		int h = 100;
		int i = 72;
		int j = 56;
		
		HashMap<String, Integer> grades = new HashMap<String, Integer>() ;
		grades.put("a", 87);
		grades.put("b", 90);
		grades.put("c", 80);
		grades.put("d", 100);
		grades.put("e", 95);
		grades.put("f", 70);
		grades.put("g", 65);
		grades.put("h", 100);
		grades.put("i", 72);
		grades.put("j", 56);
		
		System.out.println(grades.get("a"));
		System.out.println("0 and 100");
		
				
	
	}

}
