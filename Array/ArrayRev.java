class ArrayRev{
	public static void revArray(int arr[]){
		int j=arr.length-1;
		
		for(int i=0;i<j;i++){
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			j--;
		}
	}
	public static void main(String args[]){
		
		int arr[]={1,2,3,4,5,6,7,8,9};
		revArray(arr);
		for(int i:arr)
			System.out.println(i);
	}
}