
public class testBreak {
	public static void main(String[] args) {
		int arr[][] = {{1,2,3},{4,5,6,7},{9}};
		boolean found = false;
		for(int i=0;i<arr.length&&!found;i++){
			for(int j=0;j<arr[i].length;j++){
				System.out.println("i="+i+",j="+j);
				if(arr[i][j]==5){
					found = true;
					break;
				}
			}
			
		}
	System.out.println("###############");
	OK:
		for(int i=0;i<10;i++){
			for(int j=0;j<10;j++){
				System.out.println("i="+i+",j="+j);
				if(j==5) break OK;
			}
		}
	}
		
}
