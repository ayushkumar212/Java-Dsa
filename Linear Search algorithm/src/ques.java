public class ques {
    public static void main(String[] args) {
        String name = "ujjwal";
        char target = 'w';
        System.out.println(names(name,target));

    }

    public static boolean names(String name , char target){
        if(name.length()==0){
            return false;
        }

        for (int i = 0; i < name.length(); i++) {
            if(target == name.charAt(i)){
                return true;
            }
        }
        return false;

    }
}
