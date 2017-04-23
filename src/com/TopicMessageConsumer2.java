package com;

import javax.ejb.MessageDriven;

/**
 *
 * @author nik
 */
@MessageDriven(mappedName = "topicDestination")
public class TopicMessageConsumer2 extends AbstractMessageConsumer {
}
