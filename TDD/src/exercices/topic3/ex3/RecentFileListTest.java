package exercices.topic3.ex3;

import static org.junit.Assert.*;

import java.io.File;
import org.junit.Test;

public class RecentFileListTest {

	@Test
	public void emptyAndAddtest() {
		File f = new File("f");
		RecentFileList<File> fileList = new RecentFileList<File>();
		assertEquals(fileList.checkSize(), 0);
		fileList.add(f);
		RecentFileList<File> fileList2 = new RecentFileList<File>();
		fileList2.add(f);
		assertEquals(fileList.getRecentFiles(), fileList2.getRecentFiles());
		assertEquals(fileList.checkSize(), 1);
	}

	@Test
	public void maxCapacityTest() {
		File f1 = new File("f1");
		File f2 = new File("f2");
		File f3 = new File("f3");
		RecentFileList<File> fileList = new RecentFileList<File>();
		fileList.setMaxCapacity(1);
		fileList.add(f1);
		fileList.add(f2);
		fileList.add(f3);
		assertEquals(fileList.checkSize(), 1);
		RecentFileList<File> fileList2 = new RecentFileList<File>();
		fileList2.add(f3);
		assertEquals(fileList.getRecentFiles(), fileList2.getRecentFiles());
	}

	@Test
	public void alreadyExist() {
		File f1 = new File("f1");
		File f2 = new File("f2");
		File f3 = new File("f3");
		RecentFileList<File> fileList = new RecentFileList<File>();
		fileList.setMaxCapacity(3);
		fileList.add(f1);// [f1]
		fileList.add(f2);// [f2,f1]
		fileList.add(f3);// [f3,f2,f1]
		fileList.add(f2);// [f3,f2,f1]f2 exists, so is most recent, array must
							// be /[f2,f3,f1]
		assertEquals(fileList.checkSize(), 3);
		RecentFileList<File> fileList2 = new RecentFileList<File>();
		fileList2.add(f1);// [f1]
		fileList2.add(f3);// [f3,f1]
		fileList2.add(f2);// [f2,f3,f1]
		assertEquals(fileList.checkSize(), 3);
		assertEquals(fileList.getRecentFiles(), fileList2.getRecentFiles());
	}

}