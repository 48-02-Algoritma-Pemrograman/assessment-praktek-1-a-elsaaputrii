public class Nomor1{
    public static void main(String[] args){
        int N;
        int honorLembur= 10000;

        Scanner input = new Scanner (System.in);

        System.out.print("Masukkan jam lembur (dalam jam): ");
        N = input.nextInt();

        if (N <= 16) {
            System.out.println("mendapat honor lembur:" + (N *honorLembur));
        } else if (N >= 16) {
            System.out.println("mendapat honor lembur:" + (N *honorLembur));
        } else {
            System.out.println(" mendapat honor:" + (N *honorLembur));
        }

        honorLembur = N * 10000;
    }
}
