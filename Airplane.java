// Coded by Thaddeus Albert
// Airplane problem givin in class to understand constructors
// Started on 2/11/15

public class Airplane {
	public String make;
	public String model;
	public int year;
	public int capacity;

// -----------------------------------

	Airplane(String thisMake, String thisModel, int thisYear, int thisCapacity) {
	  make = thisMake;
	  model = thisModel;
	  year = thisYear;
	  capacity = thisCapacity;
	}

Airplane(String thisMake, String thisModel, int thisYear) {
	
	  make = thisMake;
	  model = thisModel;
	  year = thisYear;
	}

	Airplane(String thisMake, String thisModel) {

	  make = thisMake;
	  model = thisModel;
	}

	Airplane(String thisMake) {
	
	  make = thisMake;
	} 
}

























