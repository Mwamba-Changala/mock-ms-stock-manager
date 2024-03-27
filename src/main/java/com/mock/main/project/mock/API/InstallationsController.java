package com.mock.main.project.mock.API;

import com.mock.main.project.mock.ServiceInterfaces.InstallationService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/installation")
@RestController
@CrossOrigin("http://localhost:5173")
public class InstallationsController {
    @Autowired
    InstallationService installationService;
    @GetMapping
    @Operation(summary = "Get all installations")
    public ResponseEntity<?> getAllInstallations(){

        return new ResponseEntity<>(installationService.fetchAllInstallations(),HttpStatus.OK);
    }

    @PutMapping
    @Operation(summary = "Change installation call status to closed / false")
    public ResponseEntity<?> closeInstallationCall(@RequestParam Long installationId){

        return new ResponseEntity<>(installationService.updateInstallationStatus(installationId),HttpStatus.OK);

    }

    @GetMapping("/stats")
    @Operation(summary = "Get installations stats")
    public ResponseEntity<?> getInstallationStats(){

        return new ResponseEntity<>(installationService.getInstallationStatsMonthOnMonth(),HttpStatus.OK);
    }

}
