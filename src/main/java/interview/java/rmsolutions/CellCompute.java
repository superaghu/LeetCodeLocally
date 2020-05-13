package interview.java.rmsolutions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * See question at below image
 * <p>
 * <img width="1147" height="417" src="../../../resources/images/cellCompute.jpeg" alt="">
 * <dl>
 */
public class CellCompute {
    public List<Integer> cellCompete(int[] states, int days) {
        for (int i = 0; i < days; i++) {
            int prev = 0;
            int next = 0;
            for (int j = 0; j < states.length; j++) {
                if (j + 1 == states.length) {
                    next = 0;
                } else {
                    next = states[j + 1];
                }
                int current = states[j];
                states[j] = (prev + next) % 2 == 0 ? 0 : 1;
                prev = current;
            }
        }
        return Arrays.stream(states).boxed().collect(Collectors.toList());
    }

    public List<Integer> cellCompete_recursively(int[] states, int days) {
        recursivelyCellCompete(states, days);
        return Arrays.stream(states).boxed().collect(Collectors.toList());
    }

    private void recursivelyCellCompete(int[] states, int days) {
        if (days == 0) {
            return;
        }
        int prev = 0;
        int next = 0;
        for (int j = 0; j < states.length; j++) {
            if (j + 1 == states.length) {
                next = 0;
            } else {
                next = states[j + 1];
            }
            int current = states[j];
            states[j] = (prev + next) % 2 == 0 ? 0 : 1;
            prev = current;
        }

        days--;
        recursivelyCellCompete(states, days);
    }
}
