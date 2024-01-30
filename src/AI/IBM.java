package AI;
import java.util.*;

class IBM {
    public static List<Integer> getTotalExecutionTime(int n, String[] logs) {
        int[][] functions = new int[n][2];
        Arrays.fill(functions, new int[]{0, 0});

        for (String log : logs) {
            String[] details = log.split(":");
            int functionId = Integer.parseInt(details[0]);
            int timestamp = Integer.parseInt(details[1]);

            if (details[2].equals("start")) {
                functions[functionId][0] += timestamp;
            } else {
                functions[functionId][1] += timestamp;
            }
        }

        List<Integer> executionTimes = new ArrayList<>();
        for (int[] function : functions) {
            executionTimes.add(function[1] - function[0]);
        }

        return executionTimes;
    }
}


