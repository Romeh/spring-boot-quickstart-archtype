package ${package}.${artifactId}.web;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import ${package}.${artifactId}.web.dto.*;
import javax.validation.Valid;
import java.util.List;
import java.util.stream.Collectors;
/**
 * Created by id961900 on 08/08/2017.
 */
@RestController
@RequestMapping("/application")
@Api(value = "Applciation demo")
public class ApplicationController {

    private static final Logger log = LoggerFactory.getLogger(ApplicationController.class);

    @Autowired
    private ModelMapper modelMapper;

    @RequestMapping(method={RequestMethod.GET},value={"/version"})
    public String getVersion() {
        return "1.0";
    }



}
