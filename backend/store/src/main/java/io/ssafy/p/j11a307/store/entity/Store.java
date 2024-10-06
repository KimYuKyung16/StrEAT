package io.ssafy.p.j11a307.store.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.ssafy.p.j11a307.store.dto.UpdateStoreDTO;
import io.ssafy.p.j11a307.store.exception.BusinessException;
import io.ssafy.p.j11a307.store.exception.ErrorCode;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import java.util.List;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Store {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private Integer userId;

    @Column(nullable = false, length = 20)
    private String businessRegistrationNumber;

    @Column(nullable = false, length = 40)
    private String name;

    @Column(nullable = false)
    private String address;

    @Column(nullable = false, length = 20)
    private Double latitude;

    @Column(nullable = false, length = 20)
    private Double longitude;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 20)
    private StoreType type;

    @Column(nullable = false, length = 50)
    private String bankAccount;

    @Column(nullable = false, length = 20)
    private String bankName;

    private String ownerWord;

    private String storePhoneNumber;

    private String closedDays;

    @Enumerated(EnumType.STRING)
    @Column(length = 20)
    private StoreStatus status;

    // 관계 설정
    @OneToMany(mappedBy = "store", cascade = CascadeType.ALL)
    @JsonIgnore  // 순환 참조 방지
    private List<StorePhoto> storePhotos;

    @OneToMany(mappedBy = "store", cascade = CascadeType.ALL)
    @JsonIgnore  // 순환 참조 방지
    private List<StoreLocationPhoto> storeLocationPhotos;

    @OneToMany(mappedBy = "store", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<StoreSimpleLocation> simpleLocations;

    @ManyToOne
    @JoinColumn(name = "industry_category_id", nullable = false)
    @JsonIgnore  // 순환 참조 방지
    private IndustryCategory industryCategory;

    @OneToOne(mappedBy = "store", cascade = CascadeType.ALL)
    @JsonIgnore  // 순환 참조 방지
    private BusinessDay businessDay;

    // Store 삭제 전 IndustryCategory와의 연관관계를 끊는 메서드 추가
    public void removeFromCategory() {
        if (this.industryCategory != null) {
            this.industryCategory.removeStore(this);
            this.industryCategory = null;  // 연관관계 제거
        }
    }

    // 이름 변경 메서드
    public void changeName(String name) {
        if (name == null || name.isEmpty()) {
              throw new BusinessException(ErrorCode.STORE_NAME_NULL);
        }
        this.name = name;
    }

    public void changeOwnerWord(String ownerWord) {
        this.ownerWord = ownerWord;
    }

    // 주소 변경 메서드
    public void changeAddress(String address) {
        if (address == null || address.isEmpty()) {
            throw new BusinessException(ErrorCode.STORE_ADDRESS_NULL);
        }
        this.address = address;
    }

    // 사용자 ID 설정 메서드
    public void assignOwner(Integer userId) {
        if (userId == null) {
            throw new BusinessException(ErrorCode.OWNER_NOT_FOUND);
        }
        this.userId = userId;
    }

    public Store updateWith(UpdateStoreDTO request, IndustryCategory industryCategory) {
        return Store.builder()
                .id(this.id)  // ID는 변경하지 않음
                .userId(this.userId)  // Owner ID는 그대로 유지
                .businessRegistrationNumber(request.businessRegistrationNumber() != null ? request.businessRegistrationNumber() : this.businessRegistrationNumber)  // 사업자 등록번호 처리 추가
                .name(request.name() != null ? request.name() : this.name)
                .address(request.address() != null ? request.address() : this.address)
                .latitude(request.latitude() != null ? request.latitude() : this.latitude)
                .longitude(request.longitude() != null ? request.longitude() : this.longitude)
                .type(request.type() != null ? request.type() : this.type)
                .bankAccount(request.bankAccount() != null ? request.bankAccount() : this.bankAccount)
                .bankName(request.bankName() != null ? request.bankName() : this.bankName)
                .ownerWord(request.ownerWord() != null ? request.ownerWord() : this.ownerWord)
                .storePhoneNumber(request.storePhoneNumber() != null ? request.storePhoneNumber() : this.storePhoneNumber)  // storePhoneNumber 추가
                .closedDays(request.closedDays() != null ? request.closedDays() : this.closedDays)
                .status(request.status() != null ? request.status() : this.status)
                .industryCategory(industryCategory)
                .build();
    }

    public void changeClosedDays(String closedDays) {
        this.closedDays = closedDays;
    }

    public Integer getStoreId() {
        return this.id;
    }

    public void updateLocationAndStatus(String address, Double latitude, Double longitude, String open) {

    }
}
