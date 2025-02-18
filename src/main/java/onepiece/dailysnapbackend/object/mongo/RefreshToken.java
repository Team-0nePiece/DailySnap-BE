package onepiece.dailysnapbackend.object.mongo;

import jakarta.validation.constraints.NotNull;
import java.time.LocalDateTime;
import lombok.Builder;
import lombok.Getter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Getter
@Builder
public class RefreshToken {

  @Id
  private String refreshTokenId;

  @NotNull
  private String token;

  @Indexed
  @NotNull
  private String memberId;

  @NotNull
  private LocalDateTime expiryDate;
}
