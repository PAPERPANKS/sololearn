public class tuna{
    private String name;
    tuna(){
        name="hello";
    }
    public void msg(String name){
        name=this.name;
        System.out.println(this.name);
        System.out.println(name);
        System.out.println("helllo" + name);
    }
}