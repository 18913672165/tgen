package com.daigou.sg.rpc.payment;

import com.daigou.sg.rpc.BaseModule;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;

/**
 * This file is auto-generated by tgen
 * Don't change manually
 */

public class TPaymentSummary extends BaseModule<TPaymentSummary> implements Serializable {
    public double amountAvailable;
    public double rebateAmountAvailable;
    public double amountPendingVerification;
    public double pendingWithdrawAmount;
    public double unpaidAmount;
}
