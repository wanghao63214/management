package com.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import com.beans.Account;
import com.beans.AccountExample;
import com.mapper.AccountMapper;
import com.mapper.AuthorityMapper;
import com.mapper.RolesMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {

	@Autowired
	private AuthorityMapper authorityMapper;

	@Autowired
	private AccountMapper accountMapper;
	
	/**
	 * 根据角色id 查询显示菜单
	 * @param roleId
	 * @throws Exception
	 */
	public List<Map<String, Object>> showMeun(long roleId) throws Exception{
		return authorityMapper.selectByRoleId(roleId);
	}

	public Account selectAcountByUserName(String accountName) {
		AccountExample accountExample = new AccountExample();
		AccountExample.Criteria criteria = accountExample.createCriteria();
		criteria.andUsernameEqualTo(accountName);
		List<Account> list = accountMapper.selectByExample(accountExample);
		Account account = list.get(0);
		return account;
	}

}
