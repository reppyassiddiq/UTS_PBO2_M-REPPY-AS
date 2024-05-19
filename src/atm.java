import java.io.*;

public class atm{

    public static void main (String [] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int i=0;
        int pilihan, pilihan2, tabung, saldo = 50000, ambil, isi, index=0, index2=0;
        int[] tambah_saldo=new int[20], tarik_saldo=new int[20];
        int biaya_pengiriman = 5000; // Biaya tambahan untuk pengiriman berbeda bank

        for(i=0; i<=2; i++){

            System.out.println("=================================================");
            System.out.println("          Selamat Datang Di ATM ALCATRAZ          ");
            System.out.println("=================================================");
            System.out.print("masukan user: ");
            String user = br.readLine();
            System.out.print("masukan password: ");
            int password = Integer.parseInt(br.readLine());

            if( (user.equalsIgnoreCase("admin")) && (password==123) ){

                System.out.println("\n               Login Berhasil              ");
                System.out.println("\n");

                i=5;


                while(true){
                    System.out.println("=================================================");
                    System.out.println("                   ATM ALCATRAZ                 ");
                    System.out.println("=================================================");
                    System.out.println("\n1.Cek Saldo");
                    System.out.println("2.Simpan Uang");
                    System.out.println("3.Ambil Uang");
                    System.out.println("4.History Transaksi Bulanan");
                    System.out.println("5. Kirim Saldo Antar Bank (Bank yang Sama)");
                    System.out.println("6. Kirim Saldo Antar Bank (Bank yang Berbeda)");
                    System.out.println("7.Help");
                    System.out.println("8.keluar");

                    System.out.print("\nPilih Menu : ");
                    pilihan = Integer.parseInt(br.readLine());
                    switch (pilihan) {
                        case 1:
                            do{
                                System.out.println("=================================================");
                                System.out.println("                    Cek Saldo                    ");
                                System.out.println("       Saldo Anda adalah Rp. " + saldo       );
                                System.out.println("=================================================");
                                System.out.println("\n1.keluar");
                                System.out.println("2.Kembali");
                                System.out.print("\nPilih Menu : ");
                                pilihan2 = Integer.parseInt(br.readLine());
                                switch (pilihan2) {
                                    case 1:
                                        System.exit(0);
                                        break;

                                }
                            }while(pilihan2!=2);
                            break;
                        case 2:
                            do{
                                System.out.println("=================================================");
                                System.out.println("   Masukan Jumlah Uang Yang Ingin Anda Simpan    ");
                                System.out.print("     Rp. ");
                                tabung = Integer.parseInt(br.readLine());
                                tambah_saldo[index]=tabung;
                                index++;
                                saldo += tabung;
                                System.out.println("  Saldo Anda adalah Rp. " + saldo);
                                System.out.println("=================================================");
                                System.out.println("\n1.keluar");
                                System.out.println("2.Kembali");
                                System.out.print("\nPilih Menu : ");
                                pilihan2 = Integer.parseInt(br.readLine());
                                switch (pilihan2) {
                                    case 1:
                                        System.exit(0);
                                        break;

                                }
                            }while(pilihan2!=2);

                            break;
                        case 3:
                            do{
                                System.out.println("=================================================");
                                System.out.println("    Masukan Jumlah Uang Yang Ingin Anda Ambil    ");
                                System.out.print("     Rp. ");
                                ambil = Integer.parseInt(br.readLine());
                                tarik_saldo[index2]=ambil;
                                index2++;
                                isi = saldo;
                                isi -= ambil;
                                if (isi <= 50000) {
                                    System.out.println("Saldo Minimal setelah pengambilan harus Rp.50000");
                                } else {
                                    saldo -= ambil;
                                    System.out.println("Saldo Anda adalah Rp. " + saldo);
                                }
                                System.out.println("=================================================");
                                System.out.println("\n1.keluar");
                                System.out.println("2.Kembali");
                                System.out.print("\nPilih Menu : ");
                                pilihan2 = Integer.parseInt(br.readLine());
                                switch (pilihan2) {
                                    case 1:
                                        System.exit(0);
                                        break;

                                }
                            }while(pilihan2!=2);
                            break;
                        case 4:
                            do{
                                System.out.println("=================================================");
                                System.out.println("                History Transaksi                ");
                                System.out.println("=================================================");
                                System.out.println("History Masukan");
                                for (int y=0; y<index; y++){
                                    System.out.println((y+1)+" "+tambah_saldo[y]);}
                                System.out.println("History Keluaran");
                                for (int z=0; z<index2; z++){
                                    System.out.println((z+1)+" "+tarik_saldo[z]);}
                                System.out.println("=================================================");
                                System.out.println("\n1.keluar");
                                System.out.println("2.Kembali");
                                System.out.print("\nPilih Menu : ");
                                pilihan2 = Integer.parseInt(br.readLine());
                                switch (pilihan2) {
                                    case 1:
                                        System.exit(0);
                                        break;

                                }
                            }while(pilihan2!=2);

                            break;
                        case 7:
                            do{
                                System.out.println("=================================================");
                                System.out.println("                      Help                       ");
                                System.out.println("=================================================");
                                System.out.println("1. Gunakan Menu ke-1 jika anda ingin melihat saldo anda");
                                System.out.println("2. Gunakan Menu ke-2 jika anda ingin mengisi saldo");
                                System.out.println("3. Gunakan Menu ke-3 jika anda ingin melakukan penarikan saldo");
                                System.out.println("4. Gunakan Menu ke-4 jika anda ingin melihat history transaksi");
                                System.out.println("5. Gunakan Menu ke-5 jika anda ingin mentransfer saldo sesama bank");
                                System.out.println("6. Gunakan Menu ke-6 jika anda ingin mentransfer saldo berbeda,\n   namun akan dikenakan biaya tambahan sebesar Rp. 5000");
                                System.out.println("7. Gunakan Menu ke-8 jika anda selesai menggunakan mesin ATM");
                                System.out.println("8. Saat penarikan, saldo minimal anda adalah Rp.50000");
                                System.out.println("9. Jika terdapat masalah pada mesin ATM hubungi 021-5437xxx");
                                System.out.println("=================================================");
                                System.out.println("\n1.keluar");
                                System.out.println("2.Kembali");
                                System.out.print("\nPilih Menu : ");
                                pilihan2 = Integer.parseInt(br.readLine());
                                switch (pilihan2) {
                                    case 1:
                                        System.exit(0);
                                        break;

                                }
                            }while(pilihan2!=2);

                            break;
                        case 8:
                            System.exit(0);
                            break;

                        case 5:
                            do {
                                System.out.println("=================================================");
                                System.out.println("          Kirim Saldo Antar Bank (Bank yang Sama)         ");
                                System.out.println("=================================================");
                                System.out.println("\n");
                                System.out.print("Masukkan jumlah saldo yang ingin dikirim: Rp. ");
                                int kirim = Integer.parseInt(br.readLine());
                                // Misalnya, tidak ada biaya tambahan untuk pengiriman ke bank yang sama
                                if (saldo >= kirim) {
                                    saldo -= kirim;
                                    System.out.println("Saldo Anda saat ini: Rp. " + saldo);
                                } else {
                                    System.out.println("Saldo Anda tidak mencukupi untuk melakukan pengiriman.");
                                }
                                System.out.println("=================================================");
                                System.out.println("\n1. Keluar");
                                System.out.println("2. Kembali");
                                System.out.print("\nPilih Menu : ");
                                pilihan2 = Integer.parseInt(br.readLine());
                                switch (pilihan2) {
                                    case 1:
                                        System.exit(0);
                                        break;
                                }
                            } while (pilihan2 != 2);
                            break;
                        case 6:
                            do {
                                System.out.println("=================================================");
                                System.out.println("          Kirim Saldo Antar Bank (Bank yang Berbeda)         ");
                                System.out.println("=================================================");
                                System.out.println("\n");
                                System.out.print("Masukkan jumlah saldo yang ingin dikirim: Rp. ");
                                int kirim = Integer.parseInt(br.readLine());
                                System.out.print("Masukkan kode bank tujuan: ");
                                String kode_bank = br.readLine();
                                // Misalnya, kita asumsikan biaya tambahan hanya berlaku jika bank tujuan bukan "Mandiri"
                                if (!kode_bank.equalsIgnoreCase("ALCATRAZA")) {
                                    kirim += biaya_pengiriman; // Menambahkan biaya tambahan pengiriman antar bank
                                }
                                if (saldo >= kirim) {
                                    saldo -= kirim;
                                    System.out.println("selamat pengiriman berhasil !!!");
                                    System.out.println("(biaya pengiriman beda bank sebesar Rp. 5000)");
                                    System.out.println("\n");
                                    System.out.println("Saldo Anda saat ini: Rp. " + saldo);
                                } else {
                                    System.out.println("Saldo Anda tidak mencukupi untuk melakukan pengiriman.");
                                }
                                System.out.println("=================================================");
                                System.out.println("\n1. Keluar");
                                System.out.println("2. Kembali");
                                System.out.print("\nPilih Menu : ");
                                pilihan2 = Integer.parseInt(br.readLine());
                                switch (pilihan2) {
                                    case 1:
                                        System.exit(0);
                                        break;
                                }
                            } while (pilihan2 != 2);
                            break;

                        default:
                            System.exit(0);
                            break;
                    }
                }

            } else {
                System.out.println("user atau password Salah silakan coba lagi");
            }



        }

    }


}
