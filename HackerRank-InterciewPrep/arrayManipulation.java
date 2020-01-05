
public class arrayManipulation {
	
	public static long arrayMAnip(int n, int[][]queries) {
		long highestSum=0;
		long[] reqArr = new long[n];
		int lowerIndex=0;
		int higherIndex=0;
		int addNum =0;
		for(int i=0;i<queries.length;i++) {
			lowerIndex = queries[i][0];
			higherIndex = queries[i][1];
			addNum = queries[i][2];
			
			while(lowerIndex<=higherIndex) {	
				
				reqArr[lowerIndex-1] += addNum;
				long currentHighestSum = reqArr[lowerIndex-1];
				if(highestSum<currentHighestSum) {
					highestSum = currentHighestSum;
				}
				++lowerIndex;
			}
		}
		
		return highestSum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 5;
		int[][] queries= {
				{2,3,7},
				{1,4,3}	
				};
		
		System.out.println(arrayMAnip(n,queries));
		
	}

}
/*
Scanner scan = new Scanner(System.in);
int n = scan.nextInt();
int m = scan.nextInt();
        
//This will be the "difference array". The entry arr[i]=k indicates that arr[i] is exactly k units larger than arr[i-1]
long[] arr = new long[n];
        
int lower;
int upper;
long sum;

for(int i=0;i<n;i++) arr[i]=0;

for(int i=0;i<m;i++){
    lower=scan.nextInt();
    upper=scan.nextInt();
    sum=scan.nextInt();
    arr[lower-1]+=sum;
    if(upper<n) arr[upper]-=sum; 
}
        
long max=0;
long temp=0;

for(int i=0;i<n;i++){
    temp += arr[i];
    if(temp> max) max=temp;
}

System.out.println(max);*/
