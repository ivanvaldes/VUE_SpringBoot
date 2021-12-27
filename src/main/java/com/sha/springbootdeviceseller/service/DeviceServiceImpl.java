package com.sha.springbootdeviceseller.service;

import com.sha.springbootdeviceseller.model.Device;
import com.sha.springbootdeviceseller.repository.DeviceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class DeviceServiceImpl implements  DeviceService{

    @Autowired
    private DeviceRepository deviceRepository;

    @Override
    public Device saveDevice(Device device){
        device.setCreateTime(LocalDateTime.now());
        return deviceRepository.save(device);
    }

    @Override
    public void deleteDevice(Long id){
       deviceRepository.deleteById(id);
    }

    @Override
    public List<Device> findAllDevices(){
        return deviceRepository.findAll();
    }

}
