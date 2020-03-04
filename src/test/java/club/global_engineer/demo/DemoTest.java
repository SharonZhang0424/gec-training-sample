package club.global_engineer.demo;

import org.junit.jupiter.api.Test;

class DemoTest {

	@Test
	void test() {
		int a = 10;
		int b = a++ + a + a-- - a-- + ++a;
		System.out.println(b);

	}

}
