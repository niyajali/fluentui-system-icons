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

public val FluentIcons.Regular.RecordStop: ImageVector
    get() {
        if (_RecordStop != null) {
            return _RecordStop!!
        }
        _RecordStop = ImageVector.Builder(
            name = "Regular.RecordStop",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(12f, 3.5f)
                curveTo(7.306f, 3.5f, 3.5f, 7.306f, 3.5f, 12f)
                curveTo(3.5f, 16.694f, 7.306f, 20.5f, 12f, 20.5f)
                curveTo(16.694f, 20.5f, 20.5f, 16.694f, 20.5f, 12f)
                curveTo(20.5f, 7.306f, 16.694f, 3.5f, 12f, 3.5f)
                close()
                moveTo(2f, 12f)
                curveTo(2f, 6.477f, 6.477f, 2f, 12f, 2f)
                curveTo(17.523f, 2f, 22f, 6.477f, 22f, 12f)
                curveTo(22f, 17.523f, 17.523f, 22f, 12f, 22f)
                curveTo(6.477f, 22f, 2f, 17.523f, 2f, 12f)
                close()
                moveTo(8f, 9.5f)
                curveTo(8f, 8.672f, 8.672f, 8f, 9.5f, 8f)
                horizontalLineTo(14.5f)
                curveTo(15.328f, 8f, 16f, 8.672f, 16f, 9.5f)
                verticalLineTo(14.5f)
                curveTo(16f, 15.328f, 15.328f, 16f, 14.5f, 16f)
                horizontalLineTo(9.5f)
                curveTo(8.672f, 16f, 8f, 15.328f, 8f, 14.5f)
                verticalLineTo(9.5f)
                close()
            }
        }.build()

        return _RecordStop!!
    }

@Suppress("ObjectPropertyName")
private var _RecordStop: ImageVector? = null

@Preview
@Composable
private fun RecordStopPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.RecordStop, contentDescription = null)
    }
}
