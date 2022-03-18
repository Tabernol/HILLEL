package Den.Array;

public  class CharStack {
        public static char[] stack = new char[10];
        static int temp = 0;

        public static void push (char symbol){
            if(temp >= stack.length){
                char[] array = new char[stack.length * 2];
                for (int i = 0; i < stack.length; i++) {
                    array[i] = stack[i];
                }
                stack = array;
                //System.out.println("Array size - " + stack.length);
            }

            stack[temp] = symbol;
            temp++;
        }
        public String pop (){
            String s = new String(stack);
            return s;
        }

    public static void main(String[] args) {

    }
}
