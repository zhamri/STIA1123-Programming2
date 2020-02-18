package my.zhamri.stia1123.constructor;

class GrandFather {

    public GrandFather() {
        System.out.println("GrandFather");
    }
}

class Father extends GrandFather {

    public Father() {
        System.out.println("Father");
    }
}

class Son extends Father {

    public Son() {
        System.out.println("Son");
    }

    public static void main(String[] args) {
        Son son = new Son();
    }
}


/***
 * GrandFather
 * Father
 * Son
 */
