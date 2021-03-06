package com.daigou.sg.rpc.order;

import com.daigou.sg.rpc.BaseModule;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;

/**
 * This file is auto-generated by tgen
 * Don't change manually
 */

public class TOrderSummary extends BaseModule<TOrderSummary> implements Serializable {
    public int pendingReplyCount;
    public int pendingPaymentCount;
    public int pendingToPurchaseCount;
    public int purchasingCount;
    public int purchasedCount;
    public int arrivedInShanghaiCount;
    public int arrivedInGuangzhouCount;
    public int orderInParcelCount;
    public int cancelledCount;
    public int completedCount;
    public int arrivedInTaiwanCount;
    public int arrivedInUSACount;
}
