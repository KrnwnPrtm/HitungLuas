public class Solution {
    public static void main(String[] args) {

        PersegiPanjang bd1 = new PersegiPanjang(10, 20);

        System.out.println(bd1.getLuas());

        Lingkaran bd2 = new Lingkaran(7);

        System.out.println(bd2.getLuas());
        
        Segitiga bd3 = new Segitiga(10, 30);

        System.out.println(bd3.getLuas());
    }
}
