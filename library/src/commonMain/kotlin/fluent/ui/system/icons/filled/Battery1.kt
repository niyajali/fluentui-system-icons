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

public val FluentIcons.Filled.Battery1: ImageVector
    get() {
        if (_Battery1 != null) {
            return _Battery1!!
        }
        _Battery1 = ImageVector.Builder(
            name = "Filled.Battery1",
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
                moveTo(7f, 9f)
                horizontalLineTo(5.998f)
                curveTo(5.446f, 9f, 4.998f, 9.448f, 4.998f, 10f)
                verticalLineTo(14f)
                curveTo(4.998f, 14.552f, 5.446f, 15f, 5.998f, 15f)
                horizontalLineTo(7f)
                curveTo(7.552f, 15f, 8f, 14.552f, 8f, 14f)
                verticalLineTo(10f)
                curveTo(8f, 9.448f, 7.552f, 9f, 7f, 9f)
                close()
            }
        }.build()

        return _Battery1!!
    }

@Suppress("ObjectPropertyName")
private var _Battery1: ImageVector? = null

@Preview
@Composable
private fun Battery1Preview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.Battery1, contentDescription = null)
    }
}
