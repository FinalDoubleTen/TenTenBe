package org.tenten.tentenbe.domain.review.dto.response;

import io.swagger.v3.oas.annotations.media.Schema;
import org.tenten.tentenbe.global.common.enums.KeywordType;

public record TourKeywordInfo(
    @Schema(defaultValue = "1")
    Long keywordId,
    @Schema(defaultValue = "깨끗해요")
    String content,
    @Schema(defaultValue = "ACCOMMODATION_KEYWORD")
    KeywordType type,
    @Schema(defaultValue = "2")
    Long keywordCount) {
}
