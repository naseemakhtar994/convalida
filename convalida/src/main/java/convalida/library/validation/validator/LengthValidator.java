package convalida.library.validation.validator;

import android.support.design.widget.TextInputLayout;
import android.widget.EditText;

/**
 * @author Wellington Costa on 27/06/2017.
 */
public class LengthValidator extends AbstractValidator {

    private int min;
    private int max;

    public LengthValidator(TextInputLayout layout, int min, int max, String errorMessage) {
        super(layout, errorMessage);
        this.min = min;
        this.max = max;
    }

    public LengthValidator(EditText editText, int min, int max, String errorMessage) {
        super(editText, errorMessage);
        this.min = min;
        this.max = max;
    }

    @Override
    boolean isNotValid(String value) {
        boolean hasError = value.length() < min;

        if (max > 0) {
            hasError |= value.length() > max;
        }

        return hasError;
    }

}
