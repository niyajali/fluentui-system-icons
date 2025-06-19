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

public val FluentIcons.Filled.PhoneScreenTime: ImageVector
    get() {
        if (_PhoneScreenTime != null) {
            return _PhoneScreenTime!!
        }
        _PhoneScreenTime = ImageVector.Builder(
            name = "Filled.PhoneScreenTime",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(17.5f, 12f)
                curveTo(20.538f, 12f, 23f, 14.462f, 23f, 17.5f)
                curveTo(23f, 20.538f, 20.538f, 23f, 17.5f, 23f)
                curveTo(14.462f, 23f, 12f, 20.538f, 12f, 17.5f)
                curveTo(12f, 14.462f, 14.462f, 12f, 17.5f, 12f)
                close()
                moveTo(13.75f, 2f)
                curveTo(14.993f, 2f, 16f, 3.007f, 16f, 4.25f)
                lineTo(16f, 11.174f)
                curveTo(13.133f, 11.851f, 11f, 14.426f, 11f, 17.5f)
                curveTo(11f, 17.668f, 11.006f, 17.835f, 11.019f, 18f)
                lineTo(8.75f, 18f)
                curveTo(8.336f, 18f, 8f, 18.336f, 8f, 18.75f)
                curveTo(8f, 19.13f, 8.282f, 19.444f, 8.648f, 19.493f)
                lineTo(8.75f, 19.5f)
                horizontalLineTo(11.25f)
                lineTo(11.312f, 19.497f)
                curveTo(11.618f, 20.445f, 12.136f, 21.299f, 12.81f, 22.001f)
                lineTo(6.25f, 22f)
                curveTo(5.007f, 22f, 4f, 20.993f, 4f, 19.75f)
                verticalLineTo(4.25f)
                curveTo(4f, 3.007f, 5.007f, 2f, 6.25f, 2f)
                horizontalLineTo(13.75f)
                close()
                moveTo(16.5f, 14f)
                curveTo(16.224f, 14f, 16f, 14.224f, 16f, 14.5f)
                verticalLineTo(18.5f)
                curveTo(16f, 18.776f, 16.224f, 19f, 16.5f, 19f)
                horizontalLineTo(19.501f)
                curveTo(19.778f, 19f, 20.001f, 18.776f, 20.001f, 18.5f)
                curveTo(20.001f, 18.224f, 19.778f, 18f, 19.501f, 18f)
                horizontalLineTo(17f)
                verticalLineTo(14.5f)
                curveTo(17f, 14.224f, 16.776f, 14f, 16.5f, 14f)
                close()
            }
        }.build()

        return _PhoneScreenTime!!
    }

@Suppress("ObjectPropertyName")
private var _PhoneScreenTime: ImageVector? = null

@Preview
@Composable
private fun PhoneScreenTimePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.PhoneScreenTime, contentDescription = null)
    }
}
