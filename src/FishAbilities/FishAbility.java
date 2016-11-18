public abstract class FishAbility {

	/**
	 * @param String Name of the fish's ability
	 */
	protected String name;

	protected abstract void setup();

	public FishAbility() {
		this.setup();
		this.name = this.getName();
	}

	public String getName() {
		return this.name;
	}

}
