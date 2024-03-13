package aula2;

public class Programa {

	public static void main(String[] args) {
		
		int x, y;
		x = 10;
		y = 0;
		try {
			System.out.println(x/y);			
		} 
		catch(Exception e){
			System.out.println(e);
		}

	}

}
