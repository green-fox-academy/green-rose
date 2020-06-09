package domino;

public class Domino implements Comparable<Domino>{
    private int left;
    private int right;

    public Domino(int left, int right) {
        this.left = left;
        this.right = right;
    }

    public int getLeftSide() {
        return left;
    }

    public int getRightSide() {
        return right;
    }

    @Override
    public String toString() {
        return "[" + left + ", " + right + "]";
    }

    public void swap() {
        int temp = this.left;
        this.left = this.right;
        this.right = temp;
    }

    @Override
    public int compareTo(Domino d) {

      if (this.getLeftSide()>d.getLeftSide()) return 1;
      if (this.getLeftSide()<d.getLeftSide()) return -1;
      if(this.getRightSide()>d.getRightSide()) return 1;
      if(this.getRightSide()<d.getRightSide()) return -1;
      return 0;
    }

}
