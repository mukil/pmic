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

public class Migration3 extends Migration {

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
        TopicType event = dmx.getTopicType("dmx.events.event");
        event.getViewConfig().setConfigValue("dmx.webclient.view_config", "dmx.webclient.add_to_create_menu", false);
        TopicType person = dmx.getTopicType("dmx.contacts.person");
        person.getViewConfig().setConfigValue("dmx.webclient.view_config", "dmx.webclient.add_to_create_menu", false);
        TopicType indicator = dmx.getTopicType("info.promut.indicator");
        TopicType indicatorSet = dmx.getTopicType("info.promut.indicator_set");
        TopicType indicatorCategory = dmx.getTopicType("info.promut.indicator_category");
        TopicType referenceFrame = dmx.getTopicType("info.promut.system");
        TopicType susDimension = dmx.getTopicType("info.promut.sustainability_dimension");
        AssocType exactMatch = dmx.getAssocType("org.w3.skos.exactMatch");
        AssocType relatedMatch = dmx.getAssocType("org.w3.skos.relatedMatch");
        AssocType narrowerMatch = dmx.getAssocType("org.w3.skos.broadNarrowMatch");
        AssocType closeMatch = dmx.getAssocType("org.w3.skos.closeMatch");
        AssocType categorizes = dmx.getAssocType("info.promut.categorizes");
        AssocType defines = dmx.getAssocType("info.promut.defines");
        workspaces.assignTypeToWorkspace(indicator, csWorkspace.getId());
        workspaces.assignTypeToWorkspace(indicatorSet, csWorkspace.getId());
        workspaces.assignTypeToWorkspace(indicatorCategory, csWorkspace.getId());
        workspaces.assignTypeToWorkspace(referenceFrame, csWorkspace.getId());
        workspaces.assignTypeToWorkspace(susDimension, csWorkspace.getId());
        workspaces.assignTypeToWorkspace(exactMatch, csWorkspace.getId());
        workspaces.assignTypeToWorkspace(relatedMatch, csWorkspace.getId());
        workspaces.assignTypeToWorkspace(narrowerMatch, csWorkspace.getId());
        workspaces.assignTypeToWorkspace(closeMatch, csWorkspace.getId());
        workspaces.assignTypeToWorkspace(categorizes, csWorkspace.getId());
        workspaces.assignTypeToWorkspace(defines, csWorkspace.getId());

    }

}
