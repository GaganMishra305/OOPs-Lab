import dept.CSE;
import dept.ECE;
import dept.ME;
import dept.CE;

public class Q44 {
    public static void main(String[] args) {
        CSE cse = new CSE();
        ECE ece = new ECE();
        ME me = new ME();
        CE ce = new CE();

        // Display subjects for each department
        cse.displaySubjects();
        System.out.println();
        ece.displaySubjects();
        System.out.println();
        me.displaySubjects();
        System.out.println();
        ce.displaySubjects();
    }
}
