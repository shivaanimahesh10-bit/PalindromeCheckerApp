public class PalindromeCheckerApp {
    public static void main(String[] args){
        System.out.println("Welcome to palindrome checker app");
        String word = "madam";
        String reversed = new StringBuilder(word).reverse().toString();
        if(word.equalsIgnoreCase(reversed)) {
            System.out.println(word + "is a palindrome");
        }else{
            System.out.println(word+"is not a palindrome");
        }
    }
}

