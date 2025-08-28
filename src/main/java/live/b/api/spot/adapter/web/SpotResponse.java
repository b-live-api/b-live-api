package live.b.api.spot.adapter.web;

public record SpotResponse(
        Long spotId,
        String spotName,
        String spotImageUrl
) {
}
