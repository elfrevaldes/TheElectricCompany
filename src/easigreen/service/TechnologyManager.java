package easigreen.service;

import java.util.ArrayList;

/**
 * The Technology Manager class.
 *
 * @see java.util.ArrayList
 *
 * @version 0.1.2
 * @author Larson Caldwell
 * @author Sam Graham
 * @author Haru McClellan
 */
public class TechnologyManager
{
    //////////////////// Variables

    /**
     * The implemented technologies
     */
    private ArrayList<Technology> mImplemented;

    /**
     * The available technologies
     */
    private ArrayList<Technology> mAvailable;

    /**
     * All of the technologies
     */
    private ArrayList<Technology> mAll;

    private TechCodeManager mCodes;

    /**
     * Basic constructor of the array lists
     */
    public TechnologyManager()
    {
        mImplemented = new ArrayList<Technology>();
        mAvailable   = new ArrayList<Technology>();
        mAll         = new TechnologyGetter().getTechnologies();
	mCodes       = new TechCodeManager(mAll);
    }

    //////////////////// Methods

    /**
     * Updates the Merger
     * @returns UpgradeMerger the UpgradeMerger
     */
    public UpgradeMerger update()
    {
        UpgradeMerger allChanges = new UpgradeMerger();
        for (int i = 0; i < mImplemented.size(); i++) {
            // General
            allChanges.addBudgetChange      (mImplemented.get(i).getOther().getBudget   ());
            allChanges.addDemandRateChange  (mImplemented.get(i).getOther().getDemand   ());
            allChanges.addEmissionsChange   (mImplemented.get(i).getOther().getEmissions());
            // Nuclear
            allChanges.addNuclearPower      (mImplemented.get(i).getNuclear().getPower    ());
            allChanges.addNuclearCost       (mImplemented.get(i).getNuclear().getCost     ());
            allChanges.addNuclearApproval   (mImplemented.get(i).getNuclear().getApproval ());
            allChanges.addNuclearEmissions  (mImplemented.get(i).getNuclear().getEmissions());
            allChanges.addNuclearSecurity   (mImplemented.get(i).getNuclear().getSecurity ());
            allChanges.addNuclearProfit     (mImplemented.get(i).getNuclear().getProfit   ());
            // Fossil
            allChanges.addFossilPower       (mImplemented.get(i).getFossil().getPower    ());
            allChanges.addFossilCost        (mImplemented.get(i).getFossil().getCost     ());
            allChanges.addFossilApproval    (mImplemented.get(i).getFossil().getApproval ());
            allChanges.addFossilEmissions   (mImplemented.get(i).getFossil().getEmissions());
            allChanges.addFossilSecurity    (mImplemented.get(i).getFossil().getSecurity ());
            allChanges.addFossilProfit      (mImplemented.get(i).getFossil().getProfit   ());
            // Renewable
            allChanges.addRenewablePower    (mImplemented.get(i).getRenewable().getPower    ());
            allChanges.addRenewableCost     (mImplemented.get(i).getRenewable().getCost     ());
            allChanges.addRenewableApproval (mImplemented.get(i).getRenewable().getApproval ());
            allChanges.addRenewableEmissions(mImplemented.get(i).getRenewable().getEmissions());
            allChanges.addRenewableSecurity (mImplemented.get(i).getRenewable().getSecurity ());
            allChanges.addRenewableProfit   (mImplemented.get(i).getRenewable().getProfit   ());
            // Oil
            allChanges.addOilConsumption    (mImplemented.get(i).getOil().getConsumption());
            allChanges.addOilSecurity       (mImplemented.get(i).getOil().getSecurity   ());
            allChanges.addOilGrowth         (mImplemented.get(i).getOil().getGrowth     ());
        }
        return allChanges;
    }


    //////////////////// Getters

    /**
     * Gets the implemented technologies
     *
     * @return implemented the implemented technologies
     */
    public ArrayList<Technology> getImplemented()
    {
        return mImplemented;
    }

    /**
     * Gets the available technologies
     *
     * @return available the available technologies
     */
    public ArrayList<Technology> getAvailable()
    {
        return mAvailable;
    }

    /**
     * Gets all technologies
     *
     * @return all all of the technologies
     */
    public ArrayList<Technology> getAll()
    {
        return mAll;
    }

    //////////////////// Setters

    /**
     * Sets the implemented technologies
     *
     * @param pImplemented the new implemented technologies
     */
    public void setImplemented(ArrayList<Technology> pImplemented)
    {
        mImplemented = pImplemented;
    }

    public void implementTechnology(Technology pTech)
    {
        mImplemented.add(pTech);
    }

    /**
     * Sets the available technologies
     *
     * @param pAvailable the new available technologies
     */
    public void setAvailable(ArrayList<Technology> pAvailable)
    {
        mAvailable = pAvailable;
    }

    /**
     * Adds a Technology
     * @param pTech a Technology
     */
    public void addTechnology(Technology pTech)
    {
        mAvailable.add(pTech);
    }

    /**
     *
     *
     */
    public void addTechnology(String pCode)
    {
	Technology newTech = mCodes.getTech(pCode);
	if (newTech != null)
	{
	    mAvailable.add(newTech);
	}
    }

    /**
     * Sets all technologies
     *
     * @param pAll all of the new technologies
     */
    public void setAll(ArrayList<Technology> pAll)
    {
        mAll = pAll;
    }
}
