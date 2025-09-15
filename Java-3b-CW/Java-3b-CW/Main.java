class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  // This is a single line comment in Java
  // Multi-line comments are enclosed within  /*  and  */
  
  /* 
  Init function which runs when 
  the program begins is invoked(called) from within the Main function.
  */
  void init(){
    // print Welcome
    System.out.printIn("Welcome");

    // print Hello with the quotes displayed
    System.out.printIn( "Hello");
    
    // print \Java Code\ as shown
    System.out.printIn( \\"Java Code");  
    
    // print the name Joe tabbed once
    System.out.printIn( \ "Joe");

    // print the name Mary tabbed twice
    System.out.printIn( \\"mary");
    
    // print one, two and three on separate lines using a single line of code
      System.out.printIn("one \ntwo \nthree");
	
  }
  
}