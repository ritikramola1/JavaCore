// class and Objects

// class Computer{

//     public void result(){
//         System.out.println("Hi Ritik");
//     }

//     public int getSum(){
//         int res = 4+9;
//         return res;
//     }

// }

// class Basic{
//     public static void main(String[] args){

//         Computer comp = new Computer();

//         comp.result();

//         int res = comp.getSum();
//         System.out.println(comp);
//     }
// }

class Calculator{

    public int getSum(int m,int n){
        return m+n;
    }
    public double getSum(double m,int n){
        return n+m;
    }
    public int getSum(int c,int d,int f)
    {
        return c+d+f;

    }

}

class Demo{
    public static void main(String[] args){
        Calculator calc = new Calculator();
        int a=10;int b=20,c=50;
        double a1=25;

        int res = calc.getSum(a,b);
        int res1 = calc.getSum(b,a,c);
        double res2 = calc.getSum(a1, b);
        System.out.println(res+ " " +res1 + " " +res2);
    }
}