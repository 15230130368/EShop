package com.zkx.serviceImpl;

import com.zkx.mapper.AddressMapper;
import com.zkx.pojo.Address;
import com.zkx.pojo.City;
import com.zkx.pojo.Province;
import com.zkx.service.AddressService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("addressService")
public class AddressServiceImpl implements AddressService {
	@Resource
	private AddressMapper addressMapper;

	public void addAddress(Address address) {
		addressMapper.addAddress(address);
	}

	public List<Province> selAllProvince() {
		return addressMapper.selAllProvince();
	}

	public List<City> selAllCityByPid(int pid) {
		return addressMapper.selAllCityByPid(pid);
	}

	public List<Address> selAllAddressByUserNum(String userNum) {
		return addressMapper.selAllAddressByUserNum(userNum);
	}
}
