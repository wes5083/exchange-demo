package com.assignment.demo.exchange.util;

import java.util.HashMap;
import java.util.Map;

/**
 * all symbols map; the value from API server data
 *     https://api.apilayer.com/exchangerates_data/symbols
 */
public class ExchangeSymbols {

    private final static Map<String, String> symbolsMap;

    public static final String getSymbol(String key) {
        return symbolsMap.get(key) == null ? null : key;
    }


    static {
        symbolsMap = new HashMap<>();
        symbolsMap.put("AED", "United Arab Emirates Dirham");
        symbolsMap.put("AFN", "Afghan Afghani");
        symbolsMap.put("ALL", "Albanian Lek");
        symbolsMap.put("AMD", "Armenian Dram");
        symbolsMap.put("ANG", "Netherlands Antillean Guilder");
        symbolsMap.put("AOA", "Angolan Kwanza");
        symbolsMap.put("ARS", "Argentine Peso");
        symbolsMap.put("AUD", "Australian Dollar");
        symbolsMap.put("AWG", "Aruban Florin");
        symbolsMap.put("AZN", "Azerbaijani Manat");
        symbolsMap.put("BAM", "Bosnia-Herzegovina Convertible Mark");
        symbolsMap.put("BBD", "Barbadian Dollar");
        symbolsMap.put("BDT", "Bangladeshi Taka");
        symbolsMap.put("BGN", "Bulgarian Lev");
        symbolsMap.put("BHD", "Bahraini Dinar");
        symbolsMap.put("BIF", "Burundian Franc");
        symbolsMap.put("BMD", "Bermudan Dollar");
        symbolsMap.put("BND", "Brunei Dollar");
        symbolsMap.put("BOB", "Bolivian Boliviano");
        symbolsMap.put("BRL", "Brazilian Real");
        symbolsMap.put("BSD", "Bahamian Dollar");
        symbolsMap.put("BTC", "Bitcoin");
        symbolsMap.put("BTN", "Bhutanese Ngultrum");
        symbolsMap.put("BWP", "Botswanan Pula");
        symbolsMap.put("BYN", "New Belarusian Ruble");
        symbolsMap.put("BYR", "Belarusian Ruble");
        symbolsMap.put("BZD", "Belize Dollar");
        symbolsMap.put("CAD", "Canadian Dollar");
        symbolsMap.put("CDF", "Congolese Franc");
        symbolsMap.put("CHF", "Swiss Franc");
        symbolsMap.put("CLF", "Chilean Unit of Account (UF)");
        symbolsMap.put("CLP", "Chilean Peso");
        symbolsMap.put("CNY", "Chinese Yuan");
        symbolsMap.put("COP", "Colombian Peso");
        symbolsMap.put("CRC", "Costa Rican Col??n");
        symbolsMap.put("CUC", "Cuban Convertible Peso");
        symbolsMap.put("CUP", "Cuban Peso");
        symbolsMap.put("CVE", "Cape Verdean Escudo");
        symbolsMap.put("CZK", "Czech Republic Koruna");
        symbolsMap.put("DJF", "Djiboutian Franc");
        symbolsMap.put("DKK", "Danish Krone");
        symbolsMap.put("DOP", "Dominican Peso");
        symbolsMap.put("DZD", "Algerian Dinar");
        symbolsMap.put("EGP", "Egyptian Pound");
        symbolsMap.put("ERN", "Eritrean Nakfa");
        symbolsMap.put("ETB", "Ethiopian Birr");
        symbolsMap.put("EUR", "Euro");
        symbolsMap.put("FJD", "Fijian Dollar");
        symbolsMap.put("FKP", "Falkland Islands Pound");
        symbolsMap.put("GBP", "British Pound Sterling");
        symbolsMap.put("GEL", "Georgian Lari");
        symbolsMap.put("GGP", "Guernsey Pound");
        symbolsMap.put("GHS", "Ghanaian Cedi");
        symbolsMap.put("GIP", "Gibraltar Pound");
        symbolsMap.put("GMD", "Gambian Dalasi");
        symbolsMap.put("GNF", "Guinean Franc");
        symbolsMap.put("GTQ", "Guatemalan Quetzal");
        symbolsMap.put("GYD", "Guyanaese Dollar");
        symbolsMap.put("HKD", "Hong Kong Dollar");
        symbolsMap.put("HNL", "Honduran Lempira");
        symbolsMap.put("HRK", "Croatian Kuna");
        symbolsMap.put("HTG", "Haitian Gourde");
        symbolsMap.put("HUF", "Hungarian Forint");
        symbolsMap.put("IDR", "Indonesian Rupiah");
        symbolsMap.put("ILS", "Israeli New Sheqel");
        symbolsMap.put("IMP", "Manx pound");
        symbolsMap.put("INR", "Indian Rupee");
        symbolsMap.put("IQD", "Iraqi Dinar");
        symbolsMap.put("IRR", "Iranian Rial");
        symbolsMap.put("ISK", "Icelandic Kr??na");
        symbolsMap.put("JEP", "Jersey Pound");
        symbolsMap.put("JMD", "Jamaican Dollar");
        symbolsMap.put("JOD", "Jordanian Dinar");
        symbolsMap.put("JPY", "Japanese Yen");
        symbolsMap.put("KES", "Kenyan Shilling");
        symbolsMap.put("KGS", "Kyrgystani Som");
        symbolsMap.put("KHR", "Cambodian Riel");
        symbolsMap.put("KMF", "Comorian Franc");
        symbolsMap.put("KPW", "North Korean Won");
        symbolsMap.put("KRW", "South Korean Won");
        symbolsMap.put("KWD", "Kuwaiti Dinar");
        symbolsMap.put("KYD", "Cayman Islands Dollar");
        symbolsMap.put("KZT", "Kazakhstani Tenge");
        symbolsMap.put("LAK", "Laotian Kip");
        symbolsMap.put("LBP", "Lebanese Pound");
        symbolsMap.put("LKR", "Sri Lankan Rupee");
        symbolsMap.put("LRD", "Liberian Dollar");
        symbolsMap.put("LSL", "Lesotho Loti");
        symbolsMap.put("LTL", "Lithuanian Litas");
        symbolsMap.put("LVL", "Latvian Lats");
        symbolsMap.put("LYD", "Libyan Dinar");
        symbolsMap.put("MAD", "Moroccan Dirham");
        symbolsMap.put("MDL", "Moldovan Leu");
        symbolsMap.put("MGA", "Malagasy Ariary");
        symbolsMap.put("MKD", "Macedonian Denar");
        symbolsMap.put("MMK", "Myanma Kyat");
        symbolsMap.put("MNT", "Mongolian Tugrik");
        symbolsMap.put("MOP", "Macanese Pataca");
        symbolsMap.put("MRO", "Mauritanian Ouguiya");
        symbolsMap.put("MUR", "Mauritian Rupee");
        symbolsMap.put("MVR", "Maldivian Rufiyaa");
        symbolsMap.put("MWK", "Malawian Kwacha");
        symbolsMap.put("MXN", "Mexican Peso");
        symbolsMap.put("MYR", "Malaysian Ringgit");
        symbolsMap.put("MZN", "Mozambican Metical");
        symbolsMap.put("NAD", "Namibian Dollar");
        symbolsMap.put("NGN", "Nigerian Naira");
        symbolsMap.put("NIO", "Nicaraguan C??rdoba");
        symbolsMap.put("NOK", "Norwegian Krone");
        symbolsMap.put("NPR", "Nepalese Rupee");
        symbolsMap.put("NZD", "New Zealand Dollar");
        symbolsMap.put("OMR", "Omani Rial");
        symbolsMap.put("PAB", "Panamanian Balboa");
        symbolsMap.put("PEN", "Peruvian Nuevo Sol");
        symbolsMap.put("PGK", "Papua New Guinean Kina");
        symbolsMap.put("PHP", "Philippine Peso");
        symbolsMap.put("PKR", "Pakistani Rupee");
        symbolsMap.put("PLN", "Polish Zloty");
        symbolsMap.put("PYG", "Paraguayan Guarani");
        symbolsMap.put("QAR", "Qatari Rial");
        symbolsMap.put("RON", "Romanian Leu");
        symbolsMap.put("RSD", "Serbian Dinar");
        symbolsMap.put("RUB", "Russian Ruble");
        symbolsMap.put("RWF", "Rwandan Franc");
        symbolsMap.put("SAR", "Saudi Riyal");
        symbolsMap.put("SBD", "Solomon Islands Dollar");
        symbolsMap.put("SCR", "Seychellois Rupee");
        symbolsMap.put("SDG", "Sudanese Pound");
        symbolsMap.put("SEK", "Swedish Krona");
        symbolsMap.put("SGD", "Singapore Dollar");
        symbolsMap.put("SHP", "Saint Helena Pound");
        symbolsMap.put("SLL", "Sierra Leonean Leone");
        symbolsMap.put("SOS", "Somali Shilling");
        symbolsMap.put("SRD", "Surinamese Dollar");
        symbolsMap.put("STD", "S??o Tom?? and Pr??ncipe Dobra");
        symbolsMap.put("SVC", "Salvadoran Col??n");
        symbolsMap.put("SYP", "Syrian Pound");
        symbolsMap.put("SZL", "Swazi Lilangeni");
        symbolsMap.put("THB", "Thai Baht");
        symbolsMap.put("TJS", "Tajikistani Somoni");
        symbolsMap.put("TMT", "Turkmenistani Manat");
        symbolsMap.put("TND", "Tunisian Dinar");
        symbolsMap.put("TOP", "Tongan Pa??anga");
        symbolsMap.put("TRY", "Turkish Lira");
        symbolsMap.put("TTD", "Trinidad and Tobago Dollar");
        symbolsMap.put("TWD", "New Taiwan Dollar");
        symbolsMap.put("TZS", "Tanzanian Shilling");
        symbolsMap.put("UAH", "Ukrainian Hryvnia");
        symbolsMap.put("UGX", "Ugandan Shilling");
        symbolsMap.put("USD", "United States Dollar");
        symbolsMap.put("UYU", "Uruguayan Peso");
        symbolsMap.put("UZS", "Uzbekistan Som");
        symbolsMap.put("VEF", "Venezuelan Bol??var Fuerte");
        symbolsMap.put("VND", "Vietnamese Dong");
        symbolsMap.put("VUV", "Vanuatu Vatu");
        symbolsMap.put("WST", "Samoan Tala");
        symbolsMap.put("XAF", "CFA Franc BEAC");
        symbolsMap.put("XAG", "Silver troy ounce");
        symbolsMap.put("XAU", "Gold troy ounce");
        symbolsMap.put("XCD", "East Caribbean Dollar");
        symbolsMap.put("XDR", "Special Drawing Rights");
        symbolsMap.put("XOF", "CFA Franc BCEAO");
        symbolsMap.put("XPF", "CFP Franc");
        symbolsMap.put("YER", "Yemeni Rial");
        symbolsMap.put("ZAR", "South African Rand");
        symbolsMap.put("ZMK", "Zambian Kwacha (pre-2013)");
        symbolsMap.put("ZMW", "Zambian Kwacha");
        symbolsMap.put("ZWL", "Zimbabwean Dollar");

    }

}


