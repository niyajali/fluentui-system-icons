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

public val FluentUi.Regular.StackStar: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.StackStar",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(9.5f, 5.85f)
            curveTo(9.784f, 5.85f, 10.044f, 6.01f, 10.171f, 6.265f)
            lineTo(10.991f, 7.906f)
            lineTo(12.593f, 8.106f)
            curveTo(12.889f, 8.143f, 13.136f, 8.352f, 13.22f, 8.639f)
            curveTo(13.304f, 8.926f, 13.21f, 9.235f, 12.98f, 9.426f)
            lineTo(11.831f, 10.384f)
            lineTo(12.232f, 12.187f)
            curveTo(12.298f, 12.482f, 12.18f, 12.788f, 11.933f, 12.962f)
            curveTo(11.686f, 13.137f, 11.359f, 13.146f, 11.102f, 12.986f)
            lineTo(9.5f, 11.984f)
            lineTo(7.898f, 12.986f)
            curveTo(7.641f, 13.146f, 7.314f, 13.137f, 7.067f, 12.962f)
            curveTo(6.82f, 12.788f, 6.702f, 12.482f, 6.768f, 12.187f)
            lineTo(7.169f, 10.384f)
            lineTo(6.02f, 9.426f)
            curveTo(5.79f, 9.235f, 5.696f, 8.926f, 5.78f, 8.639f)
            curveTo(5.864f, 8.352f, 6.111f, 8.143f, 6.407f, 8.106f)
            lineTo(8.009f, 7.906f)
            lineTo(8.829f, 6.265f)
            curveTo(8.956f, 6.01f, 9.216f, 5.85f, 9.5f, 5.85f)
            close()
            moveTo(4f, 4f)
            horizontalLineTo(15f)
            curveTo(16.105f, 4f, 17f, 4.895f, 17f, 6f)
            verticalLineTo(13f)
            curveTo(17f, 14.105f, 16.105f, 15f, 15f, 15f)
            horizontalLineTo(4f)
            curveTo(2.895f, 15f, 2f, 14.105f, 2f, 13f)
            verticalLineTo(6f)
            curveTo(2f, 4.895f, 2.895f, 4f, 4f, 4f)
            close()
            moveTo(15f, 5.5f)
            horizontalLineTo(4f)
            curveTo(3.724f, 5.5f, 3.5f, 5.724f, 3.5f, 6f)
            verticalLineTo(13f)
            curveTo(3.5f, 13.276f, 3.724f, 13.5f, 4f, 13.5f)
            horizontalLineTo(15f)
            curveTo(15.276f, 13.5f, 15.5f, 13.276f, 15.5f, 13f)
            verticalLineTo(6f)
            curveTo(15.5f, 5.724f, 15.276f, 5.5f, 15f, 5.5f)
            close()
            moveTo(4.563f, 16f)
            curveTo(4.785f, 16.863f, 5.568f, 17.5f, 6.5f, 17.5f)
            horizontalLineTo(15.5f)
            curveTo(17.709f, 17.5f, 19.5f, 15.709f, 19.5f, 13.5f)
            verticalLineTo(8.5f)
            curveTo(19.5f, 7.568f, 18.863f, 6.785f, 18f, 6.563f)
            verticalLineTo(13.5f)
            curveTo(18f, 14.881f, 16.881f, 16f, 15.5f, 16f)
            horizontalLineTo(4.563f)
            close()
            moveTo(7.063f, 18.5f)
            curveTo(7.285f, 19.363f, 8.068f, 20f, 9f, 20f)
            horizontalLineTo(16.25f)
            curveTo(19.426f, 20f, 22f, 17.426f, 22f, 14.25f)
            verticalLineTo(11f)
            curveTo(22f, 10.068f, 21.363f, 9.285f, 20.5f, 9.063f)
            verticalLineTo(14.25f)
            curveTo(20.5f, 16.597f, 18.597f, 18.5f, 16.25f, 18.5f)
            horizontalLineTo(7.063f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun StackStarPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.StackStar, contentDescription = null)
    }
}
