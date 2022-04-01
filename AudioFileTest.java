import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AudioFileTest {
	@Test
	public void test_parsePath_01() {
		Audiofile test01 = new Audiofile();
		test01.parsePathname("\\my-tmp\\file.mp3");
		char sepChar = System.getProperty("file.separator").charAt(0);
		System.getProperties().setProperty("file.separator", "\\");
		assertEquals("file.m3", sepChar + "my-tmp" + sepChar + "file.mp3", test01.getPathname());
		System.out.println(test01.getPathname());
//		assertEquals("file.m3",test01.getFilename());

	}
}
