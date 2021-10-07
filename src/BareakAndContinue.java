class BareakAndContinue {
    public static void main(String[] args) {
        // Break
        for (int i = 0; i <= 100; i++) {

            if (i == 20)
                break;
            System.out.println(i);
        }

        // Continue
        for (int i = 0; i <= 100; i++) {

            if (i == 20)
                continue;
            System.out.println(i);
        }

    }

}