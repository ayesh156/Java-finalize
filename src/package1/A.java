package package1;


class A {
    int x = 20;

    @Override
    protected void finalize() throws Throwable {
        System.out.println("finalize");
    }
    
    
}


class Test {
    
    public static void main(String[] args) {
        A a = new A();
        a = new A();
        
        System.gc();
    }
}