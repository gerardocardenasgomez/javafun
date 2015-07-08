public class HelloJava {
    public static void main( String[] args){
        System.out.println("Hello, Java!");
        System.out.println(args[0]);
        HelloComponent inc = new HelloComponent();
        inc.printComponent("testing");
    
        HelloColors myColor = new HelloColors();
        String result = myColor.getColor();
        System.out.printf("Starts out as %s\n", result);
        myColor.nextColor();
        result = myColor.getColor();
        System.out.printf("Next color is %s\n", result);
    }
}
