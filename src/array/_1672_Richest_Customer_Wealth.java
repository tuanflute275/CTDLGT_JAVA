package array;

public class _1672_Richest_Customer_Wealth {

    public static int maximumWealth(int[][] a) {
    	int soKhachHang = a.length;
		int soNganHang = a[0].length;
		int[] tongTaiSan = new int[soKhachHang];
		
		for (int i = 0; i < soKhachHang; i++) {
			int tongTaiSanI = 0;
			for (int j = 0; j < soNganHang; j++) {
				tongTaiSanI += a[i][j];
			}
			tongTaiSan[i] = tongTaiSanI;
		}
		int max = 0;
		for (int i = 0; i < soKhachHang; i++) {
			System.out.println("Tong i "+i+" : "+tongTaiSan[i]);
			if(tongTaiSan[i] > max) {
				max = tongTaiSan[i];
			}
		}
    	return max;
    }
	
	public static void main(String[] args) {
		int[][] a = {{1, 2, 3},{3, 2, 2}};
		int result = maximumWealth(a);
		System.out.println("result => "+result);
	}
}
