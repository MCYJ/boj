package boj1292;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int tot = 0;
		
		// bũ���� �迭 ����
		int arr[] = new int[b];
		int flag = 1;
		
		int i = 0;
		while(i<arr.length) {
			for(int j=0;i<arr.length && j<flag ;j++) {
				arr[i] = flag;
				i++;
			}
			flag++;
		}
		for(i=a-1;i<b;i++) {
			tot += arr[i];
		}
		System.out.println(tot);
		
		sc.close();
	}
}
