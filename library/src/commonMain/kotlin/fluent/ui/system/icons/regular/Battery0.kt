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

public val FluentIcons.Regular.Battery0: ImageVector
    get() {
        if (_Battery0 != null) {
            return _Battery0!!
        }
        _Battery0 = ImageVector.Builder(
            name = "Regular.Battery0",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(17f, 6f)
                curveTo(18.657f, 6f, 20f, 7.343f, 20f, 9f)
                verticalLineTo(10f)
                horizontalLineTo(21f)
                curveTo(21.182f, 10f, 21.353f, 10.049f, 21.5f, 10.134f)
                curveTo(21.799f, 10.307f, 22f, 10.63f, 22f, 11f)
                verticalLineTo(13f)
                curveTo(22f, 13.37f, 21.799f, 13.693f, 21.5f, 13.866f)
                curveTo(21.353f, 13.951f, 21.182f, 14f, 21f, 14f)
                horizontalLineTo(20f)
                verticalLineTo(15f)
                curveTo(20f, 16.657f, 18.657f, 18f, 17f, 18f)
                horizontalLineTo(5f)
                curveTo(3.343f, 18f, 2f, 16.657f, 2f, 15f)
                verticalLineTo(9f)
                curveTo(2f, 7.343f, 3.343f, 6f, 5f, 6f)
                horizontalLineTo(17f)
                close()
                moveTo(16.998f, 7.5f)
                horizontalLineTo(5f)
                curveTo(4.22f, 7.5f, 3.579f, 8.095f, 3.507f, 8.856f)
                lineTo(3.5f, 9f)
                verticalLineTo(15f)
                curveTo(3.5f, 15.78f, 4.095f, 16.42f, 4.855f, 16.493f)
                lineTo(5f, 16.5f)
                horizontalLineTo(16.998f)
                curveTo(17.778f, 16.5f, 18.419f, 15.905f, 18.491f, 15.144f)
                lineTo(18.498f, 15f)
                verticalLineTo(9f)
                curveTo(18.498f, 8.22f, 17.903f, 7.58f, 17.143f, 7.507f)
                lineTo(16.998f, 7.5f)
                close()
            }
        }.build()

        return _Battery0!!
    }

@Suppress("ObjectPropertyName")
private var _Battery0: ImageVector? = null

@Preview
@Composable
private fun Battery0Preview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.Battery0, contentDescription = null)
    }
}
