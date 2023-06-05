class Max3Method {
    // a,b,c의 최댓값을 구하여 반환
    static int max3(int a, int b, int c) {
        int max = a;
        if (b > max)
            max = b;
        if (c > max) 
            max = c;

        return max;
    }

    static int max4(int a, int b, int c, int d) {
        int max = a;
        if (b > max) 
            max = b;
        if (c > max)
            max = c;
        if (d > max)
            max = d;
        return max;
    }

    static int min3(int a, int b, int c) {
        int min = a;
        if (b < min) 
            min = b;
        if (c < min)
            min = c;


        return min;
    }

    public static void main(String[] args) {
        System.out.println("min(1,2,3) = "+ min3(1,2,3));
        System.out.println("min(3,2,1) = "+ min3(3,2,1));
        // System.out.println("max3(3,2,1) = " + max3(3,2,1));
        // System.out.println("max3(3,2,2) = " + max3(3,2,2));
        // System.out.println("max3(3,1,1) = " + max3(3,1,2));
        // System.out.println("max3(5,32,1) = " + max3(5,32,1));
    }

}