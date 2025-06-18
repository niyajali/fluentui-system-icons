package fluent.ui.system.icons.filled

import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentUi

public val FluentUi.Filled.GlobeSearch: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.GlobeSearch",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(3.441f, 9.956f)
            curveTo(1.518f, 11.88f, 1.518f, 14.999f, 3.441f, 16.922f)
            curveTo(5.136f, 18.617f, 7.758f, 18.819f, 9.674f, 17.527f)
            lineTo(13.93f, 21.784f)
            curveTo(14.232f, 22.086f, 14.722f, 22.086f, 15.024f, 21.784f)
            curveTo(15.298f, 21.509f, 15.323f, 21.08f, 15.099f, 20.777f)
            lineTo(15.024f, 20.69f)
            lineTo(10.807f, 16.472f)
            curveTo(12.32f, 14.539f, 12.187f, 11.736f, 10.407f, 9.956f)
            curveTo(8.484f, 8.033f, 5.365f, 8.033f, 3.441f, 9.956f)
            close()
            moveTo(16.654f, 16.501f)
            curveTo(16.429f, 17.788f, 16.106f, 18.957f, 15.702f, 19.955f)
            lineTo(15.731f, 19.983f)
            lineTo(15.856f, 20.123f)
            curveTo(16.076f, 20.418f, 16.2f, 20.747f, 16.234f, 21.075f)
            curveTo(18.278f, 20.127f, 19.947f, 18.508f, 20.96f, 16.501f)
            lineTo(16.654f, 16.501f)
            close()
            moveTo(12.25f, 16.5f)
            lineTo(14.534f, 18.787f)
            curveTo(14.736f, 18.187f, 14.915f, 17.519f, 15.064f, 16.795f)
            lineTo(15.122f, 16.501f)
            lineTo(12.25f, 16.5f)
            close()
            moveTo(9.314f, 11.05f)
            curveTo(10.634f, 12.369f, 10.634f, 14.509f, 9.314f, 15.829f)
            curveTo(7.994f, 17.149f, 5.854f, 17.149f, 4.535f, 15.829f)
            curveTo(3.215f, 14.509f, 3.215f, 12.369f, 4.535f, 11.05f)
            curveTo(5.854f, 9.73f, 7.994f, 9.73f, 9.314f, 11.05f)
            close()
            moveTo(15.45f, 10f)
            lineTo(11.75f, 9.999f)
            curveTo(12.797f, 11.466f, 13.102f, 13.311f, 12.642f, 15.001f)
            lineTo(15.352f, 15.001f)
            curveTo(15.465f, 14.055f, 15.527f, 13.048f, 15.527f, 12f)
            curveTo(15.527f, 11.486f, 15.512f, 10.981f, 15.483f, 10.489f)
            lineTo(15.45f, 10f)
            close()
            moveTo(16.957f, 10.001f)
            curveTo(17.003f, 10.651f, 17.027f, 11.319f, 17.027f, 12f)
            curveTo(17.027f, 12.83f, 16.992f, 13.64f, 16.924f, 14.421f)
            lineTo(16.867f, 15.001f)
            horizontalLineTo(21.569f)
            curveTo(21.867f, 14.054f, 22.027f, 13.046f, 22.027f, 12f)
            curveTo(22.027f, 11.316f, 21.958f, 10.646f, 21.827f, 10f)
            lineTo(16.957f, 10.001f)
            close()
            moveTo(14.862f, 2.407f)
            curveTo(15.743f, 3.756f, 16.398f, 5.736f, 16.745f, 8.061f)
            lineTo(16.807f, 8.5f)
            lineTo(21.398f, 8.5f)
            curveTo(20.356f, 5.713f, 18.108f, 3.516f, 15.288f, 2.543f)
            lineTo(14.984f, 2.444f)
            lineTo(14.862f, 2.407f)
            close()
            moveTo(12.026f, 2.002f)
            curveTo(10.749f, 2.002f, 9.465f, 4.384f, 8.868f, 7.841f)
            curveTo(9.333f, 8.001f, 9.78f, 8.221f, 10.199f, 8.499f)
            lineTo(15.287f, 8.5f)
            curveTo(14.747f, 4.691f, 13.382f, 2.002f, 12.026f, 2.002f)
            close()
            moveTo(9.189f, 2.407f)
            curveTo(6.171f, 3.298f, 3.747f, 5.574f, 2.654f, 8.5f)
            lineTo(3.649f, 8.499f)
            curveTo(4.773f, 7.752f, 6.096f, 7.43f, 7.392f, 7.532f)
            curveTo(7.714f, 5.674f, 8.238f, 4.063f, 8.919f, 2.853f)
            lineTo(9.082f, 2.577f)
            lineTo(9.189f, 2.407f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun GlobeSearchPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.GlobeSearch, contentDescription = null)
    }
}
