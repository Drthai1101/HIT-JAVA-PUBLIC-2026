package bai3;

import bai1.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class VehicleServiceImpl implements VehicleService{
    private ArrayList<Vehicle> vehicles;

    public VehicleServiceImpl(ArrayList<Vehicle> vehicles) {
        vehicles = new ArrayList<>();
    }

    @Override
    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    @Override
    public boolean updateVehicle(String id, Vehicle newVehicle) {
        for (Vehicle c : vehicles) {

            if (c.getId().equals(id)) {
                vehicles.add(newVehicle);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean deleteVehicle(String id) {
        for (Vehicle c : vehicles) {

            if (c.getId().equals(id)) {
                vehicles.remove(c);
                return true;
            }
        }
        return false;
    }

    @Override
    public List<Vehicle> searchByName(String name) {
        for (Vehicle c : vehicles) {
            if (c.getName().equals(name)) {
                c.displayInfo();
            }
        }
        return List.of();
    }

    @Override
    public void sortByPrice(boolean ascending) {
        for (Vehicle c : vehicles) {
            if (ascending) {
            }
            else {
            }
        }
    }

    @Override
    public void displayAllVehicles() {
        for (Vehicle c : vehicles) {
            c.displayInfo();
        }
    }
}
