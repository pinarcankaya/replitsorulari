package replitsorulari;

public class ArraySayiToplama {

	public static void main(String[] args) {

		// Array deki sayıları toplayan Java kodunu yazınız.
//
//		int arr[]= {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//		int sum=0;
//		
//		for (int w : arr) {
//			sum=sum+w;
//		}
//		System.out.println(sum);
//		
		// Arraydeki sayıların ortalamasını hesaplayan Java Kodunu yazınız.

		int arr1[] = { 20, 30, 25, 35, -16, 60, -100 };
		double sum1 = 0;

		for (int z : arr1) {
			sum1 = sum1 + z;
		}
		
		double ort1 = (int) (sum1 / arr1.length);

		System.out.println("Array Sayılarının ortalaması: "+ ort1);

	}

}
