public class Currency {
  private String code;
  private String name;
  private double conversionFactor;

  // Constructor
  public Currency(String code, String name, double conversionFactor) {
    this.code = code;
    this.name = name;
    this.conversionFactor = conversionFactor;
  }

  // Métodos getters y setters
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getConversionFactor() {
    return conversionFactor;
  }

  public void setConversionFactor(double conversionFactor) {
    this.conversionFactor = conversionFactor;
  }

  // Sobrescritura del método toString para una representación más legible.
  @Override
  public String toString() {
    return code + " - " + name;
  }

  // Array de monedas disponibles
  public static Currency[] getCurrencies() {
    return new Currency[] {
        new Currency("USD", "Dólares", 1.0),
        new Currency("AED", "Dirham de los Emiratos Árabes Unidos", 3.6725),
        new Currency("AFN", "Afghani Afgano", 85.8863),
        new Currency("ALL", "Lek Albanés", 90.8648),
        new Currency("AMD", "Dram Armenio", 386.4526),
        new Currency("ANG", "Florín Antillano Neerlandés", 1.7900),
        new Currency("AOA", "Kwanza Angoleño", 827.0907),
        new Currency("ARS", "Peso Argentino", 268.9583),
        new Currency("AUD", "Dólar Australiano", 1.4861),
        new Currency("AWG", "Florín Arubeño", 1.7900),
        new Currency("AZN", "Manat Azerbaiyano", 1.7000),
        new Currency("BAM", "Marco Convertible de Bosnia-Herzegovina", 1.7580),
        new Currency("BBD", "Dólar de Barbados", 2.0000),
        new Currency("BDT", "Taka Bangladesí", 108.8937),
        new Currency("BGN", "Lev Búlgaro", 1.7580),
        new Currency("BHD", "Dinar Bareiní", 0.3760),
        new Currency("BIF", "Franco de Burundi", 2833.0266),
        new Currency("BMD", "Dólar Bermudeño", 1.0000),
        new Currency("BND", "Dólar de Brunéi", 1.3307),
        new Currency("BOB", "Boliviano Boliviano", 6.9201),
        new Currency("BRL", "Real Brasileño", 4.7941),
        new Currency("BSD", "Dólar Bahameño", 1.0000),
        new Currency("BTN", "Ngultrum Butanés", 82.0223),
        new Currency("BWP", "Pula de Botswana", 13.1574),
        new Currency("BYN", "Rublo Bielorruso", 2.8242),
        new Currency("BZD", "Dólar Beliceño", 2.0000),
        new Currency("CAD", "Dólar Canadiense", 1.3213),
        new Currency("CDF", "Franco Congoleño", 2332.4892),
        new Currency("CHF", "Franco Suizo", 0.8661),
        new Currency("CLP", "Peso Chileno", 820.0522),
        new Currency("CNY", "Yuan Chino", 7.1853),
        new Currency("COP", "Peso Colombiano", 3979.7030),
        new Currency("CRC", "Colón Costarricense", 539.2453),
        new Currency("CUP", "Peso Cubano", 24.0000),
        new Currency("CVE", "Escudo Caboverdiano", 99.1127),
        new Currency("CZK", "Corona Checa", 21.5856),
        new Currency("DJF", "Franco de Yibuti", 177.7210),
        new Currency("DKK", "Corona Danesa", 6.7058),
        new Currency("DOP", "Peso Dominicano", 56.2649),
        new Currency("DZD", "Dinar Argelino", 134.8015),
        new Currency("EGP", "Libra Egipcia", 30.8926),
        new Currency("ERN", "Nakfa Eritreo", 15.0000),
        new Currency("ETB", "Birr Etíope", 54.9508),
        new Currency("EUR", "Euro", 0.8988),
        new Currency("FJD", "Dólar Fiyiano", 2.2202),
        new Currency("FKP", "Libra Malvinense", 0.7780),
        new Currency("FOK", "Corona Feroesa", 6.7058),
        new Currency("GBP", "Libra Esterlina", 0.7780),
        new Currency("GEL", "Lari Georgiano", 2.5768),
        new Currency("GGP", "Libra de Guernsey", 0.7780),
        new Currency("GHS", "Cedi de Ghana", 11.3859),
        new Currency("GIP", "Libra Gibraltareña", 0.7780),
        new Currency("GMD", "Dalasi de Gambia", 60.3491),
        new Currency("GNF", "Franco Guineano", 8519.5885),
        new Currency("GTQ", "Quetzal Guatemalteco", 7.8469),
        new Currency("GYD", "Dólar Guyanés", 209.3733),
        new Currency("HKD", "Dólar de Hong Kong", 7.8178),
        new Currency("HNL", "Lempira Hondureño", 24.6803),
        new Currency("HRK", "Kuna Croata", 6.7725),
        new Currency("HTG", "Gourde Haitiano", 137.5043),
        new Currency("HUF", "Forinto Húngaro", 341.1226),
        new Currency("IDR", "Rupia Indonesio", 15041.6057),
        new Currency("ILS", "Nuevo Shekel Israelí", 3.6262),
        new Currency("IMP", "Libra de la Isla de Man", 0.7780),
        new Currency("INR", "Rupia India", 82.0224),
        new Currency("IQD", "Dinar Iraquí", 1309.7650),
        new Currency("IRR", "Rial Iraní", 42026.1627),
        new Currency("ISK", "Corona Islandesa", 131.4990),
        new Currency("JEP", "Libra de Jersey", 0.7780),
        new Currency("JMD", "Dólar Jamaiquino", 154.4594),
        new Currency("JOD", "Dinar Jordano", 0.7090),
        new Currency("JPY", "Yen Japonés", 141.7372),
        new Currency("KES", "Chelín Keniano", 141.8961),
        new Currency("KGS", "Som Kirguís", 87.8179),
        new Currency("KHR", "Riel Camboyano", 4140.5891),
        new Currency("KID", "Dólar de Kiribati", 1.4863),
        new Currency("KMF", "Franco Comorense", 442.2098),
        new Currency("KRW", "Won Surcoreano", 1286.0444),
        new Currency("KWD", "Dinar Kuwaití", 0.3069),
        new Currency("KYD", "Dólar de las Islas Caimán", 0.8333),
        new Currency("KZT", "Tenge Kazajo", 445.3708),
        new Currency("LAK", "Kip Lao", 19195.7967),
        new Currency("LBP", "Libra Libanesa", 15000.0000),
        new Currency("LKR", "Rupia de Sri Lanka", 326.5519),
        new Currency("LRD", "Dólar Liberiano", 184.6677),
        new Currency("LSL", "Loti Lesotense", 17.9753),
        new Currency("LYD", "Dinar Libio", 4.7356),
        new Currency("MAD", "Dirham Marroquí", 9.7549),
        new Currency("MDL", "Leu Moldavo", 17.5120),
        new Currency("MGA", "Ariary Malgache", 4441.0132),
        new Currency("MKD", "Dinar Macedonio", 55.2128),
        new Currency("MMK", "Kyat de Myanmar", 2098.9679),
        new Currency("MNT", "Tugrik Mongol", 3443.9991),
        new Currency("MOP", "Pataca de Macao", 8.0523),
        new Currency("MRU", "Ouguiya Mauritano", 37.3215),
        new Currency("MUR", "Rupia de Mauricio", 45.3367),
        new Currency("MVR", "Rufiyaa Maldiva", 15.4394),
        new Currency("MWK", "Kwacha Malauí", 1051.1167),
        new Currency("MXN", "Peso Mexicano", 16.9812),
        new Currency("MYR", "Ringgit Malayo", 4.5618),
        new Currency("MZN", "Metical Mozambiqueño", 64.4678),
        new Currency("NAD", "Dólar Namibio", 17.9753),
        new Currency("NGN", "Naira Nigeriana", 764.7117),
        new Currency("NIO", "Córdoba Nicaragüense", 36.7963),
        new Currency("NOK", "Corona Noruega", 10.0739),
        new Currency("NPR", "Rupia Nepalí", 131.2358),
        new Currency("NZD", "Dólar Neozelandés", 1.6204),
        new Currency("OMR", "Rial Omaní", 0.3845),
        new Currency("PAB", "Balboa Panameño", 1.0000),
        new Currency("PEN", "Sol Peruano", 3.5884),
        new Currency("PGK", "Kina de Papúa Nueva Guinea", 3.5977),
        new Currency("PHP", "Peso Filipino", 54.7268),
        new Currency("PKR", "Rupia Paquistaní", 284.6425),
        new Currency("PLN", "Złoty Polaco", 4.0045),
        new Currency("PYG", "Guaraní Paraguayo", 7282.0053),
        new Currency("QAR", "Rial Catarí", 3.6400),
        new Currency("RON", "Leu Rumano", 4.4380),
        new Currency("RSD", "Dinar Serbio", 105.3567),
        new Currency("RUB", "Rublo Ruso", 90.4515),
        new Currency("RWF", "Franco Ruandés", 1184.5328),
        new Currency("SAR", "Riyal Saudí", 3.7500),
        new Currency("SBD", "Dólar de las Islas Salomón", 8.4900),
        new Currency("SCR", "Rupia de Seychelles", 13.5994),
        new Currency("SDG", "Dinar Sudanés", 539.8468),
        new Currency("SEK", "Corona Sueca", 10.4023),
        new Currency("SGD", "Dólar de Singapur", 1.3307),
        new Currency("SHP", "Libra de Santa Elena", 0.7780),
        new Currency("SLE", "Leone de Sierra Leona", 19.6023),
        new Currency("SLL", "Leone Sierra Leonés", 19602.3196),
        new Currency("SOS", "Chelín Somalí", 569.6495),
        new Currency("SRD", "Dólar Surinamés", 38.6407),
        new Currency("SSP", "Libra Sursudanesa", 992.0128),
        new Currency("STN", "Dobra Santotomense", 22.0221),
        new Currency("SYP", "Libra Siria", 2511.1609),
        new Currency("SZL", "Lilangeni Suazi", 17.9753),
        new Currency("THB", "Baht Tailandés", 34.4643),
        new Currency("TJS", "Somoni Tayiko", 10.9168),
        new Currency("TMT", "Manat Turcomano", 3.4997),
        new Currency("TND", "Dinar Tunecino", 3.0497),
        new Currency("TOP", "Paʻanga Tongano", 2.3200),
        new Currency("TRY", "Lira Turca", 26.9592),
        new Currency("TTD", "Dólar de Trinidad y Tobago", 6.7806),
        new Currency("TVD", "Dólar Tuvaluano", 1.4863),
        new Currency("TWD", "Nuevo Dólar Taiwanés", 31.2777),
        new Currency("TZS", "Chelín Tanzano", 2451.9846),
        new Currency("UAH", "Grivna Ucraniana", 36.8194),
        new Currency("UGX", "Chelín Ugandés", 3648.8762),
        new Currency("UYU", "Peso Uruguayo", 38.0995),
        new Currency("UZS", "Som Uzbeko", 11765.9921),
        new Currency("VES", "Bolívar Venezolano", 29.0872),
        new Currency("VND", "Dong Vietnamita", 23594.2538),
        new Currency("VUV", "Vatu Vanuatuense", 117.6761),
        new Currency("WST", "Tala Samoano", 2.7070),
        new Currency("XAF", "Franco CFA de África Central", 589.6131),
        new Currency("XCD", "Dólar del Caribe Oriental", 2.7000),
        new Currency("XDR", "Derechos Especiales de Giro (FMI)", 0.7432),
        new Currency("XOF", "Franco CFA de África Occidental", 589.6131),
        new Currency("XPF", "Franco CFP", 107.2627),
        new Currency("YER", "Rial Yemení", 250.2444),
        new Currency("ZAR", "Rand Sudafricano", 17.9730),
        new Currency("ZMW", "Kwacha Zambiano", 19.4798),
        new Currency("ZWL", "Dólar de Zimbabue", 4629.9280)
    };
  }
}
