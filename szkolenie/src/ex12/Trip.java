package ex12;

import java.time.LocalDate;

public abstract class Trip {
	private LocalDate start;
	private LocalDate end;
	private String destination;
	private int price;

	public Trip(LocalDate start, LocalDate end, String destination) {
		this.start = start;
		this.end = end;
		this.destination = destination;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getPrice() {
		return price;
	}

	public String getDestination() {
		return destination;
	}

	public LocalDate getEnd() {
		return end;
	}

	public LocalDate getStart() {
		return start;
	}

	@Override
	public String toString() {
		return String.format("%s, %d PLN, from %s to %s",
		        destination, getPrice(), start, end);
	}

}
