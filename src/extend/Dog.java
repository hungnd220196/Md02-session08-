package extend;

// sub class
public class Dog extends Animal{
    String name;
    // lớp DOg kế thừa Animal
    @Override // ch thich phát hiện lỗi
    public void makeSound(){
        // empty
        System.out.println("go go");
    }
    public Dog(String species){
        super(species); // gọi đến constructor của lớp cha
    }

    public Dog(String species, String name) {
        super(species);
        this.name = name;
    }

    public void printSpecies(){
        // in tên loài  + tên của con chó
        System.out.println(super.getSpecies());
    }

    //
//    @Override
//    public void move() {
//        System.out.println("chó di chuyển");
//    }
//
//    @Override
//    public void eat() {
//        System.out.println("chó ăn xương");
//    }
//
//    @Override
//    public void sleep() {
//        System.out.println("chó đang ngu");
//    }

}
