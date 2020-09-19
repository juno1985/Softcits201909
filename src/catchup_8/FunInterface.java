package catchup_8;
@FunctionalInterface
public interface FunInterface {
	static void foo(){
		System.out.println("foo");
	}
	default void bar(){
		System.out.println("bar");
	}
	void test();
//	void test2();
}
