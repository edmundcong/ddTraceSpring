package hello;

import datadog.trace.api.DDTags;
import datadog.trace.api.Trace;
import io.opentracing.Span;
import io.opentracing.util.GlobalTracer;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping("/")
    public String index() {
        myMethod();
        return "Greetings from our Java APM app!";
    }

    @Trace
    void myMethod() {
        final Span span = GlobalTracer.get().activeSpan();
        // Span provided by @Trace annotation.
        if (span != null) {
            span.setTag(DDTags.SERVICE_NAME, "my-custom-service");
        }
    }
}
