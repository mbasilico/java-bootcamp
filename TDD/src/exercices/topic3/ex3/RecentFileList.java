package exercices.topic3.ex3;

import java.util.ArrayList;

public class RecentFileList<F> {

	private ArrayList<F> recentF;
	private int capacity = 15;

	public RecentFileList() {
		this.recentF = new ArrayList<F>();
	}

	public int checkSize() {
		return this.recentF.size();
	}

	public void setMaxCapacity(int i) {
		this.capacity = i;
	}

	private void checkCapacity() {
		if (recentF.size() > this.capacity)
			recentF.remove(recentF.size() - 1);
	}

	public void add(F file) {
		recentF.remove(file);//remove the file if exists
		recentF.add(0, file);// and add it first = most recent
		checkCapacity();
	}

	public F getLeastRecentFile() {
		return recentF.get(recentF.size() - 1);
	}

	public ArrayList<F> getRecentFiles() {
		return (ArrayList<F>) recentF;
	}

}
