package org.tenten.tentenbe.domain.tour.dto.response;

import io.swagger.v3.oas.annotations.media.Schema;
import org.tenten.tentenbe.domain.review.model.Review;
import org.tenten.tentenbe.domain.tour.model.TourItem;

public record TourSimpleResponse(
    @Schema(defaultValue = "1")
    Long id,

    @Schema(defaultValue = "카테고리 Id")
    Long contentTypeId,

    @Schema(defaultValue = "여행지 이름")
    String title,

    @Schema(defaultValue = "4.5")
    Double ratingAverage,

    @Schema(defaultValue = "100")
    Long reviewCount,

    @Schema(defaultValue = "100")
    Long likedCount,

    @Schema(defaultValue = "false")
    Boolean liked,

    @Schema(defaultValue = "http://~~~~~~image.jpg")
    String smallThumbnailUrl,

    @Schema(defaultValue = "서울특별시 강남구(여행지 주소)")
    String tourAddress,

    @Schema(defaultValue = "127.31(경도)")
    String longitude,

    @Schema(defaultValue = "37.31(위도)")
    String latitude
) {
    public static TourSimpleResponse fromEntity(TourItem tourItem) {
        return new TourSimpleResponse(
            tourItem.getId(),
            tourItem.getContentTypeId(),
            tourItem.getTitle(),
            tourItem.getReviews().stream()
                .mapToDouble(Review::getRating)
                .average()
                .orElse(0.0),
            tourItem.getReviewTotalCount(),
            tourItem.getLikedTotalCount(),
            true,
            tourItem.getSmallThumbnailUrl(),
            tourItem.getAddress(),
            tourItem.getLongitude(),
            tourItem.getLatitude()
        );
    }
}
