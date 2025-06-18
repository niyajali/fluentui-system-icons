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

public val FluentUi.Regular.ArrowForwardDownPerson: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowForwardDownPerson",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(19.69f, 9.501f)
            lineTo(16.727f, 6.538f)
            curveTo(16.434f, 6.245f, 16.434f, 5.77f, 16.727f, 5.477f)
            curveTo(16.993f, 5.211f, 17.41f, 5.187f, 17.704f, 5.404f)
            lineTo(17.788f, 5.477f)
            lineTo(22.03f, 9.72f)
            curveTo(22.297f, 9.986f, 22.321f, 10.403f, 22.103f, 10.696f)
            lineTo(22.03f, 10.78f)
            lineTo(17.788f, 15.023f)
            curveTo(17.495f, 15.316f, 17.02f, 15.316f, 16.727f, 15.023f)
            curveTo(16.461f, 14.757f, 16.437f, 14.34f, 16.654f, 14.046f)
            lineTo(16.727f, 13.962f)
            lineTo(19.69f, 11.001f)
            lineTo(14f, 11f)
            curveTo(9.802f, 11f, 6.384f, 7.662f, 6.254f, 3.496f)
            lineTo(6.25f, 3.25f)
            curveTo(6.25f, 2.836f, 6.586f, 2.5f, 7f, 2.5f)
            curveTo(7.414f, 2.5f, 7.75f, 2.836f, 7.75f, 3.25f)
            curveTo(7.75f, 6.625f, 10.425f, 9.375f, 13.771f, 9.496f)
            lineTo(14f, 9.5f)
            lineTo(19.69f, 9.501f)
            close()
            moveTo(9f, 13.5f)
            curveTo(9f, 14.881f, 7.881f, 16f, 6.5f, 16f)
            curveTo(5.119f, 16f, 4f, 14.881f, 4f, 13.5f)
            curveTo(4f, 12.12f, 5.119f, 11f, 6.5f, 11f)
            curveTo(7.881f, 11f, 9f, 12.12f, 9f, 13.5f)
            close()
            moveTo(11f, 18.875f)
            curveTo(11f, 20.432f, 9.714f, 22f, 6.5f, 22f)
            curveTo(3.286f, 22f, 2f, 20.438f, 2f, 18.875f)
            verticalLineTo(18.772f)
            curveTo(2f, 17.793f, 2.794f, 17f, 3.773f, 17f)
            horizontalLineTo(9.227f)
            curveTo(10.206f, 17f, 11f, 17.793f, 11f, 18.772f)
            verticalLineTo(18.875f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ArrowForwardDownPersonPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.ArrowForwardDownPerson, contentDescription = null)
    }
}
