package AccentureJan;

public class SecondHighestNum {
	public static void main(String[] args) {
		int ar[] = { 133, 2, 134, 53554, 747, 747, 43634, 747, 86, 346 };
        int f=Integer.MIN_VALUE;
        int s=Integer.MIN_VALUE;
        for(int num:ar){
         if(num>f){
             s=f;
             f=num;
         }   else if(num>s && num!=f){
             s=num;
         }
        }
        System.out.print(s);
	}
}
