public class Hello {

    public void print(){
        System.out.println(".(Hello world)");
    }
    public void display(String name){
        System.out.println("Hello world" + name);
    }

    public static void main(String[] args) {
        Hello hello = new Hello();
        hello.print();
        String name = "Sonam";
        hello.display(name);
    }
    
}
