/*
ID: vipinsh2
LANG: JAVA
TASK: beads
*/
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class beads {
    BufferedReader br;
    PrintWriter pw;
    StringTokenizer st;
    public static void main(String[] args) throws IOException {
        new beads().Run();
    }

    private void Run() throws IOException {
        br = new BufferedReader(new FileReader(this.getClass().getSimpleName()+".in"));
        pw = new PrintWriter(this.getClass().getSimpleName()+".out");
        int numOfBeads = Integer.parseInt(next());

        int [] beads= new int[numOfBeads];
        char previousplus='\0';
        char previous='\0';
        char current='\0';
        char [] beadChars = next().toCharArray();
        int i =0;
        int j =0;
        for (int c1 = 0; c1 < beadChars.length; c1++) {
            char  c = beadChars[c1];

            //previousplus=previous;
            //previous=current;
            current=c;
            if(i>0){
                if((current==previous)||(current=='w') || ( previous =='w' && previousplus==c) || ( previous =='w' && previousplus=='\0')){
                    beads[j]=beads[j]+1;
                    previous=current;
                }else {
                    j++;
                    previousplus=previous;
                    beads[j]=1;
                }
            }
            else {
                beads[j]=1;
            }
            i++;
        }
        boolean isCircle = false;
        if (beadChars[0]==beadChars[numOfBeads-1]){
            isCircle = true;
        }
        int [] beadsSum = new int[numOfBeads];
        for (int k = 0; k < numOfBeads; k++) {
            beadsSum[k] = beads[k+1]+beads[k];
            if (beads[k+1]==0) {
                if(isCircle){
                    beadsSum[0]=beads[0]+beads[k];
                    beadsSum[k]=0;
                }
                break;
            }
        }
        int max =0;
        int maxIndex =0;
        for (int i1 : beadsSum) {
            if(beadsSum[i1]>max){
                max=beadsSum[i1];
                maxIndex=i1;
            }
            i1++;
        }
        pw.println(maxIndex+1);
        pw.close();

    }

    private String next() throws IOException {
        while (st == null || !st.hasMoreTokens()) {
            st = new StringTokenizer(br.readLine());
        }
        return st.nextToken();
    }
}
