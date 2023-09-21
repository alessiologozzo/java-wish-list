package org.lessons.java.exercises.classes;

public class IntList {
	private int[] data;
	private int index = -1;

	public IntList() {
		data = new int[0];
	}

	public IntList(int[] data) {
		this.data = data;
	}

	public IntList(int dim) {
		data = new int[dim];
	}

	public int get(int index) {
		this.index = index;

		return data[index];
	}

	public int getNext() {
		index++;
		return get(index);
	}

	public void resetIndex() {
		index = -1;
	}

	public boolean hasNext() {
		return index + 1 < data.length;
	}

	public void add(int newElement) {
		int[] newData = new int[data.length + 1];

		for (int i = 0; i < data.length; i++)
			newData[i] = data[i];

		newData[newData.length - 1] = newElement;

		data = newData;
	}

	public void add(int newElement, int index) {
		int[] newData = new int[data.length + 1];
		int j = 0;
		boolean added = false;

		for (int i = 0; i < newData.length; i++)
			if (!added) {
				if (i == index) {
					newData[i] = newElement;
					added = true;
					j = i - 1;
				} else
					newData[i] = data[i];
			} else {
				j++;
				newData[i] = data[j];
			}

		data = newData;
	}

	public void remove() {
		int[] newData = new int[data.length - 1];

		for (int i = 0; i < newData.length; i++)
			newData[i] = data[i];

		data = newData;
	}

	public void remove(int index) {
		int[] newData = new int[data.length - 1];
		int j = 0;
		boolean removed = false;

		for (int i = 0; i < data.length; i++)
			if (!removed) {
				if (i == index) {
					j = i - 1;
					removed = true;
				} else
					newData[i] = data[i];
			} else {
				j++;
				newData[j] = data[i];
			}

		data = newData;
	}

	public int size() {
		return data.length;
	}

	@Override
	public String toString() {
		String s = "[";

		for (int i = 0; i < data.length; i++)
			s += data[i] + ((i + 1 < data.length ? ", " : ""));

		return s + "]";
	}
}
