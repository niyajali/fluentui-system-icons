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

public val FluentIcons.Filled.HourglassHalf: ImageVector
    get() {
        if (_HourglassHalf != null) {
            return _HourglassHalf!!
        }
        _HourglassHalf = ImageVector.Builder(
            name = "Filled.HourglassHalf",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(6.75f, 19.5f)
                horizontalLineTo(17.25f)
                curveTo(17.316f, 19.5f, 17.38f, 19.474f, 17.427f, 19.427f)
                curveTo(17.474f, 19.38f, 17.5f, 19.316f, 17.5f, 19.25f)
                verticalLineTo(18.65f)
                curveTo(17.495f, 18.126f, 17.363f, 17.612f, 17.116f, 17.15f)
                curveTo(16.869f, 16.689f, 16.513f, 16.294f, 16.08f, 16f)
                lineTo(14f, 14.52f)
                curveTo(13.58f, 14.242f, 13.23f, 13.869f, 12.98f, 13.431f)
                curveTo(12.73f, 12.994f, 12.586f, 12.503f, 12.56f, 12f)
                horizontalLineTo(11.44f)
                curveTo(11.414f, 12.503f, 11.27f, 12.994f, 11.02f, 13.431f)
                curveTo(10.77f, 13.869f, 10.42f, 14.242f, 10f, 14.52f)
                lineTo(7.92f, 16f)
                curveTo(7.487f, 16.294f, 7.131f, 16.689f, 6.884f, 17.15f)
                curveTo(6.637f, 17.612f, 6.505f, 18.126f, 6.5f, 18.65f)
                verticalLineTo(19.25f)
                curveTo(6.5f, 19.316f, 6.526f, 19.38f, 6.573f, 19.427f)
                curveTo(6.62f, 19.474f, 6.684f, 19.5f, 6.75f, 19.5f)
                close()
            }
        }.build()

        return _HourglassHalf!!
    }

@Suppress("ObjectPropertyName")
private var _HourglassHalf: ImageVector? = null

@Preview
@Composable
private fun HourglassHalfPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.HourglassHalf, contentDescription = null)
    }
}
