package spring;

import org.camunda.bpm.engine.runtime.ProcessInstance;
import org.camunda.bpm.engine.test.Deployment;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;


@Deployment(resources="process.bpmn")
public class SpringProcessWithCoverageAnotherTest extends AbstractCamundaTest {

  @Test
  public void start_and_finish_process() {

    Map<String, Object> variables = new HashMap<String, Object>();
    variables.put("path", "A");
    final ProcessInstance processInstance = processEngine.getRuntimeService().startProcessInstanceByKey("process-test-coverage", variables);

    Assert.assertNotNull(processInstance);
    Assert.assertTrue(processInstance.isEnded());

  }
  @Test
  public void testB() {

    Map<String, Object> variables = new HashMap<String, Object>();
    variables.put("path", "A");
    final ProcessInstance processInstance = processEngine.getRuntimeService().startProcessInstanceByKey("process-test-coverage", variables);

    Assert.assertNotNull(processInstance);
    Assert.assertTrue(processInstance.isEnded());

  }

}
