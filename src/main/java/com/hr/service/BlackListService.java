package com.hr.service;

import com.hr.domain.BlackList;

public interface BlackListService {
	/**
	 * 根据personId查询是否在黑名单
	 * @param PersonId
	 * @return
	 */
	BlackList queryByPersonId(Integer PersonId);
	
	
}
