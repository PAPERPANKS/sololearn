class name{
    String p_name;
     void display(String s){
        p_name = s;
        System.out.println(p_name + " helo");
    }
}
class fruits{
    public static void main(String args[]){
        name person = new name();
        System.out.println("hello world still!");
        person.display("pankaj");
    }
}