class Main {

	public static void main(String[] args) {
    	(new Main()).init();
	}

  //1: printing a string
  void print(String s){
    System.out.println(s);
  }

  //2: Fahrenheit to Celsius temperature conversion
    double FtoC(double F){
    double C = (F*32) *5/9.0;
    return C;
   }
  //3: Sphere volume
   double sphereVolume(double radius){
    double volume= 4/3.* Math.PI* Math.pow(radius,3);
    return volume;
  }
  
  //4: Cone volume
 double coneVolume(double radius,double height){
    return 1/3.*Math.PI*Math.pow(radius,2)*height;
  
  }

  //5: Distance between two coordinate points
 double distance(double x1,
                  double x2,
                  double y1,
                  double y2){
    
     return  Math.sqrt( Math.pow(x1-x2,2) +
                        Math.pow(y1-y2,2) );
  }


  
  void init(){
    //1
    System.out.println("Enter your name ");
    String name = Input.readString();
    print("Welcome "+name);

    //2
    System.out.println("Enter temp in deg F");
    double F = Input.readDouble();
     System.out.println("Temp in deg C is " + FtoC(F));  
    
    //3
  System.out.println("Enter radius of the sphere");
    double radius = Input.readDouble();
    double volume = sphereVolume();
    System.out.println("Volume of the Sphere is " + volume);


    //4
  System.out.println("Enter the radius of the cone ");
    rad = Input.readDouble();

    System.out.println("Enter the height of the cone ");
    double height = Input.readDouble();

   volume = coneVolume(radius, height);
   System.out.println("The volume of the cone is " + volume);
   
    //5
    System.out.println("Enter x1 ");
    double x1 = Input.readDouble();
    System.out.println("Enter y1 ");
    double y1 = Input.readDouble();
    System.out.println("Enter x2 ");
    double x2 = Input.readDouble();
    System.out.println("Enter y2 ");
    double y2 = Input.readDouble();

    double result = distance(x1, y1, x2, y2);
   System.out.println("The distance between two points is " + result);                
        
  }
  
}