package com.zhen.www.service.impl;

import com.zhen.www.bean.Attractions;
import com.zhen.www.bean.VisaCountry;
import com.zhen.www.dao.impl.IDaoImpl;
import com.zhen.www.service.IService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by caiwei on 2017/7/18.
 */
@Service("serviceimpl")
public class IServiceImpl implements IService {

    private IDaoImpl idaoimpl;
    @Override
    public List<VisaCountry> findAttactions() {
        List<VisaCountry> attractions = idaoimpl.selectAttractions();
        if(attractions!=null&&attractions.size()>0){
            return attractions;
        }
        return null;
    }

    public IDaoImpl getIdaoimpl() {
        return idaoimpl;
    }
    @Resource
    public void setIdaoimpl(IDaoImpl idaoimpl) {
        this.idaoimpl = idaoimpl;
    }

}
