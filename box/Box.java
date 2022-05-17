package box;

public class Box {
    public double width, height, depth;

    Box(Box obj) {                       // կառուցել օբյեկտի կլոն
        this.width = obj.width;
        this.height = obj.height;
        this.depth = obj.depth;
    }

    Box(double w, double h, double d) {  // կոնստրուկտոր, որն օգտագործվում է բոլոր չափերը նշելիս
        this.width = w;
        this.height = h;
        this.depth = d;
    }

    Box() {                             // կոնստրուկտոր, որն օգտագործվում է չափերի բացակայության դեպքում
        this.width = 5;
        this.height = 5;
        this.depth = 5;
    }


    Box(double len) {                  // կոնստրուկտոր, որն օգտագործվում է խորանարդի ստեղծման ժամանակ
        this.width = this.height = this.depth = len;
    }

    public static void main(String[] args) {
        Box box = new Box();

        System.out.println(box.volume());

    }

    double volume() {                 // հաշվարկել և վերադարձնել ծավալը
        return width * height * depth;
    }
}
