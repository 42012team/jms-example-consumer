package com;


import javax.ejb.MessageDriven;

/**
 *
 * @author nik
 */
@MessageDriven(mappedName = "queueDestination")
public class QueueMessageConsumer2 extends AbstractMessageConsumer {
}
