package finalprojectoo;

public class Coke implements Drink{
		
	@Override
	public String color() {
		// TODO Auto-generated method stub
		return "brown";
	}

	@Override
	public String container() {
		// TODO Auto-generated method stub
		return "can";
	}
	
	
	@Override
	public String description() {
		// TODO Auto-generated method stub
		return "A can of the classic, is there anything better?";
	}
	
	public String dietDescription() {
		return "A can of the classic with none of the calories";
	}

	@Override
	public String drink() {
		// TODO Auto-generated method stub
		return "gulp......Yup that's the classic";
	}
	public String drinkDiet() {
		return "gulp.......Yup that sucks"; 
	}

	@Override
	public String name() {
		// TODO Auto-generated method stub
		return "Coke";
	}
	public String nameDiet() {
		return "Diet Coke";
	}

}
