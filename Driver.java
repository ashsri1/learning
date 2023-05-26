class Animal {


    String name;
    String color;

    Animal(String name1,String color1){
        this.name=name1;
        this.color=color1;
    }
    Animal(String name2){
        this.name=name2;
        this.color="black";
    }
   public void Print(){
        System.out.println(this.name + " "+ this.color);
    }

    }






public class Driver {
    public static void main(String[] args) {
        Animal A1 = new Animal("dog", "red");
        A1.Print();
        Animal A2 = new Animal("cat");
        A2.Print();

       String name= A1.name;
    }
}