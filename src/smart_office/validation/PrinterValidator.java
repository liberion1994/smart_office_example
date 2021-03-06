/**
 *
 * $Id$
 */
package smart_office.validation;

import smart_office.Asset;
import smart_office.Room;

/**
 * A sample validator interface for {@link smart_office.Printer}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface PrinterValidator {
	boolean validate();

	boolean validateAsset(Asset value);
	boolean validateRoom(Room value);
}
