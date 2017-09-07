package com.liumapp.worker;

import com.liumapp.DNSQueen.worker.ready.StandReadyWorker;
import org.springframework.stereotype.Component;

/**
 * Created by liumapp on 9/7/17.
 * E-mail:liumapp.com@gmail.com
 * home-page:http://www.liumapp.com
 */
@Component
public class WorkerExample extends StandReadyWorker {
    @Override
    public String doWhatYouShouldDo(String whatQueenSays) {
        return "" + whatQueenSays;
    }
}
