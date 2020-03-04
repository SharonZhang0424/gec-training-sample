package club.global_engineer.demo;

import org.junit.jupiter.api.Test;

class DemoTest {

	@Test
	void test() {
		int a = 10;
		int b = a++ + a + a-- - a-- + ++a;
		System.out.println(b);
	}

	@Test
	void 文字列操作() {
		String str = null;

		if (str == null) {
			str = "あああああ";
		}
		System.out.println(str);

		//splitで分割
		// concat、joinで連結
		//substringで範囲を切り出す
		//containsで有無の確認
		//indexOfで位置の検索
		//startsWith、endsWithで始まりと終わりを検索
		//formatで書式付き文字列を出力
		//toUpperCase、toLowerCaseで大文字と小文字を変換する
		//matchesでパターンのマッチング
		//replaceとreplaceAllで置換
	}
}
