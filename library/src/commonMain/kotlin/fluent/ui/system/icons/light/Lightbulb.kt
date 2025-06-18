package fluent.ui.system.icons.light

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

public val FluentUi.Light.Lightbulb: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Light.Lightbulb",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(7f, 12f)
            curveTo(7f, 7.029f, 11.029f, 3f, 16f, 3f)
            curveTo(20.971f, 3f, 25f, 7.029f, 25f, 12f)
            curveTo(25f, 14.616f, 23.885f, 16.97f, 22.103f, 18.615f)
            curveTo(21.499f, 19.172f, 20.99f, 19.895f, 20.81f, 20.761f)
            lineTo(20.135f, 24f)
            horizontalLineTo(11.865f)
            lineTo(11.19f, 20.761f)
            curveTo(11.01f, 19.895f, 10.501f, 19.172f, 9.897f, 18.615f)
            curveTo(8.115f, 16.97f, 7f, 14.616f, 7f, 12f)
            close()
            moveTo(12.073f, 25f)
            horizontalLineTo(19.927f)
            lineTo(19.508f, 27.01f)
            curveTo(19.267f, 28.169f, 18.245f, 29f, 17.061f, 29f)
            horizontalLineTo(14.939f)
            curveTo(13.755f, 29f, 12.733f, 28.169f, 12.492f, 27.01f)
            lineTo(12.073f, 25f)
            close()
            moveTo(16f, 2f)
            curveTo(10.477f, 2f, 6f, 6.477f, 6f, 12f)
            curveTo(6f, 14.906f, 7.24f, 17.524f, 9.219f, 19.35f)
            curveTo(9.719f, 19.812f, 10.085f, 20.361f, 10.211f, 20.965f)
            lineTo(11.513f, 27.214f)
            curveTo(11.851f, 28.837f, 13.281f, 30f, 14.939f, 30f)
            horizontalLineTo(17.061f)
            curveTo(18.719f, 30f, 20.149f, 28.837f, 20.487f, 27.214f)
            lineTo(21.789f, 20.965f)
            curveTo(21.915f, 20.361f, 22.281f, 19.812f, 22.781f, 19.35f)
            curveTo(24.76f, 17.524f, 26f, 14.906f, 26f, 12f)
            curveTo(26f, 6.477f, 21.523f, 2f, 16f, 2f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun LightbulbPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Light.Lightbulb, contentDescription = null)
    }
}
