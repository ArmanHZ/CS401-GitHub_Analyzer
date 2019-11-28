package application;


 


import javafx.beans.property.BooleanProperty;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.ReadOnlyObjectProperty;
import javafx.beans.property.StringProperty;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.VerticalDirection;
import javafx.scene.Node;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.Label;
import javafx.scene.control.OverrunStyle;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Paint;
import javafx.scene.text.Font;
import javafx.scene.text.TextAlignment;
import javafx.scene.transform.Rotate;

public class VerticalLabel extends Pane {
    private final InternalLabel label = new InternalLabel();
    private final VerticalDirection direction;

    public VerticalLabel(VerticalDirection direction) {
        this.direction = direction;
        this.label.getTransforms().add(new Rotate(direction == VerticalDirection.DOWN ? 90 : -90, 0, 0));
        this.label.setManaged(false);
        this.getChildren().add(label);
    }

    // Content bias is Vertical if text wrapping is active:

    @Override
    public Orientation getContentBias() {
        return label.isWrapText() ? Orientation.VERTICAL : null;
    }

    @Override
    protected void layoutChildren() {
        super.layoutChildren();

        label.resizeRelocate(direction == VerticalDirection.DOWN ? getWidth() : 0, direction == VerticalDirection.DOWN ? 0 : getHeight(), getHeight(), getWidth());
    }

    // Compute methods, with width and height swapped around:

    @Override
    protected double computePrefWidth(double height) {
        return label.computePrefHeight(height);
    }

    @Override
    protected double computePrefHeight(double width) {
        return label.computePrefWidth(width);
    }

    @Override
    protected double computeMaxWidth(double height) {
        return label.computeMaxHeight(height);
    }

    @Override
    protected double computeMaxHeight(double width) {
        return label.computeMaxWidth(width);
    }

    @Override
    protected double computeMinWidth(double height) {
        return label.computeMinHeight(height);
    }

    @Override
    protected double computeMinHeight(double width) {
        return label.computeMinWidth(width);
    }

    // Delegate methods:

    public ObjectProperty<Node> labelForProperty() {
        return label.labelForProperty();
    }

    public final StringProperty textProperty() {
        return label.textProperty();
    }

    public final String getText() {
        return label.getText();
    }

    public void setText(String text) {
        label.setText(text);
    }

    public final void setLabelFor(Node value) {
        label.setLabelFor(value);
    }

    public final Node getLabelFor() {
        return label.getLabelFor();
    }

    public final ObjectProperty<TextAlignment> textAlignmentProperty() {
        return label.textAlignmentProperty();
    }

    public final void setTextAlignment(TextAlignment value) {
        label.setTextAlignment(value);
    }

    public final TextAlignment getTextAlignment() {
        return label.getTextAlignment();
    }

    public final ObjectProperty<OverrunStyle> textOverrunProperty() {
        return label.textOverrunProperty();
    }

    public final void setTextOverrun(OverrunStyle value) {
        label.setTextOverrun(value);
    }

    public final OverrunStyle getTextOverrun() {
        return label.getTextOverrun();
    }

    public final StringProperty ellipsisStringProperty() {
        return label.ellipsisStringProperty();
    }

    public final void setEllipsisString(String value) {
        label.setEllipsisString(value);
    }

    public final String getEllipsisString() {
        return label.getEllipsisString();
    }

    public final BooleanProperty wrapTextProperty() {
        return label.wrapTextProperty();
    }

    public final boolean isWrapText() {
        return label.isWrapText();
    }

    public void setWrapText(boolean wrapText) {
        label.setWrapText(wrapText);
    }

    public final ObjectProperty<Font> fontProperty() {
        return label.fontProperty();
    }

    public final void setFont(Font value) {
        label.setFont(value);
    }

    public final Font getFont() {
        return label.getFont();
    }

    public final ObjectProperty<Node> graphicProperty() {
        return label.graphicProperty();
    }

    public final void setGraphic(Node value) {
        label.setGraphic(value);
    }

    public final Node getGraphic() {
        return label.getGraphic();
    }

    public final ObjectProperty<ContextMenu> contextMenuProperty() {
        return label.contextMenuProperty();
    }

    public final void setContextMenu(ContextMenu value) {
        label.setContextMenu(value);
    }

    public final BooleanProperty underlineProperty() {
        return label.underlineProperty();
    }

    public final void setUnderline(boolean value) {
        label.setUnderline(value);
    }

    public final DoubleProperty lineSpacingProperty() {
        return label.lineSpacingProperty();
    }

    public final void setLineSpacing(double value) {
        label.setLineSpacing(value);
    }

    public final double getLineSpacing() {
        return label.getLineSpacing();
    }

    public final ObjectProperty<ContentDisplay> contentDisplayProperty() {
        return label.contentDisplayProperty();
    }

    public final void setContentDisplay(ContentDisplay value) {
        label.setContentDisplay(value);
    }

    public final ReadOnlyObjectProperty<Insets> labelPaddingProperty() {
        return label.labelPaddingProperty();
    }

    public final Insets getLabelPadding() {
        return label.getLabelPadding();
    }

    public final DoubleProperty graphicTextGapProperty() {
        return label.graphicTextGapProperty();
    }

    public final void setGraphicTextGap(double value) {
        label.setGraphicTextGap(value);
    }

    public final double getGraphicTextGap() {
        return label.getGraphicTextGap();
    }

    public final void setTextFill(Paint value) {
        label.setTextFill(value);
    }

    public final Paint getTextFill() {
        return label.getTextFill();
    }

    public final ObjectProperty<Paint> textFillProperty() {
        return label.textFillProperty();
    }

    public final BooleanProperty mnemonicParsingProperty() {
        return label.mnemonicParsingProperty();
    }

    /**
     * Inner class to make compute(...) methods accessible.
     */
    private class InternalLabel extends Label {
        @Override
        public double computePrefWidth(double height) {
            return super.computePrefWidth(height);
        }

        @Override
        public double computePrefHeight(double width) {
            return super.computePrefHeight(width);
        }

        @Override
        public double computeMaxWidth(double height) {
            return super.computeMaxWidth(height);
        }

        @Override
        public double computeMaxHeight(double width) {
            return super.computeMaxHeight(width);
        }

        @Override
        public double computeMinWidth(double height) {
            return super.computeMinWidth(height);
        }

        @Override
        public double computeMinHeight(double width) {
            return super.computeMinHeight(width);
        }
    }
}

