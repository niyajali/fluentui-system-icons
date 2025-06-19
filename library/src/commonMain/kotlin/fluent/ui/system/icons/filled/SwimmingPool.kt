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

public val FluentIcons.Filled.SwimmingPool: ImageVector
    get() {
        if (_SwimmingPool != null) {
            return _SwimmingPool!!
        }
        _SwimmingPool = ImageVector.Builder(
            name = "Filled.SwimmingPool",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(6f, 6f)
                curveTo(6f, 5.448f, 6.448f, 5f, 7f, 5f)
                curveTo(7.552f, 5f, 8f, 5.448f, 8f, 6f)
                verticalLineTo(12.026f)
                curveTo(8.632f, 12.085f, 9.3f, 12.218f, 10f, 12.441f)
                verticalLineTo(11f)
                horizontalLineTo(16f)
                verticalLineTo(14.485f)
                curveTo(16.8f, 14.474f, 17.48f, 14.313f, 18f, 14.13f)
                verticalLineTo(6f)
                curveTo(18f, 4.343f, 16.657f, 3f, 15f, 3f)
                curveTo(13.343f, 3f, 12f, 4.343f, 12f, 6f)
                curveTo(12f, 6.552f, 12.448f, 7f, 13f, 7f)
                curveTo(13.552f, 7f, 14f, 6.552f, 14f, 6f)
                curveTo(14f, 5.448f, 14.448f, 5f, 15f, 5f)
                curveTo(15.552f, 5f, 16f, 5.448f, 16f, 6f)
                verticalLineTo(9f)
                horizontalLineTo(10f)
                verticalLineTo(6f)
                curveTo(10f, 4.343f, 8.657f, 3f, 7f, 3f)
                curveTo(5.343f, 3f, 4f, 4.343f, 4f, 6f)
                curveTo(4f, 6.552f, 4.448f, 7f, 5f, 7f)
                curveTo(5.552f, 7f, 6f, 6.552f, 6f, 6f)
                close()
                moveTo(6.592f, 15.025f)
                curveTo(5.568f, 15.151f, 4.893f, 15.572f, 4.606f, 15.791f)
                curveTo(4.166f, 16.125f, 3.539f, 16.04f, 3.204f, 15.601f)
                curveTo(2.87f, 15.161f, 2.955f, 14.534f, 3.394f, 14.199f)
                curveTo(3.886f, 13.825f, 4.887f, 13.22f, 6.347f, 13.04f)
                curveTo(7.822f, 12.858f, 9.683f, 13.119f, 11.86f, 14.356f)
                curveTo(15.648f, 16.51f, 18.696f, 15.009f, 19.491f, 14.539f)
                curveTo(19.966f, 14.258f, 20.579f, 14.415f, 20.861f, 14.89f)
                curveTo(21.142f, 15.365f, 20.985f, 15.979f, 20.51f, 16.26f)
                curveTo(19.433f, 16.897f, 15.561f, 18.761f, 10.871f, 16.095f)
                curveTo(9.035f, 15.051f, 7.603f, 14.9f, 6.592f, 15.025f)
                close()
                moveTo(4.606f, 19.791f)
                curveTo(4.893f, 19.572f, 5.568f, 19.151f, 6.592f, 19.025f)
                curveTo(7.603f, 18.9f, 9.035f, 19.051f, 10.871f, 20.095f)
                curveTo(15.561f, 22.761f, 19.433f, 20.897f, 20.51f, 20.26f)
                curveTo(20.985f, 19.979f, 21.142f, 19.365f, 20.861f, 18.89f)
                curveTo(20.579f, 18.415f, 19.966f, 18.258f, 19.491f, 18.539f)
                curveTo(18.696f, 19.009f, 15.648f, 20.51f, 11.86f, 18.356f)
                curveTo(9.683f, 17.119f, 7.822f, 16.858f, 6.347f, 17.04f)
                curveTo(4.887f, 17.22f, 3.886f, 17.825f, 3.394f, 18.199f)
                curveTo(2.955f, 18.534f, 2.87f, 19.161f, 3.204f, 19.601f)
                curveTo(3.539f, 20.04f, 4.166f, 20.125f, 4.606f, 19.791f)
                close()
            }
        }.build()

        return _SwimmingPool!!
    }

@Suppress("ObjectPropertyName")
private var _SwimmingPool: ImageVector? = null

@Preview
@Composable
private fun SwimmingPoolPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.SwimmingPool, contentDescription = null)
    }
}
