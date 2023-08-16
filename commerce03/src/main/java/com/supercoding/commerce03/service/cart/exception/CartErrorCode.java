package com.supercoding.commerce03.service.cart.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
@AllArgsConstructor
public enum CartErrorCode {
	//status(HttpStatus.badRequest) 400
	INVALID_QUANTITY("수량을 확인해주세요.", HttpStatus.BAD_REQUEST),
	USER_NOT_FOUND("존재하지 않는 유저 입니다.", HttpStatus.BAD_REQUEST),
	THIS_PRODUCT_DOES_NOT_EXIST("존재하지 않는 상품 입니다.", HttpStatus.BAD_REQUEST),

	//status(HttpStatus.CONFLICT) 409
	OUT_OF_STOCK("상품이 품절되었습니다.", HttpStatus.CONFLICT),
	PRODUCT_ALREADY_EXISTS("장바구니에 이미 존재하는 상품입니다.", HttpStatus.CONFLICT);

	private final String description;
	private final HttpStatus httpStatus;
}
