/**
 *
 * $Id$
 */
package smart_office.validation;

import org.eclipse.emf.common.util.EList;

import smart_office.Room;

/**
 * A sample validator interface for {@link smart_office.Door}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface DoorValidator {
	boolean validate();

	boolean validateRoom(EList<Room> value);
}
