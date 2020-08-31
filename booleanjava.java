
public class booleanjava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean rightChamber = true;
		boolean leftChamber = false;
		boolean passedChambers = false;
		int chamberCount = 0;
		
		if (rightChamber) {
			System.out.println("you went to the right chamber");
			chamberCount = chamberCount + 1;
			
		}
		
		if (rightChamber) {
			System.out.println("you went to the second right chamber");
			chamberCount = chamberCount + 1;
			
		}
		
		if (rightChamber) {
			System.out.println("you went to the third right chamber");
			chamberCount = chamberCount + 1;
			
		}
		
		if (chamberCount == 3) {
			passedChambers = true;
		
		}
		
		if (chamberCount <= 2) {
			System.out.println("you are stuck");
		}
		if (passedChambers) {
			System.out.println("you escaped the cave");
			
		}
		}
}
