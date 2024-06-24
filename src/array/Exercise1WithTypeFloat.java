package array;

import java.util.Random;
import java.util.Scanner;

public class Exercise1WithTypeFloat {
	float array[];
	int n;

	// main
	public Exercise1WithTypeFloat() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập vào số lượng phần tử của mảng: ");
		n = sc.nextInt();
		array = createArrayFloat(n);
		printArray();
	}

	// tạo phương thức trả về mảng số thực gồm n phần tử
	public float[] createArrayFloat(int n) {
		Random random = new Random();
		float[] temp = new float[n];
		for (int i = 0; i < n; i++) {
			temp[i] = random.nextFloat();
		}
		return temp;
	}

	// phương thức hiển thị mảng
	public void printArray() {
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i] + " ");
		}
	}

	// thêm 1 phần tử X vào cuối mảng
	public void addX(float x) {
		// tăng n lên
		n = n + 1;
		// tạo mảng temp
		float[] temp = new float[n];
		//copy dữ liệu cũ
		for (int i = 0; i < array.length; i++) {
			temp[i] = array[i];
		}
		// thêm x vào cuối mảng
		temp[n-1] = x;
		
		// gán lại giá trị cho array
		array= temp;
		
	}
	
	
	// phương thức tính tổng 2 phần tử đầu tiên
	public void sum2FirstElement() {
		float sum = 0;
//		if(array.length>1) {
//			sum+=array[0];
//		}
//		if(array.length>2) {
//			sum+=array[1];
//		}
		
		
		for (int i = 0; i < 2 && i < array.length; i++) {
			sum+=array[i];
		}
		
		System.out.println("Tổng 2 phần tử đầu tiên là: "+sum);
	}
	
	
	//phương thức tính tổng các phần tử trong mảng
	public void sumArray() {
		float sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum+=array[i];
		}
		System.out.println("Tổng các phần tử trong mảng là: "+sum);
	}

	// tìm giá trị min trong mảng
	public void minArray() {
		float min = array[0];
		for (int i = 0; i < array.length; i++) {
			if(min > array[i]) {
				min = array[i];
			}
		}
		System.out.println("Giá trị nhỏ nhất trong mảng là: "+min);
	}
	
	
	
	
	public static void main(String[] args) {
		Exercise1WithTypeFloat exercise1 = new Exercise1WithTypeFloat();
		exercise1.addX(1.2f);
		exercise1.printArray();
		exercise1.sum2FirstElement();
		exercise1.sumArray();
		exercise1.minArray();
	}
}
