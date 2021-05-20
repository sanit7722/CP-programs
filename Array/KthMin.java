import java.util.*;
class KthMin{
	
	public static void main(String strgs[]){
		int arr[]={6,4,7,2,8,9,3,1};
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		ArrayList al=new ArrayList();
		for(int i=0;i<arr.length;i++){
			if(!al.contains(arr[i])){
				al.add(arr[i]);
			}
		}
		Collections.sort(al);
		
		System.out.println(al.get(n-1));
		
		
	}
}