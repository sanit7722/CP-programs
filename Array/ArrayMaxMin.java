class ArrayMaxMin{
	public static int findMaxEle(int arr[]){
		int max=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]>max){
				max=arr[i];
			}
		}
		return max;
	}
	public static int findMinEle(int arr[]){
		int min=Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++){
			if(arr[i]<min){
				min=arr[i];
			}
		}
		return min;
	}
	public static void main(String args[]){
		int arr[]={1,5,3,6,6,9,5,10,3};
		System.out.println(findMaxEle(arr));
		System.out.println(findMinEle(arr));
	}
}