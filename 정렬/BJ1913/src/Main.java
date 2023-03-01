import java.lang.reflect.Array;
import java.util.*;
class Meeting implements Comparable {
    public int start;
    public int end;

    public Meeting(int s, int e){
        start = s;
        end = e;
    }

    public int getStart(){
        return this.start;
    }

    public int getEnd(){
        return this.end;
    }

    @Override
    public int compareTo(Object o){ //객체 배열의 정렬을 위한 메서드
        Meeting m = (Meeting) o;
        return getEndAsInteger().compareTo(m.getEndAsInteger());
    }

    public Integer getEndAsInteger(){
        return this.end;
    }
}

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int cnt=0; //사용가능한 회의실 개수

        Meeting[] m = new Meeting[N];   //Meeting타입의 객체배열
        for(int i=0; i<N; i++){
            m[i] = new Meeting(sc.nextInt(), sc.nextInt());
        }
        //Arrays.sort(m); //end를 기준으로 정렬.. 객체배열정렬
        List<Meeting> list = Arrays.asList(m);
        list.sort(Comparator.comparing(Meeting::getEnd).thenComparing(Meeting::getStart));
        int end = m[0].end;
        cnt++;

        for(int i=1; i<N; i++){
            if(end<=m[i].start){
                end = m[i].end;
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
//객체배열정렬을 start기준으로 먼저 하고, end로 하면 반례 해결
//반례 이거때문에 85퍼에서 틀림;; 해결하니까 맞음
//3
//4 4
//4 4
//1 4