class Test{
    public static void main(String args[]){
        char c = 65;
        System.out.println(c);
        System.out.println((int)c);

        // char ch = c+1;  //possible lossy conversion from int to char

        // char ch = 70000;  //possible lossy conversion from int to char
        // System.out.println(ch);
        System.out.println((int)('\n'));  //10
        char nextLine = '\n';
        System.out.print(nextLine);
        int i = 1 + '\n';  // 1 + 10 = 11
        System.out.println(i);

        // char ch = '';  //error: empty character literal

        // char chh = 'A' + 1;  // no error
        char c1 = 'a';
        char c2 = 'b';
        // char res = c1 + c2;  //error: incompatible types: possible lossy conversion from int to char
        // System.out.println(res);
    }
}