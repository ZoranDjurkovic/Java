import java.text.DecimalFormat;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		double x, y, a, z;
		
		int rBr;
		
		DecimalFormat df = new DecimalFormat("#.##");
		
		System.out.println("R.Br\tX\ta\tY\tZ");
		
		rBr = 0;
		for(x=1; x<=4; x += 1)
			for(a=0.1; a<=0.5; a+=0.1)
				for(y=0.5;y<=0.6; y += 0.05) {
					rBr ++;
					
					z = (Math.pow(((x+a+y)/(x-y)), 2)) - (x/(x+2));
					
					System.out.println(rBr +"\t"+x+"\t"+a+"\t"+y+"\t"+df.format(z));
					
					
				}

	}

}
