package boj1106;

import java.util.*;


public class Main {
	static int customer;
	static int listOfTotalPrice[] = new int[1100];
	
	static int numberOfCustomer[];
	static int listOfPrice[];
	
	static int numberOfCity;
	
	static void setList(int idx, int price) {
		// custotmer �� �ʰ��ϸ� return
		if(idx >= 1100) return;
		
		// �̹� ����� ������ ũ�� return
		// -> ���̻� ������ ������ �ʿ� ����, �տ�  �ִ� �� �������� ���ϴ°� ������ ������
		if(listOfTotalPrice[idx] <= price) return;
		
		// �ݾױ������� ���ؾߵ�!!!
		// �������
		if(idx >= 1100) return;
		else {
			listOfTotalPrice[idx] = Math.min(listOfTotalPrice[idx], price);
			// �Է¹��� ����Ʈ ��ȸ
			for (int i = 0; i < numberOfCity; i++) {
				setList(idx+numberOfCustomer[i], price+listOfPrice[i]);
			}
		}
	}
	
	public static void main(String[] args) {
		Arrays.fill(listOfTotalPrice, Integer.MAX_VALUE);
		Scanner sc = new Scanner(System.in);
		
		customer = sc.nextInt();
		numberOfCity = sc.nextInt();
		
		numberOfCustomer = new int[numberOfCity];
		listOfPrice = new int[numberOfCity];
		
		for (int i = 0; i < numberOfCity; i++) {
			listOfPrice[i] = sc.nextInt();
			numberOfCustomer[i] = sc.nextInt();
		}
		
		setList(0, 0);
		
		int smallestPrice = listOfTotalPrice[customer];
		// listOfTotalPrice[customer]���� ����ؼ� ������index���� ���鼭 ���� ���� �� ����
		// -> �� ���� �ݾ����� �� ���� ��� ��ġ�� �� �ֱ� ������
		for (int i = customer; i < 1100; i++) {
			smallestPrice = Math.min(smallestPrice, listOfTotalPrice[i]);
		}
		
		
		
		System.out.println(smallestPrice);
		
		sc.close();
	}
}
