public class Nomor2{
    public static void main(String[] args){
        String namaDrive, Beliau, Mereka, Kita;
        int lamaTrip;
        int totalOmzet;
        int totaltrip = 13000;

        Scanner scanner = new Scanner(System.in);

        System.out.print("masukan nama drive");
        namaDrive = scanner.next();
        System.out.print("masukan lama trip");
        lamaTrip = scanner.nextInt();
        totaltrip = scanner.nextInt();


        if (namaDrive.equals("Beliau")) {
            totaltrip =13000;
        }

        else if (namaDrive.equals("Mereka")) {
            totaltrip = 13000;
        }

        else if (namaDrive.equals("Kita")) {
            totaltrip = 30000;
        }

        totalOmzet = lamaTrip *totaltrip;
        totaltrip = lamaTrip *13000;

    }
}
