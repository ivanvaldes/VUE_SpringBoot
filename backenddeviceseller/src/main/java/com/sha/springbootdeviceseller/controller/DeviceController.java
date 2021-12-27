package com.sha.springbootdeviceseller.controller;

import com.sha.springbootdeviceseller.model.Device;
import com.sha.springbootdeviceseller.service.DeviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/device")//pre-path
public class DeviceController {

    @Autowired
    private DeviceService deviceService;

    @PostMapping
    public ResponseEntity<?> saveDevice(@RequestBody Device device){
        return new ResponseEntity<>(deviceService.saveDevice(device), HttpStatus.CREATED);
    }

    @DeleteMapping("{deviceId}")
    public ResponseEntity<?> deleteDevice(@PathVariable Long deviceId){
        deviceService.deleteDevice(deviceId);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<?> getAllDevices(){
        return new ResponseEntity<>(deviceService.findAllDevices(), HttpStatus.OK);
    }
}
