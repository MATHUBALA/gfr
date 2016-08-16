
public class SumOfnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
    for(int i=1;i<=15;i++){
    	sum=sum+i;
    }
    System.out.println(sum);
    for(int i=15;i<=45;i++){
    	
    	if(i%2==1){
    		 sum=sum+i;
    	}
    }
    System.out.println(sum);
	}

}
