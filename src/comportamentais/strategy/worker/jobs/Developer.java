package comportamentais.strategy.worker.jobs;

import comportamentais.strategy.worker.strategies.eat.MeatFoodStrategy;
import comportamentais.strategy.worker.strategies.transportation.CarStrategy;
import comportamentais.strategy.worker.strategies.work.DeveloperStrategy;

public class Developer implements Worker {

	@Override
	public void eat() {
		new MeatFoodStrategy().eat();
	}

	@Override
	public void move() {
		new CarStrategy().move();
	}

	@Override
	public void work() {
		new DeveloperStrategy().work();
	}

}
