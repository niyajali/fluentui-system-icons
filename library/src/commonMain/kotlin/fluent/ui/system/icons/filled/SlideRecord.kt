package fluent.ui.system.icons.filled

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

public val FluentIcons.Filled.SlideRecord: ImageVector
    get() {
        if (_SlideRecord != null) {
            return _SlideRecord!!
        }
        _SlideRecord = ImageVector.Builder(
            name = "Filled.SlideRecord",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(4.75f, 4f)
                curveTo(3.231f, 4f, 2f, 5.231f, 2f, 6.75f)
                verticalLineTo(17.25f)
                curveTo(2f, 18.769f, 3.231f, 20f, 4.75f, 20f)
                horizontalLineTo(11.498f)
                curveTo(11.177f, 19.23f, 11f, 18.386f, 11f, 17.5f)
                curveTo(11f, 16.802f, 11.11f, 16.13f, 11.314f, 15.5f)
                horizontalLineTo(6.75f)
                curveTo(6.336f, 15.5f, 6f, 15.164f, 6f, 14.75f)
                curveTo(6f, 14.336f, 6.336f, 14f, 6.75f, 14f)
                horizontalLineTo(12.022f)
                curveTo(12.384f, 13.434f, 12.832f, 12.928f, 13.346f, 12.5f)
                horizontalLineTo(6.75f)
                curveTo(6.336f, 12.5f, 6f, 12.164f, 6f, 11.75f)
                curveTo(6f, 11.336f, 6.336f, 11f, 6.75f, 11f)
                horizontalLineTo(15.25f)
                curveTo(15.461f, 11f, 15.652f, 11.087f, 15.788f, 11.228f)
                curveTo(16.334f, 11.079f, 16.908f, 11f, 17.5f, 11f)
                curveTo(19.247f, 11f, 20.832f, 11.689f, 22f, 12.81f)
                verticalLineTo(6.75f)
                curveTo(22f, 5.231f, 20.769f, 4f, 19.25f, 4f)
                horizontalLineTo(4.75f)
                close()
                moveTo(6f, 8.75f)
                curveTo(6f, 8.336f, 6.336f, 8f, 6.75f, 8f)
                horizontalLineTo(11.25f)
                curveTo(11.664f, 8f, 12f, 8.336f, 12f, 8.75f)
                curveTo(12f, 9.164f, 11.664f, 9.5f, 11.25f, 9.5f)
                horizontalLineTo(6.75f)
                curveTo(6.336f, 9.5f, 6f, 9.164f, 6f, 8.75f)
                close()
                moveTo(17.5f, 21.5f)
                curveTo(15.291f, 21.5f, 13.5f, 19.709f, 13.5f, 17.5f)
                curveTo(13.5f, 15.291f, 15.291f, 13.5f, 17.5f, 13.5f)
                curveTo(19.709f, 13.5f, 21.5f, 15.291f, 21.5f, 17.5f)
                curveTo(21.5f, 19.709f, 19.709f, 21.5f, 17.5f, 21.5f)
                close()
                moveTo(17.5f, 23f)
                curveTo(20.538f, 23f, 23f, 20.538f, 23f, 17.5f)
                curveTo(23f, 14.462f, 20.538f, 12f, 17.5f, 12f)
                curveTo(14.462f, 12f, 12f, 14.462f, 12f, 17.5f)
                curveTo(12f, 20.538f, 14.462f, 23f, 17.5f, 23f)
                close()
                moveTo(17.5f, 20f)
                curveTo(18.881f, 20f, 20f, 18.881f, 20f, 17.5f)
                curveTo(20f, 16.119f, 18.881f, 15f, 17.5f, 15f)
                curveTo(16.119f, 15f, 15f, 16.119f, 15f, 17.5f)
                curveTo(15f, 18.881f, 16.119f, 20f, 17.5f, 20f)
                close()
            }
        }.build()

        return _SlideRecord!!
    }

@Suppress("ObjectPropertyName")
private var _SlideRecord: ImageVector? = null

@Preview
@Composable
private fun SlideRecordPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.SlideRecord, contentDescription = null)
    }
}
