class TV extends Appliance{
    boolean status=false;

    @Override
    void turnOn(){
        if(this.status){
            this.status=!this.status;
            if(this.status){
                System.out.println("The TV is now on");
            }else{
                System.out.println("The TV is now off");
            }
            
        }else{
            this.status=!this.status;
            if(this.status){
                System.out.println("The TV is now on");
            }else{
                System.out.println("The TV is now off");
            }
        }
    }


}