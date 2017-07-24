package com.zhen.www.dao;

import com.zhen.www.bean.Attractions;
import com.zhen.www.bean.VisaCountry;

import java.util.List;

/**
 * Created by caiwei on 2017/7/18.
 */
public interface IDao {
    List<VisaCountry> selectAttractions();
}
