import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
		System.out.println("----------程式開始------------");
		Scanner sc=new Scanner(System.in);
		System.out.print("請輸入三角形的層數： ");
		int number =sc.nextInt();
		System.out.println("");
		
		//把指定樣式三角形存入String二維矩陣
		String[][] result = makeTriangle(number);
		sc.close();
		
		//印出來
		StringBuilder sb = new StringBuilder();
		for (int i=0; i<result.length; i++) {
			for (int j=0; j<result[i].length; j++) {
				sb.append(result[i][j]);
			}
		}
		System.out.println(sb.toString());
		
		
		System.out.println("----------程式結束------------");
	}

	public static String[][] makeTriangle(int number) {

		String[][] Triangle = new String[number][number+1];

		for (int i=0; i<number; i++) {
			for (int j=0; j < number-i-1; j++) {
				Triangle[i][j]="X";
			}
			for (int k=number-i-1; k<number; k++) {
				Triangle[i][k]="O";
			}

			Triangle[i][number]="\n";
		}

		return Triangle;

	}
}
