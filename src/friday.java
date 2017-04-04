/*
ID: vipinsh2
LANG: JAVA
TASK: friday
*/
import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.StringTokenizer;

public class friday {
    BufferedReader br;
    PrintWriter pw;
    StringTokenizer st;
    int mon,tue,wed,thu,fri,sat,sun=0;
    public static void main(String[] args) throws IOException {
        new friday().run();
    }
    public void run() throws IOException {
        br = new BufferedReader(new FileReader(this.getClass().getSimpleName() + ".in"));
        pw = new PrintWriter(this.getClass().getSimpleName() + ".out");

        int np = nextInt();

        int previous =0;
        for (int i = 0; i < np; i++) {
            boolean leap = isLeapYear(1900+i);
            int febEndDays=0;
            if (leap){
                febEndDays=16;
            }else {
                febEndDays=15;
            }
            int day = previous;
            int janDay = (day+13)%7;
            addDay(janDay);
            int febDay = (janDay+18+13)%7;
            addDay(febDay);
            int marDay = (febDay+febEndDays+13)%7;
            addDay(marDay);
            int aprDay = (marDay+18+13)%7;
            addDay(aprDay);
            int mayDay = (aprDay+17+13)%7;
            addDay(mayDay);
            int junDay = (mayDay+18+13)%7;
            addDay(junDay);
            int julyDay = (junDay+17+13)%7;
            addDay(julyDay);
            int augDay = (julyDay+18+13)%7;
            addDay(augDay);
            int sepDay = (augDay+18+13)%7;
            addDay(sepDay);
            int octDay = (sepDay+17+13)%7;
            addDay(octDay);
            int novDay = (octDay+18+13)%7;
            addDay(novDay);
            int decDay = (novDay+17+13)%7;
            addDay(decDay);
            previous=decDay+18;
        }
        pw.println(sat+" " +sun+" "+mon+" "+tue+" "+wed+" "+thu+" "+fri);
        pw.close();
    }

    private void addDay(int day) {
        if (day==1){
            mon++;
        }else if (day==2){
            tue++;
        }else if (day==3){
            wed++;
        }else if (day==4){
            thu++;
        }else if (day==5){
            fri++;
        }else if (day==6){
            sat++;
        }else if (day==0){
            sun++;
        }else{
            pw.println("Error at day: " +day);
        }
    }

    private boolean isLeapYear(int year) {
        if((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))){
            return true;
        }
        else{
            return false;
        }
    }

    private int nextInt() throws IOException {
        if (st==null || !st.hasMoreTokens()) {
            st = new StringTokenizer(br.readLine());
        }
        return Integer.parseInt(st.nextToken());
    }
}
