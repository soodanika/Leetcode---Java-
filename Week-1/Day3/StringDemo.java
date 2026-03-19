class StringDemo {
    public static void main(String[] args){
        char str[] = {'h','e','l','l','o'};

        int right = str.length - 1;
        int left = 0;

        while(right > left){
            char temp = str[left];
            str[left] = str[right];
            str[right] = temp;

            left++;
            right--;
        }

        for(int i = 0; i < str.length; i++){
            System.out.print(str[i] + " ");
        }
    }
}