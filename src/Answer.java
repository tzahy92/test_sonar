import java.util.*;
import java.util.stream.Collectors;

public class Answer {

    public int findMaxForm(String[] strs, int m, int n) {
        Map<String,List<Integer>> count = new HashMap<>();
        int result = 0;
        count = Arrays.stream(strs).collect(Collectors.toMap(s -> s,sr -> countZandO(sr)));

        //count.forEach((key,val) -> if(val.get(0) <= m && val.get(1) <= n) result++;);
        for (Map.Entry<String,List<Integer>> entry : count.entrySet()) {
            if(entry.getValue().get(0) <= m && entry.getValue().get(1) <= n)
                result++;
        }
        return result;
    }

    public List<Integer> countZandO(String num){
        List<Integer> result = new ArrayList<>();
        result.add(num.length() - num.replaceAll("0","").length());
        result.add(num.length() - num.replaceAll("1","").length());
        return result;
    }
}
