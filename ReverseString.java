public class ReverseString {
    public static void Reversed(char[] s){
        int left = 0;
        int right = s.length-1;
        while(left < right){

            char temp = s[left];

            s[left] =  s[right];

            s[right] = temp;

            left++;right--;

        }
    }

    public static void main(String[] args){
        char[] s = {'h','e','l','l','o'};

        Reversed(s);

        for (char i : s)
        {
            System.out.print(i+" ");
        }


    }
}
