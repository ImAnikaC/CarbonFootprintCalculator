

public class Household {
		
		private int members;
		private String type;
		private String foodChoice;
		private int householdPurchases;
		private String packagedFood;
		private String machine;
		private int water; 
		private int garbage;
		private String recycle;
		private String transportation;
		
		Household(int members, String type){
			this.members=members;
			this.type = type;
		}

		public int getHouseholdPurchases() {
			return householdPurchases;
		}

		public void setHouseholdPurchases(int householdPurchases) {
			this.householdPurchases = householdPurchases;
		}

		public int getMembers() {
			return members;
		}
		
		public void setMembers(int members) {
			this.members = members;
		}
		
		public String getType() {
			return type;
		}
		
		public void setType(String type) {
			this.type = type;
		}
		
		public String getFoodChoice() {
			return foodChoice;
		}

		public void setFoodChoice(String foodChoice) {
			this.foodChoice = foodChoice;
		}
		
		public String getPackagedFood() {
			return packagedFood;
		}

		public void setPackagedFood(String string) {
			this.packagedFood = string;
		}
		
		
		public String getMachine() {
			return machine;
		}

		public void setMachine(String machine) {
			this.machine = machine;
		}

		public int getWater() {
			return water;
		}

		public void setWater(int water) {
			this.water = water;
		}

		public int getGarbage() {
			return garbage;
		}

		public void setGarbage(int garbage) {
			this.garbage = garbage;
		}

		public String getRecycle() {
			return recycle;
		}

		public void setRecycle(String recycle) {
			this.recycle = recycle;
		}

		public String getTransportation() {
			return transportation;
		}

		public void setTransportation(String transportation) {
			this.transportation = transportation;
		}

		public int memberPoints() {
			int answer = getMembers();
			
			if (answer == 1) 
				return 14;
			
			else if (answer == 2) 
				return 12;
			
			else if (answer == 3) 
				return 10;
			
			else if (answer == 4) 
				return 8;
			
			else if (answer == 5) 
				return 6;
			
			else if (answer == 6) 
				return 4;
			
			else
				return 2;	
		}
		
		public int typePoints() {
			String answer = getType();
			
			if (answer.equals("Large house"))
				return 10;
			
			else if (answer.equals("Medium-sized house"))
				return 7;
			
			else if (answer.equals("Small house"))
				return 4;
			
			else if (answer.equals("Apartment"))
				return 2;
			
			else
				return 0;
		}
		
		public int foodChoicePoints() {
			String answer = getFoodChoice();
			int frozen = 0;
			if (this.getPackagedFood().equals("Yes")) {
				frozen = 12;
			}else {
				frozen = 0;
			}
			if (answer.equals("Meat")) 
				return (10+frozen);
			
			else if (answer.equals("Vegetarian")) 
				return (4+frozen);
			
			else if (answer.equals("Vegan")|| answer.equals("Wild meat"))
				return (2+frozen);
			
			else
				return (0+frozen);		
		}
		
		

		
		
		
		

	}

