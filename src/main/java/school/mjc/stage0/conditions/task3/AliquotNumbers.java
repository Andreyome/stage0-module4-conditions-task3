package school.mjc.stage0.conditions.task3;

public class AliquotNumbers {
    public void isFirstAliquot(int first, int second) {
int aliquot = 0;
        for (int i = 1; i < second; i++)
            if (second % i == 0) {
                aliquot += i;
            }
        if (first == aliquot) {
            System.out.println("Aliquot");
        } else {
            System.out.println("Not aliquot");
        }
    }
}
