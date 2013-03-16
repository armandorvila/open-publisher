package com.armandorv.publisher.client.application;

public class ServiceFactory {

	public static ServiceFactory FACTORY = new ServiceFactory();

	private ServiceFactory() {
	}

	public StatsService getStatsService() {
		return new StatsService();
	}

}
