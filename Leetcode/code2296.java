
class TextEditor {
    int cursor = 0;
    StringBuilder newText = new StringBuilder();
    public TextEditor() {

    }
    public void addText(String text) {
        newText.insert(cursor, text);
        cursor += text.length();
    }
    public int deleteText(int k) {
        int del = Math.max(0, cursor - k);
        int deleted = cursor - del;
        newText.delete(del, cursor);
        cursor = del;
        return deleted;
    }

    public String cursorLeft(int k) {
        cursor = Math.max(0, cursor - k);
        int start = Math.max(0, cursor - 10);
        return newText.substring(start, cursor);
    }

    public String cursorRight(int k) {
        cursor = Math.min(newText.length(), cursor + k);
        int start = Math.max(0, cursor - 10);
        return newText.substring(start, cursor);
    }
}
