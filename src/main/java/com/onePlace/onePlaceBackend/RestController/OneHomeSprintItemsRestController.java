package com.onePlace.onePlaceBackend.RestController;

import com.onePlace.onePlaceBackend.Entity.OneHomeSprintItem;
import com.onePlace.onePlaceBackend.Service.OneHomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api")
public class OneHomeSprintItemsRestController {

    private final OneHomeService oneHomeService;

    @Autowired
    public OneHomeSprintItemsRestController(OneHomeService theOneHomeService){
        this.oneHomeService = theOneHomeService;
    }

    @PostMapping("/addSprintItem")
    public ResponseEntity<OneHomeSprintItem> addNewSprintItem(@RequestBody OneHomeSprintItem theOneHomeSprintItem){
        oneHomeService.add(theOneHomeSprintItem);
        return ResponseEntity.ok(theOneHomeSprintItem);
    }

    @PutMapping("/updateSprintItem")
    public ResponseEntity<OneHomeSprintItem> updateSprintItem(@RequestBody OneHomeSprintItem theOneHomeSprintItem){
        OneHomeSprintItem updatedSprintItem = oneHomeService.update(theOneHomeSprintItem);
        return ResponseEntity.ok(updatedSprintItem);
    }

    @GetMapping("/sprintItem/{id}")
    public ResponseEntity<OneHomeSprintItem> getSprintItem(@PathVariable int id){
        OneHomeSprintItem sprintItem = oneHomeService.get(id);
        return ResponseEntity.ok(sprintItem);
    }

    @DeleteMapping("/deleteSprintItem/{id}")
    public void deleteSprintItem(@PathVariable int id){
        oneHomeService.delete(id);
    }
}
