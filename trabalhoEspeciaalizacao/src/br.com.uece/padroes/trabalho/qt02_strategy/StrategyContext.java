package qt02_strategy;


public class StrategyContext {
    ILoggerStrategy log;

    public void setLoggerStrategy(ILoggerStrategy log){
        this.log = log;
    }

    public void CreateLog(String s){
        log.Log(s);
    }
}
