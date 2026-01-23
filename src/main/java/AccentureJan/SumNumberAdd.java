package AccentureJan;

public class SumNumberAdd {
	public static void main(String[] args) {
		int num=1354;
		while(num>=10) {
			int sum=0;
			while(num>0) {
				sum+=num%10;
				num=num/10;
			}
			num=sum;
		}
		System.out.println("sum of digit "+num);
	}

}
