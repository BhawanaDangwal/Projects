
import com.wissen.service.AggregatorService;
import com.wissen.util.PipeLineMessageFactory;

public class ProblemTestMain {

    public static void main(String[] args){
        AggregatorService service=new AggregatorService();
        PipeLineMessageFactory.parseInputPipelineMessage("P1~Infosys~2");
        service.diplayProcessedPipeline();
        PipeLineMessageFactory.parseInputPipelineMessage("P6~TCS~3");
        PipeLineMessageFactory.parseInputPipelineMessage("P4~Infosys~3");
        PipeLineMessageFactory.parseInputPipelineMessage("P1~Infosys~1");
        service.diplayProcessedPipeline();

    }
}
