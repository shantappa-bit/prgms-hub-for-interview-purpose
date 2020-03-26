package pattern;

public class sample2 {
	public static void main(String[] args) {
		int no = 1;
		char ch = 'A';
		for (int i = 1; i <= 4; i++) {

			for (int j = 4; j >= 1; j--) 
			{

				if (i == 1) {
					System.out.print(j);
				} else if (i == 2) {
					System.out.print(no);
					no++;
				} else if (i == 3) {
					System.out.print(j % 2);
				} else {
					System.out.print(ch);
					ch++;
				}
			}
			System.out.println();

		}

	}
}
