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

public val FluentIcons.Regular.SaveArrowRight: ImageVector
    get() {
        if (_SaveArrowRight != null) {
            return _SaveArrowRight!!
        }
        _SaveArrowRight = ImageVector.Builder(
            name = "Regular.SaveArrowRight",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(3f, 5.75f)
                curveTo(3f, 4.231f, 4.231f, 3f, 5.75f, 3f)
                horizontalLineTo(15.715f)
                curveTo(16.576f, 3f, 17.403f, 3.342f, 18.013f, 3.952f)
                lineTo(20.048f, 5.987f)
                curveTo(20.658f, 6.597f, 21f, 7.424f, 21f, 8.286f)
                verticalLineTo(12.022f)
                curveTo(20.537f, 11.725f, 20.034f, 11.486f, 19.5f, 11.314f)
                verticalLineTo(8.286f)
                curveTo(19.5f, 7.821f, 19.316f, 7.376f, 18.987f, 7.048f)
                lineTo(16.952f, 5.013f)
                curveTo(16.692f, 4.752f, 16.358f, 4.583f, 16f, 4.523f)
                verticalLineTo(7.25f)
                curveTo(16f, 8.493f, 14.993f, 9.5f, 13.75f, 9.5f)
                horizontalLineTo(9.25f)
                curveTo(8.007f, 9.5f, 7f, 8.493f, 7f, 7.25f)
                verticalLineTo(4.5f)
                horizontalLineTo(5.75f)
                curveTo(5.06f, 4.5f, 4.5f, 5.06f, 4.5f, 5.75f)
                verticalLineTo(18.25f)
                curveTo(4.5f, 18.94f, 5.06f, 19.5f, 5.75f, 19.5f)
                horizontalLineTo(6f)
                verticalLineTo(14.25f)
                curveTo(6f, 13.007f, 7.007f, 12f, 8.25f, 12f)
                horizontalLineTo(14.034f)
                curveTo(13.399f, 12.401f, 12.838f, 12.91f, 12.376f, 13.5f)
                horizontalLineTo(8.25f)
                curveTo(7.836f, 13.5f, 7.5f, 13.836f, 7.5f, 14.25f)
                verticalLineTo(19.5f)
                horizontalLineTo(11.314f)
                curveTo(11.486f, 20.034f, 11.725f, 20.537f, 12.022f, 21f)
                horizontalLineTo(5.75f)
                curveTo(4.231f, 21f, 3f, 19.769f, 3f, 18.25f)
                verticalLineTo(5.75f)
                close()
                moveTo(8.5f, 4.5f)
                verticalLineTo(7.25f)
                curveTo(8.5f, 7.664f, 8.836f, 8f, 9.25f, 8f)
                horizontalLineTo(13.75f)
                curveTo(14.164f, 8f, 14.5f, 7.664f, 14.5f, 7.25f)
                verticalLineTo(4.5f)
                horizontalLineTo(8.5f)
                close()
                moveTo(23f, 17.5f)
                curveTo(23f, 20.538f, 20.538f, 23f, 17.5f, 23f)
                curveTo(14.462f, 23f, 12f, 20.538f, 12f, 17.5f)
                curveTo(12f, 14.462f, 14.462f, 12f, 17.5f, 12f)
                curveTo(20.538f, 12f, 23f, 14.462f, 23f, 17.5f)
                close()
                moveTo(14.5f, 17f)
                curveTo(14.224f, 17f, 14f, 17.224f, 14f, 17.5f)
                curveTo(14f, 17.776f, 14.224f, 18f, 14.5f, 18f)
                horizontalLineTo(19.293f)
                lineTo(17.646f, 19.646f)
                curveTo(17.451f, 19.842f, 17.451f, 20.158f, 17.646f, 20.354f)
                curveTo(17.842f, 20.549f, 18.158f, 20.549f, 18.354f, 20.354f)
                lineTo(20.854f, 17.854f)
                curveTo(21.049f, 17.658f, 21.049f, 17.342f, 20.854f, 17.146f)
                lineTo(18.354f, 14.646f)
                curveTo(18.158f, 14.451f, 17.842f, 14.451f, 17.646f, 14.646f)
                curveTo(17.451f, 14.842f, 17.451f, 15.158f, 17.646f, 15.354f)
                lineTo(19.293f, 17f)
                horizontalLineTo(14.5f)
                close()
            }
        }.build()

        return _SaveArrowRight!!
    }

@Suppress("ObjectPropertyName")
private var _SaveArrowRight: ImageVector? = null

@Preview
@Composable
private fun SaveArrowRightPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.SaveArrowRight, contentDescription = null)
    }
}
