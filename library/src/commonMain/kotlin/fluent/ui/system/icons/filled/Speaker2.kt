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

public val FluentUi.Filled.Speaker2: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Speaker2",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(15f, 4.25f)
            verticalLineTo(19.746f)
            curveTo(15f, 20.825f, 13.726f, 21.397f, 12.919f, 20.68f)
            lineTo(8.428f, 16.687f)
            curveTo(8.291f, 16.564f, 8.113f, 16.497f, 7.93f, 16.497f)
            horizontalLineTo(4.25f)
            curveTo(3.007f, 16.497f, 2f, 15.49f, 2f, 14.247f)
            verticalLineTo(9.749f)
            curveTo(2f, 8.506f, 3.007f, 7.499f, 4.25f, 7.499f)
            horizontalLineTo(7.93f)
            curveTo(8.113f, 7.499f, 8.291f, 7.432f, 8.428f, 7.31f)
            lineTo(12.92f, 3.316f)
            curveTo(13.726f, 2.6f, 15f, 3.172f, 15f, 4.25f)
            close()
            moveTo(18.992f, 5.898f)
            curveTo(19.324f, 5.651f, 19.794f, 5.721f, 20.041f, 6.054f)
            curveTo(21.272f, 7.716f, 22f, 9.774f, 22f, 12f)
            curveTo(22f, 14.227f, 21.272f, 16.285f, 20.041f, 17.947f)
            curveTo(19.794f, 18.28f, 19.324f, 18.35f, 18.992f, 18.103f)
            curveTo(18.659f, 17.857f, 18.589f, 17.387f, 18.835f, 17.054f)
            curveTo(19.882f, 15.642f, 20.5f, 13.894f, 20.5f, 12f)
            curveTo(20.5f, 10.107f, 19.882f, 8.359f, 18.835f, 6.947f)
            curveTo(18.589f, 6.614f, 18.659f, 6.144f, 18.992f, 5.898f)
            close()
            moveTo(17.143f, 8.37f)
            curveTo(17.507f, 8.173f, 17.962f, 8.308f, 18.16f, 8.672f)
            curveTo(18.696f, 9.663f, 19f, 10.797f, 19f, 12f)
            curveTo(19f, 13.204f, 18.696f, 14.338f, 18.16f, 15.329f)
            curveTo(17.962f, 15.693f, 17.507f, 15.828f, 17.143f, 15.631f)
            curveTo(16.779f, 15.434f, 16.643f, 14.979f, 16.84f, 14.615f)
            curveTo(17.261f, 13.838f, 17.5f, 12.948f, 17.5f, 12f)
            curveTo(17.5f, 11.053f, 17.261f, 10.163f, 16.84f, 9.386f)
            curveTo(16.643f, 9.022f, 16.779f, 8.567f, 17.143f, 8.37f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun Speaker2Preview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.Speaker2, contentDescription = null)
    }
}
