class Main {
    int x = 10;

    class InnerClass {
        public int InnerMethod () {
            return x;
        }
    }

    public static void main(String[] args) {
        Main myObj = new Main();
        Main.InnerClass myInner = myObj.new InnerClass();
        System.out.println(myInner.InnerMethod());
    }
}
