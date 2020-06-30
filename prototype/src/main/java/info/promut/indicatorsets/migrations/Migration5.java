package info.promut.indicatorsets.migrations;

import systems.dmx.core.service.Inject;
import systems.dmx.core.service.Migration;
import systems.dmx.accesscontrol.AccessControlService;
import systems.dmx.workspaces.WorkspacesService;
import java.util.logging.Logger;

public class Migration5 extends Migration {

    private Logger logger = Logger.getLogger(getClass().getName());

    @Inject
    private WorkspacesService workspaces;
    @Inject AccessControlService as; 

    @Override
    public void run() {

        // Todo:
        // Add "Application Description" to "Indicator"
        // Add "Measurement Unit" to "Indicator"
        // Add "Target Audience " with MANY to "Indicator"
        // Assign "References" Assoc Type to app workspace

    }

}
