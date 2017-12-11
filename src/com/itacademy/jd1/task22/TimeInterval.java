package com.itacademy.jd1.task22;

public class TimeInterval {
	private int hour;
	private int min;
	private int sec;

	public TimeInterval(int h, int m, int s) {
		hour = h;
		min = m;
		sec = s;
	}

	public TimeInterval(int s) {
		sec = s % 60;
		int m = (s - sec) / 60;
		min = m % 60;
		hour = (m - min) / 60;
	}

	public int getSecond() {
		return sec + min * 60 + hour * 3600;
	}

	public int compareTime(TimeInterval t) {
		if (this.getSecond() >= t.getSecond()) {
			System.out.println(String.format("%s >= %s", this.getSecond(), t.getSecond()));
		} else {
			System.out.println(String.format("%s < %s", this.getSecond(), t.getSecond()));
		}
		return this.getSecond() - t.getSecond();
	}

	public void printTimeInSecond() {
		System.out.println("Промежуток в секундах: " + this.getSecond());
	};

	public void printTime() {
		System.out.println(String.format("Промежуток: часы %s, минуты %s, секунды %s ", this.hour, this.min, this.sec));
	};

}
