public class  IncreaseNo {
    
    public static void main(String[] args) {
        int[] numbers = {134,987654321,};
        
        for (int num : numbers) {
            System.out.println(num + " is an increasing number: " + isIncreasingNumber(num));
        }
    }
    
    public static String isIncreasingNumber(int number) {
        String numStr = String.valueOf(number);
        
        for (int i = 1; i < numStr.length(); i++) {
            if (numStr.charAt(i) <= numStr.charAt(i - 1)) {
                return "false";
            }
        }
        
        return "true";
    }
}

