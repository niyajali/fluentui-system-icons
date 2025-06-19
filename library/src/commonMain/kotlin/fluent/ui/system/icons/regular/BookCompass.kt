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

public val FluentIcons.Regular.BookCompass: ImageVector
    get() {
        if (_BookCompass != null) {
            return _BookCompass!!
        }
        _BookCompass = ImageVector.Builder(
            name = "Regular.BookCompass",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(13f, 5.75f)
                curveTo(13f, 5.336f, 12.664f, 5f, 12.25f, 5f)
                curveTo(11.836f, 5f, 11.5f, 5.336f, 11.5f, 5.75f)
                verticalLineTo(7.354f)
                curveTo(10.346f, 7.68f, 9.5f, 8.741f, 9.5f, 10f)
                curveTo(9.5f, 10.781f, 9.825f, 11.485f, 10.348f, 11.986f)
                lineTo(9.054f, 15.222f)
                curveTo(8.9f, 15.606f, 9.087f, 16.042f, 9.471f, 16.196f)
                curveTo(9.856f, 16.35f, 10.292f, 16.163f, 10.446f, 15.778f)
                lineTo(11.681f, 12.691f)
                curveTo(11.865f, 12.73f, 12.055f, 12.75f, 12.25f, 12.75f)
                curveTo(12.445f, 12.75f, 12.635f, 12.73f, 12.819f, 12.691f)
                lineTo(14.054f, 15.778f)
                curveTo(14.208f, 16.163f, 14.644f, 16.35f, 15.029f, 16.196f)
                curveTo(15.413f, 16.042f, 15.6f, 15.606f, 15.446f, 15.222f)
                lineTo(14.152f, 11.986f)
                curveTo(14.675f, 11.485f, 15f, 10.781f, 15f, 10f)
                curveTo(15f, 8.741f, 14.154f, 7.68f, 13f, 7.354f)
                verticalLineTo(5.75f)
                close()
                moveTo(11f, 10f)
                curveTo(11f, 9.31f, 11.56f, 8.75f, 12.25f, 8.75f)
                curveTo(12.94f, 8.75f, 13.5f, 9.31f, 13.5f, 10f)
                curveTo(13.5f, 10.69f, 12.94f, 11.25f, 12.25f, 11.25f)
                curveTo(11.56f, 11.25f, 11f, 10.69f, 11f, 10f)
                close()
                moveTo(6.5f, 2f)
                curveTo(5.119f, 2f, 4f, 3.119f, 4f, 4.5f)
                verticalLineTo(19.5f)
                curveTo(4f, 20.881f, 5.119f, 22f, 6.5f, 22f)
                horizontalLineTo(19.75f)
                curveTo(20.164f, 22f, 20.5f, 21.664f, 20.5f, 21.25f)
                curveTo(20.5f, 20.836f, 20.164f, 20.5f, 19.75f, 20.5f)
                horizontalLineTo(6.5f)
                curveTo(5.948f, 20.5f, 5.5f, 20.052f, 5.5f, 19.5f)
                horizontalLineTo(19.75f)
                curveTo(20.164f, 19.5f, 20.5f, 19.164f, 20.5f, 18.75f)
                verticalLineTo(4.5f)
                curveTo(20.5f, 3.119f, 19.381f, 2f, 18f, 2f)
                horizontalLineTo(6.5f)
                close()
                moveTo(19f, 18f)
                horizontalLineTo(5.5f)
                verticalLineTo(4.5f)
                curveTo(5.5f, 3.948f, 5.948f, 3.5f, 6.5f, 3.5f)
                horizontalLineTo(18f)
                curveTo(18.552f, 3.5f, 19f, 3.948f, 19f, 4.5f)
                verticalLineTo(18f)
                close()
            }
        }.build()

        return _BookCompass!!
    }

@Suppress("ObjectPropertyName")
private var _BookCompass: ImageVector? = null

@Preview
@Composable
private fun BookCompassPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.BookCompass, contentDescription = null)
    }
}
