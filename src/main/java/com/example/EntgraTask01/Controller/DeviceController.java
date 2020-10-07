package com.example.EntgraTask01.Controller;

import com.example.EntgraTask01.Entity.Device;
import com.example.EntgraTask01.Service.DeviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DeviceController {

    @Autowired
    private DeviceService service;

    @PostMapping("/addDevice")
    public Device addDevice(@RequestBody Device device){
        return service.saveDevice(device);
    }

    @PostMapping("/addDevices")
    public List<Device> addDevices(@RequestBody List<Device> devices){
        return service.saveDevices(devices);
    }

    @GetMapping("/products")
    public List<Device> findAllDevices(){
        return service.getDevices();
    }
    @GetMapping("/product/{id}")
    public Device findDeviceById(@PathVariable int id){
        return service.getDevicebyId(id);
    }

    @PutMapping("/update")
    public Device updateDevice(@RequestBody Device device){
        return service.updateDevice(device);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteDevice (int id){
        return service.deleteDevice(id);
    }

}
