package TheElectricCompany.desktop;

import TheElectricCompany.desktop.*;

import TheElectricCompany.service.*;

import java.util.*;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import javafx.scene.control.ListView;

/**
 * Technology List for Renewable Technologies
 * @version 0.2.0
 * @author Haru McClellan
 */
class RenewableTechList
   extends AppDataList
{
   /**
    * Basic Constructor
    * @param pModel a reference to SimCity
    */
   public RenewableTechList(SimCity pModel)
   {
      super(pModel);
   }

   /**
    * Updater
    */
   protected void update()
   {
      mData.clear();

      for (Technology t : mModel.getUpgradeManager().getTechnologyManager()
                                .getRenewable())
      {
         mData.add(t.getName());
      }
   }
}
