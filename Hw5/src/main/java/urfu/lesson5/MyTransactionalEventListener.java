package urfu.lesson5;

import org.springframework.stereotype.Component;
import org.springframework.transaction.event.TransactionalEventListener;

@Component
public class MyTransactionalEventListener
{
    @TransactionalEventListener
    public void onApplicationEvent(MessageSentEvent event)
    {
        System.out.println("MyTransactionalEventListener: " + event.getMessageReport());
    }
}
