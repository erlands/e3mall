package cn.itcast.service;

import cn.itcast.domain.TbItem;

public interface ItemService {
	/**
	 * 通过id查询item
	 * @param itemId
	 * @return
	 */
	public TbItem findItemById(Long itemId);
}
