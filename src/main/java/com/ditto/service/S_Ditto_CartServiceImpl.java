package com.ditto.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.ditto.dto.CartDTO;
import com.ditto.entity.S_Ditto_CartEntity;
import com.ditto.repository.S_Ditto_CartRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class S_Ditto_CartServiceImpl implements S_Ditto_CartService {
	
	private final S_Ditto_CartRepository cartRepository;

	@Override
	public Long register(CartDTO CartDTO) {
		S_Ditto_CartEntity entity = dtoToEntity(CartDTO);
		S_Ditto_CartEntity savedEntity = cartRepository.save(entity);
		return savedEntity.getCartId();
	}

	@Override
	public void updateArticle(CartDTO CartDTO) {
		Optional<S_Ditto_CartEntity> res = cartRepository.findById(CartDTO.getCartId());
		if(res.isPresent()) {
			S_Ditto_CartEntity cart = res.get();
			cart.setCartCount(CartDTO.getCartCount());
			cartRepository.save(cart);
		}
		
	}

	@Override
	public void delArticle(Long CartNo) {
		cartRepository.deleteById(CartNo);
		
	}

	@Override
	public CartDTO get(Long CartNo) {
		 Optional<S_Ditto_CartEntity> optionalCart = cartRepository.findById(CartNo);
		    if (optionalCart.isPresent()) {
		    	S_Ditto_CartEntity cart = optionalCart.get();
		        return entityToDto(cart);
		    } else {
		        // 조회된 회원이 없을 경우 null이 아닌 다른 값이나 예외 처리를 해야 합니다.
		        throw new RuntimeException("해당하는 회원을 찾을 수 없습니다.");
		    }
	}

	@Override
	public List<S_Ditto_CartEntity> getList() {
		return cartRepository.findAll();
	}

}
