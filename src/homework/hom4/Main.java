package homework.hom4;

public class Main {
    public static void main(String[] args) {
        String source1 = "Apollo";
        String target1 = "pollo";
        int result1 = WordUtil.findWordPosition(source1, target1);
        System.out.println("Source: " + source1);
        System.out.println("Target: " + target1);
        System.out.println("Result: " + result1);

        String source2 = "Apple";
        String target2 = "Plant";
        int result2 = WordUtil.findWordPosition(source2, target2);
        System.out.println("\nSource: " + source2);
        System.out.println("Target: " + target2);
        System.out.println("Result: " + result2);

        String str1 = "Hello";
        String reversedStr1 = StringUtil.stringReverse(str1);
        System.out.println(str1 + " -> " + reversedStr1);

        String str2 = "ERE";
        boolean isPalindrome2 = StringUtil.isPalindrome(str2);
        System.out.println("\n" + str2 + " -> " + isPalindrome2);

        String str3 = "Allo";
        boolean isPalindrome3 = StringUtil.isPalindrome(str3);
        System.out.println(str3 + " -> " + isPalindrome3);
    }
}
