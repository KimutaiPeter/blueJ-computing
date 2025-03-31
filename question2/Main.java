class Main{
    public static void main(String[] args){
        Appliance television=new TV();
        Appliance fan=new Fan();

        television.turnOn();
        fan.turnOn();
        System.out.println("This is question 2");
    }
}