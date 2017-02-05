package homework4;

import java.io.File;
import java.io.FileFilter;

public class FileSorting implements FileFilter {
	private String[] arreySortFiles;

	public FileSorting(String... arreySortFiles) {
		super();
		this.arreySortFiles = arreySortFiles;
	}

	private boolean check(String ext) {
		for (String stringExt : arreySortFiles) {
			if (stringExt.equals(ext)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean accept(File pathname) {
		int pointerIndex = pathname.getName().lastIndexOf(".");
		if (pointerIndex == -1) {
			return false;
		}
		String ext = pathname.getName().substring(pointerIndex + 1);
		return check(ext);
	}
}
