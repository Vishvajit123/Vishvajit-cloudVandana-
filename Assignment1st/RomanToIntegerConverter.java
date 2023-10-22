public class RomanToIntegerConverter {
    public static void main(String[] args) {
        String romanNumeral = "IX";
        int integer = convertRomanToInteger(romanNumeral);
        System.out.println("Converted integer: " + integer);
    }

    public static int convertRomanToInteger(String romanNumeral) {
        int result = 0;
        int prevValue = 0;
        
        for (int i = romanNumeral.length() - 1; i >= 0; i--) {
            char currentChar = romanNumeral.charAt(i);
            int currentValue = getNumericValue(currentChar);
            
            if (currentValue < prevValue) {
                result -= currentValue;
            } else {
                result += currentValue;
            }
            
            prevValue = currentValue;
        }
        
        return result;
    }
    
    public static int getNumericValue(char romanChar) {
        switch (romanChar) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }
}

