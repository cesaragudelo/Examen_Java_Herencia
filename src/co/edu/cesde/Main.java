package co.edu.cesde;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean parar = false;
        boolean para = false;
        boolean par = false;
        ArrayList<Watchman> watchs = new ArrayList();
        Watchman watch = new Watchman();

        ArrayList<CleaningStaff> cleans = new ArrayList();
        CleaningStaff clean = new CleaningStaff();

        ArrayList<Accountant> acounts = new ArrayList();
        Accountant acount = new Accountant();

        ArrayList<Admin> admis = new ArrayList();
        Admin admi = new Admin();
        while (!par) {
            while (!parar) {
                System.out.println("digite 1 para whatchman");
                System.out.println("digite 2 para cleaningStaf");
                System.out.println("digite 3 para Accountant");
                System.out.println("digite 4 para Admin");
                int opcion = Integer.parseInt(scanner.nextLine());
                switch (opcion) {
                    case 1:
                        System.out.println("digite neme");
                        String name = scanner.nextLine();
                        watch.setName(name);
                        System.out.println("digite identification");
                        String identification = scanner.nextLine();
                        watch.setIdentification(identification);
                        System.out.println("digite age");
                        int age = Integer.parseInt(scanner.nextLine());
                        watch.setAge(age);
                        System.out.println("digite weapon");
                        String weapon = scanner.nextLine();
                        watch.setWeapon(weapon);
                        System.out.println("digite workday");
                        String workday = scanner.nextLine();
                        watch.setWorkday(workday);
                        watchs.add(watch);
                        break;
                    case 2:
                        System.out.println("digite neme");
                        String name1 = scanner.nextLine();
                        clean.setName(name1);
                        System.out.println("digite identification");
                        String identification1 = scanner.nextLine();
                        clean.setIdentification(identification1);
                        System.out.println("digite age");
                        int age1 = Integer.parseInt(scanner.nextLine());
                        clean.setAge(age1);
                        System.out.println("digite dayOff");
                        String dayOff = scanner.nextLine();
                        clean.setDayOff(dayOff);
                        cleans.add(clean);
                        break;
                    case 3:
                        System.out.println("digite neme");
                        String name2 = scanner.nextLine();
                        acount.setName(name2);
                        System.out.println("digite identification");
                        String identification2 = scanner.nextLine();
                        acount.setIdentification(identification2);
                        System.out.println("digite age");
                        int age2 = Integer.parseInt(scanner.nextLine());
                        acount.setAge(age2);
                        System.out.println("digite leader");
                        String leader = scanner.nextLine();
                        acount.setLeader(leader);
                        System.out.println("digite parking");
                        String parking = scanner.nextLine();
                        acount.setParking(parking);
                        acounts.add(acount);
                        break;
                    case 4:
                        System.out.println("digite neme");
                        String name3 = scanner.nextLine();
                        admi.setName(name3);
                        System.out.println("digite identification");
                        String identification3 = scanner.nextLine();
                        admi.setIdentification(identification3);
                        System.out.println("digite age");
                        int age3 = Integer.parseInt(scanner.nextLine());
                        admi.setAge(age3);
                        System.out.println("digite leader");
                        String leader3 = scanner.nextLine();
                        admi.setLeader(leader3);
                        System.out.println("digite parking");
                        String parking3 = scanner.nextLine();
                        admi.setParking(parking3);
                        admis.add(admi);
                        break;

                }
                System.out.println("digite 1 si desea ingresar otro registro o 2 para finalizar");
                int stop = Integer.parseInt(scanner.nextLine());
                if (stop == 2) {
                    parar = true;
                }
            }
            while (!para) {
                System.out.println("digite 1 para imprimir whatchman");
                System.out.println("digite 2 para imprimir cleaningStaf");
                System.out.println("digite 3 para imprimir Accountant");
                System.out.println("digite 4 para imprimir Admin");
                int opcion2 = Integer.parseInt(scanner.nextLine());
                switch (opcion2) {
                    case 1:
                        for (int i = 0; i < watchs.size(); i++) {
                            System.out.println("name " + watchs.get(i).getName());
                            System.out.println("identification " + watchs.get(i).getIdentification());
                            System.out.println("age " + watchs.get(i).getAge());
                            System.out.println("weapone " + watchs.get(i).getWeapon());
                            System.out.println("workday " + watchs.get(i).getWorkday());
                        }
                        break;
                    case 2:
                        for (int j = 0; j < cleans.size(); j++) {
                            System.out.println("name " + cleans.get(j).getName());
                            System.out.println("identification " + cleans.get(j).getIdentification());
                            System.out.println("age " + cleans.get(j).getAge());
                            System.out.println("dayOff " + cleans.get(j).getDayOff());
                        }
                        break;
                    case 3:
                        for (int k = 0; k < acounts.size(); k++) {
                            System.out.println("name " + acounts.get(k).getName());
                            System.out.println("identification " + acounts.get(k).getIdentification());
                            System.out.println("age " + acounts.get(k).getAge());
                            System.out.println("leader " + acounts.get(k).getLeader());
                            System.out.println("parking " + acounts.get(k).getParking());
                        }
                        break;
                    case 4:
                        for (int l = 0; l < acounts.size(); l++) {
                            System.out.println("name " + admis.get(l).getName());
                            System.out.println("identification " + admis.get(l).getIdentification());
                            System.out.println("age " + admis.get(l).getAge());
                            System.out.println("leader " + admis.get(l).getLeader());
                            System.out.println("parking " + admis.get(l).getParking());
                        }
                        break;

                }
                System.out.println("digite 1 si desea imprimir otro registro de datos o 2 para finalizar");
                int sto = Integer.parseInt(scanner.nextLine());
                if (sto == 2) {
                    para = true;
                }
            }
            System.out.println("1 si desea ingresar mas registros 2 para finalizar");
            int st = Integer.parseInt(scanner.nextLine());
            if (st == 2) {
                par = true;
            } else if (st == 1) {
                parar = false;
                para= false;
            }
        }
    }
}


