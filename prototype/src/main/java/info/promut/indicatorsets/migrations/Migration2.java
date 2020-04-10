package info.promut.indicatorsets.migrations;

import static info.promut.indicatorsets.IndicatorSetsPlugin.INDICATORS_WS_NAME;
import static info.promut.indicatorsets.IndicatorSetsPlugin.INDICATORS_WS_URI;
import systems.dmx.core.Topic;
import systems.dmx.core.service.Inject;
import systems.dmx.core.service.Migration;
import systems.dmx.accesscontrol.AccessControlService;
import systems.dmx.workspaces.WorkspacesService;
import java.util.logging.Logger;
import systems.dmx.core.AssocType;
import systems.dmx.core.TopicType;
import systems.dmx.core.service.accesscontrol.SharingMode;

public class Migration2 extends Migration {

    private Logger logger = Logger.getLogger(getClass().getName());

    @Inject
    private WorkspacesService workspaces;
    @Inject AccessControlService as; 

    @Override
    public void run() {

        // 0) Check for WS, Make Sure Custom Plugin Workspace Does Exist
        Topic csWorkspace = workspaces.createWorkspace(INDICATORS_WS_NAME, INDICATORS_WS_URI, SharingMode.PUBLIC);
        as.setWorkspaceOwner(csWorkspace, AccessControlService.ADMIN_USERNAME);
        // 1) Assign Top Level Topic Types
        TopicType indicator = dmx.getTopicType("info.promut.indicator");
        TopicType indicatorSet = dmx.getTopicType("info.promut.indicator_set");
        TopicType referenceFrame = dmx.getTopicType("info.promut.reference_frame");
        TopicType susDimension = dmx.getTopicType("info.promut.sustainability_dimension");
        AssocType exactMatch = dmx.getAssocType("org.w3.skos.exactMatch");
        AssocType relatedMatch = dmx.getAssocType("org.w3.skos.relatedMatch");
        AssocType narrowerMatch = dmx.getAssocType("org.w3.skos.narrowMatch");
        AssocType closeMatch = dmx.getAssocType("org.w3.skos.closeMatch");
        AssocType categorizes = dmx.getAssocType("info.promut.categorizes");
        workspaces.assignToWorkspace(indicator, csWorkspace.getId());
        workspaces.assignToWorkspace(indicatorSet, csWorkspace.getId());
        workspaces.assignToWorkspace(referenceFrame, csWorkspace.getId());
        workspaces.assignToWorkspace(susDimension, csWorkspace.getId());
        workspaces.assignToWorkspace(exactMatch, csWorkspace.getId());
        workspaces.assignToWorkspace(relatedMatch, csWorkspace.getId());
        workspaces.assignToWorkspace(narrowerMatch, csWorkspace.getId());
        workspaces.assignToWorkspace(closeMatch, csWorkspace.getId());
        workspaces.assignToWorkspace(categorizes, csWorkspace.getId());

    }

}
