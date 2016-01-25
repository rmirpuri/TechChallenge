package com.oracle.techchallenge.test;



import org.junit.Before;
import org.junit.Test;
import org.junit.Ignore;

import com.oracle.techchallenge.test.helper.Keys;

import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;
import static org.junit.Assert.assertEquals;

public class Challenge1 {
	
	TwitterFactory factory;
	Twitter twitter;
	
	@Before
    public void setUp() {
		
		Keys keys = new Keys();
		ConfigurationBuilder cbb = new ConfigurationBuilder();
        cbb.setDebugEnabled(true)
            .setOAuthConsumerKey(keys.getConsumerKey())
            .setOAuthConsumerSecret(keys.getConsumerSecret())
            .setOAuthAccessToken(keys.getAccessToken())
            .setOAuthAccessTokenSecret(keys.getAccessSecret());
        
        factory = new TwitterFactory(cbb.build());
        twitter = factory.getInstance();
	
	}
 
   @Test
   public void testScreenName() throws IllegalStateException, TwitterException {
	   String screenName = twitter.getScreenName();
	   System.out.println("The screen name is: "+screenName);
   
   }
   
   @Test
   public void testUpdateStatus() {
	   /*Using the docs on http://twitter4j.org/javadoc/ 
	    *Update the status with Test 1  */
  
   }
   
   @Test
   public void testPrintAllTweets(){
	   /*Using the docs on http://twitter4j.org/javadoc/
	    * print out all the tweets on timeline
	    */
   }
}