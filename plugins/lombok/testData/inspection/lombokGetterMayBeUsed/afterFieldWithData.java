// "Use lombok @Getter for 'anotherField'" "true"

import lombok.Data;

@Data
class Foo {
  private int anotherField;
  private int fieldWithoutGetter;

}