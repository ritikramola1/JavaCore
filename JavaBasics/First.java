// // Java variables

// class First{
//     public static void main(String[] args) {
        
//         byte a=1;
//         int rit = 29;

//         float abc = 2.1f;  //we use f as ,double is default in java
//         double ab = 2.5;

//         long bcd = 1242343243;

//         char cdc='s'; //  we use single quotes //Double is for String

//         System.out.println(ab +" he " + abc  + " he " + a + " he " + rit + " he " + bcd + " he " + cdc);
//     }

// }

// //--------------------------------- // Casting in Java

// class First{
//     public static void main(String[] args) {
        
//         int a=1;
//         double b = a; // implicit casting=internal lower to higher data type

//         System.out.println(b);

//         double c = 2.5;
//         int d = (int) c; // explicit casting = external higher to lower data type we have to use (int) before the variable name

//         System.out.println(d);

//         //this is called type promotion in java , as input is of lower data type and output is of higher data type
//         byte f = 10;
//         byte g = 20;

//         int res = f*g; // byte and byte gives int as output
//         System.out.println(res);
//     }

// }

// --------------------------------- // Operators in Java
// == , !=, >, <, >=, <= are called comparison operators
// &&, ||, ! are called logical operators
// ++, -- are called increment and decrement operators

//if else statement in java
// class First{
//     public static void main(String[] args) {
        
//         int age = 18;

//         if(age>=18){
//             System.out.println("You are eligible to vote");
//         }
//         else{
//             System.out.println("You are not eligible to vote");
//         }
//     }

// }

//ternary operator in java
//it is a shorthand for if else statement used by ? and :
// ? is used for if and : is used for else

// class First{
//     public static void main(String[] args) {        
//         int age = 18;
//         String res = (age>=18) ? "You are eligible to vote" : "You are not eligible to vote";
//         System.out.println(res);
//     }
// }

// -------------------- // switch case in java ---------------
// class First{
//     public static void main(String[] args) {        
//         int day = 3;
//         switch(day){
//             case 1:
//                 System.out.println("Monday");
//                 break;
//             case 2:
//                 System.out.println("Tuesday");
//                 break;
//             case 3:
//                 System.out.println("Wednesday");
//                 break;
//             case 4:
//                 System.out.println("Thursday");
//                 break;
//             case 5:
//                 System.out.println("Friday");
//                 break;
//             case 6:
//                 System.out.println("Saturday");
//                 break;
//             case 7:
//                 System.out.println("Sunday");
//                 break;
//             default:
//                 System.out.println("Invalid day");
//         }
//     }
// }

// -------------------- // Loops in Java ---------------
// for loop in java

// class First{
//     public static void main(String[] args) {        
//         for(int i=0; i<5; i++){
//             System.out.println(i);
//         }
//     }
// }

// -------------------- // while loop in java
// class First{
//     public static void main(String[] args) {        
//         int i=0;
//         while(i<5){
//             System.out.println(i);
//             i++;
//         }
//     }
// }

// -------------------- // do while loop in java
// class First{
//     public static void main(String[] args) {        
//         int i=0;
//         do{
//             System.out.println(i);
//             i++;
//         }while(i<5);
//     }
// }