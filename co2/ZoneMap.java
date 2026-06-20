class ZoneMap {
    int min;
    int max;

    ZoneMap(int min, int max) {
        this.min = min;
        this.max = max;
    }

    boolean overlaps(int qMin, int qMax) {
        return !(max < qMin || min > qMax);
    }

    public static void main(String[] args) {
        ZoneMap block = new ZoneMap(100, 200);

        if(block.overlaps(150, 180))
            System.out.println("Read Block");
        else
            System.out.println("Skip Block");
    }
}
