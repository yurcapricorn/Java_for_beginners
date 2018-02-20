public class Calculate {
    public static void main(String[] args) {
//        for(String arg:args){
//            System.out.println("arg = " + arg);
//        }
//        System.exit(0);
        float first = Float.valueOf(args[0]);
        float second = Float.valueOf(args[2]);
        float result = 0;
        switch (args[1]) {
            case ("+"): {
                result = first + second;
                break;
            }
            case ("-"): {
                result = first - second;
                break;
            }
            case ("*"): {
                result = first * second;
                break;
            }
            case ("/"): {
                result = first / second;
                break;
            }
            case ("%"): {
                result = first % second;
                break;
            }
        }
        System.out.println(result);
    }
}
