public class Labels {
    public static void main(String[] args) {

//        NOTE: Labels

//        In Java, labels are used to identify specific points in the code that can be referenced
//        later to control the flow of the program. Labels are typically used in conjunction with
//        loop statements (such as for, while, and do-while) and switch statements to alter the
//        normal control flow.
//
//        A label is a valid Java identifier followed by a colon (":"). It is important to notes
//        that labels can only be used with loop statements and switch statements.

        cycle1:
        for (int i = 0; i < 3; i++) {
            cycle2:
            for (int j = 0; j < 3; j++) {
                if (i == 1) {
                    continue cycle1;
                } else {
                    System.out.println("[" + i + "][" + j + "]");
                }
            }
        }


        //  Output

        //  [0][0]
        //  [0][1]
        //  [0][2]
        //  [2][0]
        //  [2][1]
        //  [2][2]



    }
}
