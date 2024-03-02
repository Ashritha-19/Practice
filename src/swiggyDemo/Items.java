package swiggyDemo;

public  class Items {
    private String starter;
    private String biryanis;
    private String curries;
    private String dessert;
    private int noOfOrders;


    public Items(String starter, String biryanis, String curries, String dessert,int noOfOrders ) {
        this.starter = starter;
        this.biryanis = biryanis;
        this.curries = curries;
        this.dessert = dessert;
        this.noOfOrders=noOfOrders;
    }

    public String getStater(){

        return starter;
    }

    public String getBiryanis(){
        return biryanis;
    }

    public String getCurries(){

        return curries;
    }

    public String getDessert() {
        return dessert;
    }

    //public  String displayOrderDetails();
}
