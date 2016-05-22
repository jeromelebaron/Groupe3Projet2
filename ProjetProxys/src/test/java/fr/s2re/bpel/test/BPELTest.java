/**
 * Créé le 22 mai 2016 par Jérome LE BARON
 */
package fr.s2re.bpel.test;

import org.apache.log4j.Logger;

import fr.s2re.bpel.stock.StockBPEL;
import fr.s2re.bpel.stock.StockBPELPortType;
import fr.s2re.bpel.stock.StockBPELRequest;
import fr.s2re.bpel.stock.StockBPELResponse;

/**
 * Description de la classe
 * @author Jérome LE BARON
 * @author $LastChangedBy$
 * @version $Revision$ $Date$
 */
public class BPELTest {

    private final static Logger LOGGER = Logger.getLogger(BPELTest.class);

    /**
     * @param args
     */
    public static void main(String[] args) {
        StockBPEL stockBPEL = new StockBPEL();
        StockBPELPortType proxy = stockBPEL.getStockBPELPort();
        final StockBPELRequest payload = new StockBPELRequest();
        payload.setReferenceProduit("TB001");
        payload.setQuantiteProduit(10);
        StockBPELResponse stockBPELResponse = proxy.process(payload);
        LOGGER.info(stockBPELResponse.getQuantiteProduitSortie());
        LOGGER.info(stockBPELResponse.getMessageSortie());
    }

}
