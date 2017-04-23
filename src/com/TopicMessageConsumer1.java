package com;

import javax.ejb.MessageDriven;

/**
 *
 * @author nik
 */
@MessageDriven(mappedName = "topicDestination")
public class TopicMessageConsumer1 extends AbstractMessageConsumer {
}