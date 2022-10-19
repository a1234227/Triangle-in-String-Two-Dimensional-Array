
public class Triangle {

	public static void main(String[] args) {
		
		int number =5;
		
		String[][] Triangle=makeTriangle(number);
		    
		    for(int i=0;i<number;i++) {
		    	for(int q=0;q<2*number+1;q++) {
		    		System.out.print(Triangle[i][q]);
		    	}
		    }
		
		
	}

	public static String[][] makeTriangle(int number) {
	    
		String[][] Triangle =new String[number][2*number+1];
		
		int x=0;
		int j=0;
		    for(int i = 0; i < number ; i++) {       
		        for(int k =0; k<(number-i-1); k++) {  
		        	Triangle[i][k]=("X");
		           }
		        j=(number-i-1);
		        for(int y=0 ;y<=x;y++) {
		        	   Triangle[i][j]=("O");
		        	   j++;
		        }
		        Triangle[i][2*number]=("\n");
		        x+=2;
		    }
		    
		    for(int a=0;a<number;a++) {
		    	for(int b=0;b<2*number+1;b++) {
		    		if(Triangle[a][b]==null) {
		    			Triangle[a][b]=" ";
		    		}
		    	}
		    }
	    

		return Triangle;

	}
}
