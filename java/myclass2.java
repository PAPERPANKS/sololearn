interface intf1{
    int roll;
    String name;
};
interface intf2{
    void get();
    void put();
};
class newclass implements intf1, intf2{
    void get(){
        roll=17;
        name="pankaj";
    }
    void put(){
        System.out.println(roll);
        System.out.println(name+"\n");
    }
}
class myclass2 extends newclass{
    public static void main(String args[]){
    newclass obj = new newclass();
    obj.get();
    obj.put();
    }
}