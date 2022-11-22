
public class ReferenceTypeArrayMain {

	public static void main(String[] args) {
		/*
		int a = 345;
		Account acc = new Account(8989,"SIM",56000,3.2);
		int[] ia = new int[5];
		ia[0] = 23;
		*/
		Account[] accArray = new Account[5];
		accArray[0] = new Account(1111, "KIM", 80000, 1.3);
		accArray[1] = new Account(2222, "LIM", 99000, 9.3);
		accArray[2] = new Account(3333, "MIM", 34000, 2.3);
		accArray[3] = new Account(4444, "OIM", 23000, 0.2);
		accArray[4] = new Account(5555, "NIM", 56000, 5.8);
		Account.headerPrint();
		for(int i = 0; i < accArray.length; i++) {
			accArray[i].print();
		}
	}

}
