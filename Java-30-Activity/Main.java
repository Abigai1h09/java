class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  
  void print(Object o){System.out.println(o);}
  void printt(Object o){System.out.print(o);}

  void init(){
    // create objects
    Car car1 = new Car("BMW", "m2", "White", 2023, 20000.75);
    Car car2 = new Car("Porsche", "GT3", "Pink", 2022, 235800);

    // display brand, model and value of each car
       print(car1.brand);
       print(car1.model);
       print(car1.value);

       print(car2.brand);
       print(car2.model);
       print(car2.value);

    // Display brand and model of any car with value over 30,000
    print("\nCars with value exceeding $30,000:");
    if(car1.value > 30000){
      print(car1.value);
    }
    if(car2.value > 30000){
      print(car2.value);
    }
    
	// Make BMW honk
	print("\nUsing car functions(behavior):");	
  car1.honk();

    
  }

}