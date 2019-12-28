package lab10;

class gArray<E> {
    private E[] arr;

    gArray(E[] arr) {
        this.arr = arr;
    }

    public void set(E[] arr) {
        this.arr = arr;
    }

    public E getE(int inx) {
        return arr[inx];
    }
}

class Utilities {
    public static <E> E getElem(E[] a, int inx) {
        gArray<E> newArr = new gArray<>(a);
        try {
            return newArr.getE(inx);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index is out of bounds");
            return null;
        }
    }
}

class Test2 {
    public static void main(String[] args) {
        String[] a1 = {"Korea", "Japan", "Russia", "Peru", "Canada"};
        Integer[] a2 = {2, 4, 8, 16, 32, 64, 128, 256, 512};

        System.out.println(Utilities.getElem(a1, 3));
        System.out.println(Utilities.getElem(a2, 9));
    }
}
