package com.assignment.test.getsqrt.controller;

import com.assignment.test.getsqrt.model.Input;
import com.assignment.test.getsqrt.model.Output;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Stream;
import java.util.Comparator;

@RestController
@RequestMapping(value = "/sqrt")
public class SqrtController {

    private Logger logger = Logger.getLogger(SqrtController.class.getName());

    @GetMapping(value = "/getSqrtOfHighestNumbers")
    public ResponseEntity<Output> getSqrtOfHighestNumbers(@RequestBody Input input) {
        logger.log(Level.INFO, "Check that the input body contains at least three integers" + input.getData().size());
        if (input.getData().size() < 3) {
            logger.log(Level.INFO, "Rejecting the input body as the input is not sufficient");
            return new ResponseEntity<Output>(HttpStatus.BAD_REQUEST);
        }
        logger.log(Level.INFO, "Calculating the Result using Streams");
        return new ResponseEntity<Output>(calculateSqrt(input.getData()), HttpStatus.OK);

    }

    public Output calculateSqrt(List<Integer> numberList) {
        Stream<Integer> sInputs = numberList.stream();
        Output opObj = new Output();
        opObj.setOutput(new BigDecimal(Math.sqrt(
                sInputs.sorted(Comparator.reverseOrder()).
                        limit(3).
                        map(x -> x * x).
                        mapToInt(x -> x).
                        sum())).
                setScale(2, BigDecimal.ROUND_HALF_UP));
        return opObj;

    }
}
