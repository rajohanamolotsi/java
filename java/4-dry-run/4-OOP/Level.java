class Main {

    enum Level {
        LOW,
        MEDIUM,
        HIGH
    }
    public static void main (String[] args) {
        Level myLvl = Level.MEDIUM;

        switch (myLvl) {
            case LOW: // the values here must match the exact value as `myLvl`
                System.out.println("Level is low");
                break;
            case MEDIUM:
                System.out.println("Level is medium");
                break;
            case HIGH: // when I was using the default keyword, it was also outputting this
                System.out.println("Level is high");
                break;
        }
    }
}