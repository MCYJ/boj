package boj1074;

import java.util.*;

public class Main {
	static int n, r, c;
	static int count = 0;
	static void getZ(int tot, int row, int col) {
		// (r,c)�� �������
		// 0���� �����ϴ� ���� �����Ͽ� -1 ��Ŵ
		if(r == row && c == col && tot == 1) {
			System.out.println(count);
		}
		else {
			if(r<=row-tot/2 && c<=col-tot/2) {
				getZ(tot/2, row - tot/2, col - tot/2);
			}
			else if(r<=row-tot/2 && c<=col) {
				count+=(tot/2)*(tot/2);
				getZ(tot/2, row - tot/2, col);
			}
			else if(r<=row && c<=col-tot/2) {
				count+=2*(tot/2)*(tot/2);
				getZ(tot/2, row, col - tot/2);
			}
			else {
				count+=3*(tot/2)*(tot/2);
				getZ(tot/2, row, col);
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		r = sc.nextInt();
		c = sc.nextInt();
		
		// ��� �Ѻ��� ����, ������ ����ǥ (r,c)
		getZ((int)Math.pow(2, n), (int)Math.pow(2, n)-1, (int)Math.pow(2, n)-1);
		
		sc.close();
	}
}
