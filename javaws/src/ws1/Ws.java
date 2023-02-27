
package ws1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ws {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();

		while (true) {
			System.out.println("Input Command [q, a1, a2, a3, a4 ]");
			String cmd = sc.next();

			if (cmd.equals("q")) {
				System.out.println("quit..");
				break;
			} else if (cmd.equals("a1")) {
				// 5~9까지의 숫자를 입력 받는다.
				// 입력 받은 숫자만큼 배열을 생성하고
				// 1~9 까지의 랜덤한 숫자를 배열에 넣는다.
				// 배열 정보를 출력한다.
				// 배열의 합과 평균을 출력한다.

				System.out.println("5부터 9까지의 숫자를 입력하세요");
				int a = Integer.parseInt(sc.next());

				int[] a1 = new int[a];

				int sum1 = 0;
				double avg1 = 0;

				for (int i : a1) {
					i = r.nextInt(9) + 1;
					System.out.printf("%d \n", i);
					sum1 = sum1 + i;
				}

				avg1 = sum1 / a * 1.0;

				System.out.printf("합: %d 평균:%.2f\n", sum1, avg1);

			} else if (cmd.equals("a3")) {
				System.out.println("Input one between 5 ~ 9");
				int you = Integer.parseInt(sc.next()); // 입력 받은 you 값을 String 에서 정수로 변환
				int a3[] = new int[you]; // 입력 받은 숫자만큼 배열을 생성
				for (int i = 0; i < a3.length; i++) {
					int data = r.nextInt(9) + 1;
					a3[i] = data;
				}
				int a3Sum = 0; // a3Sum : 배열 a3의 총합
				double a3Avg = 0; // a3Avg : 배열 a3의 평균
				int a3Sum2 = 0; // a3Sum2 : 배열 a3의 짝수값 총합
				double a3Avg2 = 0; // a3Avg2 : 배열 a3의 짝수값 평균
				int a3Cnt = 0; // count 변수
				for (int a : a3) { // 배열 a3의 총합값 출력
					System.out.printf("%d \t", a);
					a3Sum += a;
					if (a % 2 == 0) {
						a3Sum2 += a;
						a3Cnt++;
					}
				}
				System.out.println("");
				a3Avg = a3Sum * 1.0 / a3.length; // 배열 a3의 평균 계산
				a3Avg2 = a3Sum2 * 1.0 / a3Cnt; // 배열 a3의 짝수값 평균 구하기
				System.out.printf("배열 a3의 합은 %d, 평균은 %4.2f \n", a3Sum, a3Avg);
				System.out.printf("배열 a3의 짝수 값만의 합은 %d, 평균은 %4.2f \n", a3Sum2, a3Avg2);

				// 5~9까지의 숫자를 입력 받는다.
				// 입력 받은 숫자만큼 배열을 생성하고
				// 1~9 까지의 랜덤한 숫자를 배열에 넣는다.
				// 배열 정보를 출력한다.
				// 배열의 합과 평균을 출력한다.
				// 짝수 값만의 합과 평균을 출력한다.
			} else if (cmd.equals("a4")) {

				// 5~9까지의 숫자를 2개 입력 받는다.
				// 2차원 배열을 만든다.
				// 1~9 까지의 랜덤한 숫자를 배열에 넣는다.
				// 배열 정보를 출력한다.
				// 배열의 합과 평균을 출력한다.
				
				System.out.println("Input first numbers [ 5 ~ 9 ] "); // 행값 입력받기
				int fourth1=Integer.parseInt(sc.next()); // scanner로 입력받은 값 정수로 변환하여 저장
				System.out.println("Input second numbers [ 5 ~ 9 ] "); // 열값 입력받기
				int fourth2=Integer.parseInt(sc.next()); // scanner로 입력받은 값 정수로 변환하여 저장
				
				int[][] a4= new int[fourth1][fourth2]; //입력값에 따른 2차원 배열 생성
				
				int sum4=0; //합 저장할 변수 선언
				double avg4=0; //평균 저장할 변수 선언
				
				for(int[] data1:a4) { //변수 행에 접근
					for(int data2:data1) { //변수 행열에 접근하여 랜덤값 할당, 출력, 합산
						data2=r.nextInt(9)+1;
						System.out.printf("%d ",data2);
						sum4+=data2;
					}
					System.out.println("");
				}
				avg4=sum4/(fourth1*fourth2*1.0);
				
				System.out.printf("합: %d 평균:%.2f\n",sum4,avg4);

			} else {
				System.out.println("Invalid input.. try again");
			}
		} // end while
		System.out.println("bye");
		sc.close();
	}

}