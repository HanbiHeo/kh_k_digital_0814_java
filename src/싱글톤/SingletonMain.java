package 싱글톤;
//0824_10
//싱글톤 : 객체가 단 한번만 만들어 지는 것
public class SingletonMain {
    public static void main(String[] args) {
//        Singleton test = new Singleton(); 객체 생성을 할 수 없음
//        Singleton obj1 = Singleton.getSingleton(); //new를 붙이면 안됨. 한번 만들어 졌기 때문에.
//        Singleton obj2 = Singleton.getSingleton();
//        System.out.println(obj1.id);
//        System.out.println(obj1.name);
//        obj1.id = 1004;
//        obj1.name = "영희";
//        System.out.println(obj2.id);
//        System.out.println(obj2.name);
        TestObject1 member1 = new TestObject1();
        TestObject2 member2 = new TestObject2();
//        member1.setInfo("동그라미", 27);
        for(int i = 0; i < 1000; i++) {
            member1.setInfo("동그라미", 27);
            member2.setInfo("우영우", 27);
        }
        member1.viewInfo(); // 두개가 다른 정보를 가지고 있어도 싱글톤으로 값을 공유하고 있음.
    }
}
