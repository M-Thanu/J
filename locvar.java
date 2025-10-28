class Example {
    void startEngine() {
        int rpm = 1000; // local variable
        System.out.println("Engine started at " + rpm + " RPM.");
    }

    public static void main(String[] args) {
        Example obj = new Example();
        //obj.startEngine();
        //System.out.println(rpm); // Error: rpm not visible here
        int a=10;
        System.out.println(~a);
    }
}
