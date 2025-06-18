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
import fluent.ui.system.icons.FluentUi

public val FluentUi.Regular.Gift: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Gift",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(14.5f, 2f)
            curveTo(16.295f, 2f, 17.75f, 3.455f, 17.75f, 5.25f)
            curveTo(17.75f, 5.895f, 17.562f, 6.495f, 17.239f, 7.001f)
            lineTo(19.75f, 7f)
            curveTo(20.44f, 7f, 21f, 7.56f, 21f, 8.25f)
            verticalLineTo(11.75f)
            curveTo(21f, 12.354f, 20.571f, 12.859f, 20.001f, 12.975f)
            lineTo(20f, 18.75f)
            curveTo(20f, 20.483f, 18.643f, 21.899f, 16.934f, 21.995f)
            lineTo(16.75f, 22f)
            horizontalLineTo(7.25f)
            curveTo(5.517f, 22f, 4.101f, 20.643f, 4.005f, 18.934f)
            lineTo(4f, 18.75f)
            lineTo(4f, 12.975f)
            curveTo(3.429f, 12.859f, 3f, 12.355f, 3f, 11.75f)
            verticalLineTo(8.25f)
            curveTo(3f, 7.56f, 3.56f, 7f, 4.25f, 7f)
            lineTo(6.761f, 7.001f)
            curveTo(6.438f, 6.495f, 6.25f, 5.895f, 6.25f, 5.25f)
            curveTo(6.25f, 3.455f, 7.705f, 2f, 9.5f, 2f)
            curveTo(10.505f, 2f, 11.404f, 2.457f, 12.001f, 3.174f)
            curveTo(12.596f, 2.457f, 13.495f, 2f, 14.5f, 2f)
            close()
            moveTo(11.25f, 12.999f)
            horizontalLineTo(5.5f)
            verticalLineTo(18.75f)
            curveTo(5.5f, 19.668f, 6.207f, 20.421f, 7.106f, 20.494f)
            lineTo(7.25f, 20.5f)
            horizontalLineTo(11.25f)
            verticalLineTo(12.999f)
            close()
            moveTo(18.5f, 12.999f)
            horizontalLineTo(12.75f)
            verticalLineTo(20.5f)
            horizontalLineTo(16.75f)
            curveTo(17.668f, 20.5f, 18.421f, 19.793f, 18.494f, 18.893f)
            lineTo(18.5f, 18.75f)
            verticalLineTo(12.999f)
            close()
            moveTo(11.25f, 8.5f)
            horizontalLineTo(4.5f)
            verticalLineTo(11.5f)
            lineTo(11.25f, 11.499f)
            verticalLineTo(8.5f)
            close()
            moveTo(19.5f, 11.5f)
            verticalLineTo(8.5f)
            horizontalLineTo(12.75f)
            verticalLineTo(11.499f)
            lineTo(19.5f, 11.5f)
            close()
            moveTo(14.5f, 3.5f)
            curveTo(13.533f, 3.5f, 12.75f, 4.284f, 12.75f, 5.25f)
            verticalLineTo(6.999f)
            horizontalLineTo(14.524f)
            lineTo(14.644f, 6.994f)
            curveTo(15.543f, 6.921f, 16.25f, 6.168f, 16.25f, 5.25f)
            curveTo(16.25f, 4.284f, 15.467f, 3.5f, 14.5f, 3.5f)
            close()
            moveTo(9.5f, 3.5f)
            curveTo(8.533f, 3.5f, 7.75f, 4.284f, 7.75f, 5.25f)
            curveTo(7.75f, 6.168f, 8.457f, 6.921f, 9.356f, 6.994f)
            lineTo(9.476f, 6.999f)
            horizontalLineTo(11.25f)
            verticalLineTo(5.25f)
            lineTo(11.244f, 5.106f)
            curveTo(11.171f, 4.207f, 10.418f, 3.5f, 9.5f, 3.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun GiftPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.Gift, contentDescription = null)
    }
}
