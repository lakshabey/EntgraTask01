package com.example.EntgraTask01.Service;

import com.example.EntgraTask01.Entity.Device;
import com.example.EntgraTask01.Repository.DeviceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeviceService {

    @Autowired
    private DeviceRepository repository;

    public Device saveDevice(Device device){
        return repository.save(device);
    }

    public List<Device> saveDevices(List<Device> devices){
        return repository.saveAll(devices);
    }

    public List<Device> getDevices(){
        return repository.findAll();
    }

    public Device getDevicebyId(int id) {
        return repository.findById(id).orElse(null);
    }

    public String deleteDevice(int id){
        repository.deleteById(id);
        return "Deleted!" + id;
    }

    public Device updateDevice(Device device){
        Device existingDevice = repository.findById(device.getId()).orElse(null);
        existingDevice.setDeviceName(device.getDeviceName());
        existingDevice.setDeviceModel(device.getDeviceModel());
        existingDevice.setDeviceStatus(device.getDeviceStatus());
        existingDevice.setEnrolledTime(device.getEnrolledTime());
        return repository.save(existingDevice);
    }

}
