import java.util.Scanner;
import java.util.ArrayList;
public class App {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        /*int numbers[] = {1,2,3,4,5};
        int sum = 0;

        for(int i=0;i < numbers.length; i++){
            sum = sum + numbers[i];
            System.out.println(numbers[i]);
            
        }
        System.out.println("Sum" + sum);*/
        
        //2D ARRAY
        /*int[][] arr = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

        for(int i = 0; i < arr.length;i++){
            for(int k = 0; k < arr.length; k++){
                System.out.print(arr[i][k] + " ");
            }
        }System.out.println();*/

        //Collect USER INPUT
        /*int[] numbers = new int[5];

        for(int i = 0; i < 5; i++){
            System.out.println("Enter a number: ");
            numbers[i] = input.nextInt();
        };

        int highest = numbers[0];
        int lowest = numbers[0];

        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] > highest){
                highest = numbers[i];
            };
            if(numbers[i] < lowest){
                lowest = numbers[i];
            };
        };
        System.out.println("Highest: "+ highest);
        System.out.println("Lowest"+ lowest);*/

        /*int numbers[] = {1,3,49,67,90};
        int total = 0;
        double average;
        int even = 0;
        

        for(int i = 0; i < numbers.length; i++){
            total = total + numbers[i];
            
            if(numbers[i]%2 == 0){
                even = even + numbers[i];
            };
        };
        
        average = (double) total / numbers.length;

        System.out.println("Total:" + total);
        System.out.println("Average:" + average);
        System.out.println("even:" + even);*/

        /*int day = 3;

        switch(day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
            case 5:
                System.out.println("Friday");
            default:
                System.out.println("invalid");
        };*/
        //QUESTION 1
        /*int i = 0;
        while(i < 10){
            i++;
            System.out.println(i);
        };

        //QUESTION 2
        int number;
        do {
            System.out.println("Enter a number: ");
            number = input.nextInt();
        }while(number > 0);

        //QUESTION 3
        System.out.println("Enter a number (1-3)");
        numbers = input.nextInt();
        switch(numbers){
            case 1:
                System.out.println("Start");
                break;
            case 2:
                System.out.println("Settings");
                break;
            case 3:
                System.out.println("Exit");
                break;
            default:
                System.out.println("Enter avalid number");
        };*/
        /*int choice;
        int storeNum = 0;
        do{
            System.out.println("Enter a number(1-3):");
            choice = input.nextInt();

            System.out.println("1. Enter a number");
            System.out.println("2. Show even/odd");
            System.out.println("3. Exit");
            switch(choice){
                case 1:
                    
                    System.out.println("Enter a number: ");
                    storeNum = input.nextInt();
                    break;
                case 2:
                    if(storeNum % 2 == 0){
                        System.out.println("This number is a even");
                    }else{
                        System.out.println("This is a odd");
                    };
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Enter a valid number.");    
            };
        }while(choice !=3 );*/

        //CASE STUDY: FreshMart Inventory & Sales System
        
        //ARRAY LISTS
        /*ArrayList<Integer> numbers = new ArrayList<>();
        //Add values in list
        numbers.add(10);
        numbers.add(30);
        //Get values in list
        //numbers.get(i);
        //Get SIZE
        //numbers.size();
        //Looping through it
        /*for(int i=0; i < numbers.size();i++){
            System.out.println(numbers.get(i));
        };*/

        //CLASSES & METHOD
        //1. ClassName Objectname = new Classname();
        //2. Objectname.variable = "Value";
        //3. Objectname.method();
        /*Student s1 = new Student();
        Student s2 = new Student();*/
        /*Student[] students = new Students[3];

        students[0] = new Student();
        students[1] = new Student();
        students[2] = new Student();

        students[0].name = "Liam";
        students[0].mark = 67;

        students[1].name = "Pow";
        students[1].mark = 90;

        students[2].name = "Kio";
        students[2].mark = 70;


        for(int i =0;i < students.length; i++){
            students[i].display();
        };
        /*s1.name = "Trey";
        s2.name = "Kyle";
        s1.mark = 85;
        s2.mark = 68;
        s2.display();
        s1.display();*/

        /*Car c1 = new Car();
        c1.brand = "Toyota";
        c1.show();*/

        //Constructors -Basically Simplifiers
        //Without Simplifiers 
        /*Student s1 = new Student();
        s1.name = "Jim";
        s1.mark = 77;

        //With Constructors
        Student s1 = new Student("Kun", 65);*/

        //ArrayList<Product> products = new ArrayList<>(); 

        //Adding the products to the list(positions)
        //products.add(new Products("Milk", 1, 50.00, 15));
        //products.add(new Products("Bread", 2, 10.05, 25));
        //products.add(new Products("Honey", 3, 76.60, 5));

        //the program
        





















    };

};
/*class Student{
    //Without Simplifiers
    String name;
    int mark;

    //With Constructors
    Student(String n, int m){
        name = n;
        mark = m;
    }

    Student(String name){
        //keyword == this
        this.name = name;
    }

    void display(){
        System.out.println(name + " " + mark);
    };
};
class Car{
    String brand;
    void show(){
        System.out.println(brand);
    }

};*/
class Product{
    String product;
    int id;
    double prices;
    int stock;

    Product(String product,int id,double prices,int stock){
        this.product = product;
        this.id = id;
        this.prices = prices;
        this.stock = stock;
    };

    void CalcuateTotal(){
        
    };
    void UpdateStock(){

    };

};