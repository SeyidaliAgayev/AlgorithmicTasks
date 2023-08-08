

public class Main {
    public static void main(String[] args) {
        System.out.println("hello world!");
        System.out.println("hello world");
        // Tek ve cut reqemleri cap eden proqram:
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter the number limit: ");
//
//        int limit = scanner.nextInt();
//
//        for (int i = 2; i <limit; i++) {
//            if (i % 2 == 0) {
//                System.out.println("Even Numbers: " + i);
//            } else if (i % 2 == 1) {
//                System.out.println("Odd Numbers: " + i);
//            }
//        }

        // Daxil edilmis ededin reqemlerinin cemini tapan proqram:
//        Scanner scanner1 = new Scanner(System.in);
//        System.out.println("Enter the number: ");
//        int number = scanner1.nextInt();
//        int a = number / 100;
//        int b = number % 10;
//        int c = (number / 10) % 10;
//        System.out.println(a + b +c);

        // Daxil edilmis ededin sade ve murekkeb oldugunu yoxlayan proqram:
//        Scanner scanner2 = new Scanner(System.in);
//        System.out.println("Enter the number: ");
//        int numbers = scanner2.nextInt();
//
//        boolean isPrime = true;
//        if (numbers < 2) {
//            isPrime = false;
//        } else {
//            for (int i = 2; i <= Math.sqrt(numbers); i++) {
//                if (numbers % i == 0) {
//                    isPrime = false;
//                    break;
//                }
//            }
//        }
//
//        if (isPrime) {
//            System.out.println(numbers + " is prime!");
//        } else {
//            System.out.println(numbers + " is not prime!");
//        }
//
//        // Daxil edilmis sozun tersi ile duzunun eyniliyini yoxlayan proqram:
//        Scanner scanner3 = new Scanner(System.in);
//        System.out.println("Enter the word: ");
//        String word = scanner3.nextLine();
//        String[] words = word.split("");
//        String reverseWords = "";
//
//        for (int i = words.length - 1; i >= 0 ; i--) {
//            reverseWords += words[i];
//        }
//        System.out.println("Original word is: " + word);
//        System.out.println("Reverse version of word is: " + reverseWords);
//
//        if (word.equals(reverseWords)) {
//            System.out.println("Original word and reverse version of word is the same!");
//        } else {
//            System.out.println("Original word and reverse version of word is not the same!");
//        }

        //Daxil edilmis sozde her bir herfden nece defe istifade olundugunu gosteren proqram:
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter the word: ");
//        String word = scanner.nextLine();
//        int[] charCount = new int[26];
//
//        for (int i = 0; i < word.length(); i++) {
//            char c = word.charAt(i);
//            if (c >= 'a' && c <= 'z') {
//                charCount[c - 'a']++;
//            }
//        }
//
//        for (char c = 'a'; c <= 'z' ; c++) {
//            int count = charCount[c - 'a'];
//            if (count > 0) {
//                System.out.println("Character: " + c + ", Count: " + count);
//            }
//        }

        // Sait ve samitin sayini hesablayan proqram:
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter the word: ");
//        String word = scanner.nextLine();
//
//        int vowelCount = 0;
//        int consonantCount = 0;
//
//        for (int i = 0; i < word.length(); i++) {
//         char c = Character.toLowerCase(word.charAt(i));
//         if (c >= 'a' && c <= 'z'){
//             if (isVowel(c)) {
//                 vowelCount++;
//             } else {
//                 consonantCount++;
//             }
//         }
//        }
//        System.out.println("Number of vowels: " + vowelCount);
//        System.out.println("Number of consonants: " + consonantCount);
//    }
//    public static boolean isVowel(char c) {
//        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
//        c = Character.toLowerCase(c);
//        for (int i = 0; i < vowels.length; i++) {
//            if (c == vowels[i]) {
//                return true;
//            }
//        }
//        return false;
//    }
//
        // Her bir reqemin kvadratini hesablayan proqram:
//        String str = "        1,e 6,e 0,e 9,e        ";
//        str = str.trim();
//        str = str.replace(" ","");
//        String[] stringArray = str.split(",e");
//        for (int i = 0; i < stringArray.length; i++) {
//            int B = Integer.parseInt(stringArray[i]);
//            System.out.println(Math.pow(B,2));
//        }
//
        // Ucuncu deyisen istifade etmeden iki deyiseni bir biri ile deyisen proqram:
//        int a = 5;
//        int b = 10;
//        a = a + b;
//        b = a - b;
//        a = a - b;
//        System.out.println(a);
//        System.out.println(b);
//
        //Yazilan setri vergul ve bosluqlarla cap eden proqram:
//        String numbers = "1,2,3,4,5,6,7,8,9";
//        numbers = numbers.replace(",",", ");
//        System.out.println(numbers);


        // Username ve sifre yoxlayan proqram:
//        Checker checker = new Checker();
//        Checker.usernameChecker();

        // casting:
//        int a = 5;
//        double b = (double)a;
//        System.out.println(b);

        // Daxil edilen ededlerin son reqemlerinin cemini tapan proqram:
//        int a = 45;
//        int b = 56;
//        int c = a%10;
//        int d = b%10;
//        System.out.println(c+d);

        // String tipinde daxil edilmis deyeri int tipine ceviren proqram:
//        String str = "45";
//        int a = Integer.parseInt(str);
//        System.out.println(a);



        // Setirde tekrarlanan reqemin olub olmadigini yoxlayan proqram:
        int[] array = {1,2,3,1};
        boolean found = false;

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]){
                    found = true;
                }
            }
        }

        if (found) {
            System.out.println("The same numbers have found!");
        } else {
            System.out.println("The same numbers have not found!");
        }

        // Daxil edilen setrde reqemlerin artma sirasi ile duzulduyunu yoxlayan proqram:
//        int[] intArray = {5,7,7,9};
//        boolean increased = false;
//        for (int i = 0; i < intArray.length - 1; i++) {
//            if (intArray[i + 1] == (intArray[i] + 1)){
//                increased = true;
//                break;
//            }
//        }
//        if (increased) {
//            System.out.println("Numbers are increasing!");
//        } else {
//            System.out.println("Numbers are not increasing!");
//        }

        //Recursion vasitesile faktorial tapilmasi:
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Which factorial of number you want to find: ");
//
//        System.out.println("Factorial of number which you entered is: " + factorial(scanner.nextInt()));

        // 2lik say sistemindeki ededi 10luq say sistemine ceviren proqram:
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter number to convert: ");
//        String binaryArray = sc.nextLine();
//
//        int decimalNumber = 0;
//        int power = 0;
//
//        for (int i = 0; i < binaryArray.length(); i++) {
//            char binaryDigit = binaryArray.charAt(i);
//            int digitValue = binaryDigit - '0';
//
//            decimalNumber += digitValue * Math.pow(2,power);
//            power++;
//        }
//        System.out.println("Decimal format of number is: " + decimalNumber);

        //Daxil edilmis deqiqeni il ve gune ceviren proqram:
//        Scanner sc1 = new Scanner(System.in);
//        System.out.println("Enter minutes: ");
//        int minutes = sc1.nextInt();
//        int years = minutes / 525600;
//        int days = (minutes % 525600) / 1440;
//        System.out.println(minutes + " minutes is " + years + " years and " + days + " days ");

        // Vurma cedveli:
//        Scanner numberScanner = new Scanner(System.in);
//        System.out.println("Input number: ");
//        int num = numberScanner.nextInt();
//        for (int i = 1; i <= 10; i++) {
//            int result = num * i;
//            System.out.println(num + "*" + i + "=" + result);
//        }

        // 10luq ededi 16liga ceviren proqram:
//        Scanner formatScanner = new Scanner(System.in);
//        System.out.println("Enter decimal number: ");
//        int decimalNumber = formatScanner.nextInt();
//            int result = decimalNumber / 16;
//            int remainedResult = decimalNumber % 16;
//            if (remainedResult <= 10) {
//                System.out.println("Hexadecimal format is: " + result + "(" + remainedResult + ")");
//            } else {
//                switch (remainedResult){
//                        case 10:
//                            String remain = "A";
//                            System.out.println("Hexadecimal format is: " + result + "(" + remain + ")");
//                            break;
//                        case 11:
//                            String remain1 = "B";
//                            System.out.println("Hexadecimal format is: " + result + "(" + remain1 + ")");
//                            break;
//                        case 12:
//                            String remain2 = "C";
//                            System.out.println("Hexadecimal format is: " + result + "(" + remain2 + ")");
//                            break;
//                        case 13:
//                            String remain3 = "D";
//                            System.out.println("Hexadecimal format is: " + result + "(" + remain3 + ")");
//                            break;
//                        case 14:
//                            String remain4 = "E";
//                            System.out.println("Hexadecimal format is: " + result + "(" + remain4 + ")");
//                            break;
//                        case 15:
//                            String remain5 = "F";
//                            System.out.println("Hexadecimal format is: " + result + "(" + remain5 + ")");
//                            break;
//                    }
//                }


        // Sozu ve daxil edilmis say qeder chari birlesdiren proqram:
//        System.out.println(foo("Soz", 'c', 5));

        // Kicik herfleri boyuk ve eksine ceviren proqram:
        String str1 = "helloWORLD";
        String firstPart = str1.substring(0, 5);
        String secondPart = str1.substring(5);
        String result1 = firstPart.toUpperCase() + secondPart.toLowerCase();
        System.out.println(result1);



    }
    public static String foo(String s, char c, int count){
        for (int i = 0; i < count; i++) {
            s = s + c;
        }
        return s;
    }
    public static int factorial(int n) {
        if (n == 1){
            return 1;
        } else {
            return (n * factorial(n-1));
        }
    }
}