package csc131.junit;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.rules.ExpectedException;
public class GiftCardTest
{
	@Test
 	public void getIssuingStore(){
	 	double balance;
	 	GiftCard card;
	 	int issuingStore;

	 	issuingStore = 1337;
	 	balance = 100.00;
	 	card = new GiftCard(issuingStore, balance);
	 	assertEquals("getIssuingStore()",
			 issuingStore, card.getIssuingStore());
 }


 	@Test
	public void getBalance() {
	 	double balance;
	 	GiftCard card;
	 	int issuingStore;

	 	issuingStore = 1337;
	 	balance = 100.00;
	 	card = new GiftCard(issuingStore, balance);
	 	assertEquals("getBalance()",
	 			balance, card.getBalance(),.001);
	}
 	@Test
	public void deduct() {
	 	double balance;
	 	GiftCard card;
	 	int issuingStore;

	 	issuingStore = 1337;
	 	balance = 100.00;
	 	card = new GiftCard(issuingStore, balance);
	 	
	 	String newBal = "Remaining Balance: " + String.format("%6.2f", 90.00);
	 	assertEquals("deduct()",
	 			newBal, card.deduct(10.0));
	}

}