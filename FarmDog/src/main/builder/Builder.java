package builder;

import java.util.List;

public interface Builder<T> {
    T build(List<String> parameters);
}
