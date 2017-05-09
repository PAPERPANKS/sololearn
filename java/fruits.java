interface fan{
    static final int code=109;
    static final String name="orient";
    void get();
    void show();
}
class name{
    String p_name;
     void display(String s){
        p_name = s;
        System.out.println(p_name + " helo");
    }
}
class fruits implements fan{
    public static void main(String args[]){
        // name person = new name();
        // System.out.println("hello world still!");
        // person.display("pankaj");
        public void get(){
            Scanner input = new Scanner(System.in);
            code=input.nextInt();
            name=input.nextLine();
        }
        public void show(){
            System.out.println("code - "+code);
            System.out.println("name - "+name);
        }
    }
}