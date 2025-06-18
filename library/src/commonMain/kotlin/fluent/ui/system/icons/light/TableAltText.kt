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

public val FluentUi.Light.TableAltText: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Light.TableAltText",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(3f, 7.5f)
            curveTo(3f, 5.015f, 5.015f, 3f, 7.5f, 3f)
            horizontalLineTo(24.5f)
            curveTo(26.985f, 3f, 29f, 5.015f, 29f, 7.5f)
            verticalLineTo(14.531f)
            curveTo(28.836f, 14.51f, 28.669f, 14.5f, 28.5f, 14.5f)
            horizontalLineTo(28f)
            verticalLineTo(12f)
            horizontalLineTo(21f)
            verticalLineTo(14.5f)
            horizontalLineTo(20f)
            verticalLineTo(12f)
            lineTo(12f, 12f)
            verticalLineTo(20f)
            horizontalLineTo(14.5f)
            verticalLineTo(21f)
            horizontalLineTo(12f)
            verticalLineTo(28f)
            horizontalLineTo(14.531f)
            curveTo(14.575f, 28.349f, 14.663f, 28.685f, 14.791f, 29f)
            horizontalLineTo(7.5f)
            curveTo(5.015f, 29f, 3f, 26.985f, 3f, 24.5f)
            verticalLineTo(7.5f)
            close()
            moveTo(4f, 21f)
            verticalLineTo(24.5f)
            curveTo(4f, 26.433f, 5.567f, 28f, 7.5f, 28f)
            horizontalLineTo(11f)
            verticalLineTo(21f)
            horizontalLineTo(4f)
            close()
            moveTo(11f, 20f)
            verticalLineTo(12f)
            horizontalLineTo(4f)
            verticalLineTo(20f)
            horizontalLineTo(11f)
            close()
            moveTo(7.5f, 4f)
            curveTo(5.567f, 4f, 4f, 5.567f, 4f, 7.5f)
            verticalLineTo(11f)
            horizontalLineTo(11f)
            verticalLineTo(4f)
            horizontalLineTo(7.5f)
            close()
            moveTo(20f, 4f)
            horizontalLineTo(12f)
            verticalLineTo(11f)
            horizontalLineTo(20f)
            verticalLineTo(4f)
            close()
            moveTo(24.5f, 4f)
            horizontalLineTo(21f)
            verticalLineTo(11f)
            lineTo(28f, 11f)
            verticalLineTo(7.5f)
            curveTo(28f, 5.567f, 26.433f, 4f, 24.5f, 4f)
            close()
            moveTo(18.5f, 16f)
            curveTo(17.119f, 16f, 16f, 17.119f, 16f, 18.5f)
            verticalLineTo(27.5f)
            curveTo(16f, 28.881f, 17.119f, 30f, 18.5f, 30f)
            horizontalLineTo(28.5f)
            curveTo(29.881f, 30f, 31f, 28.881f, 31f, 27.5f)
            verticalLineTo(18.5f)
            curveTo(31f, 17.119f, 29.881f, 16f, 28.5f, 16f)
            horizontalLineTo(18.5f)
            close()
            moveTo(19.25f, 21.5f)
            curveTo(18.836f, 21.5f, 18.5f, 21.164f, 18.5f, 20.75f)
            curveTo(18.5f, 20.336f, 18.836f, 20f, 19.25f, 20f)
            horizontalLineTo(27.75f)
            curveTo(28.164f, 20f, 28.5f, 20.336f, 28.5f, 20.75f)
            curveTo(28.5f, 21.164f, 28.164f, 21.5f, 27.75f, 21.5f)
            horizontalLineTo(19.25f)
            close()
            moveTo(18.5f, 25.25f)
            curveTo(18.5f, 24.836f, 18.836f, 24.5f, 19.25f, 24.5f)
            horizontalLineTo(27.75f)
            curveTo(28.164f, 24.5f, 28.5f, 24.836f, 28.5f, 25.25f)
            curveTo(28.5f, 25.664f, 28.164f, 26f, 27.75f, 26f)
            horizontalLineTo(19.25f)
            curveTo(18.836f, 26f, 18.5f, 25.664f, 18.5f, 25.25f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun TableAltTextPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Light.TableAltText, contentDescription = null)
    }
}
