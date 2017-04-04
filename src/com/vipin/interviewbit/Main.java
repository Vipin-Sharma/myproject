package com.vipin.interviewbit;

import javax.xml.transform.sax.SAXSource;
import java.lang.Math;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    // X and Y co-ordinates of the points in order.
    // Each point is represented by (X.get(i), Y.get(i))



     public static class Interval {
         int start;
         int end;
         Interval() { start = 0; end = 0; }
         Interval(int s, int e) { start = s; end = e; }
     }

    public static void main(String[] args) {
        ArrayList<Integer> X = new ArrayList<>();

/*        X.add(5);
        X.add(1);
        X.add(3);
        X.add(2);
        X.add(4);*/
        /*System.out.println(new Solution().wave(X));*/

        ArrayList<Interval> intervals = new ArrayList<>();
        /*intervals.add(new Interval(3, 5));
        intervals.add(new Interval(8, 10));

        Interval newInterval = new Interval(10, 3);*/

/*        intervals.add(new Interval(3, 6));
        intervals.add(new Interval(8, 10));

        Interval newInterval = new Interval(11, 12);*/

        intervals.add(new Interval(1, 2));
        intervals.add(new Interval(3, 6));

        Interval newInterval = new Interval(10, 8);


        /*intervals.add(new Interval(4396776, 43900851));
        intervals.add(new Interval(58085489, 69279738));
        intervals.add(new Interval(79427653, 83523721));
        intervals.add(new Interval(88972731, 93436461));

        Interval newInterval = new Interval(22412508, 55842029);
*/

/*
        intervals.add(new Interval(137207, 1734370));
        intervals.add(new Interval(5057723, 5365773));
        intervals.add(new Interval(6997657, 7282669));
        intervals.add(new Interval(7992707, 8945780));
        intervals.add(new Interval(13205169, 13286380));
        intervals.add(new Interval(13478080, 14361199));
        intervals.add(new Interval(14648047, 16875188));
        intervals.add(new Interval(17296166, 19089625));
        intervals.add(new Interval(20424412, 20617334));
        intervals.add(new Interval(21947854, 23077086));
        intervals.add(new Interval(24901000, 26346402));
        intervals.add(new Interval(26650724, 27196856));
        intervals.add(new Interval(28896156, 29975691));
        intervals.add(new Interval(30071726, 31373629));
        intervals.add(new Interval(32397799, 33159528));
        intervals.add(new Interval(33305337, 35470848));
        intervals.add(new Interval(35720431, 37452993));
        intervals.add(new Interval(39147629, 40818780));
        intervals.add(new Interval(40930468, 41652526));
        intervals.add(new Interval(41938404, 44430212));
        intervals.add(new Interval(48114813, 48611161));
        intervals.add(new Interval(50335149, 51023917));
        intervals.add(new Interval(51878891, 52987379));
        intervals.add(new Interval(53902725, 54359910));
        intervals.add(new Interval(56661881, 58671175));
        intervals.add(new Interval(59326619, 61927945));
        intervals.add(new Interval(63215257, 63817507));
        intervals.add(new Interval(64968095, 65653303));
        intervals.add(new Interval(66634969, 67941460));
        intervals.add(new Interval(69980615, 71436951));
        intervals.add(new Interval(71564309, 74681566));
        intervals.add(new Interval(75530199, 76592769));
        intervals.add(new Interval(76988511, 77454928));
        intervals.add(new Interval(77665838, 78087358));
        intervals.add(new Interval(78229841, 79535243));
        intervals.add(new Interval(81250676, 82624050));
        intervals.add(new Interval(83142364, 84255671));
        intervals.add(new Interval(84379892, 84668384));
        intervals.add(new Interval(84954893, 85392199));
        intervals.add(new Interval(87804458, 90457067));
        intervals.add(new Interval(90760520, 91607160));
        intervals.add(new Interval(92361716, 92692045));
        intervals.add(new Interval(95399553, 97983139));
        intervals.add(new Interval(99776803, 99818745));

        Interval newInterval = new Interval(108785977, 16197462);
*/

        /*intervals.add(new Interval(6037774, 6198243));
        intervals.add(new Interval(6726550, 7004541));
        intervals.add(new Interval(8842554, 10866536));
        intervals.add(new Interval(11027721, 11341296));
        intervals.add(new Interval(11972532, 14746848));
        intervals.add(new Interval(16374805, 16706396));
        intervals.add(new Interval(17557262, 20518214));
        intervals.add(new Interval(22139780, 22379559));
        intervals.add(new Interval(27212352, 28404611));
        intervals.add(new Interval(28921768, 29621583));
        intervals.add(new Interval(29823256, 32060921));
        intervals.add(new Interval(33950165, 36418956));
        intervals.add(new Interval(37225039, 37785557));
        intervals.add(new Interval(40087908, 41184444));
        intervals.add(new Interval(41922814, 45297414));
        intervals.add(new Interval(48142402, 48244133));
        intervals.add(new Interval(48622983, 50443163));
        intervals.add(new Interval(50898369, 55612831));
        intervals.add(new Interval(57030757, 58120901));
        intervals.add(new Interval(59772759, 59943999));
        intervals.add(new Interval(61141939, 64859907));
        intervals.add(new Interval(65277782, 65296274));
        intervals.add(new Interval(67497842, 68386607));
        intervals.add(new Interval(70414085, 73339545));
        intervals.add(new Interval(73896106, 75605861));
        intervals.add(new Interval(79672668, 84539434));
        intervals.add(new Interval(84821550, 86558001));
        intervals.add(new Interval(91116470, 92198054));
        intervals.add(new Interval(96147808, 98979097));

        Interval newInterval = new Interval(36210193, 61984219);
*/
/*
        intervals.add(new Interval(883399, 1842572));
        intervals.add(new Interval(2646087, 2730795));
        intervals.add(new Interval(3420267, 4195414));
        intervals.add(new Interval(6252801, 6961980));
        intervals.add(new Interval(8585986, 8844409));
        intervals.add(new Interval(9863657, 11144568));
        intervals.add(new Interval(11848358, 12509069));
        intervals.add(new Interval(12701387, 13043917));
        intervals.add(new Interval(15126521, 17138746));
        intervals.add(new Interval(17759548, 17991304));
        intervals.add(new Interval(21333549, 22452607));
        intervals.add(new Interval(22495397, 22877698));
        intervals.add(new Interval(23016513, 23095185));
        intervals.add(new Interval(23549814, 24044807));
        intervals.add(new Interval(24951697, 25106802));
        intervals.add(new Interval(25764424, 25826498));
        intervals.add(new Interval(26366433, 28600649));
        intervals.add(new Interval(29077775, 29165933));
        intervals.add(new Interval(30104110, 32585507));
        intervals.add(new Interval(32596101, 33777176));
        intervals.add(new Interval(33865567, 34352889));
        intervals.add(new Interval(35506526, 36084968));
        intervals.add(new Interval(36603560, 36786858));
        intervals.add(new Interval(37859588, 38111331));
        intervals.add(new Interval(39101230, 39600177));
        intervals.add(new Interval(40551578, 40909135));
        intervals.add(new Interval(42300683, 42473151));
        intervals.add(new Interval(42808354, 43246307));
        intervals.add(new Interval(43534090, 43534663));
        intervals.add(new Interval(43646691, 43985349));
        intervals.add(new Interval(44385219, 45260112));
        intervals.add(new Interval(45391195, 45712962));
        intervals.add(new Interval(47817692, 47818540));
        intervals.add(new Interval(48151947, 49147282));
        intervals.add(new Interval(50165250, 50626535));
        intervals.add(new Interval(50653967, 50768004));
        intervals.add(new Interval(51520600, 52109278));
        intervals.add(new Interval(53023049, 54054324));
        intervals.add(new Interval(54235644, 54369227));
        intervals.add(new Interval(56196793, 57593376));
        intervals.add(new Interval(58104983, 58195947));
        intervals.add(new Interval(58500588, 59052328));
        intervals.add(new Interval(59077429, 59404401));
        intervals.add(new Interval(60954880, 61869917));
        intervals.add(new Interval(62406429, 62768932));
        intervals.add(new Interval(63877222, 64660547));
        intervals.add(new Interval(65256640, 65591526));
        intervals.add(new Interval(66543641, 67552311));
        intervals.add(new Interval(68457010, 68685520));
        intervals.add(new Interval(70539138, 73461137));
        intervals.add(new Interval(74601666, 74632232));
        intervals.add(new Interval(75781949, 76434436));
        intervals.add(new Interval(79519602, 80157441));
        intervals.add(new Interval(80864919, 80925442));
        intervals.add(new Interval(81544062, 82876607));
        intervals.add(new Interval(84340293, 84927256));
        intervals.add(new Interval(85581484, 86420597));
        intervals.add(new Interval(86728120, 87927284));
        intervals.add(new Interval(88160074, 88313466));
        intervals.add(new Interval(88325329, 88345140));
        intervals.add(new Interval(89020345, 89736546));
        intervals.add(new Interval(91087305, 91187238));
        intervals.add(new Interval(93138599, 93168155));
        intervals.add(new Interval(93773258, 94840118));
        intervals.add(new Interval(95810591, 99202105));

        Interval newInterval = new Interval(91377139, 97585752);
*/

        ArrayList<Interval> out = new Main().insert(intervals,newInterval);
        for (Interval interval : out) {
            System.out.println("("+interval.start+", "+interval.end+")");
        }
    }



        public ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval newInterval) {

            ArrayList<Interval> resultIntervals= new ArrayList<>();
            ArrayList<Interval> resultPrev= new ArrayList<>();
            ArrayList<Interval> resultNextRev= new ArrayList<>();
            ArrayList<Interval> resultNext= new ArrayList<>();

            if (newInterval.end<newInterval.start){
                int temp = newInterval.start;
                newInterval.start=newInterval.end;
                newInterval.end=temp;
            }

            int prevint=-1;
            for (Interval interval : intervals) {
                if (interval.end<newInterval.start){
                    resultPrev.add(interval);
                    prevint=prevint+1;
                }
            }
            int nextint=-1;
            for (int i = intervals.size()-1; i >=0; i--) {
                if(intervals.get(i).start>newInterval.end){
                    resultNextRev.add(intervals.get(i));
                    nextint=i;
                }
            }

            for (int i = resultNextRev.size()-1; i >= 0; i--) {
                resultNext.add(resultNextRev.get(i));
            }

            boolean mergerwithprev = false;
            boolean mergerwithnext = false;
            /*if (resultPrev.size()-1>0 && newInterval.start<=resultPrev.get(resultPrev.size()-1).end){
                mergerwithprev=true;
            }*/
            if(prevint<intervals.size()-1 && nextint>0) {
                if (prevint != -1 && (newInterval.start < intervals.get(prevint + 1).end && newInterval.start > intervals.get(prevint + 1).start)) {
                    mergerwithprev = true;
                }
                if (nextint != -1 && (newInterval.end > intervals.get(nextint - 1).start && newInterval.end < intervals.get(nextint - 1).end)) {
                    mergerwithnext = true;
                }
            }
            Interval endElement= new Interval();

            if(nextint == -1 && prevint ==-1) {
                resultIntervals.add(newInterval);
                return resultIntervals;
            }

            if (nextint==-1 && intervals.size()>0){
                endElement = new Interval(newInterval.start<intervals.get(prevint+1).start ? newInterval.start :intervals.get(prevint+1).start,
                        newInterval.end>intervals.get(intervals.size()-1).end? newInterval.end :intervals.get(intervals.size()-1).end);
            }
            Interval firstElement = new Interval();
            if (prevint==-1 && intervals.size()>0){
                firstElement = new Interval(newInterval.start<intervals.get(0).start? newInterval.start :intervals.get(0).start,
                        newInterval.end>intervals.get(nextint).end?newInterval.end :intervals.get(nextint).end);
            }

            if(mergerwithprev && mergerwithnext){
                /*Interval merged = new Interval(resultPrev.get(resultPrev.size()-1).start,intervals.get(nextint-1).end);
                resultPrev.remove(resultPrev.size()-1);*/
                /*resultNext.remove(0);*/
                Interval merged = new Interval(intervals.get(prevint+1).start, intervals.get(nextint-1).end);
                resultIntervals.addAll(resultPrev);
                resultIntervals.add(merged);
                resultIntervals.addAll(resultNext);
            }
            else if (mergerwithprev){
                /*Interval merged = new Interval(resultPrev.get(resultPrev.size()-1).start,newInterval.end);
                resultPrev.remove(resultPrev.size()-1);*/
                Interval merged = new Interval(intervals.get(prevint+1).start, newInterval.end);
                resultIntervals.addAll(resultPrev);
                resultIntervals.add(merged);
                if(nextint==-1){
                    resultIntervals.add(endElement);
                }else {
                    resultIntervals.addAll(resultNext);
                }
            }else if(mergerwithnext){
                Interval merged = new Interval(newInterval.start,intervals.get(nextint-1).end);
                /*resultNext.remove(0);*/
                if(prevint==-1){
                    resultIntervals.add(firstElement);
                }else {
                    resultIntervals.addAll(resultPrev);
                }
                resultIntervals.add(merged);
                resultIntervals.addAll(resultNext);
            }
            else if(nextint == -1 && prevint ==-1){
                resultIntervals.add(newInterval);
            }else if (nextint==-1){
                resultIntervals.addAll(resultPrev);
                resultIntervals.add(endElement);
            }
            else if (prevint==-1){
                resultIntervals.add(firstElement);
                resultIntervals.addAll(resultNext);
            }
            else{
                resultIntervals.addAll(resultPrev);
                resultIntervals.add(newInterval);
                resultIntervals.addAll(resultNext);
            }

            return resultIntervals;
        }

    public int coverPoints(ArrayList<Integer> X, ArrayList<Integer> Y) {
        int k=2;
        if(X.size()!=Y.size()){
            return 0;
        }

        int distance =0;
        for (int l = 0; l < X.size()-1; l++) {
            distance += (int) Math.sqrt(Math.pow(X.get(l) - Y.get(l), k) + Math.pow(X.get(l+1) - Y.get(l+1), k));
            //distance += (int) Math.sqrt(Math.pow(Math.abs(X.get(l)) - Math.abs(Y.get(l)), k) + Math.pow(Math.abs(X.get(l+1)) - Math.abs(Y.get(l + 1)), k));
        }

        return distance;
    }

    public ArrayList<Integer> maxset(ArrayList<Integer> a) {
        int maxtotal =0;

        ArrayList<Integer> Current = new ArrayList<>();
        ArrayList<Integer> Max = new ArrayList<>();
        long currentSum = 0;
        long maxSum = 0;

        for (int j = 0; j < a.size(); j++) {
            if(a.get(j)>=0){
                Current.add(a.get(j));
                currentSum += a.get(j);

            } else{
                if (currentSum>maxSum || (currentSum==maxSum && Current.size()> Max.size())){
                    Max = Current;
                    maxSum=currentSum;
                }
                currentSum=0;
                Current = new ArrayList<>();
            }
        }
        if (currentSum>maxSum || (currentSum==maxSum && Current.size()> Max.size())){
            Max = Current;
            Current = new ArrayList<>();
            maxSum=currentSum;
            currentSum=0;
        }

        return Max;
    }

    public ArrayList<Integer> wave(ArrayList<Integer> a) {

        Collections.sort(a);
        ArrayList<Integer> b = new ArrayList<>(a.size()+1);

        int count = 0;
        int prev = 0;
        int next = 0;
        boolean flag = true;
        boolean ispending=true;

        /*for (int i = 0; i < a.size() && i <a.size(); i++) {
            b.add(a.get(count+1));
        }*/
        for (Integer i : a) {
            if (flag){
                prev=i;
                flag=!flag;
                ispending=true;
            }else {
                b.add(i);
                b.add(prev);
                ispending=false;
                flag=!flag;
            }
        }

        if(ispending){
            b.add(prev);
        }

        return b;
    }


        /*ArrayList<Integer> Y = new ArrayList<>();
        Y.add(0);
        Y.add(1);
        Y.add(2);*/

        /*int result = new Solution().coverPoints(X, Y);*/
/*
        X.add(1);
        X.add(2);
        X.add(5);
        X.add(-7);
        X.add(2);
        X.add(5);
*/
//        X.add(756898537);
//        X.add(-1973594324);
//        X.add(-2038664370);
//        X.add(-184803526);
//        X.add(1424268980);

        /*X.add(1967513926);
        X.add(1540383426);
        X.add(-1303455736);
        X.add(-521595368);*/

/*        X.add(24115);
        X.add(-75629);
        X.add(-46517);
        X.add(30105);
        X.add(19451);
        X.add(-82188);
        X.add(99505);
        X.add(6752);
        X.add(-36716);
        X.add(54438);
        X.add(-51501);
        X.add(83871);
        X.add(11137);
        X.add(-53177);
        X.add(22294);
        X.add(-21609);
        X.add(-59745);
        X.add(53635);
        X.add(-98142);
        X.add(27968);
        X.add(-260);
        X.add(41594);
        X.add(16395);
        X.add(19113);
        X.add(71006);
        X.add(-97942);
        X.add(42082);
        X.add(-30767);
        X.add(85695);
        X.add(-73671);*/

        /*System.out.println(new Solution().maxset(X));*/
}
