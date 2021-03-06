package goblinbob.mba.customnpcs.data;

import goblinbob.mba.customnpcs.animation.controller.CustomNpcController;
import goblinbob.mobends.core.animation.controller.IAnimationController;
import goblinbob.mobends.standard.data.BipedEntityData;
import noppes.npcs.entity.EntityCustomNpc;

public class CustomNpcData extends BipedEntityData<EntityCustomNpc>
{

    private final CustomNpcController controller = new CustomNpcController();

    public CustomNpcData(EntityCustomNpc entity)
    {
        super(entity);
    }

    @Override
    public IAnimationController<?> getController()
    {
        return controller;
    }

    @Override
    public void onTicksRestart()
    {
        // No behaviour
    }

}
