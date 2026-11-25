package listrik;

import java.util.Scanner;
public class tarifListrik {
    public static double[] tagihanListrik(int kwh, int golongan) {
        double biayaPemakaian,total,ppj,tarifPerkwh;
        String va;
        int biayaAdmin = 3000;

        switch (golongan) {
            case 1 :
                biayaPemakaian = kwh * 415;
                ppj = biayaPemakaian * 0.024;
                total = biayaPemakaian + ppj + biayaAdmin;
                tarifPerkwh = 415;
                va = ("450 VA");
                break;
            case 2 :
                biayaPemakaian = kwh * 605;
                ppj = biayaPemakaian * 0.024;
                total = biayaPemakaian + ppj + biayaAdmin;
                tarifPerkwh = 605;
                va = ("900 VA (Subsidi)");
                break;
            case 3 :
                biayaPemakaian = kwh * 1352;
                ppj = biayaPemakaian * 0.024;
                total = biayaPemakaian + ppj + biayaAdmin;
                tarifPerkwh = 1352;
                va = ("900 VA (Rumah Tangga Mampu/RTM)");
                break;
            case 4 :
                biayaPemakaian = kwh * 1444.70;
                ppj = biayaPemakaian * 0.024;
                total = biayaPemakaian + ppj + biayaAdmin;
                tarifPerkwh = 1444.70;
                va = ("1300 VA");
                break;
            case 5 :
                biayaPemakaian = kwh * 1444.70;
                ppj = biayaPemakaian * 0.024;
                total = biayaPemakaian + ppj + biayaAdmin;
                tarifPerkwh = 1444.70;
                va = ("2200 VA");
                break;
            case 6 :
                biayaPemakaian = kwh * 1699.53;
                ppj = biayaPemakaian * 0.024;
                total = biayaPemakaian + ppj + biayaAdmin;
                tarifPerkwh = 1699.53;
                va = (">3500 VA");
                break;
            default:
                System.out.println("Input angka yang anda masukkan tidak valid");
                return new double[]{0, 0, 0, 0, 0};
        }

                System.out.println("===== RINCIAN TAGIHAN =====");
                System.out.println("Golongan        : "+ va);
                System.out.println("Pemakaian       : "+ kwh);
                System.out.println("Tarif per kWh   : Rp"+ tarifPerkwh);
                System.out.println("Biaya Pemakaian : Rp"+ biayaPemakaian);
                System.out.println("PPJ(2,4%)        : Rp"+ ppj);
                System.out.println("Biaya Admin     : Rp"+ biayaAdmin);
                System.out.println("---------------------------");
                System.out.println("Total Tagihan   : Rp"+total);
                return  new double[]{tarifPerkwh, biayaPemakaian, ppj, biayaAdmin, total};
    }

    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan pemakaian listik anda (kWh) : ");
        int pakaiKwh = input.nextInt();
        if (pakaiKwh < 0) {
            System.out.println("Input yang dimasukkan tidak valid");
        }
        System.out.println("Pilihan Golongan");
        System.out.println("1. 450 VA");
        System.out.println("2. 900 VA (Subsidi)");
        System.out.println("3. 900 VA (Rumah Tangga Mampu)");
        System.out.println("4. 1300 VA");
        System.out.println("5. 2200 VA");
        System.out.println("6. >3500 VA");
        System.out.println("Masukkan Golongan Anda :");
        int pilihanGolongan = input.nextInt();

        tagihanListrik(pakaiKwh,pilihanGolongan);
        input.close();
    }

}