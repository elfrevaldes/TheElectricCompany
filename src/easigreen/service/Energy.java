package easigreen.service;

import easigreen.system.*;

/**
 * The Energy class contains information that each different type of plant will
 * use.  It will contain the number of a particular type of plant, the cost for
 * each one, and the impacts that it will have on the short-term and long-term
 * goals.
 *
 * @version 0.1.5
 * @author Larson Caldwell
 * @author Sam Graham
 * @author Haru McClellan
 */
public class Energy
{
    //////////////////// Variables

    /**
     * The number of plants
     */
    protected int mAmount;

    /**
     * The cost to build each new plant
     */
    protected double mCostBuild;

    /**
     * The cost to remove each existing plant
     */
    protected double mCostRemove;

    /**
     * The approval rating per unit
     */
    protected double mApproval;

    /**
     * The power production per unit
     */
    protected double mProduction;

    /**
     * The emissions produced per unit
     */
    protected double mEmissions;

    /**
     * The security of each unit
     */
    protected double mSecurity;

    /**
     * The profit made with each unit
     */
    protected double mProfitPercent;

    //////////////////// Constructors

    /**
     * To assign values is pointless because we dont know what plant it is.
     */
    public Energy()
    {
        mAmount        = 0;
        mCostBuild     = 0;
        mCostRemove    = 0;
        mApproval      = 0;
        mProduction    = 0;
        mEmissions     = 0;
        mSecurity      = 0;
        mProfitPercent = 0;
    }

    //////////////////// Getters

    /**
     * New plants are added.
     *
     * @param pAmount the amount of new plants
     */
    public void add(int pAmount)
    {
        mAmount += pAmount;
    }

    /**
     * Existing plants are removed.
     *
     * @param pAmount the amount of plants to be removed
     */
    public boolean remove(int pAmount)
    {
        if (mAmount - pAmount >= 0) {
            mAmount -= pAmount;
            return true;
        } else {
            return false;
        }
    }

    /**
     * Gets the amount of plants
     *
     * @return mAmount the amount of plants currently
     */
    public int getAmount()
    {
        return mAmount;
    }

    /**
     * Gets the cost to build each plant
     *
     * @return mCostBuild the cost of each plant to be built
     */
    public double getCostBuild()
    {
        return mCostBuild;
    }

    /**
     * Gets the cost to remove each plant
     *
     * @return mCostRemove the cost to remove each existing plant
     */
    public double getCostRemove()
    {
        return mCostRemove;
    }

    /**
     * Gets the approval rating of each plant
     *
     * @return mApproval the approval rating of each plant
     */
    public double getApproval()
    {
        return mApproval;
    }

    /**
     * Gets the power production of each plant
     *
     * @return mProduction the power production of each plant
     */
    public double getProduction()
    {
        return mProduction;
    }

    /**
     * Gets the emissions of each plant
     *
     * @return mEmissions the emissions of each plant
     */
    public double getEmissions()
    {
        return mEmissions;
    }

    /**
     * Gets the security rating of each plant
     *
     * @return mSecurity the security rating of each plant
     */
    public double getSecurity()
    {
        return mSecurity;
    }

    /**
     * Gets the profit of each plant
     *
     * @return mProfitPercent the profit of each plant
     */
    public double getProfitPercent()
    {
        return mProfitPercent;
    }   

    //////////////////// Setters

    public void setAmount(int pAmount)
    {
        mAmount = pAmount;
    }

    public void setCostBuild(double pCostBuild)
    {
        mCostBuild = pCostBuild;
    }

    public void setCostRemove(double pCostRemove)
    {
        mCostRemove = pCostRemove;
    }

    public void setApproval(double pApproval)
    {
        mApproval = pApproval;
    }
    
    public void setProduction(double pProduction)
    {
        mProduction = pProduction;
    }

    public void setEmissions(double pEmissions)
    {
        mEmissions = pEmissions;
    }

    public void setSecurity(double pSecurity)
    {
        mSecurity = pSecurity;
    }
}
