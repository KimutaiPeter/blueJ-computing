class Fan extends Appliance{
    boolean status=false;

    @Override
    public void turnOn(){
        if(this.status){
            this.status=!this.status;
            if(this.status){
                System.out.println("The Fan is now on");
            }else{
                System.out.println("The Fan is now off");
            }
        }else{
            this.status=!this.status;
            if(this.status){
                System.out.println("The Fan is now on");
            }else{
                System.out.println("The Fan is now off");
            }
        }
    }

}