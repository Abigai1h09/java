class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){
    // create 3 dogs
    Dog dog1 = new Dog("Bulldog",2, "Scooby");
    Dog dog2 = new Dog("Maltese", 4, "Duke");
    Dog dog3 = new Dog("Husky", 8, "Bella");

    // display object property values
    print(dog2.age);
    
    // invoke object behaviors(functions)
   dog3.bark();
    
  }

  int randInt(int lower, int upper){
    int range = upper - lower + 1;
    return (int)(Math.random()*range) + lower;
  }

}