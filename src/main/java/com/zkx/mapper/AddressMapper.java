package com.zkx.mapper;

import com.zkx.pojo.Address;
import com.zkx.pojo.City;
import com.zkx.pojo.Province;

import java.util.List;

public interface AddressMapper {
	public void addAddress(Address address);
	public List<Province> selAllProvince();
	public List<City> selAllCityByPid(int pid);
	public List<Address> selAllAddressByUserNum(String userNum);
}
