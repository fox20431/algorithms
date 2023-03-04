public class NC68 {
    public int jumpFloor(int target) {
        if(target==1)
            return 1;
        if(target==2)
            return 2;
        return jumpFloor(target-1)+jumpFloor(target-2);
    }
}

class NC68Main {
    public static void main(String[] args) {

    }
}
