public class Main {
    public static void main(String[] args) {
        int [] sales=new int[3];
        SalesManager salesManager=new SalesManager(sales);
        System.out.println(salesManager.max());

    }
}