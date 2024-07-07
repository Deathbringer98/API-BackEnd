package com.keyin.Sprint1_API.Aircraft;

import com.keyin.Sprint1_API.Airport.Airport;
import com.keyin.Sprint1_API.Passenger.Passenger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
public class AircraftController {

    @Autowired
    private AircraftService aircraftService;

    @GetMapping("aircraft")
    public List<Aircraft> getAllAircraft(){
        return aircraftService.getAllAircraft();
    }

    @GetMapping("aircraft/{index}")
    public Aircraft getAircraft(@PathVariable Integer index){
        return aircraftService.getAircraft(index);
    }

    @GetMapping("aircraft/id/{aircraftId}")
    public Aircraft getAircraftByAircraftId(@PathVariable Integer aircraftId){
        return aircraftService.getAircraftByAircraftId(aircraftId);
    }

    @GetMapping("aircraft/{index}/airport")
    public List<Airport> getAllAirportsUsedBySpecificAircraft(@PathVariable Integer index){
        return aircraftService.getAllAirportsUsedBySpecificAircraft(index);
    }

    @GetMapping("aircraft/id/{aircraftId}/airport")
    public List<Airport> getAllAirportsUsedBySpecificAircraftId(@PathVariable Integer aircraftId){
        return aircraftService.getAllAirportsUsedBySpecificAircraftId(aircraftId);
    }

    @PostMapping("aircraft")
    public Aircraft createAircraft(@RequestBody Aircraft newAircraft){
        return aircraftService.createAircraft(newAircraft);
    }

    @PutMapping("aircraft/{index}")
    public Aircraft updateAircraft(@PathVariable Integer index, @RequestBody Aircraft updatedAircraft){
        return aircraftService.updateAircraft(index, updatedAircraft);
    }

    @PutMapping("aircraft/id/{aircraftId}")
    public Aircraft updateAircraftByAircraftId(@PathVariable Integer aircraftId, @RequestBody Aircraft updatedAircraft){
        return aircraftService.updateAircraftByAircraftId(aircraftId, updatedAircraft);
    }

    @DeleteMapping("aircraft/{index}")
    public Aircraft deleteAircraft(@PathVariable Integer index){
        return aircraftService.deleteAircraft(index);
    }

    @DeleteMapping("aircraft/id/{aircraftId}")
    public Aircraft deleteAircraftByAircraftId(@PathVariable Integer aircraftId){
        return aircraftService.deleteAircraftByAircraftId(aircraftId);
    }

    @PostMapping("add/airport/to/aircraft/id/{aircraftId}")
    public Aircraft addAirportToAircraft(@PathVariable Integer aircraftId, @RequestBody Airport airport){
        return aircraftService.addAirportToAircraft(aircraftId, airport);
    }

    @PostMapping("add/passenger/to/aircraft/id/{aircraftId}")
    public Aircraft addPassengerToAircraft(@PathVariable Integer aircraftId, @RequestBody Passenger passenger){
        return aircraftService.addPassengerToAircraft(aircraftId, passenger);
    }

    @DeleteMapping("delete/passenger/id/{passengerId}/from/aircraft/id/{aircraftId}")
    public Aircraft deletePassengerFromAircraft(@PathVariable Integer passengerId, @PathVariable Integer aircraftId){
        return aircraftService.deletePassengerFromAircraft(passengerId, aircraftId);
    }

}

