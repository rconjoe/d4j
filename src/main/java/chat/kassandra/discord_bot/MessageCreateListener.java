package chat.kassandra.discord_bot;

import discord4j.core.event.domain.message.MessageCreateEvent;
import reactor.core.publisher.Mono;
import org.springframework.stereotype.Service;

@Service
public class MessageCreateListener extends MessageListener implements EventListener<MessageCreateEvent> {

  @Override
  public Class<MessageCreateEvent> getEventType() {
    return MessageCreateEvent.class;
  }

  @Override
  public Mono<Void> execute(MessageCreateEvent event) {
    return processCommand(event.getMessage());
  }

}
