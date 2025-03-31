

class Main{
    public static void main(String[] args){
        System.out.println("This is quesion 1");
        Student student1 = new Student("Alice", 85);
        System.out.println(student1.getName() + "'s Grade: " + student1.getGrade());

        Student student2 = new Student("Bob", 120); 
        System.out.println(student2.getName() + "'s Grade: " + student2.getGrade()); 

    
        MathOperations math = new MathOperations();
        System.out.println("Multiplication of 2 numbers: " + math.multiply(3, 4));
        System.out.println("Multiplication of 3 numbers: " + math.multiply(2, 3, 4));

 
        Animal myDog = new Dog();
        Animal myCat = new Cat();
        myDog.makeSound();  
        myCat.makeSound();  

    }
}