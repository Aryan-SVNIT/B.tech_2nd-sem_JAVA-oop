class Matrix3D_1 {

    static int sizeX = 3;
    static int sizeY = 3;
    static int sizeZ = 3;

    static void set(int value, int indexX, int indexY, int indexZ, int[] arr) {
        int index=indexX*(sizeY*sizeZ)+indexY*sizeZ+indexZ;

        arr[index] = value;
    }

    static int get(int indexX, int indexY, int indexZ, int[] arr) {
        int index=indexX*(sizeY*sizeZ)+indexY*sizeZ+indexZ;

        return arr[index];
    }

    public static void main(String[] args) {

        int[] arr = new int[sizeX*sizeY*sizeZ];

        set(5, 0, 0, 0, arr);
        set(15, 1, 2, 1, arr);
        set(25, 2, 1, 2, arr);

        System.out.println(get(0, 0, 0, arr));
        System.out.println(get(1, 2, 1, arr));
        System.out.println(get(2, 1, 2, arr));
    }
}