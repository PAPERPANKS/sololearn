class myclass{
    int a,b;
    myclass(){
        a=b=0;
    }
    int print(int a,int b){
        return a+b;
    }
    public static void main(String[] args){
        String name="pankaj";
        myclass sum_obj = new myclass();
        int value = sum_obj.print(5, 7);
        System.out.println(value);
        System.out.println("hello "+name+" :) !");

    }
}
