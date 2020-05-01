class LIS { 
	static int max_ref; // stores the LIS 
	static int _lis(int arr[], int n){ 
		if (n == 1) 
			return 1; 
		int res, akhir = 1; 		
		for (int i = 1; i < n; i++) { 
			res = _lis(arr, i); 
			if (arr[i - 1] < arr[n - 1] && res + 1 > akhir) 
				akhir = res + 1; 	} 
		if (max_ref < akhir) 
			max_ref = akhir; 		
		return akhir; } 	
	static int lis(int arr[], int n) { 		
		max_ref = 1; 		
		_lis(arr, n); 		
		return max_ref; 	} 	
	public static void main(String args[]) 
	{ 
		int arr[] = { 34,54,93,12,76,69,53,73 }; 
		int n = arr.length; 
		System.out.println("Panjang LIS adalah "
						+ lis(arr, n) + "\n"); 
	} 
} 