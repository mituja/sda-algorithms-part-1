//W n-elementowym zbiorze liderem nazywamy element,
//który występuje więcej niż 1⁄2 razy. Zastanów się czy
//możesz skorzystać z algorytmu, który
//zaimplementowałeś wcześniej.

package ExerciseIII;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Integer[] array = {1, 2, 3, 3, 5, 3, 3, 3, 9, 3};
        Integer[] arrayError = {1, 2, 1, 6, 2};
        //   leader(array);
        printLeader(array);
        printLeader(arrayError);
    }

    //samodzielna proba
    public static void leader(Integer[] array) {
        int leaderValue = 0;
        int leader = array[0];

        for (int i = 0; i < array.length; i++) {
            if (leader == array[i]) {
                leaderValue++;
                leader = array[i];
            }
        }
        System.out.println("Leader: " + leader + " Leader value: " + leaderValue);
    }

    //propozycja z zajec
    private static void printLeader(Integer[] array) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            Integer key = array[i];
            Integer count = map.get(array[i]);
            if (count == null) {
                map.put(array[i], 1);
            } else {
                count++;
                map.replace(key, count);
            }
        }
        Integer mvp = 0;
        Integer maxCount = 0;
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry) it.next();
            if ((Integer) pair.getValue() > maxCount) {
                maxCount = (Integer) pair.getValue();
                mvp = (Integer) pair.getKey();
            }
        }
        if (maxCount >= array.length / 2 + 1) {
            System.out.println(mvp);
        } else {
            System.out.println(-1);
        }
    }

}
