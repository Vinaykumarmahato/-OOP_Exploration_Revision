class Laptop{

    public void CompileCode(){

        System.out.println("Hey! Don't Do The Silly Error!");
    }
}


class Developer{

    public void BuildApp(){

        System.out.println("Building the app!");
       // CompileCode();
       Laptop obj=new Laptop();
       obj.CompileCode();
    }


}


public class MainInterface {
    
    public static void main(String[] args) {
        Developer Dev=new Developer();
        Dev.BuildApp();

    }
}
