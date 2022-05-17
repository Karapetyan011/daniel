//package inner_and_nested_class;
//
//public class Main {
//    public static void main(String[] args) {
//        //Inner class
//        OuterClass myOuter = new OuterClass();
//
//        OuterClass.InnerClass myInner = myOuter.new InnerClass();
//
//        OuterClass.InnerClass.InnerInnerClass myInnerInner = myInner.new InnerInnerClass();
//
//
//        System.out.println(myInner.y + myOuter.x + myInnerInner.z);
//
//
//         Static inner class
//        OuterClass.InnerClass myInner = new OuterClass.InnerClass();
//        System.out.println(myInner.y);
//
//
//         Access Outer Class From Inner Class
//        OuterClass myOuter = new OuterClass();
//        OuterClass.InnerClass myInner = myOuter.new InnerClass();
//        System.out.println(myInner.myInnerMethod());
//    }
//}