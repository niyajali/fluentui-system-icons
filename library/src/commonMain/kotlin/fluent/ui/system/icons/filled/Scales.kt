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

public val FluentIcons.Filled.Scales: ImageVector
    get() {
        if (_Scales != null) {
            return _Scales!!
        }
        _Scales = ImageVector.Builder(
            name = "Filled.Scales",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(3.75f, 3f)
                curveTo(3.336f, 3f, 3f, 3.336f, 3f, 3.75f)
                curveTo(3f, 4.164f, 3.336f, 4.5f, 3.75f, 4.5f)
                horizontalLineTo(4.792f)
                lineTo(2.055f, 11.217f)
                curveTo(2.019f, 11.307f, 2f, 11.403f, 2f, 11.5f)
                curveTo(2f, 13.433f, 3.567f, 15f, 5.5f, 15f)
                curveTo(7.433f, 15f, 9f, 13.433f, 9f, 11.5f)
                curveTo(9f, 11.403f, 8.981f, 11.307f, 8.945f, 11.217f)
                lineTo(6.208f, 4.5f)
                horizontalLineTo(11.25f)
                lineTo(11.25f, 16.5f)
                horizontalLineTo(7.253f)
                curveTo(6.01f, 16.5f, 5.003f, 17.507f, 5.003f, 18.75f)
                curveTo(5.003f, 19.993f, 6.01f, 21f, 7.253f, 21f)
                horizontalLineTo(16.75f)
                curveTo(17.993f, 21f, 19f, 19.993f, 19f, 18.75f)
                curveTo(19f, 17.507f, 17.993f, 16.5f, 16.75f, 16.5f)
                horizontalLineTo(12.75f)
                lineTo(12.75f, 4.5f)
                horizontalLineTo(17.792f)
                lineTo(15.055f, 11.217f)
                curveTo(15.019f, 11.307f, 15f, 11.403f, 15f, 11.5f)
                curveTo(15f, 13.433f, 16.567f, 15f, 18.5f, 15f)
                curveTo(20.433f, 15f, 22f, 13.433f, 22f, 11.5f)
                curveTo(22f, 11.403f, 21.981f, 11.307f, 21.945f, 11.217f)
                lineTo(19.208f, 4.5f)
                horizontalLineTo(20.25f)
                curveTo(20.664f, 4.5f, 21f, 4.164f, 21f, 3.75f)
                curveTo(21f, 3.336f, 20.664f, 3f, 20.25f, 3f)
                horizontalLineTo(3.75f)
                close()
                moveTo(5.5f, 6.738f)
                lineTo(7.135f, 10.75f)
                horizontalLineTo(3.865f)
                lineTo(5.5f, 6.738f)
                close()
                moveTo(16.865f, 10.75f)
                lineTo(18.5f, 6.738f)
                lineTo(20.135f, 10.75f)
                horizontalLineTo(16.865f)
                close()
            }
        }.build()

        return _Scales!!
    }

@Suppress("ObjectPropertyName")
private var _Scales: ImageVector? = null

@Preview
@Composable
private fun ScalesPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.Scales, contentDescription = null)
    }
}
