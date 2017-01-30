package com.company.siva;

import java.io.*;
import java.util.*;

public class Main {

    public static String filenumber = "50";

    public static void main(String[] args) throws IOException {

//        File f = new File("/Users/sivakiran/masters_project/cabspottingdata/new_abboip.txt");
//
//        dropoffs(f);
//        pickups(f);
//        dropoffsGrid(f);
//        pickupsGrid(f);
//        trajectoryGrid(f);
//
//        File folder = new File("/Users/sivakiran/masters_project/cabspottingdata/");
//        File[] listOfFiles = folder.listFiles();
//
//        float foundMaxLat, foundMinLong, foundMinLat, foundMaxLong;
//
//        float[] borders = {0,0,40,-130};
//
//        assert listOfFiles != null;
//        for (File file : listOfFiles) {
//            if (file.isFile()) {
//                float[] comparer = borderVals(file);
//                if(comparer[0]>borders[0]){
//                    borders[0]=comparer[0];
//                }
//                if(comparer[1]<borders[1]){
//                    borders[1]=comparer[1];
//                }
//                if(comparer[2]<borders[2]){
//                    borders[2]=comparer[2];
//                }
//                if(comparer[3]>borders[3]){
//                    borders[3]=comparer[3];
//                }
//            }
//        }
//
//        for (float val: borders) {
//            System.out.println(val);
//        }

//        alltrajectoryGrid();

//        filecreationcommand();

//        for (int i=0;i<=535;i++) {
//            filenumber = String.valueOf(i);
//            File f = new File("/Users/sivakiran/masters_project/texted/" + filenumber + ".txt");
////
//            traces(f);
//        }

//        for (int i=0;i<=535;i++) {
//            filenumber = String.valueOf(i);
//            File f = new File("/Users/sivakiran/masters_project/texted/" + filenumber + ".txt");
////
//            traces_unchanged(f);
//        }

//        listceate();

////
        double average = 0;
        double score = 0;
        for (int i=0; i<100; i++){
            score = score+ibat();
        }

        average = score/100;
//
        System.out.println("No of of Anomalous is "+average);

//        ibatFalseAlarm();

//        ibat();

//        System.out.println(count);
//

//        File f = new File("/Users/sivakiran/masters_project/p_11_32_14_33.txt");
//        mapperPrinter(f);
    }

    private static int ibatFalseAlarm() throws IOException {
        List<String[]> set = new ArrayList<>();


//        File f = new File("/Users/sivakiran/masters_project/p_5_34_13_33.txt");
//        File f = new File("/Users/sivakiran/masters_project/p_13_33_4_32.txt");
        File f = new File("/Users/sivakiran/masters_project/p_11_32_14_33.txt");
        BufferedReader br = new BufferedReader(new FileReader(f));
        String line;

        while ((line=br.readLine())!=null){
            String[] a = new String[line.split(",").length-1];
            for (int i=0; i<line.split(",").length-1;i++) {
                a[i] = line.split(",")[i];
            }
            set.add(a);
        }

        String[] a = {"p 5 34","p 5 34","p 6 34","p 8 35","p 9 33","p 9 32","p 9 32","p 9 32","p 10 32","p 12 32","p 13 32","p 14 32","p 13 33"};
        String[] b = {"p 5 34","p 5 34","p 6 34","p 9 35","p 9 34","p 10 34","p 12 34","p 12 34","p 13 33","p 13 33"};
        String[] c = {"p 5 34","p 7 34","p 9 34","p 10 34","p 12 33","p 12 32","p 13 32","p 13 33"};
        String[] d = {"p 5 34","p 6 34","p 7 34","p 9 35","p 10 35","p 11 35","p 12 34","p 12 34","p 12 32","p 13 32","p 13 33","p 13 33"};
        String[] e = {"p 5 34","p 5 34","p 6 34","p 8 34","p 9 35","p 11 35","p 11 35","p 12 34","p 12 34","p 12 33","p 12 32","p 13 32","p 13 32","p 13 33"};
//        String[] f = {"p 5 34","p 5 34","p 6 34","p 7 35","p 8 36","p 9 34","p 10 34","p 12 34","p 13 34","p 13 33","p 13 33","p 13 33"};
        String[] g = {"p 5 34","p 5 34","p 5 33","p 5 32","p 6 31","p 7 31","p 8 31","p 9 31","p 11 32","p 12 32","p 13 32","p 13 33","p 13 33"};
        String[] h = {"p 5 34","p 5 34","p 6 35","p 8 36","p 8 36","p 8 35","p 9 34","p 9 32","p 10 32","p 10 32","p 11 33","p 12 33","p 13 33","p 13 33"};
//        String[] i = {"p 5 34","p 6 34","p 7 34","p 9 34","p 9 34","p 11 34","p 11 34","p 11 33","p 11 32","p 12 32","p 13 32","p 13 33"};
        String[] j = {"p 5 34","p 5 34","p 7 34","p 9 34","p 9 34","p 11 34","p 11 33","p 12 33","p 12 32","p 13 32","p 13 33"};
//        String[] k = {"p 5 34","p 5 34","p 6 34","p 9 35","p 10 35","p 12 35","p 12 34","p 12 34","p 12 34","p 13 33"};
//        String[] l = {"p 5 34","p 5 34","p 6 34","p 6 34","p 9 35","p 11 34","p 11 32","p 12 32","p 13 33","p 13 33","p 13 33"};
        String[] o = {"p 5 34","p 6 34","p 9 34","p 10 34","p 11 34","p 13 34","p 13 33"};
        String[] p = {"p 5 34","p 6 34","p 6 35","p 8 36","p 10 37","p 11 37","p 11 36","p 12 36","p 13 35","p 14 34","p 14 33","p 13 33"};

        float bigLat = 37.820000f;
        float smallLon = -122.525000f;

        for (String[] trace : set) {
            for (int i=0;i<trace.length;i++) {
                float x=0;
                float y=0;
                if (trace[i].split(" ").length>1) {
                    x = Float.parseFloat(trace[i].split(" ")[0]);
                    y = Float.parseFloat(trace[i].split(" ")[1]);
                }

                float mainLat;
                float mainLong;
                mainLat = bigLat;
                for (int k = 0; k < 50; k++) {

                    mainLat = mainLat - 0.0012f * 2;
                    mainLong = smallLon;

                    for (int l = 0; l < 50; l++) {


                        mainLong = mainLong + 0.00175f * 2;

                        if (x > mainLat && y < mainLong && x <= mainLat + 0.0012f * 2 && y >= mainLong - 0.00175f * 2) {
//                        System.out.print("p" + " " + k + " " + l + ",");

                            trace[i]="p" + " " + k + " " + l;
                        }


                    }
                }

            }

        }
        int count=0;

        for (int kar=0;kar<1000;kar++) {


                int[] n = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
                int m = 20;
                double unsuccessful = 1;

            //clearly normal paths
//            String[] t = {"p 5 34","p 6 34","p 9 34","p 10 34","p 11 34","p 13 34","p 13 33", ""};
//
//
//            String[] t = {"p 11 32","p 13 34","p 14 33","p 11 32","p 13 34","p 11 34","p 14 33", "p 13 34"};
//
//
//            String[] t = {"p 4 32","p 5 32","p 6 32","p 10 34","p 11 34","p 13 34","p 13 33"};


            // clearly anomalous paths

//            String[] t = {"p 6 35","p 8 36","p 10 37","p 11 37","p 11 36","p 12 36","p 13 35","p 14 34","p 14 33","p 13 33"};

            String[] t = {"p 11 32","p 11 32", "p 1 4", "p 9 9", "p 12 3","p 6 34","p 9 34","p 11 34","p 13 33","p 13 33","p 14 33"};

//            String[] t = {"p 5 32","p 6 34","p 9 34","p 10 34","p 11 34","p 13 34","p 13 33", "p 4 1", "p 3 1"};
//


            Random random = new Random();

                List<String[]> selected = new ArrayList<>();

                float average = 1;

//        System.out.print("ANOMALY VECTOR: {");

                for (int x = 0; x < m; x++) {
                    List<String[]> subSample = pickRandom(set, 30);

                    int pp = 0;
                    while (pp < 8) {
                        n[x] = n[x] + 1;
                        int index = 0;

                        index = random.nextInt(t.length);

                        String randomCell = t[index];
                        for (int z = 0; z < subSample.size(); z++) {
                            int ppp = 0;
                            for (int y = 0; y < subSample.get(z).length; y++) {

                                if (Objects.equals(subSample.get(z)[y], randomCell)) {

                                    ppp++;
                                    break;
                                }

                            }
                            if (ppp != 0) {
                                pp++;
                                break;
                            } else {
                                average = (average + 1) / 2;
                                average++;
                            }
                        }


                    unsuccessful = unsuccessful + n[x];

                }

//        System.out.println("}");

                unsuccessful = unsuccessful - 20*30;
//        System.out.println("BEFORE UN "+unsuccessful);

                unsuccessful = (2 * (Math.log(unsuccessful) + 0.57721566) * (unsuccessful - 1) - 2 * (unsuccessful - 1)) / unsuccessful;

                double v = average / (unsuccessful);

//        System.out.println("AFTER UN "+unsuccessful);

                double anomalyScore = Math.pow(2, -v);
                if (anomalyScore > 0.8) {
                    count++;
                }

            }

        }
        System.out.println(count);

        return count;

    }

    private static void mapperPrinter(File f) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(f));
        String line;
        while ((line=br.readLine())!=null){
            System.out.println("type\t"+"latitude\t"+"longitude");
            if (line.split(",").length>0) {
                for (int i = 0; i < line.split(",").length - 1; i++) {
                    if (line.split(",")[i].split(" ").length>1)
                    System.out.println("T\t" + line.split(",")[i].split(" ")[0] + "\t" + line.split(",")[i].split(" ")[1]);
                }
            }

            System.out.println();
        }
    }




    private static void listceate() throws IOException {
        File f = new File("/Users/sivakiran/masters_project/test_trajectories.txt");
        BufferedReader br = new BufferedReader(new FileReader(f));
        String line;
        List a = new ArrayList();
        while ((line=br.readLine())!=null){
            for (int i = 0; i<line.split(",").length-1;i++){
                a.add(i,"\""+line.split(",")[i]+"\"");
                System.out.print(a.get(i)+",");
            }
            System.out.println();
        }
    }

    private static int ibat() throws IOException {

        List<String[]> set = new ArrayList<>();


        File f = new File("/Users/sivakiran/masters_project/p_13_33_4_32.txt");
        BufferedReader br = new BufferedReader(new FileReader(f));
        String line;

        while ((line=br.readLine())!=null){
            String[] a = new String[line.split(",").length-1];
            for (int i=0; i<line.split(",").length-1;i++) {
                a[i] = line.split(",")[i];
            }
            set.add(a);
        }

        String[] a = {"p 5 34","p 5 34","p 6 34","p 8 35","p 9 33","p 9 32","p 9 32","p 9 32","p 10 32","p 12 32","p 13 32","p 14 32","p 13 33"};
        String[] b = {"p 5 34","p 5 34","p 6 34","p 9 35","p 9 34","p 10 34","p 12 34","p 12 34","p 13 33","p 13 33"};
        String[] c = {"p 5 34","p 7 34","p 9 34","p 10 34","p 12 33","p 12 32","p 13 32","p 13 33"};
        String[] d = {"p 5 34","p 6 34","p 7 34","p 9 35","p 10 35","p 11 35","p 12 34","p 12 34","p 12 32","p 13 32","p 13 33","p 13 33"};
        String[] e = {"p 5 34","p 5 34","p 6 34","p 8 34","p 9 35","p 11 35","p 11 35","p 12 34","p 12 34","p 12 33","p 12 32","p 13 32","p 13 32","p 13 33"};
//        String[] f = {"p 5 34","p 5 34","p 6 34","p 7 35","p 8 36","p 9 34","p 10 34","p 12 34","p 13 34","p 13 33","p 13 33","p 13 33"};
        String[] g = {"p 5 34","p 5 34","p 5 33","p 5 32","p 6 31","p 7 31","p 8 31","p 9 31","p 11 32","p 12 32","p 13 32","p 13 33","p 13 33"};
        String[] h = {"p 5 34","p 5 34","p 6 35","p 8 36","p 8 36","p 8 35","p 9 34","p 9 32","p 10 32","p 10 32","p 11 33","p 12 33","p 13 33","p 13 33"};
//        String[] i = {"p 5 34","p 6 34","p 7 34","p 9 34","p 9 34","p 11 34","p 11 34","p 11 33","p 11 32","p 12 32","p 13 32","p 13 33"};
        String[] j = {"p 5 34","p 5 34","p 7 34","p 9 34","p 9 34","p 11 34","p 11 33","p 12 33","p 12 32","p 13 32","p 13 33"};
//        String[] k = {"p 5 34","p 5 34","p 6 34","p 9 35","p 10 35","p 12 35","p 12 34","p 12 34","p 12 34","p 13 33"};
//        String[] l = {"p 5 34","p 5 34","p 6 34","p 6 34","p 9 35","p 11 34","p 11 32","p 12 32","p 13 33","p 13 33","p 13 33"};
        String[] o = {"p 5 34","p 6 34","p 9 34","p 10 34","p 11 34","p 13 34","p 13 33"};
        String[] p = {"p 5 34","p 6 34","p 6 35","p 8 36","p 10 37","p 11 37","p 11 36","p 12 36","p 13 35","p 14 34","p 14 33","p 13 33"};
//
//        String[] t = g;
//
//        set.add(a);
//        set.add(b);
//        set.add(c);
//        set.add(d);
//        set.add(e);
//        set.add(f);
//        set.add(g);
//        set.add(h);
//        set.add(i);
//        set.add(j);
//        set.add(k);
//        set.add(l);
//        set.add(o);
//        set.add(p);
        float bigLat = 37.820000f;
        float smallLon = -122.525000f;

        for (String[] trace : set) {
            for (int i=0;i<trace.length;i++) {
                float x=0;
                float y=0;
                if (trace[i].split(" ").length>1) {
                    x = Float.parseFloat(trace[i].split(" ")[0]);
                    y = Float.parseFloat(trace[i].split(" ")[1]);
                }

                float mainLat;
                float mainLong;
                mainLat = bigLat;
                for (int k = 0; k < 50; k++) {

                    mainLat = mainLat - 0.0012f * 2;
                    mainLong = smallLon;

                    for (int l = 0; l < 50; l++) {


                        mainLong = mainLong + 0.00175f * 2;

                        if (x > mainLat && y < mainLong && x <= mainLat + 0.0012f * 2 && y >= mainLong - 0.00175f * 2) {
//                        System.out.print("p" + " " + k + " " + l + ",");

                            trace[i]="p" + " " + k + " " + l;
                        }


                    }
                }

            }

        }
        int count=0;

        for (int kar=0;kar<set.size();kar++) {
            if (set.get(kar).length>0) {

//                System.out.println(Arrays.toString(set.get(kar)));

                int[] n = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
                int m = 20;
                double unsuccessful = 1;

                String[] t = set.get(kar);

                Random random = new Random();

                List<String[]> selected = new ArrayList<>();

                float average = 1;

//        System.out.print("ANOMALY VECTOR: {");

                for (int x = 0; x < m; x++) {
                    List<String[]> subSample = pickRandom(set, 20);

                    int pp = 0;
                    while (pp < 8) {
                        n[x] = n[x] + 1;
                        int index = 0;

                        index = random.nextInt(t.length);

                        String randomCell = t[index];
                        for (int z = 0; z < subSample.size(); z++) {
                            int ppp = 0;
                            for (int y = 0; y < subSample.get(z).length; y++) {

                                if (Objects.equals(subSample.get(z)[y], randomCell)) {

                                    ppp++;
                                    break;
                                }

                            }
                            if (ppp != 0) {
                                pp++;
                                break;
                            } else {
                                average = (average + 1) / 2;
                                average++;
                            }
                        }
                    }

                    unsuccessful = unsuccessful + n[x];

                }

//        System.out.println("}");

                unsuccessful = unsuccessful - 20*20;
//        System.out.println("BEFORE UN "+unsuccessful);

                unsuccessful = (2 * (Math.log(unsuccessful) + 0.57721566) * (unsuccessful - 1) - 2 * (unsuccessful - 1)) / unsuccessful;

                double v = average / (unsuccessful);

//        System.out.println("AFTER UN "+unsuccessful);

                double anomalyScore = Math.pow(2, -v);
                if (anomalyScore > 0.5) {
//                    System.out.println("ANOMALY SCORE: " + anomalyScore + " for " + Arrays.toString(set.get(kar)));
                    count++;
                }

            }

        }
        System.out.println(count);

        return count;


    }

    private static List<String[]> pickRandom(List<String[]> lst, int n) {
        List<String[]> copy = new ArrayList<>(lst);
        Collections.shuffle(copy);
        return copy.subList(0, n);
    }

    private static void traces_unchanged(File fin) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader(fin));
        BufferedReader br2 = new BufferedReader(new FileReader(fin));

        PrintWriter writer = new PrintWriter("/Users/sivakiran/masters_project/traces_unchanged_500/"+filenumber+".txt", "UTF-8");

        String line = null;
        String line2 = null;
        List<Coord> traces = new ArrayList<>();
        int i = 0;
        while ((line = br.readLine()) != null) {
            if (line.split(" ")[2].equals("1")) {
                traces.add(i, new Coord(Float.valueOf(line.split(" ")[0]), Float.valueOf(line.split(" ")[1])));
                i++;
            } else if (line2 != null && line.split(" ")[2].equals("0") && !line2.split(" ")[2].equals("0")) {
                traces.add(i, new Coord(0f, 0f));
                i++;
            }
            line2 = br2.readLine();
        }

        float bigLat = 37.820000f;
        float smallLon = -122.525000f;

        int c = 1;

        for (Coord trace : traces) {


            float x = trace.getX();
            float y = trace.getY();

            float mainLat;
            float mainLong;
            mainLat = bigLat;
            for (int k = 0; k < 50; k++) {

                mainLat = mainLat - 0.0012f * 2;
                mainLong = smallLon;

                for (int l = 0; l < 50; l++) {


                    mainLong = mainLong + 0.00175f * 2;

                    if (x > mainLat && y < mainLong && x <= mainLat + 0.0012f * 2 && y >= mainLong - 0.00175f * 2) {
//                        System.out.print("p" + " " + k + " " + l + ",");

                        writer.print(x +" "+y+ ",");
                    }


                }
            }
            if (x == 0f) {
//                System.out.println("-"+"t."+filenumber+"." + c);
                writer.println("-"+"t_"+filenumber+"_" + c);
                c++;
            }

        }

        writer.close();
    }

    // FOR TRACES FOLDER - outputs the path followed by the taxi for particular trip id.

    private static void traces(File fin) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader(fin));
        BufferedReader br2 = new BufferedReader(new FileReader(fin));

        PrintWriter writer = new PrintWriter("/Users/sivakiran/masters_project/traces_500/"+filenumber+".txt", "UTF-8");

        String line = null;
        String line2 = null;
        List<Coord> traces = new ArrayList<>();
        int i = 0;
        while ((line = br.readLine()) != null) {
            if (line.split(" ")[2].equals("1")) {
                traces.add(i, new Coord(Float.valueOf(line.split(" ")[0]), Float.valueOf(line.split(" ")[1])));
                i++;
            } else if (line2 != null && line.split(" ")[2].equals("0") && !line2.split(" ")[2].equals("0")) {
                traces.add(i, new Coord(0f, 0f));
                i++;
            }
            line2 = br2.readLine();
        }

        float bigLat = 37.820000f;
        float smallLon = -122.525000f;

        int c = 1;

        for (Coord trace : traces) {


            float x = trace.getX();
            float y = trace.getY();

            float mainLat;
            float mainLong;
            mainLat = bigLat;
            for (int k = 0; k < 50; k++) {

                mainLat = mainLat - 0.0012f * 2;
                mainLong = smallLon;

                for (int l = 0; l < 50; l++) {


                    mainLong = mainLong + 0.00175f * 2;

                    if (x > mainLat && y < mainLong && x <= mainLat + 0.0012f * 2 && y >= mainLong - 0.00175f * 2) {
//                        System.out.print("p" + " " + k + " " + l + ",");

                        writer.print("p" + " " + k + " " + l + ",");
                    }


                }
            }
            if (x == 0f) {
//                System.out.println("-"+"t."+filenumber+"." + c);
                writer.println("-"+"t_"+filenumber+"_" + c);
                c++;
            }

        }

writer.close();
    }

    private static void filecreationcommand() {

        for (int i = 0; i < 600; i++) {
            if (i > 100)
                System.out.println("cp filtered/part-00" + i + " texted/" + i + ".txt");
            else if (i < 100 && i > 10)
                System.out.println("cp filtered/part-000" + i + " texted/" + i + ".txt");
            else if (i < 10)
                System.out.println("cp filtered/part-0000" + i + " texted/" + i + ".txt");
        }
    }


    /*
     ARRAY OF BORDERS = {maxLat, minLong, minLat, maxLong}
     */

    /*
     OBTAINED BORDERS = {50.30546, -127.08143, 32.8697, -115.56218}

     MAP BORDERS:

        float bigLat = 51f;
        float smallLon = -128f;

        float smallLat = 32f;
        float bigLon = -115f;
     */


    private static void alltrajectoryGrid() throws IOException {

        File folder = new File("/Users/sivakiran/masters_project/cabspottingdata/");
        File[] listOfFiles = folder.listFiles();

        float bigLat = 37.820000f;
        float smallLon = -122.525000f;

        List<Coord> occupiedLocs = new ArrayList<>();
        int i = 0;
        assert listOfFiles != null;
        for (File file : listOfFiles) {

            if (file.isFile() && !file.getName().equals(".DS_Store") && file.getName().equals("new_abboip.txt")) {

                System.out.println(file.getName());

                BufferedReader br = new BufferedReader(new FileReader(file));
                String line = null;
                int j = 0;


                while ((line = br.readLine()) != null) {
                    if (Objects.equals(line.split(" ")[2], "1")) {
                        occupiedLocs.add(j, new Coord(Float.valueOf(line.split(" ")[0]), Float.valueOf(line.split(" ")[1])));
                        j++;
                    }
                }
                br.close();
                i++;


            }
            System.out.println("FINISHED GETTING A TAXI'S OCCUPIED LOCATIONS " + i);
        }

        List<Coord>[][] mapping = new ArrayList[50][50];

        float mainLat = bigLat;

        for (int k = 0; k < 50; k++) {

            mainLat = mainLat - 0.0012f * 2;
            float mainLong = smallLon;

            for (int l = 0; l < 50; l++) {

                mainLong = mainLong + 0.00175f * 2;
                List<Coord> satisfied = new ArrayList<>();
                int z = 0;

                for (int m = 0; m < occupiedLocs.size(); m++) {

                    float x = occupiedLocs.get(m).getX();
                    float y = occupiedLocs.get(m).getY();

                    if (x > mainLat && y < mainLong && x < mainLat + 0.0012f * 2 && y > mainLong - 0.00175f * 2) {
                        satisfied.add(z, occupiedLocs.get(m));
                        z++;
                    }


                }
                mapping[k][l] = satisfied;

            }
            System.out.println("UPDATED mapping Matrix " + k);
        }

        for (int a = 0; a < 50; a++) {
            for (int b = 0; b < 50; b++) {
                if (mapping[a][b].size() > 0) {
                    System.out.println("(" + a + "," + b + ")\t" + mapping[a][b].size() + "\tfirst entry:\t" + mapping[a][b].get(0).getX() + "\t" + mapping[a][b].get(0).getY());
                }
            }
        }
        /*---------------- Sample O/P ------------------
        Grid Number (3,22) 50.30546 -122.00204 TOTAL NO OF POINTS IN GRID: 6
        Grid Number (68,19) 37.9427 -122.65456 TOTAL NO OF POINTS IN GRID: 9
        Grid Number (68,20) 37.94709 -122.33354 TOTAL NO OF POINTS IN GRID: 4473
        Grid Number (68,21) 37.89596 -122.19819TOTAL NO OF POINTS IN GRID: 2371
        Grid Number (68,22) 37.89021 -122.05971TOTAL NO OF POINTS IN GRID: 129
         */
    }


    private static float[] borderVals(File fin) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader(fin));

        String line = null;
        int i = 0;

        float maxLat = 0.0f;
        float minLon = 0.0f;

        float minLat = 40f;
        float maxLon = -130f;


        while ((line = br.readLine()) != null) {
            if (Objects.equals(line.split(" ")[2], "1")) {

                float a = Float.valueOf(line.split(" ")[0]);
                float b = Float.valueOf(line.split(" ")[1]);

                if (a > maxLat) {
                    maxLat = Float.valueOf(line.split(" ")[0]);
                }
                if (b < minLon) {
                    minLon = Float.valueOf(line.split(" ")[1]);
                }
                if (a < minLat) {
                    minLat = Float.valueOf(line.split(" ")[0]);
                }
                if (b > maxLon) {
                    maxLon = Float.valueOf(line.split(" ")[1]);
                }

                i++;
            }
        }

        float[] maxValues = {maxLat, minLon, minLat, maxLon};

        System.out.println("TOTAL LOCS " + i);
//        System.out.println("MAX LAT " + maxLat);
//        System.out.println("MIN LON " + minLon);
//        System.out.println("MIN LAT " + minLat);
//        System.out.println("MAX LON " + maxLon);

        return maxValues;
    }


    private static List<Coord>[][] trajectoryGrid(File fin) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader(fin));

        float bigLat = 38.9f;
        float smallLon = -123.0f;

        float smallLat = 37.5f;
        float bigLon = -122.0f;


        List<Coord> occupiedLocs = new ArrayList<>();


        String line = null;
        int i = 0;

        float maxLat = 0.0f;
        float minLon = 0.0f;

        float minLat = 40f;
        float maxLon = -130f;


        while ((line = br.readLine()) != null) {
            if (Objects.equals(line.split(" ")[2], "1")) {

                occupiedLocs.add(i, new Coord(Float.valueOf(line.split(" ")[0]), Float.valueOf(line.split(" ")[1])));

                if (Float.valueOf(line.split(" ")[0]) > maxLat) {
                    maxLat = Float.valueOf(line.split(" ")[0]);
                }
                if (Float.valueOf(line.split(" ")[1]) < minLon) {
                    minLon = Float.valueOf(line.split(" ")[1]);
                }
                if (Float.valueOf(line.split(" ")[0]) < minLat) {
                    minLat = Float.valueOf(line.split(" ")[0]);
                }
                if (Float.valueOf(line.split(" ")[1]) > maxLon) {
                    maxLon = Float.valueOf(line.split(" ")[1]);
                }

                i++;
            }
        }

        List<Coord>[][] mapping = new ArrayList[100][100];

        float mainLat = bigLat;
        float mainLat2 = smallLat, mainLong2 = bigLon;

        for (int k = 0; k < 100; k++) {

            mainLat = mainLat - 0.014f;
            float mainLong = smallLon;

            for (int l = 0; l < 100; l++) {

                mainLong = mainLong + 0.01f;
                List<Coord> satisfied = new ArrayList<>();
                int z = 0;

                for (int m = 0; m < occupiedLocs.size(); m++) {

                    float x = occupiedLocs.get(m).getX();
                    float y = occupiedLocs.get(m).getY();

                    if (x > mainLat && y < mainLong && x < mainLat + 0.014f && y > mainLong - 0.01f) {
                        satisfied.add(z, occupiedLocs.get(m));
                        z++;
                    }
                }
                mapping[k][l] = satisfied;

            }
        }

        System.out.println("TOTAL LOCS " + i);
        System.out.println("MAX LAT " + maxLat);
        System.out.println("MIN LON " + minLon);
        System.out.println("MIN LAT " + minLat);
        System.out.println("MAX LON " + maxLon);

        for (int a = 0; a < 100; a++) {
            for (int b = 0; b < 100; b++) {
                if (mapping[a][b].size() > 0) {
                    for (int c = 0; c < mapping[a][b].size(); c++) {
                        System.out.println("Grid Number (" + a + "," + b + ") " + mapping[a][b].get(c).getX() + "\t" + mapping[a][b].get(c).getY());
                    }
                }
            }
        }

        br.close();

        return mapping;
    }


    /****** Coordinate Borders ******/

    /*
            38.900000, -123.000000
            37.500000, -122.000000
            38.900000, -122.000000
            37.500000, -123.000000
    */
    private static List<Coord>[][] dropoffsGrid(File fin) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader(fin));
        BufferedReader br2 = new BufferedReader(new FileReader(fin));
        br2.readLine();

        float bigLat = 38.9f;
        float smallLon = -123.0f;

        float smallLat = 37.5f;
        float bigLon = -122.0f;

        List<Coord> dropoffLocs = new ArrayList<>();


        String line = null;
        String line2 = null;
        int i = 0;

        float maxLat = 0.0f;
        float minLon = 0.0f;

        float minLat = 40f;
        float maxLon = -130f;


        while ((line = br.readLine()) != null) {
            line2 = br2.readLine();
            if (Objects.equals(line.split(" ")[2], "1") && !Objects.equals(line2.split(" ")[2], "1")) {

                dropoffLocs.add(i, new Coord(Float.valueOf(line.split(" ")[0]), Float.valueOf(line.split(" ")[1])));

                if (Float.valueOf(line.split(" ")[0]) > maxLat) {
                    maxLat = Float.valueOf(line.split(" ")[0]);
                }
                if (Float.valueOf(line.split(" ")[1]) < minLon) {
                    minLon = Float.valueOf(line.split(" ")[1]);
                }
                if (Float.valueOf(line.split(" ")[0]) < minLat) {
                    minLat = Float.valueOf(line.split(" ")[0]);
                }
                if (Float.valueOf(line.split(" ")[1]) > maxLon) {
                    maxLon = Float.valueOf(line.split(" ")[1]);
                }

                i++;
            }
        }

        List<Coord>[][] mapping = new ArrayList[100][100];

        float mainLat = bigLat;
        float mainLat2 = smallLat, mainLong2 = bigLon;

        for (int k = 0; k < 100; k++) {

            mainLat = mainLat - 0.014f;
            float mainLong = smallLon;

            for (int l = 0; l < 100; l++) {

                mainLong = mainLong + 0.01f;
                List<Coord> satisfied = new ArrayList<>();
                int z = 0;

                for (int m = 0; m < dropoffLocs.size(); m++) {

                    float x = dropoffLocs.get(m).getX();
                    float y = dropoffLocs.get(m).getY();

                    if (x > mainLat && y < mainLong && x < mainLat + 0.014f && y > mainLong - 0.01f) {
                        satisfied.add(z, dropoffLocs.get(m));
                        z++;
                    }
                }
                mapping[k][l] = satisfied;

            }
        }

        System.out.println("TOTAL DROPOFFS " + i);
        System.out.println("MAX LAT " + maxLat);
        System.out.println("MIN LON " + minLon);
        System.out.println("MIN LAT " + minLat);
        System.out.println("MAX LON " + maxLon);

        for (int a = 0; a < 100; a++) {
            for (int b = 0; b < 100; b++) {
                if (mapping[a][b].size() > 0) {
                    for (int c = 0; c < mapping[a][b].size(); c++) {
                        System.out.println("Grid Number (" + a + "," + b + ") " + mapping[a][b].get(c).getX() + "\t" + mapping[a][b].get(c).getY());
                    }
                }
            }
        }

        br.close();

        return mapping;
    }

    private static List<Coord>[][] pickupsGrid(File fin) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader(fin));
        BufferedReader br2 = new BufferedReader(new FileReader(fin));

        float bigLat = 38.9f;
        float smallLon = -123.0f;

        float smallLat = 37.5f;
        float bigLon = -122.0f;

        List<Coord> pickupLocs = new ArrayList<>();


        String line = null;
        String line2 = null;
        int i = 0;

        float maxLat = 0.0f;
        float minLon = 0.0f;

        float minLat = 40f;
        float maxLon = -130f;


        while ((line = br.readLine()) != null) {
            if (line2 != null) {
                if (Objects.equals(line.split(" ")[2], "1") && !Objects.equals(line2.split(" ")[2], "1")) {

                    pickupLocs.add(i, new Coord(Float.valueOf(line.split(" ")[0]), Float.valueOf(line.split(" ")[1])));

                    if (Float.valueOf(line.split(" ")[0]) > maxLat) {
                        maxLat = Float.valueOf(line.split(" ")[0]);
                    }
                    if (Float.valueOf(line.split(" ")[1]) < minLon) {
                        minLon = Float.valueOf(line.split(" ")[1]);
                    }
                    if (Float.valueOf(line.split(" ")[0]) < minLat) {
                        minLat = Float.valueOf(line.split(" ")[0]);
                    }
                    if (Float.valueOf(line.split(" ")[1]) > maxLon) {
                        maxLon = Float.valueOf(line.split(" ")[1]);
                    }

                    i++;
                }
            }
            line2 = br2.readLine();
        }

        List<Coord>[][] mapping = new ArrayList[100][100];

        float mainLat = bigLat;
        float mainLat2 = smallLat, mainLong2 = bigLon;

        for (int k = 0; k < 100; k++) {

            mainLat = mainLat - 0.014f;
            float mainLong = smallLon;

            for (int l = 0; l < 100; l++) {

                mainLong = mainLong + 0.01f;
                List<Coord> satisfied = new ArrayList<>();
                int z = 0;

                for (int m = 0; m < pickupLocs.size(); m++) {

                    float x = pickupLocs.get(m).getX();
                    float y = pickupLocs.get(m).getY();

                    if (x > mainLat && y < mainLong && x < mainLat + 0.014f && y > mainLong - 0.01f) {
                        satisfied.add(z, pickupLocs.get(m));
                        z++;
                    }
                }
                mapping[k][l] = satisfied;


            }
        }

        System.out.println("TOTAL PICKUPS " + i);
        System.out.println("MAX LAT " + maxLat);
        System.out.println("MIN LON " + minLon);
        System.out.println("MIN LAT " + minLat);
        System.out.println("MAX LON " + maxLon);

        for (int a = 0; a < 100; a++) {
            for (int b = 0; b < 100; b++) {
                if (mapping[a][b].size() > 0) {
                    for (int c = 0; c < mapping[a][b].size(); c++) {
                        System.out.println("Grid Number (" + a + "," + b + ") " + mapping[a][b].get(c).getX() + "\t" + mapping[a][b].get(c).getY());
                    }
                }
            }
        }

        br.close();

        return mapping;
    }

    /********** TOOLS **********/

    private static void pickups(File fin) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader(fin));
        BufferedReader br2 = new BufferedReader(new FileReader(fin));

        String line = null;
        String line2 = null;
        int i = 0;
        while ((line = br.readLine()) != null) {
            if (line2 != null) {
                if (Objects.equals(line.split(" ")[2], "1") && !Objects.equals(line2.split(" ")[2], "1")) {
                    System.out.println(line.split(" ")[0] + "\t" + line.split(" ")[1] + "\tcircle1\tgreen");
                    i++;
                }
            }
            line2 = br2.readLine();
        }

        System.out.println("TOTAL PICKUPS " + i);
        br.close();
    }

    private static void dropoffs(File fin) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader(fin));
        BufferedReader br2 = new BufferedReader(new FileReader(fin));

        br2.readLine();

        String line = null;
        String line2 = null;
        int i = 0;
        while ((line = br.readLine()) != null) {
            line2 = br2.readLine();
            if (line2 != null) {
                if (Objects.equals(line.split(" ")[2], "1") && Objects.equals(line2.split(" ")[2], "0")) {
                    System.out.println(line.split(" ")[0] + "\t" + line.split(" ")[1] + "\tcross1\tred");
                    i++;
                }
            }
        }

        System.out.println("TOTAL DROPOFFS " + i);
        br.close();
    }

}

