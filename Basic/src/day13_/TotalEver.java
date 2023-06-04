package day13_;
class Com{
	int getTotal(int arr1[]) {
		int total = 0;
		for(int i=0; i<arr1.length;i++)
			total = total + arr1[i];
		return total;
		
	}
	int getAverage(int arr2[]) {
		int total = 0;
		total = getTotal(arr2);
		int average = total / arr2.length;
		return average;
	}
}
public class TotalEver {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4};
		Com obj = new Com();
		int total = obj.getTotal(arr);//배열 이름;객체에대한주소를가리킴
		int average = obj.getAverage(arr);
		System.out.println("합계: "+ total);
		System.out.println("평균: "+ average);

	}

}
