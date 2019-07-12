
public class fff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String str= "103,394,54,345,34,22,105,65,49,40";
		String[] a=str.split(",");//[103][394][54]....
		int[] d=new int [a.length];

		for(int i=0; i<d.length; i++) {
			d[i]=Integer.parseInt(a[i]);
		}
		
		
		
	}
}
