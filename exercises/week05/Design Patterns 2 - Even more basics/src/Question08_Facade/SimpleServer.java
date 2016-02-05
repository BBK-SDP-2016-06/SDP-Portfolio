package Question08_Facade;

public class SimpleServer implements ServerFacade{

    private ScheduleServer scheduleServer;

    public SimpleServer(ScheduleServer newServer) {
        this.scheduleServer = newServer;
    }

    @Override
    public void start() {
        scheduleServer.startBooting();
        scheduleServer.readySystemConfigFile();
        scheduleServer.init();
        scheduleServer.initializeContext();
        scheduleServer.initializeListeners();
        scheduleServer.createSystemObjects();
        System.out.println("Start working......");
    }

    @Override
    public void stop() {
        System.out.println("After work done......");
        scheduleServer.releaseProcesses();
        scheduleServer.destroy();
        scheduleServer.destroySystemObjects();
        scheduleServer.destroyListeners();
        scheduleServer.destroyContext();
        scheduleServer.shutdown();
    }
}
