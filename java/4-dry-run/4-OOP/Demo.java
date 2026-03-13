enum Level {
    LOW("This is low"),
    MEDIUM("This is medium"),
    HIGH("This is high");

    private String desc;

    private Level(String desc) {
        this.desc = desc;
    }

    public String getDesc () {
        return this.desc;
    }
}

class Demo {
    public static void main(String[] args) {
        for (Level myLvl : Level.values()){
            System.out.println(myLvl + " : " + myLvl.getDesc());
        } // wow, the above really came out as a dictionary

    }
}