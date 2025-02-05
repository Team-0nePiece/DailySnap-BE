package onepiece.dailysnapbackend.util.exception;

import lombok.Builder;
import lombok.Getter;

import java.util.Map;

/**
 * 예시 응답값
 * "code" : "400"
 * "message" : "잘못된 요청입니다."
 * "title" : "값을 입력해주세요"
 */
@Getter
public class ValidErrorResponse {
  private final String code;
  private final String message;
  private final Map<String, String> validation;

  @Builder
  public ValidErrorResponse(String code, String message, Map<String, String> validation) {
    this.code = code;
    this.message = message;
    this.validation = validation;
  }

  public void addValidation(String field, String message) {
    this.validation.put(field, message);
  }
}
