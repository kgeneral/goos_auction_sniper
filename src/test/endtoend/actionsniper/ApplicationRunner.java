package test.endtoend.actionsniper;

import actionsniper.Main;

public class ApplicationRunner {

	public static final String SNIPER_ID = "sniper"; 
  	public static final String SNIPER_PASSWORD = "sniper";
	protected static final String XMPP_HOSTNAME = null;
	private static final String STATUS_JOINING = null;
	private static final String STATUS_LOST = null;
  	private AuctionSniperDriver driver; 

	public void startBiddingIn(final FakeAuctionServer auction) {
		Thread thread = new Thread("Test Application") {
			@Override 
			public void run(){
				try{
					Main.main(XMPP_HOSTNAME, SNIPER_ID, SNIPER_PASSWORD, auction.getItemId());
				} catch (Exception e) {
					
				}
			}
		};
		thread.setDaemon(true);
		thread.start();
		driver = new AuctionSniperDriver(1000);
		
		driver.showsSniperStatus(STATUS_JOINING);
	}

	public void showsSniperHasLostAuction() {
		driver.showsSniperStatus(STATUS_LOST);
		
	}

	public void stop() {
		if (driver != null) { 
	      driver.dispose();  
	    } 
	}

}
