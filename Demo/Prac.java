class Practice{

    int id;
    String name;
    double fees;


    // public Practice()
    // {
    //     id = 1;
    //     name = "Ritikkk";
    //     fees = 100;
    // }

       public Practice(int idno,String stuname,double fee){
        this.id = idno;
        this.name = stuname;
        this.fees = fee;
       
    }
    // public int getId(){
    //     return 1;
    // }

    //  public double getFees(){
    //     return 100;
    // }

    //  public String getName(){
    //     return "RITIK";
    // }

    // public int getIdA(){
    //     return 2;
    // }

    //  public double getFeesA(){
    //     return 500;
    // }

    //  public String getNameA(){
    //     return "ABHAY";
    // }

}

class Prac{
    public static void main(String[] args) {
        
        Practice Ritik = new Practice(1,"RITIK",100);
        Practice Abhay = new Practice(2,"ABHAY",500);
        //Practice Abhay = new Practice();

        // int id = Ritik.getId();
        // double fee = Ritik.getFees();
        // String rit = Ritik.getName();

        // int ida = Abhay.getId();
        // double feeA = Abhay.getFees();
        // String abh = Abhay.getNameA();

        System.out.println(Ritik.id + " " + Ritik.name + " " + Ritik.fees);
        System.out.println(Abhay.id + " " + Abhay.name + " " + Abhay.fees);

    }
}