package game;

public class Card {

	private Hand held;
	private String name;
	private Type type;

	private enum Type {
		WEAPON,
		CHARACTER,
		ROOM;
	}
}
