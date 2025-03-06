public class pelindrome {
    public static void main(String[] args) {
        
    
        String name = "Aryan singh";
        StringBuilder sb = new StringBuilder();

        String str45 = sb.reverse().toString();

        if (name.equals(str45)){
            System.out.print("it is pelindrome");
        }
        else {
            System.out.println("it is not");
        }
    
    }
}
