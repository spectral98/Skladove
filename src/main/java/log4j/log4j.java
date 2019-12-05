
package log4j;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class log4j {
            private static Logger logger = LogManager.getLogger(log4j.class);

          {
                System.out.println("\n its work \n");


                logger.debug("Логнат");
                logger.info("Успешно влязъл");
                logger.warn("Внимание");
                logger.error("Появи се грешка при логване");
                logger.fatal("Грешни данни");

                System.out.println("\n Completed");

    }
    }
