package com.algocoding.plolymorphismdemo;

public enum FeatureType {

    BILL_PAYMENT("BILL_PAYMENT"),
    BATCH_PAYMENT("BATCH_PAYMENT"),
    MONEY_TRANSFER("MONEY_TRANSFER"),
    ITERATIVE_MONEY_TRANSFER("ITERATIVE_MONEY_TRANSFER"),
    //billing
    BILL_TAMIN("BILL_TAMIN"),
    BILL_BATCH_TAMIN("BILL_BATCH_TAMIN"),
    BILL_TAX("BILL_TAX"),
    BILL_BATCH_TAX("BILL_BATCH_TAX"),
    BILL_UTILITY("BILL_UTILITY"),
    BILL_UTILITY_BATCH("BILL_UTILITY_BATCH"),
    //
    CURRENCY_TRANSFER("CURRENCY_TRANSFER"),
    CURRENCY_TRADE("CURRENCY_TRADE"),
    BATCH_PAYMENT_ACH("BATCH_PAYMENT_ACH"),
    ONLINE_BATCH_PAYMENT("ONLINE_BATCH_PAYMENT"),
    OFFLINE_BATCH_TRANSFER("OFFLINE_BATCH_TRANSFER"),
    FUND_CARD_CHARGE("FUND_CARD_CHARGE"),
    FUND_CARD_DISCHARGE("CARD_DISCHARGE"),
    COUPON_CARD_CHARGE("COUPON_CARD_CHARGE"),
    BUSINESS_CARD_CHARGE("BUSINESS_CARD_CHARGE"),
    COUPON_CARD_DISCHARGE("COUPON_CARD_DISCHARGE"),
    BUSINESS_CARD_DISCHARGE("BUSINESS_CARD_DISCHARGE"),
    FUND_CARD_CHARGE_ONLINE("FUND_CARD_CHARGE_ONLINE"),
    OTHER("OTHER"),
    NONE("NONE");

    String value;

    FeatureType(String value) {
        this.value = value;
    }

    public static FeatureType getEnum(String val) {
        if (val == null) {
            return NONE;
        }

        switch (val.toUpperCase()) {
            case "BILL_TAMIN":
                return BILL_TAMIN;
            case "BILL_BATCH_TAMIN":
                return BILL_BATCH_TAMIN;
            case "BILL_TAX":
                return BILL_TAX;
            case "BILL_BATCH_TAX":
                return BILL_BATCH_TAX;
            case "BATCH_PAYMENT":
                return BATCH_PAYMENT;
            case "BILL_UTILITY":
                return BILL_UTILITY;
            case "BILL_PAYMENT":
                return BILL_PAYMENT;
            case "MONEY_TRANSFER":
                return MONEY_TRANSFER;
            case "ITERATIVE_MONEY_TRANSFER":
                return ITERATIVE_MONEY_TRANSFER;
            case "BATCH_PAYMENT_ACH":
                return BATCH_PAYMENT_ACH;
            case "ONLINE_BATCH_PAYMENT":
                return ONLINE_BATCH_PAYMENT;
            case "OFFLINE_BATCH_TRANSFER":
                return OFFLINE_BATCH_TRANSFER;
            case "FUND_CARD_CHARGE":
                return FUND_CARD_CHARGE;
            case "FUND_CARD_CHARGE_ONLINE":
                return FUND_CARD_CHARGE_ONLINE;
            case "CURRENCY_TRADE":
                return CURRENCY_TRADE;
            case "COUPON_CARD_CHARGE":
                return COUPON_CARD_CHARGE;
            case "COUPON_CARD_DISCHARGE":
                return COUPON_CARD_DISCHARGE;
            case "BUSINESS_CARD_CHARGE":
                return BUSINESS_CARD_CHARGE;
            case "BUSINESS_CARD_DISCHARGE":
                return BUSINESS_CARD_DISCHARGE;
            case "BILL_UTILITY_BATCH":
                return BILL_UTILITY_BATCH;
            case "OTHER":
                return OTHER;
            default:
                return NONE;
        }
    }

    public static String getTitle(FeatureType status) {
        String title = "نامشخص";

        switch (status) {
            case BILL_TAMIN:
                title = "پرداخت قبض تامین اجتماعی";
                break;
            case BILL_BATCH_TAMIN:
                title = "پرداخت قبض دسته ای تامین اجتماعی";
                break;
            case BILL_TAX:
                title = "پرداخت قبض مالیاتی";
                break;
            case BILL_BATCH_TAX:
                title = "پرداخت قبض دسته ای مالیاتی";
                break;
            case BILL_UTILITY:
                title = "پرداخت قبض خدماتی";
                break;
            case BILL_UTILITY_BATCH:
                title = "پرداخت قبض خدماتی گروهی";
                break;
            case BATCH_PAYMENT:
                title = "واریز دسته ای آفلاین درون بانکی(ملی به ملی)";
                break;
            case BATCH_PAYMENT_ACH:
                title = "واریز دسته ای آفلاین پایا بین بانکی(ACH)";
                break;
            case MONEY_TRANSFER:
                title = "انتقال پول تکی";
                break;
            case ITERATIVE_MONEY_TRANSFER:
                title = "انتقال پول همتا ";
                break;
            case ONLINE_BATCH_PAYMENT:
                title = "واریز دسته ای آنلاین";
                break;
            case BILL_PAYMENT:
                title = "پرداخت قبض از حساب";
                break;
            case OFFLINE_BATCH_TRANSFER:
                title = "واریز دسته ای آفلاین";
                break;
            case FUND_CARD_CHARGE:
                title = "شارژ تنخواه کارت";
                break;
            case FUND_CARD_CHARGE_ONLINE:
                title = "شارژ آنلاین تنخواه کارت";
                break;
            case BUSINESS_CARD_DISCHARGE:
                title = "دشارژ تجاری کارت";
                break;
            case BUSINESS_CARD_CHARGE:
                title = "شارژ تجاری کارت";
                break;
            case COUPON_CARD_CHARGE:
                title = "شارژ بن کارت";
                break;
            case COUPON_CARD_DISCHARGE:
                title = "دشارژ بن کارت";
                break;
            case CURRENCY_TRADE:
                title = "ارز توافقی";
                break;
            case NONE:
                title = "نامشخص";
                break;

        }

        return title;
    }

    public String getValue() {
        return value;
    }

    public static String getTitle(String featureType) {
        switch (getEnum(featureType)) {
            case BILL_TAMIN:
                return "قبض تامین اجتماعی";
            case BILL_BATCH_TAMIN:
                return "قبض دسته ای تامین اجتماعی";
            case BILL_TAX:
                return "قبض مالیاتی";
            case BILL_BATCH_TAX:
                return "قبض دسته ای مالیاتی";
            case BILL_UTILITY_BATCH:
                return "قبض خدماتی گروهی";
            case BATCH_PAYMENT:
                return "واریز دسته ای";
            case BILL_PAYMENT:
                return "پرداخت قبض";
            case MONEY_TRANSFER:
                return "انتقال پول";
            case ITERATIVE_MONEY_TRANSFER:
                return "انتقال پول همتا ";
            case BATCH_PAYMENT_ACH:
                return "واریز دسته ای پایا";
            case FUND_CARD_CHARGE:
            case FUND_CARD_CHARGE_ONLINE:
                return "شارژ تنخواه کارت";
            case ONLINE_BATCH_PAYMENT:
                return "واریز دسته ای";
            case CURRENCY_TRADE:
                return "ارز توافقی";
            case BILL_UTILITY:
                return "پرداخت قبض خدماتی";
            case COUPON_CARD_CHARGE:
                return "شارژ بن کارت";
            case COUPON_CARD_DISCHARGE:
                return "دشارژ بن کارت";
            case BUSINESS_CARD_CHARGE:
                return "شارژ تجاری کارت";
            case BUSINESS_CARD_DISCHARGE:
                return "دشارژ تجاری کارت";
            case OTHER:
                return "سایر";
            case NONE:
                return "نامشخص";
        }

        return "نامشخص";
    }

    public static String getShortTitle(FeatureType status) {
        String title = "نامشخص";

        switch (status) {
            case BILL_TAMIN:
                title = "پرداخت قبض تامین اجتماعی";
                break;
            case BILL_BATCH_TAMIN:
                title = "پرداخت قبض دسته ای تامین اجتماعی";
                break;
            case BILL_TAX:
                title = "پرداخت قبض مالیاتی";
                break;
            case BILL_BATCH_TAX:
                title = "پرداخت قبض دسته ای مالیاتی";
                break;
            case BILL_UTILITY_BATCH:
                title = "پرداخت قبض خدماتی گروهی";
                break;
            case BATCH_PAYMENT:
                title = "واریز دسته ای ملی به ملی";
                break;
            case BATCH_PAYMENT_ACH:
                title = "پایا گروهی";
                break;
            case MONEY_TRANSFER:
                title = "انتقال پول تکی";
                break;
            case ITERATIVE_MONEY_TRANSFER:
                title = "انتقال پول همتا";
                break;
            case CURRENCY_TRANSFER:
                title = "انتقال پول ارزی";
                break;
            case ONLINE_BATCH_PAYMENT:
                title = "واریز دسته ای آنلاین";
                break;
            case BILL_PAYMENT:
                title = "قبض";
                break;
            case OFFLINE_BATCH_TRANSFER:
                title = "واریز دسته ای ملی به ملی";
                break;
            case FUND_CARD_CHARGE:
                title = "شارژ تنخواه کارت";
                break;
            case FUND_CARD_CHARGE_ONLINE:
                title = "شارژ آنلاین تنخواه کارت";
                break;
            case OTHER:
                title = "سایر";
                break;
            case CURRENCY_TRADE:
                title = "ارز توافقی";
                break;
            case BILL_UTILITY:
                title = "پرداخت قبض خدماتی";
                break;
            case COUPON_CARD_CHARGE:
                title = "شارژ بن کارت";
                break;
            case COUPON_CARD_DISCHARGE:
                title = "دشارژ بن کارت";
                break;
            case BUSINESS_CARD_CHARGE:
                title = "شارژ تجاری کارت";
                break;
            case BUSINESS_CARD_DISCHARGE:
                title = "دشارژ تجاری کارت";
                break;
            case NONE:
                title = "نامشخص";
                break;
        }

        return title;
    }
}
