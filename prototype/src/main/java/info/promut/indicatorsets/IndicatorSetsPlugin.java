package info.promut.indicatorsets;

import java.util.logging.Logger;
import javax.ws.rs.Consumes;
import javax.ws.rs.Path;
import systems.dmx.accesscontrol.AccessControlService;
import systems.dmx.core.osgi.PluginActivator;
import systems.dmx.core.service.Inject;
import systems.dmx.workspaces.WorkspacesService;

@Path("/indicator-sets")
@Consumes("application/json")
public class IndicatorSetsPlugin extends PluginActivator  {

    private Logger log = Logger.getLogger(getClass().getName());

    public static final String INDICATORS_WS_NAME = "ProMUT Indicator Sets";
    public static final String INDICATORS_WS_URI = "info.promut.workspace";

    @Inject WorkspacesService ws; 
    @Inject AccessControlService as; 

}