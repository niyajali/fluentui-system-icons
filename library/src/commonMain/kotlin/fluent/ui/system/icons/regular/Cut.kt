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

public val FluentIcons.Regular.Cut: ImageVector
    get() {
        if (_Cut != null) {
            return _Cut!!
        }
        _Cut = ImageVector.Builder(
            name = "Regular.Cut",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(12.141f, 9.342f)
                lineTo(12.14f, 9.343f)
                lineTo(7.37f, 2.328f)
                curveTo(7.137f, 1.986f, 6.671f, 1.897f, 6.328f, 2.13f)
                curveTo(5.986f, 2.363f, 5.897f, 2.829f, 6.13f, 3.172f)
                lineTo(11.261f, 10.717f)
                lineTo(8.865f, 14.46f)
                curveTo(8.308f, 14.167f, 7.673f, 14f, 7f, 14f)
                curveTo(4.791f, 14f, 3f, 15.791f, 3f, 18f)
                curveTo(3f, 20.209f, 4.791f, 22f, 7f, 22f)
                curveTo(9.209f, 22f, 11f, 20.209f, 11f, 18f)
                curveTo(11f, 17.009f, 10.639f, 16.102f, 10.042f, 15.403f)
                lineTo(12.178f, 12.066f)
                lineTo(14.243f, 15.102f)
                curveTo(13.477f, 15.831f, 13f, 16.86f, 13f, 18f)
                curveTo(13f, 20.209f, 14.791f, 22f, 17f, 22f)
                curveTo(19.209f, 22f, 21f, 20.209f, 21f, 18f)
                curveTo(21f, 15.791f, 19.209f, 14f, 17f, 14f)
                curveTo(16.471f, 14f, 15.966f, 14.103f, 15.504f, 14.289f)
                lineTo(13.057f, 10.692f)
                lineTo(13.059f, 10.69f)
                lineTo(12.141f, 9.342f)
                close()
                moveTo(4.5f, 18f)
                curveTo(4.5f, 16.619f, 5.619f, 15.5f, 7f, 15.5f)
                curveTo(8.381f, 15.5f, 9.5f, 16.619f, 9.5f, 18f)
                curveTo(9.5f, 19.381f, 8.381f, 20.5f, 7f, 20.5f)
                curveTo(5.619f, 20.5f, 4.5f, 19.381f, 4.5f, 18f)
                close()
                moveTo(14.5f, 18f)
                curveTo(14.5f, 16.619f, 15.619f, 15.5f, 17f, 15.5f)
                curveTo(18.381f, 15.5f, 19.5f, 16.619f, 19.5f, 18f)
                curveTo(19.5f, 19.381f, 18.381f, 20.5f, 17f, 20.5f)
                curveTo(15.619f, 20.5f, 14.5f, 19.381f, 14.5f, 18f)
                close()
                moveTo(13.938f, 9.316f)
                lineTo(17.882f, 3.154f)
                curveTo(18.105f, 2.806f, 18.003f, 2.342f, 17.654f, 2.118f)
                curveTo(17.305f, 1.895f, 16.841f, 1.997f, 16.618f, 2.346f)
                lineTo(13.02f, 7.968f)
                lineTo(13.938f, 9.316f)
                close()
            }
        }.build()

        return _Cut!!
    }

@Suppress("ObjectPropertyName")
private var _Cut: ImageVector? = null

@Preview
@Composable
private fun CutPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.Cut, contentDescription = null)
    }
}
