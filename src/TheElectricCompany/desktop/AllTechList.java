package TheElectricCompany.desktop;

import TheElectricCompany.desktop.*;

import TheElectricCompany.service.*;

import java.util.*;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import javafx.scene.control.ListView;

/**
 * List holder of technologies
 *
 * @version 0.2.1
 * @author Sam Graham
 * @author Haru McClellan
 * @author Larson Caldwell
 */
class AllTechList
   extends AppDataList
{
   ////////////////////////////// Constructor

   /**
    * Basic Constructor
    * @param pModel the model, a SimCity
    */
   public AllTechList(SimCity pModel)
   {
      super(pModel);
   }

   ///////////////////////////// Updater

   /**
    * Update the Technology List
    */
   protected void update()
   {
      mData.clear();

      for (Technology t : mModel.getUpgradeManager().getTechnologyManager()
                                .getAll())
      {
         mData.add(t.getName());
      }
   }
}
