package fluent.ui.system.icons.regular

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentIcons

public val FluentIcons.Regular.ArrowAutofitHeightDotted: ImageVector
    get() {
        if (_ArrowAutofitHeightDotted != null) {
            return _ArrowAutofitHeightDotted!!
        }
        _ArrowAutofitHeightDotted = ImageVector.Builder(
            name = "Regular.ArrowAutofitHeightDotted",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(16.78f, 3.22f)
                curveTo(16.487f, 2.927f, 16.013f, 2.927f, 15.72f, 3.22f)
                lineTo(13.22f, 5.72f)
                curveTo(12.927f, 6.013f, 12.927f, 6.487f, 13.22f, 6.78f)
                curveTo(13.513f, 7.073f, 13.987f, 7.073f, 14.28f, 6.78f)
                lineTo(16.25f, 4.811f)
                lineTo(18.22f, 6.78f)
                curveTo(18.513f, 7.073f, 18.987f, 7.073f, 19.28f, 6.78f)
                curveTo(19.573f, 6.487f, 19.573f, 6.013f, 19.28f, 5.72f)
                lineTo(16.78f, 3.22f)
                close()
                moveTo(4f, 6.242f)
                curveTo(4f, 5f, 5.007f, 3.992f, 6.25f, 3.992f)
                horizontalLineTo(10.25f)
                curveTo(10.664f, 3.992f, 11f, 4.328f, 11f, 4.742f)
                curveTo(11f, 5.156f, 10.664f, 5.492f, 10.25f, 5.492f)
                horizontalLineTo(6.25f)
                curveTo(5.836f, 5.492f, 5.5f, 5.828f, 5.5f, 6.242f)
                verticalLineTo(17.742f)
                curveTo(5.5f, 18.156f, 5.836f, 18.492f, 6.25f, 18.492f)
                horizontalLineTo(10.25f)
                curveTo(10.664f, 18.492f, 11f, 18.828f, 11f, 19.242f)
                curveTo(11f, 19.656f, 10.664f, 19.992f, 10.25f, 19.992f)
                horizontalLineTo(6.25f)
                curveTo(5.007f, 19.992f, 4f, 18.985f, 4f, 17.742f)
                verticalLineTo(6.242f)
                close()
                moveTo(16.78f, 20.78f)
                lineTo(19.28f, 18.28f)
                curveTo(19.573f, 17.987f, 19.573f, 17.513f, 19.28f, 17.22f)
                curveTo(18.987f, 16.927f, 18.513f, 16.927f, 18.22f, 17.22f)
                lineTo(16.25f, 19.189f)
                lineTo(14.28f, 17.22f)
                curveTo(13.987f, 16.927f, 13.513f, 16.927f, 13.22f, 17.22f)
                curveTo(12.927f, 17.513f, 12.927f, 17.987f, 13.22f, 18.28f)
                lineTo(15.72f, 20.78f)
                curveTo(16.013f, 21.073f, 16.487f, 21.073f, 16.78f, 20.78f)
                close()
                moveTo(16.25f, 11f)
                curveTo(15.836f, 11f, 15.5f, 11.336f, 15.5f, 11.75f)
                verticalLineTo(12.25f)
                curveTo(15.5f, 12.664f, 15.836f, 13f, 16.25f, 13f)
                curveTo(16.664f, 13f, 17f, 12.664f, 17f, 12.25f)
                verticalLineTo(11.75f)
                curveTo(17f, 11.336f, 16.664f, 11f, 16.25f, 11f)
                close()
                moveTo(15.5f, 15.25f)
                curveTo(15.5f, 14.836f, 15.836f, 14.5f, 16.25f, 14.5f)
                curveTo(16.664f, 14.5f, 17f, 14.836f, 17f, 15.25f)
                verticalLineTo(16.25f)
                curveTo(17f, 16.664f, 16.664f, 17f, 16.25f, 17f)
                curveTo(15.836f, 17f, 15.5f, 16.664f, 15.5f, 16.25f)
                verticalLineTo(15.25f)
                close()
                moveTo(16.25f, 7f)
                curveTo(15.836f, 7f, 15.5f, 7.336f, 15.5f, 7.75f)
                verticalLineTo(8.75f)
                curveTo(15.5f, 9.164f, 15.836f, 9.5f, 16.25f, 9.5f)
                curveTo(16.664f, 9.5f, 17f, 9.164f, 17f, 8.75f)
                verticalLineTo(7.75f)
                curveTo(17f, 7.336f, 16.664f, 7f, 16.25f, 7f)
                close()
            }
        }.build()

        return _ArrowAutofitHeightDotted!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowAutofitHeightDotted: ImageVector? = null

@Preview
@Composable
private fun ArrowAutofitHeightDottedPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.ArrowAutofitHeightDotted, contentDescription = null)
    }
}
