//package io.ssafy.p.j11a307.product.dto;
//
//import io.ssafy.p.j11a307.product.entity.Product;
//import io.swagger.v3.oas.annotations.media.Schema;
//
//@Schema(description = "상품 정보를 수정하기 위한 DTO")
//public record UpdateProductDTO(
//        @Schema(description = "상품명", example = "타코야끼")
//        String name,
//
//        @Schema(description = "가격", example = "2800")
//        Integer price
//) {
//        // Product 엔티티를 받아서 record로 변환하는 생성자
//        public UpdateProductDTO(Product product) {
//                this(
//                        product.getName(),
//                        product.getPrice()
//                );
//        }
//}
package io.ssafy.p.j11a307.product.dto;

import io.ssafy.p.j11a307.product.entity.Product;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.List;

@Schema(description = "상품 정보를 수정하기 위한 DTO")
public record UpdateProductDTO(
        @Schema(description = "상품명", example = "타코야끼")
        String name,

        @Schema(description = "가격", example = "2800")
        Integer price,

        @Schema(description = "상품설명", example = "통통한 문어가 들어있는 타코야끼")
        String description,

        @Schema(description = "수정할 상품 카테고리 리스트")
        List<UpdateProductCategoryDTO> categories,

        @Schema(description = "수정할 옵션 카테고리 리스트")
        List<UpdateProductOptionCategoryDTO> optionCategories
) {
        // Product 엔티티를 받아서 record로 변환하는 생성자
        public UpdateProductDTO(Product product) {
                this(
                        product.getName(),
                        product.getPrice(),
                        product.getDescription(),  // 상품 설명 추가
                        product.getCategories() != null ? product.getCategories().stream()
                                .map(UpdateProductCategoryDTO::new)
                                .toList() : List.of(),
                        product.getOptionCategories() != null ? product.getOptionCategories().stream()
                                .map(UpdateProductOptionCategoryDTO::new)
                                .toList() : List.of()
                );
        }
}