package io.ssafy.p.j11a307.store.entity;

import io.ssafy.p.j11a307.store.dto.StoreUpdateRequest;
import io.ssafy.p.j11a307.store.exception.BusinessException;
import io.ssafy.p.j11a307.store.exception.ErrorCode;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Store {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer userId; // Owner ID만 저장
    private String name;
    private String address;
    private String latitude;
    private String longitude;
    private String type;
    private String bankAccount;
    private String bankName;
    private String ownerWord;
    private String status;

    // 이름 변경 메서드
    public void changeName(String name) {
        if (name == null || name.isEmpty()) {
              throw new BusinessException(ErrorCode.STORE_NAME_NULL);
        }
        this.name = name;
    }

    // 주소 변경 메서드
    public void changeAddress(String address) {
        if (address == null || address.isEmpty()) {
            throw new BusinessException(ErrorCode.STORE_ADDRESS_NULL);
        }
        this.address = address;
    }

    public Store updateWith(StoreUpdateRequest request) {
        return Store.builder()
                .id(this.id)  // ID는 변경하지 않음
                .userId(this.userId)  // Owner ID는 그대로 유지
                .name(request.name() != null ? request.name() : this.name)
                .address(request.address() != null ? request.address() : this.address)
                .latitude(request.latitude() != null ? request.latitude() : this.latitude)
                .longitude(request.longitude() != null ? request.longitude() : this.longitude)
                .type(request.type() != null ? request.type() : this.type)
                .bankAccount(request.bankAccount() != null ? request.bankAccount() : this.bankAccount)
                .bankName(request.bankName() != null ? request.bankName() : this.bankName)
                .ownerWord(request.ownerWord() != null ? request.ownerWord() : this.ownerWord)
                .status(request.status() != null ? request.status() : this.status)
                .build();
    }

}
