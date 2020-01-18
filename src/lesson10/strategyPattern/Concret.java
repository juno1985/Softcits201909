package lesson10.strategyPattern;

public class Concret {
	//多态
	private AbstractStrategy strategy;

	public AbstractStrategy getStrategy() {
		return strategy;
	}

	public void setStrategy(AbstractStrategy strategy) {
		this.strategy = strategy;
	}
	
	public void execute() {
		strategy.action();
	}

}
