import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("How many members are in your household (include yourself)?");
		int member = input.nextInt();
		System.out.println("Do you live in a large house, medium-sized house, small house, or an apartment?");
		String type = input.next();
		
		Household house1 = new Household(member,type);
		
		System.out.println("Is most of the food you eat prepackaged or frozen (Yes/No)");
		String frozen = input.next();
		house1.setPackagedFood("Yes");
		System.out.println("What does your food choice look like: meat, vegetarian, or vegan?");
		String foodchoice = input.next();
		house1.setFoodChoice(foodchoice);
		
		System.out.println("On average, how many new pieces of furniture, electronics, or other household gadgets do you buy per year?");
		int purchases = input.nextInt();
		house1.setHouseholdPurchases(purchases);
		//Mansheel will write the method inside class 
		
		System.out.println("Do you have a dishwasher AND a washing machine or do you have either a dishwasher OR a washingmachine? (both/one)");
		String machine = input.next();
		house1.setMachine(machine);
		//write the method inside class 
		
		System.out.println("How many times do you run your dishwasher and/or washing machine? ");
		int water = input.nextInt();
		house1.setWater(water);
		//write the method inside class 
		
		System.out.println("How many garbage cans do you fill up per week? ");
		int garbage = input.nextInt();
		house1.setGarbage(garbage);
		//method 
		
		System.out.println("Do you recycle? (yes/no)");
		String recycle = input.next();
		house1.setRecycle(recycle);
		//method 
		//+24-8 if they say yes periodt.
		//+24 if they say no.
		
		System.out.println("Do you have a car or do you use public transport? (car/public)");
		String transportation = input.next();
		house1.setTransportation(transportation);
		//12 if car
		//6 if public 
	
		
		
		
		
		
	}
}
