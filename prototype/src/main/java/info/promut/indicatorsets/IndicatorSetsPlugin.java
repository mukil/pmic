package info.promut.indicatorsets;

import java.util.logging.Logger;
import javax.ws.rs.Consumes;
import javax.ws.rs.Path;
import systems.dmx.accesscontrol.AccessControlService;
import static systems.dmx.core.Constants.*;
import systems.dmx.core.DMXObject;
import systems.dmx.core.model.AssocModel;
import systems.dmx.core.model.PlayerModel;
import systems.dmx.core.osgi.PluginActivator;
import systems.dmx.core.service.Inject;
import systems.dmx.core.service.event.PreCreateAssoc;
import systems.dmx.core.util.DMXUtils;
import systems.dmx.workspaces.WorkspacesService;

@Path("/indicator-sets")
@Consumes("application/json")
public class IndicatorSetsPlugin extends PluginActivator implements PreCreateAssoc {

    private Logger log = Logger.getLogger(getClass().getName());

    public static final String INDICATORS_WS_NAME = "ProMUT Indicator Sets";
    public static final String INDICATORS_WS_URI = "info.promut.workspace";
    public static final String INDICATOR = "info.promut.indicator";
    public static final String INDICATOR_SET = "info.promut.indicator_set";
    public static final String INDICATOR_CATEGORY = "info.promut.indicator_category";
    public static final String SUSTAINABILITY_DIMENSION = "info.promut.sustainability_dimension";
    public static final String SYSTEM_LEVEL = "info.promut.system_level";
    public static final String DEFINES = "info.promut.defines";
    public static final String CATEGORIZES = "info.promut.categorizes";

    @Inject WorkspacesService ws; 
    @Inject AccessControlService as; 
    
    @Override
    public void preCreateAssoc(AssocModel am) {
        if (am.getTypeUri().equals(ASSOCIATION)) {
            PlayerModel player1 = am.getPlayer1();
            PlayerModel player2 = am.getPlayer2();
            DMXObject topic1 = dmx.getObject(player1.getId());
            DMXObject topic2 = dmx.getObject(player2.getId());
            log.info("preCreateAssoc: topic1: " + topic1.getTypeUri() + ", topic2: " + topic2.getTypeUri());
            if (topic1.getTypeUri().equals(INDICATOR) && topic2.getTypeUri().equals(INDICATOR_SET)) {
                DMXUtils.associationAutoTyping(am, INDICATOR, INDICATOR_SET, DEFINES, CHILD, PARENT);
            } else if (topic1.getTypeUri().equals(INDICATOR) && topic2.getTypeUri().equals(SUSTAINABILITY_DIMENSION)) {
                DMXUtils.associationAutoTyping(am, INDICATOR, SUSTAINABILITY_DIMENSION, CATEGORIZES, CHILD, PARENT);
            } else if (topic1.getTypeUri().equals(INDICATOR) && topic2.getTypeUri().equals(INDICATOR_CATEGORY)) {
                DMXUtils.associationAutoTyping(am, INDICATOR, INDICATOR_CATEGORY, CATEGORIZES, PARENT, CHILD);
            } else if (topic2.getTypeUri().equals(INDICATOR) && topic1.getTypeUri().equals(INDICATOR_SET)) {
                DMXUtils.associationAutoTyping(am, INDICATOR_SET, INDICATOR, DEFINES, PARENT, CHILD);
            } else if (topic2.getTypeUri().equals(INDICATOR) && topic1.getTypeUri().equals(SUSTAINABILITY_DIMENSION)) {
                DMXUtils.associationAutoTyping(am, SUSTAINABILITY_DIMENSION, INDICATOR, ASSOCIATION, PARENT, CHILD);
            } else if (topic2.getTypeUri().equals(INDICATOR) && topic1.getTypeUri().equals(INDICATOR_CATEGORY)) {
                DMXUtils.associationAutoTyping(am, INDICATOR_CATEGORY, INDICATOR, CATEGORIZES, CHILD, PARENT);
            } else if (topic2.getTypeUri().equals(INDICATOR_SET) && topic1.getTypeUri().equals(SUSTAINABILITY_DIMENSION)) {
                DMXUtils.associationAutoTyping(am, SUSTAINABILITY_DIMENSION, INDICATOR, CATEGORIZES, PARENT, CHILD);
            } else if (topic1.getTypeUri().equals(INDICATOR_SET) && topic2.getTypeUri().equals(SUSTAINABILITY_DIMENSION)) {
                DMXUtils.associationAutoTyping(am, INDICATOR, SUSTAINABILITY_DIMENSION, ASSOCIATION, CHILD, PARENT);
            } else if (topic2.getTypeUri().equals(INDICATOR) && topic1.getTypeUri().equals(SYSTEM_LEVEL)) {
                DMXUtils.associationAutoTyping(am, SYSTEM_LEVEL, INDICATOR, CATEGORIZES, CHILD, PARENT);
            } else if (topic1.getTypeUri().equals(INDICATOR) && topic2.getTypeUri().equals(SYSTEM_LEVEL)) {
                DMXUtils.associationAutoTyping(am, INDICATOR, SYSTEM_LEVEL, CATEGORIZES, PARENT, CHILD);
            }
        }
    }

}