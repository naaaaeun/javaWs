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

			} else if (cmd.equals("a2")) {
				int num2 = 0;
				// 5~9까지의 숫자를 입력 받는다.
				while (true) {
					System.out.println("5에서 9까지 숫자를 입력하라");
					Scanner sc2 = new Scanner(System.in);
					num2 = Integer.parseInt(sc2.next());
					if (num2 >= 5 && num2 <= 9) {
						System.out.printf("%s을 입력했군요 \n", num2); // 입력숫자 확인용
						break;
					} else {
						System.out.println("5에서 9까지의 숫자를 입력하세요......");
					}
				}
				// 입력 받은 숫자만큼 배열을 생성하고
				int a2[] = new int[num2];
				// 1~9 까지의 랜덤한 숫자를 배열에 넣는다.
				Random r2 = new Random();
				for (int i2 = 0; i2 < a2.length; i2++) {
					a2[i2] = r2.nextInt(9) + 1;
				}
				// 배열 정보를 출력한다.
				System.out.println(Arrays.toString(a2));
				// 배열의 합과 평균을 출력한다.
				int sum2 = 0;
				int i2 = 0;
				for (i2 = 0; i2 < a2.length; i2++) {
					sum2 += a2[i2];
				}
				System.out.printf("전체합: %d 전체평균:%4.2f\n", sum2, (sum2 * 1.0) / (a2.length));
				// 짝수번째 숫자들의 합과 평균을 출력한다.
				int sum2_3 = 0;
				int cnt = 0;
				for (i2 = 0; i2 < a2.length; i2++) {
					if (i2 % 2 != 0) { // 짝수번째 숫자들이니 배열번호는 1번,3번~으로 추출되도록
						sum2_3 += a2[i2];
						cnt++;
					}
				}
				System.out.printf("짝수번째합: %d 짝수번째평균:%4.2f\n", sum2_3, (sum2_3 * 1.0) / cnt);
			} else if (cmd.equals("a3")) {
				System.out.println("Input one between 5 ~ 9");
				String yours = sc.next(); // yours 숫자를 String 으로 입력 받음
				int you = Integer.parseInt(yours); // String yours를 정수 you로 변환
				int a3[] = new int[you]; // 입력 받은 숫자만큼 배열을 생성

				for (int i = 0; i < a3.length; i++) {
					int data = r.nextInt(9) + 1;
					a3[i] = data;
				}

				for (int a : a3) { // 배열 a3을 출력
					System.out.printf("%d \t", a);
				}
				System.out.println("");

				int a3Sum = 0; // a3Sum : 배열 a3의 총합
				double a3Avg = 0; // a3Avg : 배열 a3의 평균
				for (int a : a3) { // 배열 a3의 총합값 출력
					a3Sum += a;
				}
				a3Avg = a3Sum * 1.0 / a3.length; // 배열 a3의 평균 계산
				System.out.printf("배열 a3의 합은 %d, 평균은 %4.2f \n", a3Sum, a3Avg);

				int a3Sum2 = 0; // a3Sum2 : 배열 a3의 짝수값 총합
				double a3Avg2 = 0; // a3Avg2 : 배열 a3의 짝수값 평균
				int a3Cnt = 0; // count 변수

				for (int a : a3) { // 배열 a3의 짝수값 총합 구하기
					if (a % 2 == 0) {
						a3Sum2 += a;
						a3Cnt++;
					}
				}
				a3Avg2 = a3Sum2 * 1.0 / a3Cnt; // 배열 a3의 짝수값 평균 구하기

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
			} else {
				System.out.println("Invalid input.. try again");
			}
		} // end while
		System.out.println("bye");
		sc.close();
	}

}