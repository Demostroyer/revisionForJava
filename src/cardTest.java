
public class cardTest {
	public static void main(String [] args){
		//creating an array of type CreditCard, called wallet. has 3 accounts
		CreditCard[] wallet = new CreditCard[3];
		wallet[0] = new CreditCard("Ian Dempsey" ,"BOI","4319 3978 2526 4500 ", 1000);
		wallet[1] = new CreditCard("Rachel Murphy" ,"AIB","4319 3978 2526 4340 ", 5000);
		wallet[2] = new CreditCard("Zoe Dempsey" ,"BOI","4319 3978 2526 4780 ", 4500, 20);//so Zoe will have an additional 20 on her creditcard already
		
		for(int val = 1;val <=16;val++){
			wallet[0].charge(val);//just adding in some charges to our creditcards
			wallet[1].charge(2*val);
			wallet[2].charge(3*val);
			
		}
		
		for(CreditCard card: wallet ){//quick style of for loop
			CreditCard.Summary(card);
			while(card.getBal() > 200){//so if we owe more than 200, make a payment of 200 , repet till bal <200
				
				card.payment(200);
				System.out.println("New balance = " + card.getBal());
			}
		}
	}
}
