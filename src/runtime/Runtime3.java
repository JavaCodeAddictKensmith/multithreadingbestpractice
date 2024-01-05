package runtime;



//restart system

public class Runtime3{
    public static void main(String args[])throws Exception{
        Runtime.getRuntime().exec("shutdown -r -t 0");
    }
}

//shutdown system

 class Runtime2{
    public static void main(String args[])throws Exception{
        Runtime.getRuntime().exec("shutdown -s -t 0");
    }
}