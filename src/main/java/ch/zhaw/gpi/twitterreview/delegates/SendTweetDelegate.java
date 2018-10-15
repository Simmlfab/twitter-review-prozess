package ch.zhaw.gpi.twitterreview.delegates;

import javax.inject.Named;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

/**
 * Implementation des Service Task "Tweet Senden"
 * 
 * @author simml
 */
@Named("sendTweetAdapter")
public class SendTweetDelegate implements JavaDelegate{

    /**
     * 1. Die Prozessvariable TweetContent wird ausgelesen
     * 2. Dieser Text wird in der Konsole ausgegebn.
     * 
     * @param de            Objekt welches die Verknüpfung zur Process Engine und aktuellen Execution enthält
     * @throws Exception
     */
    @Override
    public void execute(DelegateExecution de) throws Exception {
        String tweetContent = (String) de.getVariable("tweetContent");
        System.out.println("----------------Folgender Tweet wird veröffentlicht------------------" + tweetContent);
    }
    
}
