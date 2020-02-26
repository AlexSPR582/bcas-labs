package pz.pz3.task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class Text {
    private Word title;
    private Sentence[] sentences;

    public Text(Word title, Sentence... sentences) {
        this.title = title;
//        this.sentences = Arrays.asList(sentences);
        
    }

    public Word getTitle() {
        return title;
    }

    public void setTitle(Word title) {
        this.title = title;
    }

    public Sentence[] getSentences() {
        return sentences;
    }

    public void setSentences(Sentence[] sentences) {
        this.sentences = sentences;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Text text = (Text) o;
        return Objects.equals(title, text.title) &&
                Arrays.equals(sentences, text.sentences);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(title);
        result = 31 * result + Arrays.hashCode(sentences);
        return result;
    }

    @Override
    public String toString() {
        return "Text{" +
                "title=" + title +
                ", sentences=" + Arrays.toString(sentences) +
                '}';
    }
}
