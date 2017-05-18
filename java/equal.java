class equal{
    public static void main(String a[]){
    String s1=new String("hello");
    String s2=s1;//equality of objects
    String s3=new String(s1);//refrences
    System.out.println(s1);
    System.out.println(s2);
    System.out.println(s3);
    
    }
}