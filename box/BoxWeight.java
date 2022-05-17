package box;

public class BoxWeight extends Box {
    double weight;

    BoxWeight(double width, double height, double depth, double weight) {  // կոնստրուկտոր, որն օգտագործվում է բոլոր չափերը նշելիս
        this.width = width;
        this.height = height;
        this.depth = depth;
        this.weight = weight;
    }

    public static void main(String[] args) {
        Box box1 = new Box();
    }
}
